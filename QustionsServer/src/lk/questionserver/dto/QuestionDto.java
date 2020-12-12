package lk.questionserver.dto;

import java.io.Serializable;
import java.util.List;

public class QuestionDto implements Serializable{

	
	private String id;
	private String question;
	private List<AnswerDto> answerDtos;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<AnswerDto> getAnswerDtos() {
		return answerDtos;
	}
	public void setAnswerDtos(List<AnswerDto> answerDtos) {
		this.answerDtos = answerDtos;
	}
	
	
	
}
