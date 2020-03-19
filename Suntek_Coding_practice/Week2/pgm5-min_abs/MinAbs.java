import java.lang.Math;
import java.util.*;
class  MinAbs
{
		static Scanner scan=new Scanner(System.in);
		static int size1=scan.nextInt();
		static int arr1[]=new int[size1];
		
		static int size2=scan.nextInt();
		static int arr2[]=new int[size2];
		
		static int size3=scan.nextInt();
		static int arr3[]=new int[size3];
		
	int findMinDiff(int a,int b,int c,int min)
	{
		if(a<0 || b<0 || c<0)
		{
			return min;
		}
		int temp=Math.abs(Math.max(Math.max(arr1[a],arr2[b]),arr3[c])
			              -Math.min(Math.min(arr1[a],arr2[b]),arr3[c]));
		if(temp<min)
		{
			min=temp;
		}
		int max=Math.max(Math.max(arr1[a],arr2[b]),arr3[c]);
		if (max==arr1[a])
		{
			return findMinDiff(a-1,b,c,min);
		}
		else if (max==arr2[b])
		{
			return findMinDiff(a,b-1,c,min);
		}
		else
		{
			return findMinDiff(a,b,c-1,min);
		}
		
	}
	public static void main(String[] args) 
	{
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=scan.nextInt();		
		}
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=scan.nextInt();		
		}
		for(int i=0;i<arr3.length;i++)
		{
			arr3[i]=scan.nextInt();		
		}
		MinAbs obj=new MinAbs();
		int minval=obj.findMinDiff(  size1-1,size2-1,size3-1,
			Math.abs(  Math.max(Math.max(arr1[size1-1],arr2[size2-2]),arr3[size3-3])
			            -Math.min(Math.min(arr1[size1-1],arr2[size2-2]),arr3[size3-3])  )  );
		System.out.println(minval);
	}
}