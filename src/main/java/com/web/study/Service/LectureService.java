package com.web.study.Service;



import com.web.study.domain.entity.LectureRegist;
import com.web.study.dto.request.LectureRegistReqDto;
import com.web.study.dto.request.LectureReqDto;
import com.web.study.dto.request.LecturerReqDto;
import com.web.study.dto.request.StudentReqDto;

public interface LectureService {
	public void registLecture(LectureReqDto lectureReqDto) ;
	public void registLecturer(LecturerReqDto lecturerReqDto);
	public void registStudent(StudentReqDto studentReqDto);
	public void registLecetureRegist(LectureRegistReqDto lectureRegistReqDto );
	
}
