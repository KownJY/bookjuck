package com.project.bookjuck.user;

import com.project.bookjuck.user.model.CustomerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @GetMapping("/login")
    public String login(){ return "user/login"; }

    @GetMapping("/join")
    public void join(@ModelAttribute("entity") CustomerEntity entity){}


    @PostMapping("/join")
    public String joinProc(CustomerEntity entity){
        System.out.println(entity);
        int result = service.insCustomer(entity);
        return "redirect:joindone";
    }

}
