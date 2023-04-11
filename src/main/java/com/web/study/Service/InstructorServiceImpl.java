package com.web.study.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.web.study.Repository.InstructorRepository;
import com.web.study.domain.entity.Instructor;
import com.web.study.dto.request.lecturer.InstructorReqDto;
import com.web.study.dto.response.InstructorRespDto;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class InstructorServiceImpl implements InstructorService{
	public final InstructorRepository instructorRepository;
	
	@Override
	public void registInstructor(InstructorReqDto instructorReqDto) {
		Instructor instructor = instructorReqDto.toEntity();
		instructorRepository.registe(instructor);
		
	}
	@Override
	public List<InstructorRespDto> getInstructorAll() {
		List<InstructorRespDto> dtos = new ArrayList<>();
		instructorRepository.getInstructorAll().forEach(entity -> {
			dtos.add(entity.toDto());
		});
		return dtos;
	}
	@Override
	public InstructorRespDto findInstructorById(int id) {
		return instructorRepository.findInstructorById(id).toDto();
	}
	
}
