import java.util.*;
class  MissingNumber
{	
	void quickSort(int[] arr, int start, int end)
     {
 
			int partition = partition(arr, start, end);
	 
			if(partition-1>start)
			{
				quickSort(arr, start, partition - 1);
			}
			if(partition+1<end) 
			{
				quickSort(arr, partition + 1, end);
			}
    }
 
    int partition(int[] arr, int start, int end)
	{
			int pivot = arr[end];
	 
			for(int i=start; i<end; i++)
			{
				if(arr[i]<pivot)
				{
					int temp= arr[start];
					arr[start]=arr[i];
					arr[i]=temp;
					start++;
				}
			}
	 
			int temp = arr[start];
			arr[start] = pivot;
			arr[end] = temp;
	 
			return start;
    }
	int findMissingNumber(int arr[])
	{
		int low=0,high=arr.length-1,mid=(low+high)/2;
		if(arr[0]!=1)
		{
			return 1;
		}
		else
		{
			while(low<high && mid!=low)
			{
				if(arr[mid]==mid+1)
				{
					low=mid;
				}
				else 
				{
					high=mid;
				}
				mid=(low+high)/2;
				
			}
		}
		return arr[mid]+1;
	}
	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		for (int i=0;i<arr.length ;i++ )
		{
			arr[i]=scan.nextInt();
		}
		MissingNumber obj=new MissingNumber();
		obj.quickSort(arr, 0, arr.length-1);
		int missed_num=obj.findMissingNumber(arr);
		System.out.println(missed_num);
	}
}
