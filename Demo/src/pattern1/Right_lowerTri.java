package pattern1;

public class Right_lowerTri {
public static void main(String[] args) {
	for(int i=5; i>0;i--) {
		for(int j=1; j<=5;j++) {
			if(j>=i) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	System.out.println();
	
	///////////////////////////////////////
	for(int i=5; i>0;i--) {
		for(int j=1; j<=5;j++) {
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
	for(int i=5; i>0;i--) {
		for(int j=1; j<=5;j++) {
			if(j>=i) {
				System.out.print(j);
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	System.out.println();
	
	///////////////////////////////////////
	
	for(char i='E'; i>='A';i--) {
		for(char j='A'; j<='E'; j++) {
			if(j>=i) {
				System.out.print(i);
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	System.out.println();
	
	////////////////////////////////////////
	
	for(char i='E'; i>='A'; i--) {
		for(char j='A'; j<='E'; j++) {
			if(j>=i) {
				System.out.print(j);
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
