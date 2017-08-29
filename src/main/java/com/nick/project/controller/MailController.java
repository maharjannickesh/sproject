package com.nick.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nick.project.mailSender.MailMail;

@Controller
@RequestMapping(value = "/sendmail")
public class MailController {

    @Autowired
    private MailMail mail;

    @RequestMapping(value = "/testmail", method = RequestMethod.GET)
    public void sendTestMail() {
        System.out.println("Test Mail");
        mail.sendMail("nikeshmhjn@gmail.com", "nickesh.maharjan@gmail.com", "Test", "This Is a Test Email");
    }
}
