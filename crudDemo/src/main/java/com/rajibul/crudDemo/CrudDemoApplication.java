package com.rajibul.crudDemo;

import com.rajibul.crudDemo.DAO.StudentDAO;
import com.rajibul.crudDemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudDemoApplication.class, args);
	}
		@Bean
		public CommandLineRunner comandlineRunner (StudentDAO studentDAO){


		return runner ->{
//			createstudent(studentDAO);
			createMultiplestudent(studentDAO);
		};
	}

	private void createMultiplestudent(StudentDAO studentDAO) {

		//create multiple student

		System.out.println("Creating 3 Student object");
		Student tempStudent1=new Student("JOHN","HEHE","johnhehe@gmail.com");
		Student tempStudent2=new Student("DON","HEHE","donhehe@gmail.com");
		Student tempStudent3=new Student("MOTU","HEHE","motuhehe@gmail.com");

		//save the student object
		System.out.println("Save the Student...........");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);



	}

	private void createstudent(StudentDAO studentDAO) {





		//create the student object
		System.out.println("Creating new Student object");
		Student tempStudent=new Student("Rajibul","Mondal","rajibulmondal173@gmail.com");


		//save the student object
		System.out.println("Save the Student...........");
		studentDAO.save(tempStudent);
		//display the id of saved student
		System.out.println("Saved student.Generated id : "+tempStudent.getId());
	}

}



