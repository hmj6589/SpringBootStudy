package com.example.sbb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import com.example.sbb.answer.Answer;
import com.example.sbb.question.Question;
import com.example.sbb.question.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.example.sbb.question.QuestionService;


@SpringBootTest
class SbbApplicationTests {

	@Autowired
	private QuestionService questionService;

//	@Transactional
	@Test
	void testJpa() {
		for (int i=1;i<=300;i++){
			String subject = String.format("테스트 데이터입니다:[%03d]", i);
			String content="내용 없음";
			this.questionService.create(subject, content);
		}
	}
}