package project7;
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Main2 extends JFrame implements MouseListener {
    JButton jButton = new JButton();
    JButton jButton2 = new JButton();
    JLabel jLabel = new JLabel("你");
    JLabel jLabel2 = new JLabel("好");
    JPanel jpanel = new JPanel();
    public Main2(){
        this.setTitle("test");
        this.setBounds(600, 200, 200, 200);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jpanel.setLayout(null);
        jButton.setBounds(50,50,30,10);
        jButton.addMouseListener(this);
        jButton2.setBounds(100,50,30,10);
        jButton2.addMouseListener(this);
        jLabel.setBounds(50,80,30,20);
        jLabel2.setBounds(100,80,30,20);
        jpanel.add(jButton);
        jpanel.add(jButton2);
        this.setContentPane(jpanel);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object source = e.getSource();
        if(source==jButton){
            jpanel.add(jLabel);
            this.setContentPane(jpanel);
            //showJDialog(jLabel.getText());
            this.setVisible(true);
        }else {
            jpanel.add(jLabel2);
            this.setContentPane(jpanel);
            //showJDialog(jLabel2.getText());
            this.setVisible(true);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
    public static void showJDialog(String content) {
        //创建一个弹框对象
        JDialog jDialog = new JDialog();
        //给弹框设置大小
        jDialog.setSize(200, 150);
        //让弹框置顶
        jDialog.setAlwaysOnTop(true);
        //让弹框居中
        jDialog.setLocationRelativeTo(null);
        //弹框不关闭永远无法操作下面的界面
        jDialog.setModal(true);
        //创建Jlabel对象管理文字并添加到弹框当中
        JLabel warning = new JLabel(content);
        warning.setBounds(0, 0, 200, 150);
        jDialog.getContentPane().add(warning);
        //让弹框展示出来
        jDialog.setVisible(true);
    }
}
