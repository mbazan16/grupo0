package com.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.entities.PostIt;
import com.example.services.interfaces.IServPostIt;

@Controller
@RequestMapping("/postit")
public class PostItController {
	Logger log = LoggerFactory.getLogger(PostItController.class);
	
	@Autowired
	IServPostIt service;
	
	
	@GetMapping("/")
	public String list(Model model) {
		log.info("[list]");
		
		Iterable<PostIt> list = service.getList();
		
		log.debug("List:");
		list.forEach(s->log.debug(s.toString()));
		
		model.addAttribute("elements", list);
	
		return "postits";		
		
	}
	
	
	@GetMapping("/{id}")
	public String element(Model model,@PathVariable Long id) {
		log.info("[element]");
		log.debug("[id:"+id+"]");
		
		PostIt element=service.getElement(id);
		
		log.debug(element.toString());
		
		
		model.addAttribute("element", element);
	
		return "postit";		
		
	}
	
	
	@PostMapping("/new")
	public String newElement(Model model,@RequestParam String color,@RequestParam Integer tamanio) {
		log.info("[element]");
		log.debug("[color:"+color+"]");
		log.debug("[tamanio:"+tamanio+"]");
		
		service.newElement(color,tamanio);			
		
		
	
		return "redirect:/postit/";		
		
	}
	
	@PostMapping("/update")
	public String updateElement(Model model,@ModelAttribute PostIt element) {
		log.info("[element]");
		log.debug("[element:"+element.toString()+"]");
		
		service.update(element);
		
		return "redirect:/postit/"+element.getId();		
		
	}
	
	
	@GetMapping("/d/{id}")
	public String deleteElement(Model model,@PathVariable("id") Long identificador) {
		log.info("[element]");
		log.debug("[id:"+identificador+"]");
		
		service.delete(identificador);
		
		
		return "redirect:/postit/";
		
	}

}
