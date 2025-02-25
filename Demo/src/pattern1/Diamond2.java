package pattern1;

public class Diamond2 {
public static void main(String[] args) {
	for(int i=5; i>0;i--) {
		for(int j=1; j<=5; j++) {
			if(j>=i) {
				System.out.print("* ");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	for(int i=2; i<=5;i++) {
		for(int j=1; j<=5; j++) {
			if(j>=i) {
				System.out.print("* ");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	System.out.println();
	
	//////////////////////////////////////////////
	
	for(int i=5; i>0;i--) {
		for(int j=1; j<=5; j++) {
			if(j>=i) {
				System.out.print(i+" ");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	for(int i=2; i<=5;i++) {
		for(int j=1; j<=5; j++) {
			if(j>=i) {
				System.out.print(i+" ");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	System.out.println();
	
	/////////////////////////////////////////////
	
	for(int i=5; i>0;i--) {
		for(int j=1; j<=5; j++) {
			if(j>=i) {
				System.out.print(j+" ");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	for(int i=2; i<=5;i++) {
		for(int j=1; j<=5; j++) {
			if(j>=i) {
				System.out.print(j+" ");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	System.out.println();
	
	////////////////////////////////////////////////////////////////////////////////////////
	//With an extra var starts from 1 inc to 5 and then again starts from 2 and ends at 5///
	////////////////////////////////////////////////////////////////////////////////////////
	int a=1;
	for(int i=5; i>0;i--) {
		for(int j=1; j<=5; j++) {
			if(j>=i) {
				System.out.print(a+" ");
			}else {
				System.out.print(" ");
			}
		}
		a++;
		System.out.println();
	}
	for(int i=2; i<=5;i++) {
		for(int j=1; j<=5; j++) {
			if(j>=i) {
				System.out.print(i+" ");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	System.out.println();
	
	//////////////////////////////////
	
	
	for(int i=5; i>0;i--) {
		int b=1;
		for(int j=1; j<=5; j++) {
			if(j>=i) {
				System.out.print(b+" ");
				b++;
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	for(int i=2; i<=5;i++) {
		for(int j=1; j<=5; j++) {
			if(j>=i) {
				System.out.print(i+" ");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	System.out.println();
	
	//////////////////////////////////////////////
	
	for(char i='E'; i>='A'; i--) {
		for(char j='A'; j<='E'; j++) {
			if(j>=i) {
				System.out.print(i+" ");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	for(char i='B'; i<='E'; i++) {
		for(char j='A'; j<='E'; j++) {
			if(j>=i) {
				System.out.print(i+" ");
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
				System.out.print(j+" ");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	for(char i='B'; i<='E'; i++) {
		for(char j='A'; j<='E'; j++) {
			if(j>=i) {
				System.out.print(j+" ");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	

}
}
