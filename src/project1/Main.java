package project1;

public class Main {
    public static void main(String[] args) {
        ClassRoom classRoom = new ClassRoom(10, 250);
        Teacher teacher = new Teacher("刘永红", (byte) 55, "面向对象设计");
        Students students = new Students(1,"王楠",(byte)20,'男');
        System.out.println(classRoom.toString());
        System.out.println(teacher.toString());
        System.out.println(students.toString());
    }
}
