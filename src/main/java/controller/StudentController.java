package controller;

import domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.StudentService;

import javax.annotation.Resource;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentService service;
    @RequestMapping("/addStudent.do") 
    public ModelAndView addStudent(Student student){
        ModelAndView mv = new ModelAndView();
        String tips = "注册失败";
        int nums = service.addStudent(student);
        if (nums>0){
            tips = "注册成功";
        }
        mv.addObject("tips", tips);
        mv.setViewName("result");
        return mv;
    }
}
