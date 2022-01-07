
public class Greedy {
	public static void main(String[] args) {
		int n = 1260; // 거슬러줘야할 돈의 초기값
		int[] coinType = {500, 100, 50, 10}; // 동전 종류
		int count = 0;
		
		for(int i=0; i < coinType.length ; i++) {
			int coin = coinType[i];
			count += n / coin;
			n = n % coin;
			
		}
		System.out.println(count);
	}
}

