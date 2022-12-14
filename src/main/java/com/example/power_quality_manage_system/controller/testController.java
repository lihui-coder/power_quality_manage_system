package com.example.power_quality_manage_system.controller;

import com.example.power_quality_manage_system.entity.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
public class testController {
    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    public String test1(@RequestParam(value = "nickname", required = false) String name, Integer age){
        System.out.println(name);
        System.out.println(age);
        return "test1";
    }

    @RequestMapping(value = "/test2", method = RequestMethod.POST)
    public String test2(Student student){
        System.out.println(student);
        return "test2";
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public  String upload(MultipartFile photo, HttpServletRequest request) throws IOException {
        System.out.println(photo.getContentType());
        System.out.println(photo.getOriginalFilename());
        String path = request.getServletContext().getRealPath("/upload/");
        System.out.println(path);
        saveFile(path, photo);
        return "上传成功";
    }

//    这个请求被拦截
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(String username, String password){
        System.out.println(username);
        System.out.println(password);
        return "登录成功";
    }

    public void saveFile(String path, MultipartFile photo) throws IOException {
        File dir = new File(path);
        if(!dir.exists()){
            dir.mkdir();
        }
        File file = new File(path + photo.getOriginalFilename());
        photo.transferTo(file);
    }
}
