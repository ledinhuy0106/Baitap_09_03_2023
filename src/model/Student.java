package model;

import static controller.StudentManagement.sc;

public class Student {
    private int id;
    private String name;
    private String address;
     private String phone;
     private  int age;

     private boolean gender;

     private double mark;

    public Student() {
    }

    public Student(int id, String name, String address, String phone, int age, boolean gender, double mark) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.age = age;
        this.gender = gender;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
    public void input(){
        System.out.println("Vui lòng nhập id học sinh: ");
        id=Integer.parseInt(sc.nextLine());
        System.out.println("Vui lòng nhập tên học sinh: ");
        name= sc.nextLine();
        System.out.println("Vui lòng nhập địa chỉ học sinh: ");
        address= sc.nextLine();
        System.out.println("Vui lòng nhập tuổi học sinh: ");
        age=Integer.parseInt(sc.nextLine());
        System.out.println("Vui lòng nhập số điện thoại học sinh: ");
        phone=sc.nextLine();
        System.out.println("Vui lòng nhập giới tính học sinh: ");
        String nameIp=sc.nextLine();
        if (nameIp.equals("nam")){
            gender=true;
        } else if (nameIp.equals("nu")) {
            gender=false;
        }else {
            gender=false;
        }
        System.out.println("Vui lòng nhập điểm học sinh: ");
        mark=Double.parseDouble(sc.nextLine());
    }
    public void display(){
        System.out.printf("Học sinh %d tên: %s, tuổi: %d, địa chỉ: %s, số điện thoại: %s, điểm: %s, giới tính: %s \n",
                id, name, age,address, phone, mark, gender ? "Nam" : "Nữ" );
    }
}
