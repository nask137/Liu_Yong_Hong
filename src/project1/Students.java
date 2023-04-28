package project1;

public class Students {
    private int id ;
    private String name ;
    private byte age ;
    private char sex;


    public Students() {
    }

    public Students(int id, String name, byte age, char sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public byte getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(byte age) {
        this.age = age;
    }

    /**
     * 获取
     * @return sex
     */
    public char getSex() {
        return sex;
    }

    /**
     * 设置
     * @param sex
     */
    public void setSex(char sex) {
        this.sex = sex;
    }

    public String toString() {
        return "Students{id = " + id + ", name = " + name + ", age = " + age + ", sex = " + sex + "}";
    }
}
