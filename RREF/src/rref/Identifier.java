/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rref;

import java.util.Scanner;

/**
 *
 * @author Siddhant P
 */
    public class Identifier 
{
	int r,c;
	double[][] M;
	public void ArrayCons()
	{
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter the number of rows");	    
		r=in.nextInt();
	    System.out.println("Enter the number of columns");
		c=in.nextInt();
	
	    M= new double[r][c];
	    
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				System.out.println("Enter M[" + i +"][" + j + "]");
				M[i][j] = in.nextDouble();		
				
			}
			
		}
		int count, factors=0; 
		double f1 = 0;
		for(int i=1; i<r; i++)
		{
			count=0;
				if(M[i-1][0]/M[i][0]== M[i-1][1]/M[i][1])
				{
					f1=(M[i-1][0]/M[i][0]);
//					System.out.println(M[i-1][0]/M[i][0] + "   " + M[i-1][1]/M[i][1]+ " aa");
					for(int n=1; n<c; n++)
					{
                                            
						if(f1==M[i-1][n-1]/M[i][n-1])
						{

							count++;
						}
								
					}
				}
			if((c-1)==count)
                        {factors++;}

				
		}
		
		count=0;
		if(M[0][0]/M[r-1][0]==M[0][1]/M[r-1][1]&&r>=3&&factors<(r-1))
		{

				f1=M[0][0]/M[r-1][0];
				for(int n=1; n<c; n++)
					{
						if(M[0][n-1]/M[r-1][n]==f1)
							count++;
					}
				if((c-1)==count)
                                {factors++;}
		}
				
		System.out.println(factors);
		
	}

	
}
    

