package com.example.demo.controller;

import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;

@RestController
@Api("控制器")
/**
 *
 */
public class ControllerTest {
    Logger logger = LoggerFactory.getLogger(ControllerTest.class);


    //可映射多个url
    @GetMapping(value = {"/hello","/h"})
    /** */
    public String hello() {
        return "SpringBoot: Hello!";
    }
//
//    @GetMapping(value = "/name/{name}")
//    /** */
//    public String hello1(@PathVariable("name") String s) {
//        System.out.println("Name: " + s);
//        return "Name: " + s;
//    }
//
    @GetMapping(value = "/name")
    /**
     * 请求参数名与方法形参名相同可不使用该注解
     */
    public String hello2(@RequestParam(value = "name", required = false) String s) {
        System.out.println("Name: " + s);
        return "Name: " + s;
    }

    @GetMapping(value = "/name1")
    /**
     * 请求参数名与方法形参名相同可不使用该注解
     */
    public String hello3(@RequestParam(value = "name", defaultValue = "姜子牙") String s) {
        System.out.println("Name: " + s);
        return "Name: " + s;
    }
//
//    @PostMapping("post")
//    /**
//     *
//     */
//    public String post(String name, String age) {
//        logger.info("Name:" + name + "Age:" + age);
//        return "Name:" + name + "Age:" + age;
//    }
//
//    @PostMapping("/postString")
//    /**
//     *
//     */
//    public String postString(HttpServletRequest request) {
//        ServletInputStream is = null;
//        StringBuilder      sb = null;
//        try {
//            is = request.getInputStream();
//            sb = new StringBuilder();
//            byte[] buf = new byte[1024];
//            int    len = 0;
//            while ((len = is.read(buf)) != -1) {
//                sb.append(new String(buf, 0, len));
//            }
//            System.out.println(sb.toString());
//            return sb.toString();
//        } catch (Exception e) {
//            e.printStackTrace();//输出异常信息
//        } finally {
//            try {
//                if (is != null) {
//                    is.close();
//                }
//            } catch (Exception e) {
//                e.printStackTrace();//输出异常信息
//            }
//
//        }
//
//        return sb.toString();
//    }
}
