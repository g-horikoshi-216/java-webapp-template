package javaweb.service;

import common.constant.*;

public class SecondService {
    public String execute(String input){
        if(input != null && !input.isEmpty()){
            return "!!!" + input + "!!!";
        } else {
            return CommonConst.ERROR_MESSAGE_01;
        }
    }
    
}
