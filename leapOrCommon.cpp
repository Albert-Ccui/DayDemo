#include <stdio.h>
#include <stdlib.h>
 void judgeYear(int year) 
 {
 	if(year % 100 == 0)
	{
		//�������꣬��Ҫ��400����
		if(year % 400 ==0)
		{
			printf("%d������...",year);
		 } 
		 else{
		 	printf("%d��ƽ��...",year);
		 }
		 
	}
	else{
		//���������꣬��Ҫ��4���� 
			if(year % 4 ==0)
		{
			printf("%d������...",year);
		 } 
		 else{
		 	printf("%d��ƽ��...",year);
		 }
	}
 }

int main(void)
{	
	int year = 0;
	printf("���������:");
	scanf("%d", &year);
	judgeYear(year);
	
 } 

