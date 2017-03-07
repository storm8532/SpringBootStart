package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by Administrator on 2017/3/7 0007.
 */
@Controller
public class JspController {

    @RequestMapping(value = "/helloJsp")
    public String helloJsp(Map<String,Object> map) {
        map.put("key","test");
        return "helloJsp";
    }
}
