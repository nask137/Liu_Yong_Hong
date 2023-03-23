package project4;

public class Tank {
    private double speed;
    private int bulletAmount;

    public Tank() {
    }

    public Tank(double speed, int bulletAmount) {
        this.speed = speed;
        this.bulletAmount = bulletAmount;
    }

    public void speedUp(){
        System.out.println("加速");
    }
    public void speedDown(){
        System.out.println("减速");
    }
    public void fire(){
        if (this.bulletAmount>0) {
            System.out.println("开炮！！！！！！！！！！");
            this.bulletAmount--;
        }
        else System.out.println("没子弹了！！！");
    }

    /**
     * 获取
     * @return speed
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * 设置
     * @param speed
     */
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    /**
     * 获取
     * @return bulletAmount
     */
    public int getBulletAmount() {
        return bulletAmount;
    }

    /**
     * 设置
     * @param bulletAmount
     */
    public void setBulletAmount(int bulletAmount) {
        this.bulletAmount = bulletAmount;
        System.out.println("新的子弹数量为"+bulletAmount);
    }

    public String toString() {
        return "Tank{speed = " + speed + ", bulletAmount = " + bulletAmount + "}";
    }
}
