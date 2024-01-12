import java.util.Arrays;

public class TestPrint {
	public static void print(String line) { // 전달받는 형식에 따라 toString을 써야함
		System.out.println(line);
	}
	
//	public static void print(Object o) {
//		System.out.println(o.toString());
//	}
	
	public static void main(String[] args) {
		print("asdf");
//		print(Arrays.asList("10", "20"));
	}
}
