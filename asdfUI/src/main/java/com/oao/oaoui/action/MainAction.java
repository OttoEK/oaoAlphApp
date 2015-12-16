package com.oao.oaoui.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.oao.oaoui.entities.Aplicacion;
import com.oao.oaoui.entities.Aplicacion2;
import com.oao.oaoui.entities.ListAplicacion;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 * Handles requests for the application home page.
 */
@Component
public class MainAction extends AbstractAction {
	private static final Logger LOG = LoggerFactory.getLogger(MainAction.class);

	public ListAplicacion aplicacionListar() throws JsonParseException, JsonMappingException, IOException {
		String jsonInString = postrest("http://localhost:8082/cursoao-web-il/aplicacion/listar", "" );
		Set<Aplicacion2> aplicaciones = jsonToPojoList(new TypeReference<Set<Aplicacion2>>() {}, jsonInString);
		List<Aplicacion2> arraylist= new ArrayList<Aplicacion2>();
		
		if(aplicaciones!=null){
			arraylist.addAll(aplicaciones);
		}
		ListAplicacion lista = new ListAplicacion();
		lista.setAplicaciones(arraylist);
		return lista;
	}
	
	public String aplicacionAgregar(Aplicacion aplicacion) throws JsonParseException, JsonMappingException, IOException {
		Aplicacion2 aplicacion2 = new Aplicacion2();
		aplicacion2.setbActivo(aplicacion.getBActivo());
		aplicacion2.setnIdAplicacion(null);
		aplicacion2.setsNombreAplicacion(aplicacion.getSNombreAplicacion());
		aplicacion2.setsTituloVentana(aplicacion.getSTituloVentana());
		aplicacion2.setsUrlInicio(aplicacion.getSUrlInicio());
		aplicacion2.setsVersionAplicacion(aplicacion.getSVersionAplicacion());
		
		String input = pojoToJson(aplicacion2);
		
		String jsonInString = postrest("http://localhost:8082/cursoao-web-il/aplicacion/nueva",input  );
		
		return jsonInString;
	}

	protected String postrest(String resourceStr, String inputStr) {
		String jsonInString = null;
		try {
			Client client = Client.create();
			WebResource webResource = client.resource(resourceStr);
			ClientResponse response = webResource.type("application/json").post(ClientResponse.class, inputStr);
			jsonInString = response.getEntity(String.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return jsonInString;
	}

	protected <T> T jsonToPojo(Class<T> clazz, String jsonInString) throws IOException, JsonParseException, JsonMappingException {
		T r = null;
		ObjectMapper mapper = new ObjectMapper();
		r = mapper.readValue(jsonInString, clazz);
		return r;
	}
	
	public static <T> T jsonToPojoList(final TypeReference<T> type, final String jsonPacket)throws IOException, JsonParseException, JsonMappingException {
		   T data = null;
		   try {
		      data = new ObjectMapper().readValue(jsonPacket, type);
		   } catch (Exception e) {
			   e.printStackTrace();
		   }
		   return data;
		}
	
	protected String  pojoToJson(Object object) throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		return mapper.writeValueAsString(object);
		
	}
	

		
}
