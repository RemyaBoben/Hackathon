package com.java.hackathon.Hackathon;

public class Person implements Comparable<Person> {
	int height;
	int weight;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	Person(int height,int weight){
		this.height=height;
		this.weight=weight;
	}
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.height-o.height;
	}
	@Override
    public String toString() {
        return "Person {" + "height=" + height + ", weight=" + weight +"}\n";
    }

	
}
