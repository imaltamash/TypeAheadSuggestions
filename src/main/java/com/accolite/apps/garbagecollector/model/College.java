package com.accolite.apps.garbagecollector.model;

public class College {
	private Student e;

	public College(Student e) {
		this.e = e;
	}

	public void finalized() {
		System.out.println("destory College ");
	}

}



