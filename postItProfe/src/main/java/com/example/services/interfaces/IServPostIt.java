package com.example.services.interfaces;

import com.example.entities.PostIt;

public interface IServPostIt {
	
	public Iterable<PostIt> getList();
	
	public PostIt getElement(Long id);

	public void newElement(String color, Integer tamanio);
	

}
