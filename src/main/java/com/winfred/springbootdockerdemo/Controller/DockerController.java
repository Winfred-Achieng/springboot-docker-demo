package com.winfred.springbootdockerdemo.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {


    @GetMapping("/docker")
    public String getDemo(){

        return "Demo for springboot and docker";
    }
}
