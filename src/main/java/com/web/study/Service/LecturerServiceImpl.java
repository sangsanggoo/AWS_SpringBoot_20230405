package com.web.study.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.web.study.Repository.LecturerRepository;
import com.web.study.domain.entity.Lecturer;
import com.web.study.dto.request.lecture.LectureReqDto;
import com.web.study.dto.request.lecturer.LecturerReqDto;
import com.web.study.dto.response.LecturerRespDto;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class LecturerServiceImpl implements LecturerService{
	public final LecturerRepository lecturerRepository;
	
	@Override
	public void registLecturer(LecturerReqDto lecturerReqDto) {
		Lecturer lecturer = lecturerReqDto.toEntity();
		lecturerRepository.registe(lecturer);
		
	}
	@Override
	public List<LecturerRespDto> getLectureAll() {
		List<LecturerRespDto> dtos = new ArrayList<>();
		lecturerRepository.getLecturerAll().forEach(entity -> {
			dtos.add(entity.toDto());
		});
		return dtos;
	}
	@Override
	public LecturerRespDto findLectureById(int id) {
		return lecturerRepository.findLectureById(id).toDto();
	}
	
}
