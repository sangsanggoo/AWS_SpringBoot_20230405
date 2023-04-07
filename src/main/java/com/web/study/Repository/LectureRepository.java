package com.web.study.Repository;

import org.apache.ibatis.annotations.Mapper;

import com.web.study.domain.entity.Lecture;
import com.web.study.domain.entity.LectureRegist;
// mybatis를 사용하면 Impl을 안만들어도 됨
import com.web.study.domain.entity.Lecturer;
import com.web.study.domain.entity.Student;

@Mapper
public interface LectureRepository {
	public int registe(Lecture lecture);
	public int registe2(Lecturer lecturer);
	public int registe3(Student student);
	public int registe4(LectureRegist lectureRegist);
}
