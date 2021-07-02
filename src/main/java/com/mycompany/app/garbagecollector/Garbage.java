package com.mycompany.app.garbagecollector;

import com.mycompany.app.garbagecollector.model.C;
import com.mycompany.app.garbagecollector.model.College;
import com.mycompany.app.garbagecollector.model.Student;


public class Garbage {
	// test garbage collector release C object from reference (from memory )
	public static void testGarbageCollector() {
		try {
			C c1 = new C();
			GarbageCollector.get(c1);
			GarbageCollector.release(c1);
			GarbageCollector.gc();
		} catch (Exception e) {
		}
	}

	// test garbage collector release department object with has-a relation ship
	// with Employee class.
	public static void testGarbageCollectorHierachyClass() {
		try {
			Student e = new Student();
			College d = new College(e);
			College d1 = new College(e);
			GarbageCollector.get(d);
			GarbageCollector.get(d1);
			GarbageCollector.release(d1);
			GarbageCollector.gc();
		} catch (Exception e) {
		}
	}

	public static void main(String[] args) {
		System.out.println("Starting Garbage Collector Process");
		testGarbageCollector();
		System.out.println("Create Student and College object and then release the reference");
		testGarbageCollectorHierachyClass();
	}


}
