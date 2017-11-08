package com.java94;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ScoreManager {
	
	//某门科目  所有学生的成绩
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
	
	//保存成绩
	public void save(){
		//保存到文件。。。
	}
	
	public void load(){
		
	}
	
	public void print(){
		//遍历每个学生
		for(Student student : students){
			//遍历每个学生的每个科目
			for(Iterator<Subject> it = student.getScores().keySet().iterator();it.hasNext();){
				Subject subject = it.next();
				Score score = student.getScores().get(subject);
				System.out.println(student.getName()+"      "+score.getTotalScore());
			}
			
		}
	}
}
