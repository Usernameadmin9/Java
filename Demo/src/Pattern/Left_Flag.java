package Pattern;

public class Left_Flag {
public static void main(String[] args) {
	for(int i=5; i>0; i--) {
		for(int j=1; j<=5; j++) {
			if(j<=i) {
				System.out.print(i);
			}
		}
		System.out.println();
	}
	for(int i=2; i<=5; i++) {
		for(int j=1; j<=5; j++) {
			if(j<=i) {
				System.out.print(i);
			}
		}
		System.out.println();
	}
	System.out.println();
	
	//////////////////////////////////////////
	
	for(int i=5; i>0; i--) {
		for(int j=1; j<=5; j++) {
			if(j<=i) {
				if(i==5||i==j||j==1) {
					System.out.print(i);
				}else {
					System.out.print(" ");
				}
			}
		}
		System.out.println();
	}
	for(int i=2; i<=5; i++) {
		for(int j=1; j<=5; j++) {
			if(j<=i) {
				if(i==5||i==j||j==1) {
					System.out.print(i);
				}else {
					System.out.print(" ");
				}
			}
		}
		System.out.println();
	}
	
}
}
