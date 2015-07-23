#include<stdio.h>
main(){
	int a[8],i,j;
	printf("请输入八次英语四级成绩（没有八次的用0代替）：\n");
	for(i=0;i<8;i++){
		scanf("%d",&a[i]);
		if (a[i]>=425)
			j= 1;
		else
			j= 0;
	}
	if(j=0)
		printf("没有通过四级。");
	else
		printf("已经通过了四级。");
}
