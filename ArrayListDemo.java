package org.anu;
import java.util.ArrayList;
public class ArrayListDemo {

	public ArrayListDemo(){
nameList.add("Anu");
	
nameList.add("Sham");

			

System.out.println(nameList);

System.out.println("After addition");
	System.out.println(nameList);
	}

		
	
		ArrayList nameList = new ArrayList();
		ArrayList <BankofAmerica>  boa = new ArrayList<BankofAmerica>();
	
	public void addName(String name) {
		
		nameList.add(name);
		System.out.println(nameList);
	System.out.println();
	}
public void prinList() {
	//boa.add("Julia");
	
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
//ArrayListDemo demo = new ArrayListDemo();
//demo.nameList();

		ArrayList list = new ArrayList();
		list.add("Anu");
		list.add("John");
		list.add("Joe");

		System.out.println(list);	
		//print the size
		System.out.println(list.size());
		StringBuffer sb = new StringBuffer("Ram");

		list.add(sb);

		Integer i = new Integer(10);
		list.add(i);
		int x = 50;
		list.add(x);
		//list.add(new StringBuffer("Ram"));
		list.add(567);
		System.out.println(list);

	}

}
