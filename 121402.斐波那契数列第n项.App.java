package pac;

import java.util.Scanner;

public class App {
public static void main(String[] args) {
  int i = 0;
	Scanner scanner=new Scanner(System.in);
	i=scanner.nextInt();
		 
		        System.out.println("第"+i+"项为："+getNum(i));
		    }
		    
			private static int getNum(int i){
		        if (i<=0){
		            return -1;
		        }else if (i==1||i==2){
		            return 1;
		        }else {
		            return getNum(i-1)+getNum(i-2);
		        }
		    }
}
