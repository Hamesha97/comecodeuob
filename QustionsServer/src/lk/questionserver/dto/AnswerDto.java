package lk.questionserver.dto;

import java.io.Serializable;

public class AnswerDto implements Serializable{

	private String id;
	private String answer;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	
}
