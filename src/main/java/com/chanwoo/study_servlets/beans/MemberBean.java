package com.chanwoo.study_servlets.beans;

public class MemberBean {
    String firstName;
    String secondName;
    String HandleName;
    
    public String getFirstName(){
        return this.firstName;
    }
    public String getsecondName(){
        return this.secondName;
    }
    public String getHandleName(){
        return this.HandleName;
    }

    public void setfirstName(String firstName){
        this.firstName = firstName;
    }
    public void setsecondName(String secondName){
        this.secondName = secondName;
    }
    public void setHandleName(String HandleName){
        this.HandleName = HandleName;
    }


}
