package ch18.question.q1;

import java.io.*;

public class StudentInfoManager {
    // 파일 경로 (클래스 레벨 상수로 정의)
    private static final String FILE_PATH = "C:/Temp/students.csv";

    public static void main(String[] args) {
        // 파일이 존재하지 않으면 BOM이 있는 새 파일
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            try (FileOutputStream fos = new FileOutputStream(file)) {
                // UTF-8 BOM (EF BB BF) 추가
                fos.write(0xEF);
                fos.write(0xBB);
                fos.write(0xBF);
            } catch (IOException e) {
                System.out.println("파일 초기화 중 오류 발생: " + e.getMessage());
            }
        }

        // 테스트 코드
        try {
            // 학생 정보 추가
            addStudent("홍길동", "2021001", "컴퓨터공학과");
            addStudent("김철수", "2021002", "경영학과");
            addStudent("이영희", "2021003", "디자인학과");

            // 모든 학생 정보 출력
            showAllStudents();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addStudent(String name, String studentId, String major) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(String.format("%s,%s,%s", name, studentId, major));
            writer.newLine();
            System.out.printf("학생 정보가 추가되었습니다: %s(%s)%n", name, studentId);
        }
    }

    public static void showAllStudents() throws IOException {
        System.out.println("\n==== 전체 학생 정보 ====");
        System.out.printf("%-10s%-15s%-20s%n", "이름", "학번", "전공");
        System.out.println("------------------------------------------------");

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // BOM이 붙은 첫 줄일 수 있음
                line = line.replace("\uFEFF", "");

                String[] parts = line.split(",");
                if (parts.length == 3) {
                    System.out.printf("%-10s%-15s%-20s%n", parts[0], parts[1], parts[2]);
                }
            }
        }

        System.out.println("------------------------------------------------");
    }
}
