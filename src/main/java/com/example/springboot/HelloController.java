package com.example.springboot;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/megha")
    public String sd() {
        return "Greetings from Megha!";
    }

    @GetMapping("/Greetings")
    public String greeting(@RequestParam(name="name", required=true, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "Greeting: " + name;
    }

    @GetMapping("/square")
    public String square(@RequestParam(name="num", required=true, defaultValue="World") int num, Model model) {
        model.addAttribute("name", num);
        return "Square is: " + Math.pow(num, 2);
    }

    @GetMapping("/calc")
    public String calc(
            @RequestParam(name="val", required=true) int num,
            @RequestParam(name="pow", required=true) int pow)
            {
                return "Result is: " + Math.pow(num, pow);
            }
}