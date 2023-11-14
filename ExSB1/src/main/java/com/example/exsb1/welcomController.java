package com.example.exsb1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.namespace.QName;
import java.util.ArrayList;
@RestController
public class welcomController {
    @GetMapping(path = "/name")
    public String name() {
        return " My name is Yousef";
    }
    @GetMapping(path = "/age")

    public int age(){

        return 25;
    }
    @GetMapping(path = "/check")

    public  String status(){
        return "Everything OK";
    }
    @GetMapping(path = "/health")

    public  String health(){
        return "Server health is up and running";
    }
    @GetMapping(path = "/names")

    public String names(){
        var nam =new ArrayList<>();
        nam.add("Yousef");
        nam.add("bader");
        nam.add("faisal");
        nam.add("bandier");

        return nam.toString();
    }

}
