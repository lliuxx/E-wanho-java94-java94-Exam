package com.java94;

public class TestScore {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		
		s1.setName("����");
		s2.setName("����");
		s3.setName("����");
		
		Subject subject = new Subject();
		subject.setName("��һ��ѧ�ڸ���");
		subject.setUsualPersent(20);
		subject.setFinalPersent(80);
		
		ScoreManager manager = new ScoreManager();
		
		manager.setScore(subject, s1, 70, 60);
		
		manager.setScore(subject, s2, 75, 80);
		
		manager.setScore(subject, s3, 90, 90);
		
		manager.print();
		
		

	}

}
