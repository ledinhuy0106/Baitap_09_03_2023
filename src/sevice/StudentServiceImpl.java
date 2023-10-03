package sevice;

import model.Student;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static controller.StudentManagement.list;
import static controller.StudentManagement.sc;

public class StudentServiceImpl implements StudentService<Student> {
    @Override
    public void add() {
        Student student = new Student();
        student.input();
        save(student);
    }

    @Override
    public void save(Student student) {
        getAllStudent().add(student);
    }

    @Override
    public void getAll() {
        for (Student student : getAllStudent()) {
            student.display();
        }
    }

    @Override
    public void update() {
        System.out.println("Nhập id hsinh cần sửa:");
        int idUpdate = Integer.parseInt(sc.nextLine());
        Student student = getById(idUpdate);
        student.input();
        getAllStudent().set(idUpdate, student);
    }

    public Student getById(int id) {
        for (Student s : getAllStudent()) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    @Override
    public void delete() {
        System.out.println("Nhập vào id hsinh cần xóa: ");
        int idDelete = Integer.parseInt(sc.nextLine());
        Student student = getById(idDelete);
        getAllStudent().remove(student);
    }

    @Override
    public void getAllSortByName() {
        for (Student student : sortByName()) {
            student.display();
        }
    }

    public List<Student> sortByName() {
        getAllStudent().sort(Comparator.comparing(Student::getName));
        return getAllStudent();
    }

    @Override
    public void getByName() {
        System.out.println("Nhập tên cần tìm: ");
        String name = sc.nextLine();
        for (Student s : getAllStudent()) {
            if (s.getName().equals(name)) {
                s.display();
            }
        }
    }

    @Override
    public void getAllSortDownByMark() {
        for (Student student : sortDownByMark()) {
            student.display();
        }
    }

    public List<Student> sortDownByMark() {
        getAllStudent().sort((a, b) -> (int) (b.getMark()-a.getMark()));
        return getAllStudent();
    }

    @Override
    public void getAllSortUpByMark() {
        for (Student student : sortUpByMark()) {
            student.display();
        }
    }

    public List<Student> sortUpByMark() {
        Student student= new Student();
        getAllStudent().sort(Comparator.comparing(Student::getMark));
        return getAllStudent();
    }


    public List<Student> getAllStudent() {
        return list;
    }
}
