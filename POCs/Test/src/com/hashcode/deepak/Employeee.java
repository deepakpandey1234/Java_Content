package com.hashcode.deepak;

import java.util.HashSet;

public class Employeee {
		private String name;
	public Employeee(String name) {
		this.name=name;
	}
	
	
	
/*	@Override
	public int hashCode() {
		System.out.println("hashcode");
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}*/



	@Override
	public boolean equals(Object obj) {
		System.out.println("equals");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employeee other = (Employeee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}



	public static void main(String[] args) {
		Employeee e1=new Employeee("Haja");
		Employeee e2=new Employeee("Haja");
		HashSet hm=new HashSet();
		hm.add(e1);
		hm.add(e2);
		System.out.println(e1.equals(e2));

	}

}
