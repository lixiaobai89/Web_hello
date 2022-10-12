package com.lishan.ssm.utils.designPatterns.other;

import java.util.Map;

public class Test {

    public Map print(Map map) {


        map.put("b", 000);
        System.out.println("这是Test类" + map.toString());

        return map;
    }

    public String printStr(String s) {


        s = "bbb";
        System.out.println("这是Test类" + s);

        return s;
    }
}
