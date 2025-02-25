package pattern1;

public class Upper_pyramid {
public static void main(String[] args) {
	for(int i=5; i>0; i--) {
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
	
	///////////////////////////////////////////////////
	////////With extra variable to print from 1 ///////
	///////////////////////////////////////////////////
	int k=1;
	for(int i=5; i>0; i--) {
		for(int j=1; j<=5; j++) {
			if(j>=i) {
				System.out.print(k+" ");
			}else {
				System.out.print(" ");
			}
		}
		k++;
		System.out.println();
	}
	System.out.println();
	
	//////////////////////////////////
	
	for(int i=5; i>0; i--) {
		int m=1;
		for(int j=1; j<=5; j++) {
			if(j>=i) {
				System.out.print(m+" ");
				m++;
			}else {
				System.out.print(" ");
			}
			
		}
		
		System.out.println();
	}
	System.out.println();
	
	/////////////////////////////////////////////////////
	//////Without any extra variable prints from 5 //////
	/////////////////////////////////////////////////////
	
	for(int i=5; i>0; i--) {
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
	
	////////////////////////////////////////
	
	for(int i=5; i>0; i--) {
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
	
	///////////////////////////////////////////////
	///////// Alphabets prints from E /////////////
	///////////////////////////////////////////////
	
	for(char i='E';i>='A'; i--) {
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
	
	for(char i='E'; i>='A'; i--) {
		for(char j='A'; j<='E';j++) {
			if(j>=i) {
				System.out.print(j+" ");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	System.out.println();
	
	//////////////////////////////////////////////////
	/////////// Alphabets prints from A //////////////
	//////////////////////////////////////////////////
	char a='A';
	for(char i='E';i>='A'; i--) {
		for(char j='A'; j<='E'; j++) {
			if(j>=i) {
				System.out.print(a+" ");
			}else {
				System.out.print(" ");
			}
		}
		a++;
		System.out.println();
	}
	System.out.println();
	
	for(char i='E'; i>='A'; i--) {
		char b='A';
		for(char j='A'; j<='E';j++) {
			if(j>=i) {
				System.out.print(b+" ");
				b++;
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	System.out.println();
	
	
}
}
