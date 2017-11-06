/**
*@author:Albert
*@version: 1.0
*/
public class KeyPointSort {
	public static void main(String[] args) {
		int[] arr = {21,15,29,36,20,56,8,2};
		int[] arr2 = {1,5,14,17,34,56,78,99};
		System.out.println("����ǰ:");
		showElement(arr);
		System.out.println("\n"+"ð�������:");
		bubbleSort(arr);
		showElement(arr);
		System.out.println("\n"+"ѡ�������:");
		selectSort(arr);
		showElement(arr);
		System.out.println("\n"+"���ֲ�������:");
		System.out.println(selectIndex(arr2,78));
		System.out.println(selectIndex(arr2,5));				System.out.println(selectIndex(arr2,35));
	}
	/**
	*����һ����ѯ����Ԫ�صķ���
	*/
	private static void showElement(int[] arr) {
		for(int i = 0; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	/**
	*���ǽ�����������Ԫ�صķ���
	*/
	private static void switchElement(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	/**
	*����ð������
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
	*����ѡ������
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
	*���Ƕ��ֲ��ҷ�����������������
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