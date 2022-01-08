import java.util.*;

public class NumberCardGame {

	public static void main(String[] args) {
		
		// 행의 수 n과 열의 수 m 입력받기
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		// 행렬에 들어가는 숫자 입력
		int[][] arr = new int[n][m];
		for(int i=0; i < n; i++) {
			for(int j=0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int max = 0;
		
		for(int i=0; i < n; i++) {
			// 각 행에서 가장 작은 수 찾기
			int min = 10001;
			for(int j=0; j < m; j++) {
				if(arr[i][j] < min)
					min = arr[i][j];
			}
			// 찾은 수 중에서 가장 큰 수 찾기
			if(max < min)
				max = min;
		}
		System.out.println(max);
	}

}
