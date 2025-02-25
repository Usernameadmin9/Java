package pattern1;

public class Right_Arrow_Fastforward {
public static void main(String[] args) {
	for(int i=1; i<=5; i++) {
		for(int j=1; j<=5; j++) {
			if(j<=i) {
				System.out.print("* ");
			}
		}
		System.out.println();
	}
	for(int i=4; i>0; i--) {
		for(int j=1; j<=5; j++) {
			if(j<=i) {
				System.out.print("* ");
			}
		}
		System.out.println();
	}
	System.out.println();
	
	////////////////////////////////////
	
	for(int i=1; i<=5; i++) {
		for(int j=1; j<=5; j++) {
			if(j<=i) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	for(int i=4; i>0; i--) {
		for(int j=1; j<=5; j++) {
			if(j<=i) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	System.out.println();
	
	///////////////////////////////////////////
	
	for(int i=1; i<=5; i++) {
		for(int j=1; j<=5; j++) {
			if(j<=i) {
				System.out.print(j+" ");
			}
		}
		System.out.println();
	}
	for(int i=4; i>0; i--) {
		for(int j=1; j<=5; j++) {
			if(j<=i) {
				System.out.print(j+" ");
			}
		}
		System.out.println();
	}
	System.out.println();
	
	/////////////////////////////////////////
	
	for(char i='A'; i<='E'; i++) {
		for(char j='A'; j<='E'; j++) {
			if(j<=i) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	for(char i='D'; i>='A'; i--) {
		for(char j='A'; j<='E'; j++) {
			if(j<=i) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	System.out.println();
	
	//////////////////////////////////////////
	for(char i='A'; i<='E'; i++) {
		for(char j='A'; j<='E'; j++) {
			if(j<=i) {
				System.out.print(j+" ");
			}
		}
		System.out.println();
	}
	for(char i='D'; i>='A'; i--) {
		for(char j='A'; j<='E'; j++) {
			if(j<=i) {
				System.out.print(j+" ");
			}
		}
		System.out.println();
	}
}
}
