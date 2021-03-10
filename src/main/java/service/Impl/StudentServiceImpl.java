package service.Impl;

import dao.StudentDao;
import domain.Student;
import org.springframework.stereotype.Service;
import service.StudentService;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "studentService")
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;
    @Override
    public int addStudent(Student student) {
        int nums = studentDao.insertStudent(student);
        return nums;
    }

    @Override
    public List<Student> findStudents() {

        return studentDao.selectStudents();
    }
}
