package lk.questionserver.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import lk.questionserver.dao.QuestionDao;
import lk.questionserver.db.DBConnection;
import lk.questionserver.dto.AnswerDto;
import lk.questionserver.dto.QuestionDto;

public class QustionDaoImpl implements QuestionDao{

	


	@Override
	public QuestionDto getQustion(Integer reqId) throws Exception {
		
		Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select * from question LIMIT 1 OFFSET "+reqId+"";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        
       
        while (rst.next()) {
        	QuestionDto questionDto = new QuestionDto();
        	questionDto.setId(rst.getString("id"));
            questionDto.setQuestion(rst.getString("question"));
            
            String sqlAnswer = "select * from answers where question_id='"+questionDto.getId()+"'";
            Statement stmAnswer = connection.createStatement();
            ResultSet rstAnswer = stmAnswer.executeQuery(sqlAnswer);
            
            List<AnswerDto> answerDtos = new ArrayList<AnswerDto>();
            while (rstAnswer.next()) {
            	AnswerDto answerDto = new AnswerDto();
            	answerDto.setAnswer(rstAnswer.getString("answers"));
            	answerDto.setId(rstAnswer.getString("id"));
            	answerDtos.add(answerDto);
            }
            
            questionDto.setAnswerDtos(answerDtos);
            return questionDto;
            
        }

        return null;
	}
	

}
