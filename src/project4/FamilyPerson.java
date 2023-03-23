package project4;
public class FamilyPerson {
   private static String surname;
   private  String name ;

     public FamilyPerson() {
     }

     public FamilyPerson( String name) {
          this.name = name;
     }

     /**
      * 获取
      * @return surname
      */
     public static String getSurname() {
          return surname;
     }

     /**
      * 设置
      * @param surname
      */
     public static void setSurname(String surname) {
          FamilyPerson.surname = surname;
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

     public String toString() {
          return "FamilyPerson{surname = " + surname + ", name = " + name + "}";
     }
}
