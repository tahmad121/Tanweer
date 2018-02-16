package com.si.beans;

public class Answer {
	private int id;
	private String answer;

	/*public Answer(int id, String answer) {
		super();
		this.id = id;
		this.answer = answer;
	}*/
	
	

	@Override
	public String toString() {
		return "Answer [id=" + id + ", answer=" + answer + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	
}
