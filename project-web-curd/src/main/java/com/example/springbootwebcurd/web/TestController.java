package com.example.springbootwebcurd.web;

import org.springframework.web.bind.annotation.*;

/**
 * ***GOOD LUCK****
 *
 * @Author : Wukn
 * @Date : 2018/6/
 */
@RestController
@RequestMapping(value = "test")
public class TestController {


    /**
     * 测试
     * @return
     */
    @ResponseBody
    @PostMapping(value = "hello")
    public String helloWord() {
        return "Hello Word !!!";
    }











}
