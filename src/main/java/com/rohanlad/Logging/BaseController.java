package com.rohanlad.Logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {
    Logger logger= (Logger) LoggerFactory.getLogger(BaseController.class);
    @RequestMapping("/")
    public String welcome(){
        logger.trace("welcome() accessed!!!");
        return "welcome!";
    }
}
