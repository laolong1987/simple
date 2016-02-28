package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by gaoyang on 16/2/28.
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping(value = "/show")
    public String show(HttpServletRequest request,
                                HttpServletResponse response) {

        return "/jsp/demo";
    }
}
