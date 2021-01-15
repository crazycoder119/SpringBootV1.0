package com.chandima.log4j.demo.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import java.util.Date;


@RestController
@RequestMapping(value = "/log")
public class LoggingController {
    Logger logger = LoggerFactory.getLogger(LoggingController.class);

    @RequestMapping(value = "/response/{name}", method = RequestMethod.GET)
    public String getResponse(@PathVariable String name){
        logger.error("Getresponse method");
        logger.error("RequestParam : " +name);
        return name + " _ " + new Date();
    }

    @RequestMapping(value = "/exception", method = RequestMethod.GET)
    public void throwException(){
        try {
            throw new Exception();
        } catch (Exception e) {
            logger.error("Exception - ", e);
        }
    }


}
