package com.springboot.chatapp.repository;

import com.springboot.chatapp.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MemberRepository extends JpaRepository<Member, String>, JpaSpecificationExecutor<Member> {

}