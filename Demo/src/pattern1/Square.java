package pattern1;

public class Square {
public static void main(String[] args) {
	for(int i=1; i<=5;i++) {
		for(int j=1; j<=5; j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	System.out.println();
	///////////////////////////
	
	for(int i=1; i<=5;i++) {
		for(int j=1; j<=5; j++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	System.out.println();
	
	///////////////////////////
	for(int i=1; i<=5; i++) {
		for(int j=1; j<=5; j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	System.out.println();
	
	////////////////////////////
	
	for(char i='A'; i<='E'; i++) {
		for(char j='A'; j<='E';j++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	System.out.println();
	
	//////////////////////////////
	
	for(char i='A'; i<='E'; i++) {
		for(char j='A'; j<='E';j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	System.out.println();
}
}
