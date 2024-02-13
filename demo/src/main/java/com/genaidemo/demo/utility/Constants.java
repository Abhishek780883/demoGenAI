package com.genaidemo.demo.utility;

import lombok.Data;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
@Data
public class Constants {

    public static HashMap<String,Map<String,String>> contactUsDetails = new HashMap<>();
    public static HashMap<String, Map<String, String>> testDataStore = new HashMap<String, java.util.Map<String, String>>();

}
