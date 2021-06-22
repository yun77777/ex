package ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		int x1,y1,r1,x2,y2,r2,x3,y3;
		List<Integer> cntArr=new ArrayList<Integer>();
		
		for(int i=0;i<T;i++) {
			x1=sc.nextInt();
			y1=sc.nextInt();
			r1=sc.nextInt();
			x2=sc.nextInt();
			y2=sc.nextInt();
			r2=sc.nextInt();
			
			cntArr.add(contactPointCnt(x1, y1, r1, x2, y2, r2));
		}
		
		for(int i=0;i<T;i++) {
			System.out.println(cntArr.get(i));
		}

	}
	
	public static int contactPointCnt(int x1, int y1, int r1, int x2, int y2, int r2) {
		int distancePow=(int) (Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2)); //두 점 사이 거리 제곱
		
		if(distancePow>Math.pow(r1+r2,2)||distancePow<Math.pow(r1-r2,2))
			return 0;
		else if(x1==x2&&y1==y2&&r1==r2)
			return -1;
		else if(Math.pow(r1+r2,2)==distancePow||distancePow==Math.pow(r1-r2,2))
			return 1;
		else
			return 2;
	}

}