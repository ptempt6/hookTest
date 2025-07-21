package com.example.hooktest;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/devast")
public class DevastController {

    @PostMapping
    ResponseEntity<Integer> doHook(@RequestBody(required = false) Object body) {
        System.out.println(body);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
