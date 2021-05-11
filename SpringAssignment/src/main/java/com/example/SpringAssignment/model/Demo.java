package com.example.SpringAssignment.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo {
	private int id; 
	private String name;
	private List<String> skillset;
	private Map<String,String> projects;
	private Set<String> phone_nos;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getSkillset() {
		return skillset;
	}
	public void setSkillset(List<String> skillset) {
		this.skillset = skillset;
	}
	public Map<String, String> getProjects() {
		return projects;
	}
	public void setProjects(Map<String, String> projects) {
		this.projects = projects;
	}
	public Set<String> getPhone_nos() {
		return phone_nos;
	}
	public void setPhone_nos(Set<String> phone_nos) {
		this.phone_nos = phone_nos;
	}
	@Override
	public String toString() {
		return "Demo [id=" + id + ", name=" + name + ", skillset=" + skillset + ", projects=" + projects
				+ ", phone_nos=" + phone_nos + "]";
	}
	
	
}
