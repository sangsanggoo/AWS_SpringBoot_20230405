package com.web.study.Service;

import java.util.List;

import com.web.study.domain.entity.Lecturer;
import com.web.study.dto.request.lecturer.LecturerReqDto;
import com.web.study.dto.response.LecturerRespDto;

public interface LecturerService {
	public void registLecturer(LecturerReqDto lecturerReqDto);
	public List<LecturerRespDto> getLectureAll();
	public LecturerRespDto findLectureById(int id);
}
