package com.web.study.Service;



import java.util.List;

import com.web.study.domain.entity.Lecture;
import com.web.study.dto.request.lecture.LectureReqDto;
import com.web.study.dto.response.LectureRespDto;

public interface LectureService {
	public void registLecture(LectureReqDto lectureReqDto) ;
	public List<LectureRespDto> getLectureAll();
	public LectureRespDto findLectureById(int id);
	public List<LectureRespDto> searchLecture(int type, String searchValue);
}
