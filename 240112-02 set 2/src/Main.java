import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Set<Integer> setA = new HashSet<>(
					Arrays.asList(1, 2, 3, 4, 5)
				);
		Set<Integer> setB = new HashSet<>(
				Arrays.asList(3, 4, 5, 6, 7)
			);
		
		Set<Integer> union = new HashSet<>();
		union.addAll(setA);
		union.addAll(setB);
		
		System.out.println(union); // 합집합
		
		Set<Integer> duplicate = new HashSet<>();
		duplicate.addAll(setA);
		duplicate.retainAll(setB); // 중복되지않은 원소들이 제거
		
		System.out.println(duplicate); //교집합.
		
		Set<Integer> leftOuterSecter = new HashSet<>();
		leftOuterSecter.addAll(setA);
		leftOuterSecter.removeAll(setB); // 중복되는 원소들이 제거
		
		System.out.println(leftOuterSecter);
	}
}









