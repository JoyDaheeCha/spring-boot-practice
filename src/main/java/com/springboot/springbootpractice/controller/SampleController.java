package com.springboot.springbootpractice.controller;

import com.springboot.springbootpractice.domain.Address;
import com.springboot.springbootpractice.domain.Member;
import com.springboot.springbootpractice.domain.SampleVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/hello")
    public String SayHello() {
        return "Hello world";
    }

    @GetMapping("/sample")
    public SampleVO makeSample() {

        SampleVO vo = new SampleVO();
        vo.setVal1("v1");
        vo.setVal2("v2");
        vo.setVal3("v3");

        System.out.println(vo);

        return vo;
    }

    // TODO 상호참조로 인한 stack over flow 현상 피할법 찾기
    @GetMapping("/stackOverflow")
    public Address stackOverflow() {

        Address address = new Address();
        Member member = new Member();

        member.setAddr(address);
        member.setId("jay");
        member.setPw("1234");

        address.setMember(member);
        address.setZipcode("123");

        System.out.println(address);

        return address;
    }
}
