package project4;

public class Family {
    public static void main(String[] args) {
        System.out.println(FamilyPerson.getSurname());
        FamilyPerson.setSurname("杨");
        FamilyPerson father = new FamilyPerson("金");
        System.out.println(father);
        FamilyPerson son = new FamilyPerson("广");
        System.out.println(son);
        FamilyPerson dau = new FamilyPerson("菁");
        System.out.println(dau);


    }

}
