#include <stdio.h>
#include <stdlib.h>
int main(void)
{
	void threeSort(int *n,int *p,int *q);
	int a,b,c,*p,*q,*n;
	printf("请输入三个整数:\n");
	scanf("%d%d%d",&a,&b,&c);
	n=&a;
	p=&b;
	q=&c;
	threeSort(n,p,q);
	printf("a = %d,b = %d,c = %d\n",a,b,c);
 } 
 void threeSort(int *n,int *p,int *q)
 {
 	void swap(int *b1,int *b2);
 	if(*n < *p){
 		swap(n,p);
	 }
	  
	  if(*n < *q){
	 	swap(n,q);
	 }
	 if(*p < *q){
	 	swap(p,q);
	 }
 }
 void swap(int *b1,int *b2)
 {
 	int temp = *b1;
 	*b1 = *b2;
 	*b2 = temp;
 }
