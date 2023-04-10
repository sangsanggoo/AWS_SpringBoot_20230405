package com.web.study.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.study.Repository.StudentRepository;
import com.web.study.domain.entity.Student;
import com.web.study.dto.request.student.StudentReqDto;
import com.web.study.dto.response.StudentRespDto;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	public StudentRepository studentRepository;
	@Override
	public void registStudent(StudentReqDto studentReqDto) {
		Student student = studentReqDto.toEntity();
		studentRepository.registe(student);
	}
	@Override
	public List<StudentRespDto> getStudentAll() {
		List<StudentRespDto> dts = new ArrayList<>();
		studentRepository.getStudentAll().forEach(entity -> {
			dts.add(entity.toDto());
		});
		return dts;
	}
	
	@Override
	public StudentRespDto getStudentById(int id) {
		return studentRepository.getStudentById(id).toDto();
	}
}
