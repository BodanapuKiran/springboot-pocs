package com.sortedSetDemo;
import java.util.*;
class Employee implements Comparable{
	String name;
	int id;
	Employee(String name,int id){
	 this.name=name;
	 this.id=id;
	}
	
	public String toString() {
		return name+"--"+id;
	}
	
	public int compareTo(Object obj) {
	int id1=this.id;
	Employee e=(Employee)obj;
	int id2=e.id;
	if(id1>id2)
		return 1;
	else  if(id1<id2)
		return -1;
	else
		return 0;
	}
	
}

public class customisedcomparable  {
public static void main(String[] args) {
	Employee e=new Employee("nag",100);
	Employee e1=new Employee("balaiah",200);
	Employee e2=new Employee("chiru",50);
	Employee e3=new Employee("venki",150);
	Employee e4=new Employee("nag",100);
    TreeSet t=new TreeSet();
    t.add(e);
    t.add(e1);
    t.add(e2);
    t.add(e3);
    t.add(e4);
    System.out.println(t);
	
}
}
