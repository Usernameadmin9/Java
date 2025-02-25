package pattern2hallow;

public class Upper_triRight {
public static void main(String[] args) {
	for (int i = 1; i <=5; i++) {
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
	for (int i = 1; i<=5; i++) {
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
	for (int i = 1; i <=5; i++) {
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
	for (char i = 'A'; i <='E'; i++) {
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
	for (char i = 'A'; i <='E'; i++) {
		for (char j = 'A'; j <='E'; j++) {
			if(j>=i) {
				if(j=='E'||i=='A'||j==i) {
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
	System.out.println();   //can be done as like above but if using this code 
	                        //it can be used for lower pyramids also by inserting spaces.
}
}
