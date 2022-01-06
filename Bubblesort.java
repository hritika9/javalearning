package com;

public class Bubblesort {

	public static void main(String[] args) {
		 
		int [] arr =  {10,30,60,50,80,70};
		 
		  
		 

	
	
	 
		
		for(int i =arr.length-1;i>0;i--) {
			for(int j =0; j<i;j++) {
			if(arr[j]>arr[j+1]) {
				swap(arr,j,j+1);
			}
			}
		}
		for(int i =0; i<arr.length;i++) {
			 System.out.println(arr[i]);
		 }
	}
			
		 
		 
		
	 
	
	public static void swap(int [] arr,int a , int b) {
		 if(a==b) {
			 return;
		 }
		 int temp= arr[a];
		 arr[a]=arr[b];
		 arr[b]= temp;
	}

}
