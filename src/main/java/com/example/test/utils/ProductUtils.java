package com.example.test.utils;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import net.bytebuddy.description.method.MethodDescription;
import org.json.JSONArray;
import org.json.JSONException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import javax.xml.crypto.Data;
import java.io.File;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import com.google.gson.reflect.TypeToken;

@Slf4j
public class ProductUtils {
    private ProductUtils(){

    }
    public static ResponseEntity<String> getResponseEntity(String responseMessage, HttpStatus httpStatus){
        return new ResponseEntity<String>("{\"message\":\""+responseMessage+"\"}", httpStatus);
    }

    public static String getUUID (){
        Date date = new Date();
        long time = date.getTime();
        return "BILL-"+ time;
    }

    public static JSONArray getJasonArrayFromString(String data) throws JSONException {
        JSONArray jsonArray = new JSONArray(data);
        return jsonArray;
    }
    public static boolean isNullOrEmpty(String str){
        return str== null || str.isEmpty();
    }


    public static Map<String,Object> getMapFromJson(String data){
        if(!isNullOrEmpty(data))
            return new Gson().fromJson(data,new TypeToken<Map<String,Object>>() {
        }.getType());
        return new HashMap<>();
}

public static Boolean isFileExist(String path){
        log.info("inside isFileExist");
        try{
            File file=new File(path);
            return (file !=null && file.exists()) ? Boolean.TRUE : Boolean.FALSE;

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return false;
}
}