package com.example.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.PostIt;
import com.example.repositories.PostItRepository;
import com.example.services.interfaces.IServPostIt;

@Service
public class ServPostIt implements IServPostIt {

	Logger log = LoggerFactory.getLogger(ServPostIt.class);

	@Autowired
	PostItRepository repository;

	@Override
	public Iterable<PostIt> getList() {
		log.info("[getList]");

		return repository.findAll();
	}

	@Override
	public PostIt getElement(Long id) {
		log.info("[getElement]");
		log.debug("[id:" + id + "]");

		return repository.findById(id).get();
	}

	@Override
	public void newElement(String color, Integer tamanio) {
		log.info("[newElement]");
		log.debug("[color:" + color + "]");
		log.debug("[tamanio:" + tamanio + "]");
		
		PostIt element = new PostIt(color,tamanio);
		
		element= repository.save(element);
		
		log.debug("Elemento creado:"+element);
	}

}
