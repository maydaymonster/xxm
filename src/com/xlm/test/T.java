package com.xlm.test;

public class T {
  static public int add(int z,int  ... s)
  {
	  int sum=0;
	  for(int i=0;i<s.length;i++)
	  {
		  sum+=s[i];
	  }
	  return sum;
  }
  public static void main(String[] args) {
//	     int s[]= {1,2,8,7,9};
//	    int z=T.add(s);
//	    System.out.println(z);
	  
	  
	  int z=T.add(1,2,87,9,10,11,89);
	  System.out.println(z);
}

}
