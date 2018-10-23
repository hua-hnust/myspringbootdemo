package com.example.demo.contorller;

import com.example.demo.service.StudentsService;
import com.example.demo.model.Students;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by hua on 2018-03-23.
 * Describe:
 */

@Controller
@RequestMapping("/user")
public class HelloContorller {

    @Autowired
    private StudentsService studentsService;

    @RequestMapping("/hello")
    public String hello(){
        return "hello!";
    }

    //返回HTML页面不能用 @RestController注解
    @GetMapping("/student")
    public String student(Model model){
        Students student = studentsService.queryStudentsById(1);
        model.addAttribute("user",student);
        return  "student";
    }

    @RequestMapping("/students")
    @ResponseBody
    public List<Students> studentses(){
        List<Students> list = studentsService.queryStudentsByName("小明");
        return list;
    }
}
