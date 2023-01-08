package com.example.Flipkartms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Womens_cloth {
    @GetMapping("/Womens_cloth")
    public String getData(){
        return "Local women's cloth";
    }

}
