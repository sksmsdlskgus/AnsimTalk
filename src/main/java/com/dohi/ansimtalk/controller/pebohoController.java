package com.dohi.ansimtalk.controller;

import com.dohi.ansimtalk.service.MemberService;
import com.dohi.ansimtalk.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class pebohoController {


    private final MemberService memberService;
    private final MessageService messageService;


}
