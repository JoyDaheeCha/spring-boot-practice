package com.springboot.springbootpractice.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(exclude = {"addr"})
public class Member {
    private String id;
    private String pw;

    private Address addr;

    @Override
    public String toString() {
        return "Member id [id=" + id + ", pw="  + pw + ", addr=" + addr + "]";
    }
}
