package DailyPractice;

public class DP {

	public static void main(String[] args) {
		
		//count number of char in string
	       String mn="vishnu vardhan";
	       int count=0;
	       for(int i=0;i<mn.length();i++)
	       {
	    	   count++;
	       }
	       System.out.println("number of char in string="+count);
        //count number of char in a string with out space 
        String mnws="vishnu vardhan";
        int counta=0;
        for(int i=0;i<mnws.length();i++)
        {
        	if(mnws.charAt(i)!=' ')
        	{
        		counta++;
        	}
        }
        System.out.println("number of char in a string with out space="+counta);
        //count number of words in the sting
        String line="hi i am vishnu vardhan";
        int countb=1;
        for(int i=0;i<line.length();i++)
        {
        	if((line.charAt(i)==' ')&&(line.charAt(i+1)!=' '))
        	{
        		countb++;
        	}
        }
        System.out.println("number of words in the sting="+countb);
        //reverse the string 
        String rs="vishnu";
        StringBuilder sb=new StringBuilder();
        sb.append(rs);
        sb.reverse();
        System.out.println(sb);
        //count same char in the string 
        String scs="sarigamapadanisa";
        int countc=0;
        char c='a';
        for(int i=0;i<scs.length();i++)
        {
        	if(scs.charAt(i)==c)
        	{
        		countc++;
        	}
        }
        System.out.println("same char in the string="+countc);
        //Cap initial letters in a String 
        String ili="hi in need thousand rupees";
        String words[]=ili.split("\\s");
        String rev="";
        for(String word:words)
        {
        	String fir=word.substring(0,1);
        	String sec=word.substring(1);
        	rev+=fir.toUpperCase()+sec+" ";	
        }
        System.out.println(rev);
        //replace a char in a String 
        String cs="monkey";
        String csc=cs.replace('m','d');
        System.out.println(csc);
        
        //reverse the number
        int rn=12345;
        int reve=0;
        while(rn!=0)
        {
        	int ri=rn%10;
        	reve=reve*10+ri;
        	rn=rn/10;
        }
        System.out.println(reve);
        //sort the array in AO
		int ao[]= {20,4,17,55,9,80};
		int tem=0;
		System.out.println("sort the array in AO");
		for(int i=0;i<ao.length;i++)
		{
			for(int j=i+1;j<ao.length;j++)
			{
				if(ao[i]>ao[j])
				{
					tem=ao[i];
					ao[i]=ao[j];
					ao[j]=tem;
				}
			}
			System.out.println(ao[i]);
		}
        //sort the array in DO
		
        //swap the number
		int a=10;
		int b=20;
		System.out.println("before a="+a+"b="+b);
		int d=0;
		d=a;
		a=b;
		b=d;
		System.out.println("after a="+a+"b="+b);
        //string to int
		String si="100";
		System.out.println(si+111);
		int sii=Integer.parseInt(si);
		System.out.println(sii+111);
		
		//separate odd and even values in array
		int oae[]= {30,20,7,27,55,13,22};
		System.out.println("the even values:");
		for(int i=0;i<oae.length;i++)
		{
			if(oae[i]%2==0)
			{
				System.out.println(oae[i]);
			}
		}
		
		System.out.println("the odd values:");
		for(int j=0;j<oae.length;j++)
		{
			if(oae[j]%2!=0)
			{
				System.out.println(oae[j]);
			}
		}
		
		
	/*	//count number of char in string
       
        //count number of char in a string with out space 
        
        //count number of words in the sting
        
        //reverse the string 
        
        //count same char in the string 
        
        //Cap initial letters in a String 
        
        //replace a char in a String 
      
        
        //reverse the number

        //sort the array in AO
        //sort the array in DO
        //swap the number
        //string to int 
        //separate odd and even values in array
         
         */

	}

}
