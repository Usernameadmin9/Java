package Pattern;

public class left_lowerTri {
public static void main(String[] args) {
	for(int i=1; i<=5; i++) {
		for(int j=1; j<=5; j++) {
			if(j<=i) {
				if(i==j||j==1||i==5) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
		}
		System.out.println();
	}
	System.out.println();
	
	///////////////////////////////////////////////
	
	for(int i=1; i<=5; i++) {
		for(int j=1; j<=5; j++) {
			if(j<=i) {
				if(i==j||j==1||i==5) {
					System.out.print(i);
				}else {
					System.out.print(" ");
				}
			}
		}
		System.out.println();
	}
	System.out.println();
	
	///////////////////////////////////////////////
	
	for(int i=1; i<=5; i++) {
		for(int j=1; j<=5; j++) {
			if(j<=i) {
				if(i==j||j==1||i==5) {
					System.out.print(j);
				}else {
					System.out.print(" ");
				}
			}
		}
		System.out.println();
	}
	System.out.println();
	
	///////////////////////////////////////////////
	
	for(char i='A';i<='E';i++) {
		for(char j='A'; j<='E'; j++) {
			if(j=='A'||j==i||i=='E') {
				System.out.print(i);
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	System.out.println();
	
	///////////////////////////////////////////////
	
	for(char i='A';i<='E';i++) {
		for(char j='A'; j<='E'; j++) {
			if(j=='A'||j==i||i=='E') {
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
