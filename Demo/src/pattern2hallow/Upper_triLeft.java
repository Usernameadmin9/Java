package pattern2hallow;

public class Upper_triLeft {
public static void main(String[] args) {
	//////////////
	////EXTRA////
	/////////////
	System.out.println();
	for (int i = 1; i<=5; i++) { //this prints i in a sequence staring from 1
		for (int j = 5; j >0; j--) {  //but this prints j stating from 5 or last no.
			if(j==5||i==1||j==i) {
				System.out.print(i);
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	System.out.println();
	/////////////////////////////////////
	///main practical code starts here///
	/////////////////////////////////////
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
	for(int i=5; i>0;i--) {  //this prints j in a sequence staring from 1
		for (int j = 1; j <=5; j++) {  //but this prints i stating from 5 or last no.
			if(i==j||i==5||j==1) {
				System.out.print(i);
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
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

}
}
