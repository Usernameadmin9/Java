package Pattern;

public class Lower_pyramid {
public static void main(String[] args) {
	for(int i=1; i<=5; i++) {
		for(int j=1;j<=5; j++) {
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
