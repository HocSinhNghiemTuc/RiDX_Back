package com.hust.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeAPI {
    @GetMapping("/api/test")
    public ResponseEntity<String> testStringBoot(){
        return ResponseEntity.ok("Success");
    }
}
