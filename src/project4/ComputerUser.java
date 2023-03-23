package project4;
public class ComputerUser {
    public static void main(String[] args) {
        double []b={1,2.3,4,5,};
        CD cd = new CD(b.length,b);
        Computer computer = new Computer(5,cd);
        double []a={1,2.3,4,8};
        computer.getCd().setContent(a);
        System.out.println(computer.getCd());

    }
}
