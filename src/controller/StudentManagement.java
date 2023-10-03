package controller;

import model.Student;
import sevice.StudentService;
import sevice.StudentServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {
    public static Scanner sc= new Scanner(System.in);
    public static List<Student> list=new ArrayList<>();
    public static void main(String[] args) {
        StudentService<Student> studentService=new StudentServiceImpl();
        int choice;
        do {
            System.out.println("*****************************Student Management*****************************");
            System.out.println("1. Thêm mới học sinh");
            System.out.println("2. Sửa thông tin học sinh");
            System.out.println("3. Xóa thông tin học sinh");
            System.out.println("4. Tìm kiếm học sinh theo Tên");
            System.out.println("5. Sắp xếp theo tên học sinh từ a-z");
            System.out.println("6. In ra danh sách học sinh");
            System.out.println("7. Sắp xếp điểm tăng dần");
            System.out.println("8. Sắp xếp điểm giảm dần");
            System.out.println("9. Thoát");
            System.out.print("Nhập vào lựa chọn của bạn (1-9): ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    studentService.add();
                    break;
                case 2:
                    studentService.update();
                    break;
                case 3:
                    studentService.delete();
                    break;
                case 4:
                    studentService.getByName();
                    break;
                case 5:
                    studentService.getAllSortByName();
                    break;
                case 6:
                    studentService.getAll();
                    break;
                case 7:
                    studentService.getAllSortUpByMark();
                    break;
                case 8:
                    studentService.getAllSortDownByMark();
                    break;
                case 9:
                    System.out.println("Đã thoát!");
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}
