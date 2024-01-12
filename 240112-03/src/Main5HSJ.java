//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Objects;
//import java.util.Scanner;
//import java.util.Set;
//
//class Student {
//   private String name;
//
//   public Student(String name) {
//      super();
//      this.name = name;
//   }
//
//   @Override
//   public String toString() {
//      return "Student [name=" + name + "]";
//   }
//
//   @Override
//   public int hashCode() {
//      return Objects.hash(name);
//   }
//
//   @Override
//   public boolean equals(Object obj) {
//      if (this == obj)
//         return true;
//      if (!(obj instanceof Student))
//         return false;
//      Student other = (Student) obj;
//      return Objects.equals(name, other.name);
//   }
//
//   public String getName() {
//      return name;
//   }
//
//   public void setName(String name) {
//      this.name = name;
//   }
//
//}
////학원 수강생 관리 프로그램
//
////영어반, 수학반
//
////같은 과목에 중복 등록 불가
////각 반은 총원이 3명
////학생이 3명이 넘으면 추가 반이 생겨야한다.
//
//public class Main5HSJ {
//   public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//
//      List<Set<Student>> englishClass = new ArrayList<>();
//      List<Set<Student>> mathClass = new ArrayList<>();
//
//      Set<Student> englishRoom = new HashSet<>();
//      Set<Student> mathRoom = new HashSet<>();
//
//      boolean go = true;
//      while (go) {
//
//         System.out.println("학생이름은?");
//         String name = sc.nextLine();
//         System.out.println("듣고 싶은 수업은? (영/수");
//         String watClass = sc.nextLine();
//         if (watClass.equals("영")) {
//            englishRoom.add(new Student(name));
//            if (englishRoom.size() == 3) {
//                englishClass.add(englishRoom);
//                englishRoom = new HashSet<>();
//             }
//         } else if (watClass.equals("수")) {
//            mathRoom.add(new Student(name));
//            if (mathRoom.size() == 3) {
//                mathClass.add(mathRoom);
//                mathRoom = new HashSet<>();
//             }
//         } else {
//            System.out.println("입력이 잘못됬다 이놈아!");
//         }
//         if (watClass.equals("-1")) {
//            go = false;
//         }
//
//      }
//      System.out.println("마지막 영어반 : " + englishRoom);
//      System.out.println("마지막 수학반 : " + mathRoom);
//      System.out.println("풀방된 영어반 : " + englishClass);
//      System.out.println("풀방된 수학반  : " + mathClass);
//
//   }
//
//}