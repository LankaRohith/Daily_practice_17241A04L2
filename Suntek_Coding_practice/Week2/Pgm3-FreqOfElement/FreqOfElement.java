import java.util.*;
class  FreqOfElement
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



	int leftIndexOfElement(int arr[],int k)
	{
		int low=0,high=arr.length;
		int mid=(low+high)/2;
		while(low<=high)
		{
				if(arr[mid]==k)
				{   
						mid=mid-1;
						
						if(arr[mid]!=k)
						{
							break;
						}
						if (arr[mid]==k && mid==0)
						{
							return mid;
						}
						else
						{
						continue;				
						}
				}
				else if(arr[mid]>k)
				{
						high=mid+1;
				}
				else
				{
						low=mid+1;
				}
				mid=(low+high)/2;
		}
		
		return mid+1;
	}
	int rightIndexOfElement(int arr[],int k)
	{
		int low=0,high=arr.length;
		int mid=(low+high)/2;
		while(low<=high)
		{
				if(arr[mid]==k)
				{   
						mid=mid+1;
						
						if(arr[mid]!=k)
						{
							break;
						}
						if (arr[mid]==k && mid==arr.length-1)
						{
							return mid;
						}
						else
						{
						continue;				
						}
				}
				else if(arr[mid]>k)
				{
						high=mid+1;
				}
				else
				{
						low=mid+1;
				}
				mid=(low+high)/2;
		}
		
		return mid-1;
	}


	public static void main(String[] args) 
	{
			FreqOfElement obj=new FreqOfElement();
			Scanner scan =new Scanner(System.in);
			int n=scan.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=scan.nextInt();
			}
			obj.quickSort(arr, 0, arr.length-1);
			int k=scan.nextInt();
			System.out.println(obj.rightIndexOfElement(arr,k)-obj.leftIndexOfElement(arr,k)+1);
		
	}
}
