package com.tao.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.tao.dao.PublishmentDao;
import com.tao.model.Publishment;

@Controller @Scope("prototype")
public class PublishmentAction extends ActionSupport{
	@Resource PublishmentDao publishmentDao;
	private Publishment publishment;
	private List<Publishment> publishmentList;
	
	
	public Publishment getPublishment() {
		return publishment;
	}
	public void setPublishment(Publishment publishment) {
		this.publishment=publishment;
	}
	
	public List<Publishment> getPublishmentList() {
		return publishmentList;
	}
	public void setPublishmentList(List<Publishment> publishmentList) {
		this.publishmentList=publishmentList;
	}
	public String addPublishment() throws Exception{
		publishmentDao.AddPublishment(publishment);
		return "message";
	}
	public String showPublishment() {
		publishmentList=publishmentDao.QueryAllPublishment();
		return "show_view";
	}
	
}
