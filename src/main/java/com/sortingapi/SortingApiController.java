package com.sortingapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class SortingApiController {

    @GetMapping("/hola")
    public String helloWorld() {
        return "Hello World";
    }
}
