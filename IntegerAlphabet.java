package com.guru.problems;

public class IntegerAlphabet {

	public static void main(String[] args) {
		new IntegerAlphabet().printAlphaEquivalent(1007,"");

	}
	
	private void printAlphaEquivalent(int n, String str){
		if(n>0){
				int n1=n,n2=n;
			int md = n1%10;
			while(md<=0){
				n1=n1/10;
				md=n1%10;
			}
				System.out.println("TENS:N:"+n1+":STR:"+getAlpha(md) + str);
				printAlphaEquivalent(n1/10, getAlpha(md) + str);
			
			md = n2%100;
			if(md>9 && md<27){
				System.out.println("HUNDREDS:N:"+n2+":STR:"+getAlpha(md) + str);
				printAlphaEquivalent(n2/100, getAlpha(md) + str);
			}
		}else{
			System.out.println(str);
		}
		
	}
	
	private String getAlpha(int n){
		return Character.toString ((char) (n+64));
	}

}
