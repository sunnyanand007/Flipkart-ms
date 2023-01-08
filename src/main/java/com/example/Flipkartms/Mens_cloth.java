package com.example.Flipkartms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mens_cloth {
    @GetMapping("/Mens_cloth")
    public String getData(){
        return "Good mens cloth";
    }

}
