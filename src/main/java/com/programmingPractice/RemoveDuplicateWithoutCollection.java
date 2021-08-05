package com.programmingPractice;
public class RemoveDuplicateWithoutCollection 
{

public static void main(String[] args) 
{
    int[] a = {4,10,10,4,100, 30, 10,10,100};
    int[] output = new int[a.length];
    int count = 0;
    int num = 0;

    //Iterate over an array
    for(int i=0; i<a.length; i++)
    {
        num=a[i];
       boolean flag = check(output,num);
        if(flag==false)
        {
            output[count]=num;
            ++count;
        }

    }

    //print the all the elements from an array except zero's (0)
    for (int i : output) 
    {
        if(i!=0 )
            System.out.print(i+"  ");
    }

}

/***
 * If a next number from an array is already exists in unique array then return true else false
 * @param arr   Unique number array. Initially this array is an empty.
 * @param num   Number to be search in unique array. Whether it is duplicate or unique.
 * @return  true: If a number is already exists in an array else false 
 */
public static boolean check(int[] arr, int num)
{
    boolean flag = false;
    for(int i=0;i<arr.length; i++)
    {
        if(arr[i]==num)
        {
            flag = true;
            break;
        }
    }
    return flag;
}
}