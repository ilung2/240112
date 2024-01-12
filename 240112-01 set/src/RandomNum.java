import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomNum {
	public static void main(String[] args) {
		// 1 ~ 10 사이의 무작위 정수를 4개 가지는 집합(중복X) 생성하기
		Set<Integer> set = new HashSet<>();
		
		Random random = new Random();
		
		for (int i = 0; i < 4; i++) {
			set.add(random.nextInt(10) + 1);
		}
		
		System.out.println(set);
	}
}
