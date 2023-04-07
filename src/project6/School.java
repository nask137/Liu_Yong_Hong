package project6;

public class School {
    String schoolName;
     //内部类声明对象newsPaper
    InnerNewsPaper newsPaper ;
    School() {
        this("某某大学"); //调用带参数的构造方法
    }
    School(String s) {
        //创建对象newsPaper
        newsPaper= new InnerNewsPaper();
        String [] content = {"举办迎新会.", "机械系获得机器人大赛冠军.",
                "计算机学院召开学生会换届大会."};
        schoolName = s;
        newsPaper.setContent(content);
    }
    public void showNews(){
        newsPaper.showContent(schoolName);
    }


}
