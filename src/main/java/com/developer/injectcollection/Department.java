package com.developer.injectcollection;

import java.util.*;

public class Department {
	private int deptId;
	private String dept;
	private List<String> subjects;
	
	public Department(int deptId, String dept, List<String> subjects) {
		super();
		this.deptId = deptId;
		this.dept = dept;
		this.subjects = subjects;
	}
	
	public void show()
	{
		System.out.println(dept);
		System.out.println(deptId);
		
		Iterator<String> itr = subjects.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
