
package com.example.ms1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdditionController {

    @GetMapping("/ms1/add")
    public String add(
            @RequestParam("a") int a,
            @RequestParam("b") int b) {

        int sum = a + b;

        return "MS 1.1 - Additon = " + sum;
    }
}
