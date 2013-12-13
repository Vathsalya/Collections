package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class EmployeeDetails {

	public EmployeeDetails() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(28,"Vathsalya",27,new Date(12-4-2011),0));
		list.add(new Employee(21,"Chaitanya",24,new Date(1-8-2011),0));
		list.add(new Employee(8,"Pavan",27,new Date(22-6-2007),0));
		
		//Collections.sort(list);
		Collections.sort(list,new EmployeeJoinDateComparator());
		
		for(Employee e : list)
			System.out.println(e.getId());
	}

}
