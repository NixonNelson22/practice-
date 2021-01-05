/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.simple_web_application;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nixon
 */
@RestController
public class simpleController {
    @RequestMapping("/")
    public String Index() {
        return("hello world!");
    }
    
    
}
