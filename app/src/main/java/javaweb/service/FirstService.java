package javaweb.service;

import common.constant.*;

public class FirstService {
    public String processString(String input){
        if (input != null && !input.isEmpty()){
            input = input.toUpperCase();
        } else {
            return CommonConst.ERROR_MESSAGE_01;
        }
        return input;
    }
}