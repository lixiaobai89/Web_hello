package com.lishan.ssm.action;

import com.alibaba.druid.pool.vendor.SybaseExceptionSorter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class dictionary {

    private final String index = "index";

    @RequestMapping("/index")
    public String dir(){

        System.out.println("ddd");
        System.out.println("aaa");
        return index;
    }

}
