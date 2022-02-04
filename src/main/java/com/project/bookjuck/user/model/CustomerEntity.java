package com.project.bookjuck.user.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CustomerEntity {
    private int iuser;
    private String uid;
    private String upw;
    private String nm;
    private String adr;
    private String mail;
    private String birth;
    private String phoneno;
    private int gender;
}
