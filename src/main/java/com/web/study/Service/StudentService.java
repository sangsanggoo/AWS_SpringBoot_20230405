package com.web.study.Service;

import java.util.List;

import com.web.study.domain.entity.Student;
import com.web.study.dto.request.student.StudentReqDto;
import com.web.study.dto.response.StudentRespDto;

public interface StudentService {
	public void registStudent(StudentReqDto studentReqDto);
	public List<StudentRespDto> getStudentAll();
	public StudentRespDto getStudentById(int id);
}
