package com.java94;

import java.util.HashMap;
import java.util.Map;

public class Student {
	private int id;
	private String name;
	
	private Map<Subject,Score> scores;

	public Student() {
		scores = new HashMap<>();
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

	public Map<Subject, Score> getScores() {
		return scores;
	}

	public void setScores(Map<Subject, Score> scores) {
		this.scores = scores;
	}
	
/*	public void setScore(Subject subject,float usualScore,float finalScore){
		Score score = new Score();
		score.setSubject(subject);
		score.setStudent(this);
		score.setUsualScore(usualScore);
		score.setFinalScore(finalScore);
		
		
		scores.put(subject, score);
	}*/
	
}
