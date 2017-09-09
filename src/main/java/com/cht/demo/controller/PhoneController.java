package com.cht.demo.controller;


import com.cht.demo.domain.Phone;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value="/phone")
public class PhoneController {


    //http://localhost:8080/phone/
    @RequestMapping
    public String index(){
        return "Hello World!";
    }

    @RequestMapping("/name/{name}")
    public Phone view(@PathVariable("name") String name) {
        Phone phone = new Phone();
        phone.setPhoneName(name);
        return phone;
    }


    //http://localhost:8080/phone/getmap
    @RequestMapping(value="/getmap")
    public Map<String,String> getMap(){
        Map<String,String> phoneMap = new HashMap<String,String>();
        phoneMap.put("name", "apple phone");
        phoneMap.put("money", "5000");
        return phoneMap;
    }
}
