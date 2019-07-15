
package com.pruebas.spring.controller;

import com.pruebas.spring.domain.Cliente;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class ClienteController {

	

  @RequestMapping(value = "/cliente", method = RequestMethod.GET)
  //Pregunta... ¿y si quito @ModelAttribute("cliente")... funciona?
  //public String initForm() {  
  public String initForm(@ModelAttribute("cliente") Cliente cliente) {
      System.out.println("---- metodo Cliente");

      // Aqui es muy simple porque lo unico que necesito es un objeto vacio
      return "form1";
  }

  @RequestMapping(value = "/addCliente", method = RequestMethod.POST)
  public String processSubmit(
          @ModelAttribute("cliente") Cliente cliente,
          ModelMap model) {
      System.out.println("-- metodo addCliente");
      System.out.println("--------"+cliente);
      model.addAttribute(cliente);
      return "form2";
  }
  
//  @RequestMapping(value = "/listarClientes", method = RequestMethod.GET)
//  public String processSubmit(
//		  @ModelAttribute("clientes") List<Cliente> clientes,
//		  ModelMap model) {
//	  System.out.println("-- metodo listarClientes");
//	  model.addAttribute(clientes);
//	  return "form3";
//  }

}
