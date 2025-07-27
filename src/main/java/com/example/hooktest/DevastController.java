package com.example.hooktest;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestController
@RequestMapping("/devast")
public class DevastController {
    int counter = 0;
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    String doHook(@RequestBody(required = false) Map<String,Object> body) {
        System.out.println("POST" + counter++);
        //System.out.println(body);


        //recursivePrint(body);
       return "{\"type\":\"commands\", \"content\": [\"!build=steel_wall:149:149\"]}";

        //return "{ \"type\": \"filter\", \"content\": 0 }";
    }

    void recursivePrint(Map<String,Object> body){
        for (Map.Entry<String, Object> entry : body.entrySet()) {
            if (entry.getValue() instanceof Map) {
                recursivePrint((Map<String,Object>)entry.getValue());
                continue;
            }
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
