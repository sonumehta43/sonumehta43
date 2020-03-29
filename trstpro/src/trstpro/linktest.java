package trstpro;

import javax.swing.text.html.HTMLDocument.Iterator;

public class linktest {

	public static void main(String[] args) {
		
	int []  a= {1,2,4,6,8,9};
	int []  b= {0,1,3,5,6,9};
	
	int c[]=arrayintersact(a,b);
	System.out.println(c);
	
	}

	private static int[] arrayintersact(int[] a, int[] b) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++)
		{
			for(int k=0;k<b.length;k++)
			{
				if(a[i]==b[i])
			{
				//c[i]=a[i];
			}
			}
		}
		
		
		return null;
	}

}