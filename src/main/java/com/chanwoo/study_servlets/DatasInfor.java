package com.chanwoo.study_servlets;

import java.util.ArrayList;
import java.util.HashMap;

import com.chanwoo.study_servlets.beans.MemberBean;

import jakarta.servlet.http.HttpServlet;

public class DatasInfor {
    public HashMap<String, String> getSearchFormData() {
        HashMap<String, String> searchForm = new HashMap<String, String>();
        searchForm.put("search_key", "Search Title");
        searchForm.put("name", "요주의랩!");
        searchForm.put("id", "ID0001");
        return searchForm;
    }
    public ArrayList<String> getTablesListWithString() {
        ArrayList<String> tablesListWithString = new ArrayList<String>();
        tablesListWithString.add("@mdo");
        tablesListWithString.add("@fat");
        tablesListWithString.add("@twitter");
        return tablesListWithString;
    }

    public HashMap<String, Object> getBundlesData(){
        DatasInfor datasInfor = new DatasInfor();
        HashMap<String, String> searchForm = datasInfor.getSearchFormData();
        ArrayList<String> tablesListWithString = datasInfor.getTablesListWithString();

        HashMap<String, Object> bundlesData = new HashMap<>();
        bundlesData.put("searchForm", searchForm);
        bundlesData.put("tablesListWithString", tablesListWithString);
        bundlesData.put("dataWithMemberBean", datasInfor.getDataToMemberBean());
        bundlesData.put("dataListWithMemberBean", datasInfor.getDataListWithMemberBean());

        return bundlesData;
    }

    public MemberBean getDataToMemberBean(){
        MemberBean memberBean = new MemberBean();
        memberBean.setfirstName("Mark");
        memberBean.setsecondName("Otto");
        memberBean.setHandleName("@mdo");
        return memberBean;
    }
    
    public ArrayList<MemberBean> getDataListWithMemberBean(){
        ArrayList<MemberBean> membersList = new ArrayList<>();

        MemberBean memberBean = new MemberBean();
        memberBean.setfirstName("Mark");
        memberBean.setsecondName("Otto");
        memberBean.setHandleName("@mdo");
        membersList.add(memberBean);

        MemberBean memberBean02 = new MemberBean();
        memberBean.setfirstName("Jacob");
        memberBean.setsecondName("Thor");
        memberBean.setHandleName("@fat");
        membersList.add(memberBean02);

        MemberBean memberBean03 = new MemberBean();
        memberBean.setfirstName("Larry");
        memberBean.setsecondName("Bird");
        memberBean.setHandleName("@twitter");
        membersList.add(memberBean03);

        
        return membersList;
    }
}