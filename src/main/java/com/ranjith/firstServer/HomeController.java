package com.ranjith.firstServer;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/message")
    public ResponseEntity<?> getMessage(){
        return ResponseEntity.ok("Ranjith Welcomes You!!");
    }
}
