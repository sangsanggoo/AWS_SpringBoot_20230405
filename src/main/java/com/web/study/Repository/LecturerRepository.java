package com.web.study.Repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.web.study.domain.entity.Lecturer;
@Mapper
public interface LecturerRepository {
	public int registe(Lecturer lecturer);
	public List<Lecturer> getLecturerAll();
	public Lecturer findLectureById(int id);
}
