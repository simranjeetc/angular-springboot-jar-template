package com.opengrok;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller
{
    @RequestMapping("/api/hello")
    public String hello()
    {
        return "this is open-grok config app";
    }
}
