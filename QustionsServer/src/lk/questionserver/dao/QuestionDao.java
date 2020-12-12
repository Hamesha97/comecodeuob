package lk.questionserver.dao;

import java.util.List;

import lk.questionserver.dto.QuestionDto;

public interface QuestionDao {

	public QuestionDto getQustion(Integer reqId)throws Exception;
}
