package com.web.study.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.web.study.Repository.LectureRepository;
import com.web.study.domain.entity.Lecture;
import com.web.study.dto.request.lecture.LectureReqDto;
import com.web.study.dto.response.CourseRespDto;
import com.web.study.dto.response.LectureRespDto;

import lombok.RequiredArgsConstructor;
//@service는 컴포넌트 종류중 하나 @Component처럼 ioc(Service) 컨테이너에 넣어주는거임 

@Service
@RequiredArgsConstructor
public class LectureServiceImpl implements LectureService{
	
	private final LectureRepository lectureRepository;
	
	
	@Override
	public void registLecture(LectureReqDto lectureReqDto) {
		//Dto 를 entity로 변환
		Lecture lecture = lectureReqDto.toEntity();
//		lectureReqDto에는 json의 형태로 온 lecture값들은 넣어서
//		Lecture 클래스로 만들어서 리턴해주는 toEntity가 있어서 lecture가 생성됨
		System.out.println(lecture);
		lectureRepository.registe(lecture);
//		lectureRepository(인터페이스)registe에 lecture를 넣어주면
//		mappers의 Lecture.xml에서 mysql에 넣어줌
	}
	@Override
	public List<LectureRespDto> getLectureAll() {
		List<LectureRespDto> dtos = new ArrayList<>();
		lectureRepository.getLectureAll().forEach(entity -> {
			dtos.add(entity.dto());
		});
		return dtos;
	}
	@Override
	public LectureRespDto findLectureById(int id) {
		return lectureRepository.findLectureById(id).dto();
	}
	
	@Override
	public List<LectureRespDto> searchLecture(int type, String searchValue) {
		Map<String,Object> parameterMap = new HashMap<>();
		parameterMap.put("type", type);
		parameterMap.put("searchValue", searchValue);
		
		List<LectureRespDto> dtos = new ArrayList<>();
		lectureRepository.searchLecture(parameterMap).forEach((entity -> {
			dtos.add(entity.dto());
		}));
		return dtos;
	}
	
	
}
