public class Assigment_1_part1_DAA{//using non-recursion fibonacci series
	public static void main(String args[]) {
		
		 int n1=0;
		 int n2=1;
		 int n3;
		 int i;
		 int count=15;    
		 
		 System.out.print(n1+" "+n2); 
		    
		 for(i=2;i<count;++i){  
		  n3 = n1+n2;  
		  
		  System.out.print(" "+n3);    
		  n1 = n2;    
		  n2 = n3;    
		 }  
	}
	}
    //time complexity = T(N)
    //space complexity = O(1)
   