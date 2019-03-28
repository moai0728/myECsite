package com.internousdev.ecsite.action;


import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

/*import com.internousdev.ecsite.dao.LoginDAO;
import com.internousdev.ecsite.dto.LoginDTO;*/
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	/*private String loginUserId;
	private String loginPassword;*/
	public String execute(){
		    /*LoginDAO loginDAO=new LoginDAO();
		    LoginDTO loginDTO=loginDAO.getLoginUserInfo(loginUserId, loginPassword);

			session.put("admin_flg", loginDTO.getAdminFlg());*/
			return SUCCESS;
	}

	public void setSession(Map<String,Object> session){
		this.session=session;
	}
	public Map<String,Object> getSession(){
		return session;
	}
}
