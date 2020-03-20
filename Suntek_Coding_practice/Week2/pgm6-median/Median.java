import java.lang.Math;
import java.util.*;
class Median 
{
	float getMedian(int arr1[],int arr2[])
	{
		int low1=0,high1=arr1.length-1,mid1;
		int low2=0,high2=arr2.length-1,mid2;
		float	median1,median2;
		while ((high1-low1)!=1)
		{
			mid1=(low1+high1)/2;
			mid2=(low2+high2)/2;
			if ((high1-low1)%2==0)
			{
				median1=arr1[mid1];
				median2=arr2[mid2];
			}
			else 
			{
				median1=(arr1[mid1]+arr1[mid1+1])/2;
				median2=(arr2[mid2]+arr2[mid2+1])/2;
			}
			if (median1<median2)
			{
				low1=mid1;
				high2=mid2;
			}
			else 
			{
				low2=mid2;
				high1=mid1;
			}
			
		}	
		return (Math.max(arr1[low1],arr2[low2]) + Math.min(arr1[high1],arr2[high2]))/2;
	}
	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		int size=scan.nextInt();
		int arr1[]=new int[size];
		int arr2[]=new int[size];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=scan.nextInt();
		}
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=scan.nextInt();
		}
		Median obj=new Median();
		float median=obj.getMedian(arr1,arr2);
		System.out.println(median);
	}
}