package project;

import java.util.Arrays;

public class array 
{
  
  public static void main(String args[])
  {
    
    int arr1[]={1,2,3,4,5,6};
    int arr2[]=new int[10];
    arr2=Arrays.copyOf(arr1,10);
    for(int i=0;i<arr2.length;i++)
    
    {
      
      System.out.println(""+arr2[i]);
    }
  }
}






