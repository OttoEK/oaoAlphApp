package com.oao.temuco.rest.prueba;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service/greeting")
public class PruebaController2 {
 @RequestMapping(value = "/{name}", method = RequestMethod.GET)
 public String getGreeting(@PathVariable String name) {
  String result="Hello "+name;  
  return result;
 }
}