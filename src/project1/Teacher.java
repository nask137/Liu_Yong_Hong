package project1;

public class Teacher {
    private String  name;
    private byte age ;
    private String classname;


    public Teacher() {
    }

    public Teacher(String name, byte age, String classname) {
        this.name = name;
        this.age = age;
        this.classname = classname;
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
     * @return classname
     */
    public String getClassname() {
        return classname;
    }

    /**
     * 设置
     * @param classname
     */
    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String toString() {
        return "Teacher{name = " + name + ", age = " + age + ", classname = " + classname + "}";
    }
}
