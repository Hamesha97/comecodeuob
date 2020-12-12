package lk.questionserver.service.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import lk.questionserver.dao.QuestionDao;
import lk.questionserver.dao.impl.QustionDaoImpl;
import lk.questionserver.dto.QuestionDto;
import lk.questionserver.service.RemoteQuestionService;

public class RemoteQuestionServiceImpl extends UnicastRemoteObject  implements RemoteQuestionService {

	private QuestionDao questionDao;
	
	public RemoteQuestionServiceImpl() throws Exception {
		super();
		questionDao = new QustionDaoImpl();
	}

	@Override
	public QuestionDto getQustion(Integer reqId) throws Exception{
		
		try {
			return questionDao.getQustion(reqId);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		
	}

}
