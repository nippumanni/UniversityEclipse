package com.example.university;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.university.domain.Course;
import com.example.university.domain.Department;
import com.example.university.domain.Person;
import com.example.university.domain.Staff;
import com.example.university.domain.Student;
import com.example.university.repo.CourseRepository;
import com.example.university.repo.StaffRepository;
import com.example.university.repo.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;


@Service
public class UniversityService {
	
	@Autowired
	private StaffRepository staffrepository;
	
	public void saveStaffForPostOne ()
	{
		Person person = new Person("OnefirstName","OnelastName");
		Staff staff = new Staff(person);
		staffrepository.save(staff);
	}
	
	public void saveStaffForPostTwo ()
	{
		Person person = new Person("TwofirstName","TwolastName");
		Staff staff = new Staff(person);
		staffrepository.save(staff);
	}

	public Staff findOne()
	{
		return staffrepository.findOne(1);

	}

	public Iterable<Staff> findAll()
	{
		return staffrepository.findAll();

	}
	
}
