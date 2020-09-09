package com.lishan.ssm.utils.designPatterns.other;

import org.apache.commons.lang3.StringUtils;

public class TestIsNull {
    public static void main(String[] args) {
        String msg = "";
        String msgNull = null;
        msg.isEmpty();
        StringUtils.isBlank(msgNull);
        StringUtils.isEmpty(msgNull);
        //boolean s = "fdsf".isBlank();
        System.out.println(msgNull);
        //msgNull.isEmpty();
        //msgNull.isBlank();
    }
}
