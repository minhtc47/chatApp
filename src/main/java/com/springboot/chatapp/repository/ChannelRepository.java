package com.springboot.chatapp.repository;

import com.springboot.chatapp.model.Channel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ChannelRepository extends JpaRepository<Channel, String>, JpaSpecificationExecutor<Channel> {

}