package com.example.hooktest;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/devast")
public class DevastController {
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    String doHook(@RequestBody(required = false) Map<String,Object> body) {
        System.out.println("POST");
        System.out.println(body);
        return "{\"type\":\"commands\", \"content\": [\"!build=wood_wall:149:149\"]}";
    }
}
