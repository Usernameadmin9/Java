package pattern2hallow;

public class Square {
public static void main(String[] args) {
	for(int i=1; i<=5; i++) {
		for(int j=1; j<=5; j++) {
			if(i==1||i==5||j==5||j==1) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	System.out.println();
	
	////////////////////////////////////////
	
	for(int i=1; i<=5; i++) {
		for(int j=1; j<=5; j++) {
			if(i==1||i==5||j==1||j==5) {
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
			if(i==1||i==5||j==1||j==5) {
				System.out.print(j);
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	System.out.println();
	
	///////////////////////////////////////
	
	for(char i='A'; i<='E'; i++) {
		for(char j='A'; j<='E'; j++) {
			if(i=='A'||i=='E'||j=='A'||j=='E') {
				System.out.print(i);
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	System.out.println();
	
	///////////////////////////////////////
	
	for(char i='A'; i<='E'; i++) {
		for(char j='A'; j<='E'; j++) {
			if(i=='A'||i=='E'||j=='A'||j=='E') {
				System.out.print(j);
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	System.out.println();
}
}
