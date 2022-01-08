import java.util.*;

public class LLN {
	public static void main(String[] args) {
		// 배열 크기 N, 숫자 더해지는 회수 M, 주어진 값K 입력받기
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int k = scanner.nextInt();
		
		// 배열의 크기 n만큼 자연수 입력받음
		int[] arr = new int[n];
		for(int i=0; i < n ; i++) {
			arr[i] = scanner.nextInt();
		}
		
		Arrays.sort(arr); // 입력받은 n개의 수 정렬
		int first = arr[n-1]; // 가장 큰 수
		int second = arr[n-2]; // 다음으로 큰 수
		
		int result = 0;
		result += (first*k + second)*(m/(k+1)); // (가장 큰 수 k번 + 두번째로 큰 수)에 m/(k+1)만큼 더함
		result += m%(k+1)*first; // 나누어떨어지지 않는 경우 남은 횟수만큼  큰 수 더함
		
		System.out.println(result);
		
		scanner.close();
	}
}
