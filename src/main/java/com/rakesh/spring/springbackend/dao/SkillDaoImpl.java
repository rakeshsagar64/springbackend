package com.rakesh.spring.springbackend.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rakesh.spring.springbackend.model.Skill;

@Repository(value="skillDao")
@Transactional
public class SkillDaoImpl implements SkillDao{
	
	@Autowired
	SessionFactory sessionFactory;
	
	public boolean addSkill(Skill skill) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().save(skill)!=null;
	}

	public List<Skill> fetchAllSkills() {
		// TODO Auto-generated method stub
		List<Skill> list = sessionFactory.getCurrentSession().createQuery("from Skill").list();
		System.out.println(list);
		return list;
	}

	public List<Skill> fetchSkill(String Skill) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Skill where technology='"+Skill+"'").list();
	}

	
	
}
