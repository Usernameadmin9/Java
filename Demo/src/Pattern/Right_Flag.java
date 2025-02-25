package Pattern;

public class Right_Flag {
public static void main(String[] args) {
	for(int i=1; i<=5; i++) {
		for(int j=1; j<=5; j++) {
			if(j>=i) {
				System.out.print(i);
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	for(int i=4; i>0; i--) {
		for(int j=1; j<=5; j++) {
			if(j>=i) {
				System.out.print(i);
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	System.out.println();
	
	///////////////////////////////////////
	
	for(int i=1; i<=5; i++) {
		for(int j=1; j<=5; j++) {
			if(j>=i) {
				if(i==1||j==5||i==j) {
					System.out.print(i);
				}else {
					System.out.print(" ");
				}
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	for(int i=4; i>0; i--) {
		for(int j=1; j<=5; j++) {
			if(j>=i) {
				if(i==1||j==5||i==j) {
					System.out.print(i);
				}else {
					System.out.print(" ");
				}
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
