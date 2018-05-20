package com.rakesh.spring.springbackend.service;

import java.util.List;

import com.rakesh.spring.springbackend.model.Skill;

public interface SkillIntr {
	

	public boolean addSkill(Skill skill);
	public List<Skill> fetchAllSkills();
	public List<Skill>fetchSkill(String Skill);
	
}
