package com.chanwoo.study_servlets.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;


public class PollWithDB {
    public HashMap<String, Object> getQuestion(String questionsUid) throws SQLException{
        Commons commons = new Commons();
        Statement statement = commons.getStatement();
        
        ResultSet resultset = statement.executeQuery("SELECT * FROM QUESTIONS_LIST WHERE QUESTIONS_UID = '"+questionsUid+"'");
        HashMap<String, Object> result = null;
        while(resultset.next()){
            result = new HashMap<>();
            result.put("QUESTIONS_UID",resultset.getString("QUESTIONS_UID"));
            result.put("QUESTIONS",resultset.getString("QUESTIONS"));
            result.put("ORDERS",resultset.getString("ORDERS"));

        }
        return result;
    }
}
