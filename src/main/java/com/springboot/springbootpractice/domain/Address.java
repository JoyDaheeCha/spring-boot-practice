package com.springboot.springbootpractice.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(exclude = {"member"})
public class Address {

    private String zipcode;
    private Member member;

    @Override
    public String toString() {
        return "Address [zipcode=" + zipcode + ", member=" + member + "]";
    }
}
