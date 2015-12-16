$(document).ready(function() {
	
	$("#agregarForm").validate({
	    rules : {
	    	"sNombreAplicacion" : {
	            required : true,
	            
	        },
	        "sTituloVentana" : {
	            required : true,
	            
	        },
	        "sUrlInicio" : {
	            required : true,
	            
	        },
	    },
	    errorPlacement: function(label, element) {
	        label.addClass('alert-danger');
	        label.insertAfter(element);
	    },
	    wrapper: 'div',
	    submitHandler: function(form) {	 
			var params = {
					form: form,
					callback: function (response) { 					
						
					}
				};			
			$('#main-container').AjaxFormSubmit(params);
		}
	});
	
	$('button[data-oao-action="submit"]').click(function(){
		url = $(this).attr("href");
		$.get(url).done(function (response) {
			$('#main-container').html(response);
		});
	})	
});