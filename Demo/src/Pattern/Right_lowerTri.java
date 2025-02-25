package Pattern;

public class Right_lowerTri {
public static void main(String[] args) {
	for(int i=5; i>0; i--) {
		for(int j=1; j<=5;j++) {
			if(j>=1) {
				if(i==1||j==5||i==j) {
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
}
}
