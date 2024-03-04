package com.springboot.chatapp.service;


import com.springboot.chatapp.model.Member;

import java.util.List;

public interface TestService {
    Member createMember(Member member);
    List<Member> getAllMember();
}
