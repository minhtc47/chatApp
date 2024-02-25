package com.springboot.chatapp.repository;

import com.springboot.chatapp.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ServerRepository extends JpaRepository<Server, String>, JpaSpecificationExecutor<Server> {

}