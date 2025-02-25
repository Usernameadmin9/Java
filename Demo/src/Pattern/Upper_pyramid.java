package Pattern;

public class Upper_pyramid {
public static void main(String[] args) {
	for(int i=5; i>0; i--) {
		for(int j=1; j<=5; j++) {
			if(j>=i) {
				if(i==1||i==j||j==5) {
					System.out.print(i+" ");
				}else {
					System.out.print("  ");
				}
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
