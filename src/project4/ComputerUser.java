package project4;
public class ComputerUser {
    public static void main(String[] args) {
        CD cd = new CD(2,2.0);
        Computer computer = new Computer(5,cd);
        computer.getCd().setContent(5.0);
        System.out.println(computer.getDate());

    }
}
