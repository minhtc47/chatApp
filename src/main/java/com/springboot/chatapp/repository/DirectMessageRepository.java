package com.springboot.chatapp.repository;

import com.springboot.chatapp.model.DirectMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DirectMessageRepository extends JpaRepository<DirectMessage, String>, JpaSpecificationExecutor<DirectMessage> {

}