package com.si.beans;

import java.util.List;

import org.aspectj.org.eclipse.jdt.core.dom.QualifiedName;
import org.springframework.beans.factory.annotation.Autowired;

public class Question {

	private int id;
	private String name;
	private List<Answer> answers;

/*	public Question(int id, String name, List<Answer> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}*/
	
	
	

	@Override
	public String toString() {
		return "Question [id=" + id + ", name=" + name + ", answers=" + answers
				+ "]";
	}

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

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	
}
