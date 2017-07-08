package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by osiefart on 10.05.17.
 */
@RestController
@RequestMapping("/helloworld")
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET)
    public String helloWorld(){
        return "hello world :-)";
    }

}
