package com.collections;

import java.util.Comparator;

public class EmployeeJoinDateComparator implements Comparator<Employee> {

	

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e2.getJoiningDate().compareTo(e1.getJoiningDate());
	}

}
