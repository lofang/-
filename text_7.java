package text;

import java.util.Scanner;  

public class text_7 {  
  
    public static void main(String[] args) {  
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);  
        int[][] num = new int[2][120];  
        int i,j,size,New,max=0,tag=0; 
          
        for(i=0;i<2;i++){//������������ʽ  
            size = in.nextInt();//��һ��Ϊ�����
            if(max<size)  
                max=size;  
              
            num[i][size]=in.nextInt();  
            if(size==0)//��һ��Ϊ0��ֱ��������һ������ʽ  
                continue;  
            do {//����ֱ������Ϊ0��  
                New = in.nextInt();  
                num[i][New]+=in.nextInt();  
            } while (New!=0);  
        }  
        /* ****���**** */  
        //(num[0][i]+num[1][i])Ϊϵ�� ��iΪָ��             ��ѡ�����з������ַֿ�����İ취  
        for(i=max;i>=0;i--){  
            if(max==0)//ֻ�г�������������  
                {System.out.print((num[0][i]+num[1][i]));break;}  
            if((num[0][i]+num[1][i])!=0){//ϵ����Ϊ0  
                if(tag==1)//tagΪ����λ�ã�tagΪ0 �� ���ǵ�һ�������+��  
                    if((num[0][i]+num[1][i])>=0)//�ǵ�һ�� ����Ӻ�  
                        System.out.print("+");  
                if((num[0][i]+num[1][i])!=1||i==0)//���ϵ����ϵ��Ϊ1������������ǳ������1���  
                    System.out.print(num[0][i]+num[1][i]);  
                if(i!=0)//��Ϊ��������x  
                    System.out.print("x");  
                if(i!=0&&i!=1)//��Ϊ�������x��һ�η����������  
                    System.out.print(i);  
                tag=1;//�й�һ��������� �����������  
            }  
            if(tag==0&&i==0&&(num[0][i]+num[1][i])==0)//��� ֻ��һ����� �ҳ�����Ϊ0 ��������  
                System.out.print((num[0][i]+num[1][i]));  
                  
        }  
        System.out.println();  
        }  
}  