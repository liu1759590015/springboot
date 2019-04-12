package com.baizhi;

import com.baizhi.dao.StudentMapper;
import com.baizhi.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootDemoApplicationTests {
    @Autowired
    private StudentMapper studentMapper;
    @Test
    public void contextLoads() {
        /*Student student = studentMapper.selectByPrimaryKey(1);
        //System.out.println(student);
        student.setName("唐嫣");
        studentMapper.updateByPrimaryKey(student);*/

        /*Student student1=new Student();
        student1.setId(2);
        student1.setName("刘诗诗");
        studentMapper.updateByPrimaryKey(student1);*/

        Student student=new Student();
        student.setId(3);
        student.setName("刘亦菲");
        studentMapper.updateByPrimaryKeySelective(student);

    }

}
