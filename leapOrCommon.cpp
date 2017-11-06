#include <stdio.h>
#include <stdlib.h>
 void judgeYear(int year) 
 {
 	if(year % 100 == 0)
	{
		//是整数年，需要用400整除
		if(year % 400 ==0)
		{
			printf("%d是闰年...",year);
		 } 
		 else{
		 	printf("%d是平年...",year);
		 }
		 
	}
	else{
		//不是整数年，需要用4整除 
			if(year % 4 ==0)
		{
			printf("%d是闰年...",year);
		 } 
		 else{
		 	printf("%d是平年...",year);
		 }
	}
 }

int main(void)
{	
	int year = 0;
	printf("请输入年份:");
	scanf("%d", &year);
	judgeYear(year);
	
 } 

