package com.springboot.chatapp.service.impl;

import com.springboot.chatapp.model.Member;
import com.springboot.chatapp.repository.MemberRepository;
import com.springboot.chatapp.service.TestService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    private MemberRepository memberRepository;

    public TestServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public Member createMember(Member member) {
        return memberRepository.save(member);
    }

    @Override
    public List<Member> getAllMember() {
        return memberRepository.findAll();
    }
}
