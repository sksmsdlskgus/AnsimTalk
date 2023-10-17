package com.dohi.ansimtalk.controller;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Getter @Setter
public class MessageForm {

    private Long sendid;//보내는사람
    private Long receiveid;//받는 사람
    //메세지 타입 -> text
    private String mtype;
    private String messagetext;

}

