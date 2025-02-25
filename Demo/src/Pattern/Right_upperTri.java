package Pattern;

public class Right_upperTri {
public static void main(String[] args) {
	for(int i=1; i<=5;i++) {
		for(int j=1; j<=5;j++) {
			if(j>=i) {
				if(i==1||j==5||j==i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	System.out.println();
	///////////////////////////////////////////////
	
	for(int i=1; i<=5; i++) {
		for(int j=1; j<=5;j++) {
			if(j>=i) {
				if(i==1||i==j||j==5) {
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
	System.out.println();
	
	/////////////////////////////////////////////////
	
	for(int i=1; i<=5;i++) {
		for(int j=1; j<=5; j++) {
			if(j>=i) {
				if(i==1||j==5||i==j) {
					System.out.print(j);
				}else {
					System.out.print(" ");
				}
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	
	////////////////////////////////////
	
	for(char i='A'; i<='E';i++) {
		for(char j='A'; j<='E'; j++) {
			if(j>=i) {
				if(i=='A'||i==j||j=='E') {
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
	for(char i='A'; i<='E';i++) {
		for(char j='A'; j<='E'; j++) {
			if(j>=i) {
				if(i=='A'||i==j||j=='E') {
					System.out.print(j);
				}else {
					System.out.print(" ");
				}
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	
//	/////////////////////////////////////////////////
//	
//	for(int i=5; i>0;i--) {
//		for(int j=1; j<=5;j++) {
//			if(j>=i) {
//				if(i==1||j==5||j==i) {
//					System.out.print(i);
//				}else {
//					System.out.print(" ");
//				}
//			}else {
//				System.out.print(" ");
//			}
//		}
//		System.out.println();
//	}
//	////////////////////////////////////////////////
//	
//	for(int i=5; i>0;i--) {
//		for(int j=1; j<=5;j++) {
//			if(j>=i) {
//				if(i==1||j==5||j==i) {
//					System.out.print(i+" ");
//				}else {
//					System.out.print("  ");
//				}
//			}else {
//				System.out.print(" ");
//			}
//		}
//		System.out.println();
//	}
}
}
