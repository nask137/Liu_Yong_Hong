package project4;

public class Fight {
    public static void main(String[] args) {
        Tank tank = new Tank(20.0,2);
        Tank tank1 = new Tank(22.0,5);
        tank.fire();
        tank.fire();
        tank.fire();
        tank.speedDown();
        tank.setBulletAmount(20);
        tank.fire();
    }
}
