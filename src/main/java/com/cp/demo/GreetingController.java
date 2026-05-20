package com.cp.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/demo")
@CrossOrigin(origins =  "https://practice-deployment-frontend.vercel.app/")
public class GreetingController {

    @GetMapping("/hello")
    public Map<String, String> getMessage() {

        Map<String, String> response = new HashMap<>();

        response.put("message", "Hello from Spring Boot");

        return response;
    }


//    public StudentRepository studentRepository;
//
//    public GreetingController(StudentRepository studentRepository) {
//        this.studentRepository = studentRepository;
//    }
//
//
//    @PostMapping("/add")
//    public String addStudent(@RequestBody UserRequest ur){
//        Users u1 = new Users(ur.getName());
//        System.out.println("Name : " + u1.getName());
//        System.out.println("ID : " + u1.getId() );
//        studentRepository.save(u1);
//        return ur.getName();// "Added Student";
//    }
//
//    @GetMapping("/getall")
//    public List<Users> getAllStudents(){
//        return studentRepository.findAll();
//    }




}
