package com.java94;

/***
 * 具体某个学生的考试成绩 设计类
 * @author notre
 *
 */
public class Score {
	/**
	 * 考试id
	 */
	private int id;
	
	/**	科目 **/
	private Subject subject;
	
	/** 哪个学生的考试成绩 */
	private Student student;
	
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	/**	考试名称 **/
	private String name;
	

	
	private float usualScore;
	
	/** 期末成绩 */
	private float finalScore;
	
	public float getTotalScore(){
		return usualScore*subject.getUsualPersent()/100+finalScore*subject.getFinalPersent()/100;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public float getUsualScore() {
		return usualScore;
	}

	public void setUsualScore(float usualScore) {
		this.usualScore = usualScore;
	}



	public float getFinalScore() {
		return finalScore;
	}

	public void setFinalScore(float finalScore) {
		this.finalScore = finalScore;
	}
	
	
}
