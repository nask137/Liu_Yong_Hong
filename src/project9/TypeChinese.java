package project9;
public class TypeChinese {
    public static void main(String args[]) {
        System.out.println("输入汉字练习(输入#结束程序)");
        System.out.printf("输入显示的汉字(回车)\n");
        Chinese hanzi;
        hanzi = new Chinese();
        GiveChineseThread giveHanzi = new GiveChineseThread();
        giveHanzi.setChinese(hanzi);
        giveHanzi.setSleepLength(5000);
        InputChineseThread typeHanzi = new InputChineseThread();
        typeHanzi.setChinese(hanzi);
        giveHanzi.start();
        try{
            Thread.sleep(500);
        } catch(Exception exp){}
        typeHanzi.start();
    }
}
