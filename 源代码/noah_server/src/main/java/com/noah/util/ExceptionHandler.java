package com.noah.util;

import com.noah.model.Response;
import org.apache.tomcat.util.buf.StringUtils;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

public class ExceptionHandler {

    public static Response getMessage(ConstraintViolationException e){
        Response responseMsg;
        List<String> msgList=new ArrayList<String>();
        for(ConstraintViolation<?> constraintViolation:e.getConstraintViolations()){
            msgList.add(constraintViolation.getMessage());
        }
        String messages= StringUtils.join(msgList);
        responseMsg=new Response(2,messages,null);
        return responseMsg;
    }

}
