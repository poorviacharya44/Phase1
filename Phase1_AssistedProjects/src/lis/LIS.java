package lis;

public class LIS{
static int LI_Subseq(int array[], int arr_len){
    int arr[] = new int[arr_len];
    int i, j, max = 0;
    for (i = 0; i < arr_len; i++)
       arr[i] = 1;
    for (i = 1; i < arr_len; i++)
    for (j = 0; j < i; j++)
    if (array[i] > array[j] && arr[i] < arr[j] + 1)
    arr[i] = arr[j] + 1;
    for (i = 0; i < arr_len; i++)
    if (max < arr[i])
    max = arr[i];
    return max;
 }
 public static void main(String args[]){
	 int array[] = {5,4,1,2,3};
    //int array[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
    int arr_len = array.length;
    System.out.println("The length of the longest increasing subsequence is " +  LI_Subseq(array, arr_len));
 }
 }
