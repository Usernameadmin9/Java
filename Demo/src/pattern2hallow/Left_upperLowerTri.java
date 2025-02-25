package pattern2hallow;

public class Left_upperLowerTri {
public static void main(String[] args) {
	
	//////star upper lower 
	for(int i=5; i>0;i--) { 
		for (int j = 1; j <=5; j++) {  
			if(i==j||i==5||j==1) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	for(int i=2; i<=5;i++) {
		for (int j = 1; j <=5; j++) {
			if (j==1||j==i||i==5) {
				System.out.print("*");
				
			}else {
				System.out.print(" ");
			}
			
		}
		System.out.println();
	}
	System.out.println();
	//////upper lower triangle i numbers
	for(int i=5; i>0;i--) { 
		for (int j = 1; j <=5; j++) {  
			if(i==j||i==5||j==1) {
				System.out.print(i);
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	for(int i=2; i<=5;i++) {
		for (int j = 1; j <=5; j++) {
			if (j==1||j==i||i==5) {
				System.out.print(i);
				
			}else {
				System.out.print(" ");
			}
			
		}
		System.out.println();
	}
	System.out.println();
	////////upper lower triangle j numbers
	for(int i=5; i>0;i--) { 
		for (int j = 1; j <=5; j++) {  
			if(i==j||i==5||j==1) {
				System.out.print(j);
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	for(int i=2; i<=5;i++) {
		for (int j = 1; j <=5; j++) {
			if (j==1||j==i||i==5) {
				System.out.print(j);
				
			}else {
				System.out.print(" ");
			}
			
		}
		System.out.println();
	}
	System.out.println();
//////////////////////////////////////////
/////upper-lower triangle alphabets i/////
//////////////////////////////////////////
	for(char i='E'; i>='A';i--) { 
		for (char j = 'A'; j <='E'; j++) {  
			if(i==j||i=='E'||j=='A') {
				System.out.print(i);
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	for(char i='B'; i<='E';i++) {
		for (char j = 'A'; j <='E'; j++) {
			if (j=='A'||j==i||i=='E') {
				System.out.print(i);
				
			}else {
				System.out.print(" ");
			}
			
		}
		System.out.println();
	}
	System.out.println();
	
	//////////////////////////////////////////
	/////upper-lower triangle alphabets j/////
	//////////////////////////////////////////
	for(char i='E'; i>='A';i--) { 
		for (char j = 'A'; j <='E'; j++) {  
			if(i==j||i=='E'||j=='A') {
				System.out.print(j);
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	for(char i='B'; i<='E';i++) {
		for (char j = 'A'; j <='E'; j++) {
			if (j=='A'||j==i||i=='E') {
				System.out.print(j);
				
			}else {
				System.out.print(" ");
			}
			
		}
		System.out.println();
	}

}
}
