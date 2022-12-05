package task_2_oop_intro;

public class Employee {
    private final String name;
    private final int age;
    private final String position;
    private final String phone;
    private final String email;


    public Employee(String name, int age, String position, String phone, String email) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
}
