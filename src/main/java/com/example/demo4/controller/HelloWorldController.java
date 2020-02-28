package com.example.demo4.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/")
    public String hello()
    {
        return "Hello Spring";
    }

    @RequestMapping("/shop")
    public String shop()
    {
        return " <div>\n" +
                "        <ul>\n" +
                "            <li>Apple</li>\n" +
                "            <li>Cookies</li>\n" +
                "        </ul>\n" +
                "    </div>";
    }
}
