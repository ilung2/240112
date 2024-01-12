import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

// 학원 수강생 관리 프로그램
class Student {
	private String name;

	public Student(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name);
	}
}
// 영어반 , 수학반

// 같은 과목에 중복 등록 불가
// 각 반은 총원이 3명 (총원이 가득찬 경우, 해당 과목의 반이 신규 개설된다.)
public class Main5 {
	public static void main(String[] args) {
		List<Set<Student>> mathClass = new ArrayList<>();
		List<Set<Student>> engClass = new ArrayList<>();

		Set<Student> setList = new HashSet<>();
		Set<Student> setMath = new HashSet<>();
		Set<Student> setEng = new HashSet<>();
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("학생의 이름을 등록하세요, 0을누르면 종료");
			String name = scan.nextLine();
			if (name.equals("0")) {
				break;
			}
			System.out.println("영어반 / 수학반 등록해주세요, 0을누르면 종료");
			String nameClass = scan.nextLine();
			if (nameClass.equals("영어반")) {
				setEng.add(new Student(name));
				setList.add((new Student(name)));
				if (setEng.size() == 3) {
					engClass.add(setEng);
					setEng = new HashSet<>();
				}

			} else if (nameClass.equals("수학반")) {
				setMath.add(new Student(name));
				setList.add((new Student(name)));
				if (setMath.size() == 3) {
					mathClass.add(setMath);
					setMath = new HashSet<>();
				}
			} else {
				System.out.println("잘못된 입력입니다.");
			}
			
		}
		System.out.println("인원이 꽉찬 영어반 : " + engClass);
		System.out.println("인원이 꽉찬 수학반 : " + mathClass);
		System.out.println("다음 영어반 : " + setEng);
		System.out.println("다음 수학반 : " + setMath);
		System.out.println("등록된 학생 이름: " + setList);
	}
}
