package pattern2hallow;

public class lower_triRight {
public static void main(String[] args) {
	for (int i = 5; i>0; i--) {
		for (int j = 1; j <=5; j++) {
			if(j==5||i==1||j==i) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	System.out.println();
	for (int i = 5; i>0; i--) {
		for (int j = 1; j <=5; j++) {
			if(j==5||i==1||j==i) {
				System.out.print(i);
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	System.out.println();
	for (int i = 5; i>0; i--) {
		for (int j = 1; j <=5; j++) {
			if(j==5||i==1||j==i) {
				System.out.print(j);
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	System.out.println();
	System.out.println();
	for (char i = 'E'; i>='A'; i--) {
		for (char j = 'A'; j <='E'; j++) {
			if(j=='E'||i=='A'||j==i) {
				System.out.print(i);
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	System.out.println();
	System.out.println();
	for (char i = 'E'; i>='A'; i--) {
		for (char j = 'A'; j <='E'; j++) {
			if(j=='E'||i=='A'||j==i) {
				System.out.print(j);
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	System.out.println();
	
	///////////////////////////////////////
	///EXTRA///
	//////////////////////////////////////
	System.out.println();
	for (char j = 'A'; j <='E'; j++) {
		for (char i = 'E'; i>='A'; i--) {
			if(j=='E'||i=='A'||j==i) {
				System.out.print(j);
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	System.out.println();
	for (char j = 'A'; j <='E'; j++) {
		for (char i = 'E'; i>='A'; i--) {
			if(j=='E'||i=='A'||j==i) {
				System.out.print(i);
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	System.out.println();
	
}
}
