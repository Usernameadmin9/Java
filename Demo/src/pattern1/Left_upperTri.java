package pattern1;

public class Left_upperTri {
public static void main(String[] args) {
	for(int i=5; i>0; i--) {
		for(int j=1; j<=5; j++) {
			if(j<=i) {
				System.out.print("*");
			}
		}
		System.out.println();
	}
	System.out.println();
	
	////////////////////////////////////
	
	for(int i=5; i>0;i--) {
		for(int j=1; j<=5;j++) {
			if(j<=i){
				System.out.print(i);
			}
		}
		System.out.println();
	}
	System.out.println();
	
	//////////////////////////////////////
	
	for(int i=5; i>0;i--) {
		for(int j=1; j<=5;j++) {
			if(j<=i){
				System.out.print(j);
			}
		}
		System.out.println();
	}
	System.out.println();
	
	//////////////////////////////////////
	
	for(char i='E'; i>='A'; i--) {
		for(char j='A'; j<='E'; j++) {
			if(j<=i) {
				System.out.print(i);
			}
		}
		
		System.out.println();
	}
	System.out.println();
	
	//////////////////////////////////////////
	////// With extra var prints from A //////
	//////////////////////////////////////////
	char a='A';
	for(char i='E'; i>='A'; i--) {
		for(char j='A'; j<='E'; j++) {
			if(j<=i) {
				System.out.print(a);
			}
		}
		a++;
		System.out.println();
	}
	System.out.println();
	
	///////////////////////////////////////
	
	for(char i='E'; i>='A'; i--) {
		for(char j='A'; j<='E'; j++) {
			if(j<=i) {
				System.out.print(j);
			}
		}
		System.out.println();
	}
	System.out.println();
}
}
