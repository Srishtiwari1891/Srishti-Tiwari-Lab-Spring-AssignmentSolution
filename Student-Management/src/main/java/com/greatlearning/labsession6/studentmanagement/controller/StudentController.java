package com.greatlearning.labsession6.studentmanagement.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.greatlearning.labsession6.studentmanagement.entity.Student;
import com.greatlearning.labsession6.studentmanagement.service.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@GetMapping("/list")
	public String showStudents(Model model){
		model.addAttribute("students",studentService.findAll());
	return "student-list";
		//return "home";
	}
	
	@RequestMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {
		model.addAttribute("student", new Student());
		model.addAttribute("mode", "Add");
		return "student-form";
	}

	@RequestMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("studentId") int studentId, Model model) {
		model.addAttribute("student", studentService.findById(studentId));
		model.addAttribute("mode", "Update");
		return "student-form";
	}

	@PostMapping("/save")
	public String saveBook(@RequestParam("studentId") int studentId, @RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName, @RequestParam("course") String course, @RequestParam("country") String country) {
		Student student = null;
		if (studentId== 0)
			student= new Student(firstName, lastName, course, country);
		else {
			student = studentService.findById(studentId);
			student.setFirstName(firstName);
			student.setLastName(lastName);
			student.setCourse(course);
			student.setCountry(country);
		}
		studentService.save(student);
		return "redirect:/students/list";
	}

	@RequestMapping("/delete")
	public String delete(@RequestParam("studentId") int studentId) {
		studentService.deleteById(studentId);
		return "redirect:/students/list";
	}
	
	@RequestMapping("/403")
	public String AccessDenied() {
		return "403";
	}
}
