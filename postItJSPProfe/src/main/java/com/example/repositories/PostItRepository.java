package com.example.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.PostIt;

@Repository
public interface PostItRepository extends CrudRepository<PostIt, Long> {

}
