package com.example.MyFirstSpring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // GET Request - Default Hello Message
    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    // POST Request - Accept name as input
    @PostMapping
    public String sayHelloPost(@RequestBody String name) {
        return "Hello, " + name + "!";
    }

    // PUT Request - Update name
    @PutMapping("/{name}")
    public String sayHelloPut(@PathVariable String name) {
        return "Updated Hello, " + name + "!";
    }

    // DELETE Request - Say Goodbye
    @DeleteMapping("/{name}")
    public String sayGoodbye(@PathVariable String name) {
        return "Goodbye, " + name + "!";
    }
}
