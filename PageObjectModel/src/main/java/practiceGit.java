import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.swing.plaf.ListUI;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class practiceGit {

	public void reverseString() {
	
			String r = "tell me in reverse Nafesah";
			r.split(" ");
		
		 
			for(int i=r.length()-1; i>=0;i--) {
				
				System.out.println(r.charAt(i));
				}
				
			}
			
			
			
			//print number 1 to 100, if number is divisble by 3 print hello, if number is divisible by 5 pint hi, if number is divisible by 3 and 5 print hi hello:
			@Test
			public void printHundred() {
				
				for(int i = 1; i<=100; i++) 
				{
					
					if(i%3==0 && i%5==0) 
						System.out.println("HI HELLO");
				
				else if(i%3==0){
						System.out.println("HELLO");
					}
					if(i%5==0)
						{
						System.out.println("HI");
						}
						else{
							System.out.println(i);
						
					
						}
					}
				}
				
				
			
			
	
	
	
	
	@Test
	public void practiceInterface() {
		
		ArrayList<String> prac = new ArrayList<String>();
		
		prac.add("pala");
		prac.add("naf");
		prac.add("shah");
		prac.add("nas");
		prac.remove(1);
		prac.toArray();
	
		System.out.println(prac);
			
		}
	
	@Test
	public void practiceInterface2() {
		
		ArrayList<String> prac = new ArrayList<String>();
		LinkedList<String> inty=new LinkedList<String>();		
		prac.add("pala");
		prac.add("naf");
		prac.add("shah");
		prac.add("nas");
		prac.remove(1);
		prac.toArray();
		
		for(String f: prac) {
			System.out.println(f);
		}
			
		}
	

	
	@Test
	public void reverseString33() {
	
	String f = "tell me my potential";
	f.split(" ");
	
	for(int i =f.length()-1; i>=0;i--) {
		System.out.println(f.charAt(i));
		
	}
	
	
	
	
	}
	
	@Test
	public void practiceArray5() {
		
		// given array store to ArrayList and print values
		
		int a[] = {7,9,10,3,15,20};
		
		ArrayList<Integer> num= new ArrayList<Integer>();
		
		/*
		for(Integer g: a) {
			num.add(g);c
			System.out.println(g);
		}
	}
		*/
	}
			
		
	
		
	//coming from website, grab all text from menuBar- theres mult.
		public ArrayList<String> actValue (List<WebElement> elements) {
			
			ArrayList<String> ar= new ArrayList<String>();
			
			for(WebElement e: elements ) {
				String text=e.getText();
				ar.add(text);
			}
			return ar;
		}
		
			public ArrayList<String> expValue(String []ar6) {
				ArrayList<String> ar2= new ArrayList<String>();
				for(String a: ar2) {
					ar2.add(a);
				}
				return ar2;
				
			}
			
			
	public void compareText(ArrayList<String> ar, ArrayList<String>ar2) {
	
	Iterator<String> i =ar.iterator();
	Iterator<String> j=	ar2.iterator();
	
		while(i.hasNext() && j.hasNext()){
	
			if(i.next().equals(j.next())){
				
			System.out.println("Matched");
		}
			else {
				System.out.println("not matched");
			}
	}
	
	}
	WebDriver dr;
	public void verifyMenuText() {
		ArrayList<String> ar= actValue(dr.findElements(By.xpath("give xpath")));
		String [] s= {"Men", "Woman"};
		ArrayList<String> e	= expValue(s);
		
		//.compare(a,e);
		
	
	
}
	
	@Test
	public void highestOnetoHundredMethod() {
		
		for(int i =1; i<=100; i++) {
			if(i%3==0 && i%5==0) {
				System.out.println("Hi hello");
			}
			else if (i%3==0) {
				System.out.println("hello");
			}
			if(i%5==0) {
				System.out.println("Hi");
			}
			else{
			System.out.println(i);
		}
	}
	
	}
	
	@Test
	//to find duplicate value using HashSet and Iterator
	public void duplicateValue() {
		
		
		String s= "abcdbefb";
		char[]  c=s.toCharArray();
		
		HashSet<Character> h= new HashSet<Character>();
	
		for(Character x: c) {
			h.add(x);
		}
		
		Iterator<Character> i= h.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			System.out.println("Jenkins was Added ");
		}
		
		
		
	
	}
	}
	
	



		
	





