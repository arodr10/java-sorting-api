package com.sortingapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api")
public class SortingApiController {

    @GetMapping("/sort")
    public String helloWorld(@RequestParam String sampleWord) {
        SortSelection selection = new SortSelection();
        String ordered = selection.process(sampleWord);
        return ordered;
    }
}

