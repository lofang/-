package text;
import java.util.Scanner;
public class text_6 {
	private static Scanner in;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new Scanner(System.in);
		
		int j, i = in.nextInt();
		if(i < 0)       		//�ж��Ƿ�Ϊ���������
		{
			System.out.print("fu ");  //���������
			j = -i;					
		}else
			j = i;
		int mark = 1;
		int key = j;
		while(key > 9)     //�ж�λ��,�õ�mark
		{
			key/=10;
			mark*=10;
		}
		do
		{
			int d = j/mark;				//ͨ��mark�õ����λ�ϵ���ֵ��
			switch(d)
			{
			case 0:System.out.print("ling");break;  
	        case 1:System.out.print("yi");break;  
	        case 2:System.out.print("er");break;  
	        case 3:System.out.print("san");break;  
	        case 4:System.out.print("si");break;  
	        case 5:System.out.print("wu");break;  
	        case 6:System.out.print("liu");break;  
	        case 7:System.out.print("qi");break;  
	        case 8:System.out.print("ba");break;  
	        case 9:System.out.print("jiu");break;
			}
			if(mark > 9)				//�ж��Ƿ�Ϊ��λ���֣���Ϊ��λ����ĩβ����Ҫ�ո�
			{
				System.out.print(" ");
			}
			j%=mark;					//�ӵ����ڶ�λλ���Ͽ�ʼ�����ֵ
			mark/=10;						
		}while(mark > 0);				//�ж��Ƿ���ȫ��λ���ϵ���ֵ
		}
	}
	

