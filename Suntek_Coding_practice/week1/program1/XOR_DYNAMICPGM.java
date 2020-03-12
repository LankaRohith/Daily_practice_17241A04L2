import java.util.*;
class XOR_DYNAMICPGM
{    
     int findXor(int m,int arr[],int start,int end)
	{
                     int xor=m;
                    for(int arr_index=start+1;arr_index<=end;arr_index++)
                          {
   		xor=xor^arr[arr_index];	
                          }
	    return xor;
	}

     public static void main(String...b)
             {
			
               	Scanner Inputread=new Scanner(System.in);
                int size_arr= Inputread.nextInt();
                int size_querie= Inputread.nextInt();
                int[] arr=new int[size_arr];
                int [][]querie=new int[size_querie][2];
	int[] expected_output={2,7,14,8};
	for(int arr_index=0;arr_index<size_arr;arr_index++)
	    {
		arr[arr_index]=Inputread.nextInt();   //int[] arr={1,3,4,8}
	    }

	for(int querie_index=0;querie_index<size_querie;querie_index++)
	   {      
	               querie[querie_index][0]=Inputread.nextInt();   //int [][]querie={{0,1},{12},{0,3},{3,3}}
	              querie[querie_index][1]=Inputread.nextInt();
                   }
                XOR_DYNAMICPGM obj=new XOR_DYNAMICPGM();    
	  
                int xor_op[][]=new int[size_arr][size_arr];
	int i,j;
	for(i=0;i<size_arr-1;i++)
	   {
		j=i+1;
		xor_op[i][j]=arr[i]^arr[j];
	   }
	int start,end;
int output[]=new int[size_arr];
	for(int querie_index=0,output_index=0;querie_index<size_querie;querie_index++,output_index++)
	   {         
	              start= querie[querie_index][0];
	             end=querie[querie_index][1];

		if(start==end)
		  {	output[output_index]=arr[start];
 			System.out.print(arr[start]+" ");
 			continue;
		}
		if(xor_op[start][end]!=0)
                                  {
			output[output_index]=xor_op[start][end];
			System.out.print(xor_op[start][end]+" ");
                                   }  		
		else
		  {
			for(i=start,j=end;xor_op[i][j]==0;j--);
			start=j;
			
			
			output[output_index]=obj.findXor(xor_op[i][j],arr,start,end);
			 
			xor_op[querie[querie_index][0]][querie[querie_index][1]]=output[output_index];
			System.out.print(output[output_index]+" ");
		}
                   }
int errors=0;
for(i=0;i<size_arr;i++)
{  if(output[i]!=expected_output[i])
errors+=1;
}
if(errors==0)
System.out.println("\nNO ERRORS");
else
System.out.println("\nNO.OF ERRORS="+errors);
 
	                

          }


}