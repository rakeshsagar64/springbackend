package com.rakesh.spring.springbackend.dao;

import java.util.List;

import com.rakesh.spring.springbackend.model.Skill;

public interface SkillDao {
	
	
	public boolean addSkill(Skill skill);
	public List<Skill> fetchAllSkills();
	public List<Skill>fetchSkill(String Skill);
	
	
	
}
