package Pattern;

public class Left_upperTri {
public static void main(String[] args) {
	for(int i=5; i>0; i--) {
		for(int j=1; j<=5; j++) {
			if(j<=i) {
				if(i==5||j==1||i==j) {
					System.out.print(i);
				}else {
					System.out.print(" ");
				}
			}
		}
		System.out.println();
	}
	
}
}
