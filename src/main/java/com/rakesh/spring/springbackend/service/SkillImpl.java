package com.rakesh.spring.springbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakesh.spring.springbackend.dao.SkillDao;
import com.rakesh.spring.springbackend.model.Skill;
@Service(value="skillIntr")
public class SkillImpl implements SkillIntr{

	@Autowired
	SkillDao skillDao;
	
	public boolean addSkill(Skill skill) {
		// TODO Auto-generated method stub
		return skillDao.addSkill(skill);
	}

	public List<Skill> fetchAllSkills() {
		// TODO Auto-generated method stub
		return skillDao.fetchAllSkills();
	}

	public List<Skill> fetchSkill(String Skill) {
		// TODO Auto-generated method stub
		return skillDao.fetchSkill(Skill);
	}

}
