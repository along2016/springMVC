package test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import service.StudentService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:main/resources/spring-mybatis.xml"})
public class StudentTest{

	private static Logger logger = Logger.getLogger(StudentTest.class);
	
	@Resource
	private StudentService studentService;
	
	@Test
	public void test1(){
//		Student student = studentService.getStudentById(1);
	}
}
