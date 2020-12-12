package lk.questionserver.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

import lk.questionserver.dto.QuestionDto;

public interface RemoteQuestionService extends Remote{

	public QuestionDto getQustion(Integer reqId)throws Exception;
	
	
}
