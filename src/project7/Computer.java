package project7;
import com.sun.deploy.panel.NumberDocument;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class Computer extends JFrame implements MouseListener, ActionListener {
    public static int level=10;
    public static int flag=0;
    JMenu jMenu = new JMenu("更换难度");
    JMenuBar jMenuBar = new JMenuBar();
    JMenuItem jMenuItem1 = new JMenuItem("简单");
    JMenuItem jMenuItem2 = new JMenuItem("一般");
    JMenuItem jMenuItem3 = new JMenuItem("困难");
    JMenuItem jMenuItem4 = new JMenuItem("地狱");
    JButton limit = new JButton("提交");
    JButton change = new JButton("换题");

    JTextField first = new JTextField();
    JTextField second = new JTextField();
    JTextField third = new JTextField();
    JTextArea jTextArea = new JTextArea("+");
    JTextArea jTextArea1 = new JTextArea("-");
    JTextArea jTextArea2 = new JTextArea("=");
    JTextArea jTextArea3 = new JTextArea("/");
    JTextArea jTextArea4 = new JTextArea("%");
    JPanel jpanel = new JPanel();
    public Computer() {
        this.setTitle("算术测试");
        this.setBounds(700, 200, 600, 160);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jMenuItem4.addActionListener(this);
        jMenuItem3.addActionListener(this);
        jMenuItem2.addActionListener(this);
        jMenuItem1.addActionListener(this);
        change.addMouseListener(this);
        limit.addMouseListener(this);
        jMenu.add(jMenuItem1);
        jMenu.add(jMenuItem2);
        jMenu.add(jMenuItem3);
        jMenu.add(jMenuItem4);
        jMenuBar.add(jMenu);
        this.setJMenuBar(jMenuBar);
        first.setBounds(95, 25, 50, 30);
        second.setBounds(225, 25, 50, 30);
        third.setBounds(350, 25, 50, 30);
        limit.setBounds(500, 21, 60, 35);
        change.setBounds(0, 21, 60, 35);
        first.setDocument(new NumberDocument());
        second.setDocument(new NumberDocument());
        jTextArea2.setBounds(300, 32, 13, 13);
        jpanel.setLayout(null);
        jpanel.add(limit);
        jpanel.add(change);
        jpanel.add(first);
        jpanel.add(second);
        jpanel.add(third);
        jpanel.add(jTextArea2);
        jTextArea.setBounds(180, 32, 13, 13);
        jTextArea.setName("+");
        jTextArea1.setBounds(180, 32, 13, 13);
        jTextArea1.setName("-");
        jTextArea3.setBounds(180, 32, 13, 13);
        jTextArea3.setName("/");
        jTextArea4.setBounds(180, 32, 13, 13);
        jTextArea4.setName("%");
      load();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object object= e.getSource();
         if (object==limit) {
            judge();
        }else {
             Random random = new Random();
             flag=random.nextInt(4);
             load();
        }
    }
    public  void judge (){
        if(flag==0) {
            if (Integer.parseInt(first.getText()) + Integer.parseInt(second.getText()) == Integer.parseInt(third.getText()))
                showJDialog("回答正确！");
            else showJDialog("回答错误");
        }else if(flag==1) {
            if (Integer.parseInt(first.getText()) - Integer.parseInt(second.getText()) == Integer.parseInt(third.getText()))
                showJDialog("回答正确！");
            else showJDialog("回答错误");
        }else if(flag==2) {
            if (Integer.parseInt(first.getText()) / Integer.parseInt(second.getText()) == Integer.parseInt(third.getText()))
                showJDialog("回答正确！");
            else showJDialog("回答错误");
        }else if(flag==3) {
            if (Integer.parseInt(first.getText()) % Integer.parseInt(second.getText()) == Integer.parseInt(third.getText()))
                showJDialog("回答正确！");
            else showJDialog("回答错误");
        }
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
public int getNumber(int level){
    Random r = new Random(System.currentTimeMillis()%125);
    return (r.nextInt(level*2)-r.nextInt(level*2));
}

    @Override
    public void actionPerformed(ActionEvent e) {
        Object object= e.getSource();
        if(object== jMenuItem1){
            level=10;
        } else if (object==jMenuItem2) {
            level=100;
        } else if (object==jMenuItem3) {
            level=1000;
        } else if (object==jMenuItem4) {
            level=10000;
        }
    }
    public  void load(){
        jpanel.remove(jTextArea);
        jpanel.remove(jTextArea1);
        jpanel.remove(jTextArea3);
        jpanel.remove(jTextArea4);
        if(flag==0)jpanel.add(jTextArea);
        if(flag==1)jpanel.add(jTextArea1);
        if(flag==2)jpanel.add(jTextArea3);
        if(flag==3)jpanel.add(jTextArea4);
        this.setContentPane(jpanel);
        first.setText(String.valueOf(getNumber(level)));
        second.setText(String.valueOf(getNumber(level)));
        this.setVisible(true);
    }
}
