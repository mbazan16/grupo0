package com.example.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.dto.EmpleadoDTO;
import com.example.servicios.ServicioEmpleado;


@Controller 
@RequestMapping("/")
public class HomeController {
	
	private static Logger log = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	ServicioEmpleado servicio;
	
	@GetMapping
	public String getListadoEmpleados(Model model, @RequestParam(defaultValue = "60")Long departamentoId) {
		
		List<EmpleadoDTO> empleados= servicio.getListadoEmpleadosDepartamento(departamentoId);
		model.addAttribute("ListadoDepartamento",empleados);
		return "home";
	}
	
	
}
