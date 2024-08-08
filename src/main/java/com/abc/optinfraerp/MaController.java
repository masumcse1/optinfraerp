package com.abc.optinfraerp;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//hello/bd
@RestController
@RequestMapping("/hello")
public class MaController {

    @RequestMapping(value ="/bd",method = RequestMethod.GET)
    public ResponseEntity<String> getMyName() {

        return new ResponseEntity<>("Done App Azure app", HttpStatus.OK);
    }

}


///http://localhost:8080/hello/bd