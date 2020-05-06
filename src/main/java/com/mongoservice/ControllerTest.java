package com.mongoservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class ControllerTest {

    @GetMapping
    String abc(@RequestParam(value = "name" , required = false) String name){
        return name + " Hello world !";
    }


}
