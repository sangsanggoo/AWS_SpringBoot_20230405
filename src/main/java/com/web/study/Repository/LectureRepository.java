package com.web.study.Repository;

import org.apache.ibatis.annotations.Mapper;

import com.web.study.domain.entity.Lecture;
// mybatis를 사용하면 Impl을 안만들어도 됨

@Mapper
public interface LectureRepository {
	public int registe(Lecture lecture);
}
