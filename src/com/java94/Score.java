package com.java94;

/***
 * ����ĳ��ѧ���Ŀ��Գɼ� �����
 * @author notre
 *
 */
public class Score {
	/**
	 * ����id
	 */
	private int id;
	
	/**	��Ŀ **/
	private Subject subject;
	
	/** �ĸ�ѧ���Ŀ��Գɼ� */
	private Student student;
	
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	/**	�������� **/
	private String name;
	

	
	private float usualScore;
	
	/** ��ĩ�ɼ� */
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
