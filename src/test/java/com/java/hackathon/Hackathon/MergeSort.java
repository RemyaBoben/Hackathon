package com.java.hackathon.Hackathon;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iArr = {7,3,9,5,1,6,10};
		int n=iArr.length;
		
		System.out.println("Given Array");
		for(int i=0;i<=n-1;i++){
			System.out.print(iArr[i]+" ");
			
		}
		mergeSort(iArr,0,n-1);
		
		System.out.println("\nSorted Array");
		for(int i=0;i<=n-1;i++){
			System.out.print(iArr[i]+" ");
			
		}
	}
	private static void mergeSort(int iArr[],int lb,int ul){
		if(lb<ul){
			int mid = (lb+ul)/2;
			mergeSort(iArr,lb,mid);
			mergeSort(iArr,mid+1,ul);
			merge(iArr,lb,mid,ul);
		}
		
	}
	private static void merge(int iArr[],int lb,int mid,int ul){
		int i=lb;
		int j=mid+1;
		int k=0;
		//int n=ul-lb+1;
		int[] iArrSorted = new int[ul-lb+1];
		while(i<=mid && j<=ul){
			if(iArr[i]<=iArr[j]){
				iArrSorted[k] = iArr[i];
				k++;
				i++;
			}
			else{
				iArrSorted[k] = iArr[j];
				k++;
				j++;
			}
		}
		
			while(j<=ul){
				iArrSorted[k] = iArr[j];
				k++;
				j++;
			}
		
		 while(i<=mid){
			 iArrSorted[k] = iArr[i];
				k++;
				i++;
		 }
		
		
		int h=0;
		while(lb<=ul){
			iArr[lb++]=iArrSorted[h++];
		}
	}


}
