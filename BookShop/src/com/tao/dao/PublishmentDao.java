package com.tao.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.xml.ws.ServiceMode;

import org.hibernate.Query;
import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tao.model.Publishment;


@Service @Transactional
public class PublishmentDao {
	@Resource SessionFactory factory;
	public void AddPublishment(Publishment publishment) throws Exception{
		Session s=factory.getCurrentSession();
		s.save(publishment);
	}
	public void DeletePublishment(String book_id) throws Exception{
		Session s=factory.getCurrentSession();
		Object publishment = s.load(Publishment.class, book_id);
		s.delete(publishment);
	}
	public void UpdatePublishment(Publishment publishment) throws Exception{
		Session s=factory.getCurrentSession();
		s.update(publishment);
	}
	//@SuppressWarnings("unchecked")
	public ArrayList<Publishment> QueryAllPublishment(){
		Session s=factory.getCurrentSession();
		String hql="From Publishment";
		Query q=s.createQuery(hql);
		List publishmentList=q.list();
		return (ArrayList<Publishment>)publishmentList;
	}
	public Publishment GetPublishmentById(String book_id) {
		Session s=factory.getCurrentSession();
		Publishment publishment=(Publishment)s.get(Publishment.class, book_id);
		return publishment;
	}
	public ArrayList<Publishment> QueryPublishmentInfo(String book_id ){
		Session s =factory.getCurrentSession();
		String hql ="From Publishment publishment where 1=1";
		if(!book_id.equals("")) hql = hql + "and publishment.book_id like '%" + book_id+"%'";
				Query q=s.createQuery(hql);
				List publishmentlist = q.list();
				return (ArrayList<Publishment>)publishmentlist;
				
	}
	
}
