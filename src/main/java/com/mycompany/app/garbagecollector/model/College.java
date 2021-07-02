package com.mycompany.app.garbagecollector.model;

public class College {
	private Student e;

	public College(Student e) {
		this.e = e;
	}

	public void finalized() {
		System.out.println("destory College ");
	}

}



