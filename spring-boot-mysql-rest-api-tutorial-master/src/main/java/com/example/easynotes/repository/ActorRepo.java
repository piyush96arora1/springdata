package com.example.easynotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.easynotes.model.ActorModel;

@Repository
public interface ActorRepo extends JpaRepository<ActorModel,Long> {

}
