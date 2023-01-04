package com.baiyao.liteflow.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: tonganyuan
 * @Date: 2023/1/3 14:32
 * @Description:
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/param")
    public String test(@RequestParam("param") String param) {
        return param;
    }

}
