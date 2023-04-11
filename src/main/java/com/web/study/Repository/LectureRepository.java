package com.web.study.Repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.web.study.domain.entity.Lecture;

@Mapper
public interface LectureRepository {
	public int registe(Lecture lecture);
	public List<Lecture> getLectureAll();
	public Lecture findLectureById(int id);
	public List<Lecture> searchLecture(Map<String, Object> parameter);
}
