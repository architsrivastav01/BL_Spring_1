package com.example.MyFirstSpring.controller;

import com.example.MyFirstSpring.model.Message;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // GET Request - Default Hello Message
    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
        //	http://localhost:8080/hello  --> to run on browser
    }

//    // POST Request - Accept name as input
//    @PostMapping
//    public String sayHelloPost(@RequestBody String name) {
//        return "Hello, " + name + "!";
//    }
//
//    // PUT Request - Update name
//    @PutMapping("/{name}")
//    public String sayHelloPut(@PathVariable String name) {
//        return "Updated Hello, " + name + "!";
//    }
//
//    // DELETE Request - Say Goodbye
//    @DeleteMapping("/{name}")
//    public String sayGoodbye(@PathVariable String name) {
//        return "Goodbye, " + name + "!";
//    }
//}
//GET Request with Query Parameter
@GetMapping("/query")
public String sayHello(@RequestParam String name) {
    return "Hello " + name + " from BridgeLabz!";
    //	http://localhost:8080/hello/query?name=archit  --> to run on browserUC_2
}
    // GET Request with Path Variable
    @GetMapping("/param/{name}")
    public String sayHellousingPath(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz!";
    }
    @PostMapping("post")
    public String greetWithRequestBody(@RequestBody Message names){
        return "Hello, "+names.getFirstName()+" "+names.getLastName();
    }

}