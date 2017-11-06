/**
*@author:Albert
*@version: 1.0
*/
public class KeyPointSort {
	public static void main(String[] args) {
		int[] arr = {21,15,29,36,20,56,8,2};
		int[] arr2 = {1,5,14,17,34,56,78,99};
		System.out.println("排序前:");
		showElement(arr);
		System.out.println("\n"+"冒泡排序后:");
		bubbleSort(arr);
		showElement(arr);
		System.out.println("\n"+"选择排序后:");
		selectSort(arr);
		showElement(arr);
		System.out.println("\n"+"二分查找索引:");
		System.out.println(selectIndex(arr2,78));
		System.out.println(selectIndex(arr2,5));				System.out.println(selectIndex(arr2,35));
	}
	/**
	*这是一个查询数组元素的方法
	*/
	private static void showElement(int[] arr) {
		for(int i = 0; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	/**
	*这是交换数组两个元素的方法
	*/
	private static void switchElement(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	/**
	*这是冒泡排序
	*/
	private static void bubbleSort(int[] arr) {
		for(int i =0;i<arr.length-1 ; i++) {
			for(int j =0;j<arr.length-1-i ; j++) {
				if(arr[j]>arr[j+1]) {
				 switchElement(arr,j,j+1);
				}
			}
		}
	}
	/**
	*这是选择排序
	*/	
	private static void selectSort(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1;j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					switchElement(arr,i,j);
			}
		}
	}
	}
	/**
	*这是二分查找法（查找数组索引）
	*/
	private static int selectIndex(int[] arr,int number) {
		int min = 0 ;
		int max = arr.length-1 ;
		int middle = (min + max ) /2;
		while(arr[middle] != number) {
			if(arr[middle] > number) {
				max = middle - 1;
			}else if (arr[middle] < number) {
				min = middle + 1;
			}
			middle = (min + max)/ 2;
			if(min > max) {
				return -1;
			}
		}
			return middle;
	}
}