package lk.questionserver.main;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import lk.questionserver.service.RemoteQuestionService;
import lk.questionserver.service.impl.RemoteQuestionServiceImpl;


public class StartServer {
	

	public static void main(String[] args) {
		
	System.out.println("Attempting to start the Question Server..."); 
	try {
		RemoteQuestionService remoteQuestionService = new RemoteQuestionServiceImpl();
		Registry reg = LocateRegistry.createRegistry(1098);
		reg.rebind("QuestionService",remoteQuestionService);

		System.out.println("Service started. Welcome to the RMI Question Service!");

	} catch (Exception e) {
		System.out.println("An error occured: "+e.toString()); 
		e.printStackTrace();
	} 
	}
}
