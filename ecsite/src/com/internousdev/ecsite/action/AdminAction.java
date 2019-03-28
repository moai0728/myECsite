package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.LoginDAO;
import com.internousdev.ecsite.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class AdminAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;

	private String loginUserId;
	private String loginPassword;



	public String execute(){
		String result="login";
		if(session.containsKey("admin_flg")){
			LoginDAO loginDAO=new LoginDAO();
		    LoginDTO loginDTO=loginDAO.getLoginUserInfo(loginUserId, loginPassword);

			session.put("admin_flg", loginDTO.getAdminFlg());


			result=SUCCESS;
		}

	return result;
	}


	public void setSession(Map<String,Object> session){
		this.session=session;
	}
	public Map<String,Object> getSession(){
		return this.session;
	}
	public String getLoginUserId(){
		return loginUserId;
	}
	public void setLoginUserId(String loginUserId){
		this.loginUserId=loginUserId;
	}
	public String getLoginPassword(){
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword){
		this.loginPassword=loginPassword;
	}

}
