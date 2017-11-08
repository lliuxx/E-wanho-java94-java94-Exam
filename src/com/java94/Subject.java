package com.java94;

/**
 * 科目 包含 科目名称 该科目考试分数占比
 * @author notre
 *
 */
public class Subject {
	private int id;
	private String name;
	
	/**	平时分占比 **/
	private int usualPersent;
	
	
	/** 期末占比*/
	private int finalPersent;
	
	public boolean check(){
		return usualPersent + finalPersent == 100;
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
	public int getUsualPersent() {
		return usualPersent;
	}
	public void setUsualPersent(int usualPersent) {
		this.usualPersent = usualPersent;
	}

	public int getFinalPersent() {
		return finalPersent;
	}
	public void setFinalPersent(int finalPersent) {
		this.finalPersent = finalPersent;
	}
	
	
}
