package com.java94;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ScoreManager {
	
	//ĳ�ſ�Ŀ  ����ѧ���ĳɼ�
	private List<Student> students;
	
	public ScoreManager() {
		students = new ArrayList<>();
	}
	
	
	
	public void setScore(Subject subject,Student student,float usualScore,float finalScore){
		Score score = new Score();
		score.setSubject(subject);
		score.setStudent(student);
		score.setUsualScore(usualScore);
		score.setFinalScore(finalScore);
		student.getScores().put(subject, score);
		
		students.add(student);
	}
	
	//����ɼ�
	public void save(){
		//���浽�ļ�������
	}
	
	public void load(){
		
	}
	
	public void print(){
		//����ÿ��ѧ��
		for(Student student : students){
			//����ÿ��ѧ����ÿ����Ŀ
			for(Iterator<Subject> it = student.getScores().keySet().iterator();it.hasNext();){
				Subject subject = it.next();
				Score score = student.getScores().get(subject);
				System.out.println(student.getName()+"      "+score.getTotalScore());
			}
			
		}
	}
}
