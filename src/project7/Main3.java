package project7;

import com.sun.deploy.panel.NumberDocument;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Main3 extends JFrame implements MouseListener {
    public static int flag = 1;
    JButton jButton = new JButton("+");
    JButton jButton1 = new JButton("-");
    JButton jButton2 = new JButton("*");
    JButton jButton3 = new JButton("/");
    JTextField jTextField = new JTextField();
    JTextField jTextField2 = new JTextField();
    JTextField jTextField3 = new JTextField();
    JLabel jLabel = new JLabel("操作数");
    JLabel jLabel1 = new JLabel("操作数2");
    JLabel jLabel2 = new JLabel("结果");
    JPanel jPanel = new JPanel();

    public Main3() throws InterruptedException {
        this.setTitle("计算器");
        this.setBounds(700, 200, 700, 600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jButton.setBounds(500, 0, 100, 30);
        jButton1.setBounds(500, 100, 100, 30);
        jButton2.setBounds(500, 200, 100, 30);
        jButton3.setBounds(500, 300, 100, 30);
        jButton.addMouseListener(this);
        jButton1.addMouseListener(this);
        jButton2.addMouseListener(this);
        jButton3.addMouseListener(this);
        jTextField.setBounds(100, 0, 200, 30);
        jTextField.setDocument(new NumberDocument());
        jTextField2.setBounds(100, 200, 200, 30);
        jTextField2.setDocument(new NumberDocument());
        jTextField3.setBounds(100, 400, 200, 30);
        jTextField3.setDocument(new NumberDocument());
        jLabel.setBounds(0, 0, 50, 30);
        jLabel1.setBounds(0, 200, 50, 30);
        jLabel2.setBounds(0, 400, 50, 30);
        jPanel.add(jButton);
        jPanel.add(jButton1);
        jPanel.add(jButton2);
        jPanel.add(jButton3);
        jPanel.add(jTextField);
        jPanel.add(jTextField2);
        jPanel.add(jTextField3);
        jPanel.add(jLabel);
        jPanel.add(jLabel1);
        jPanel.add(jLabel2);
        jPanel.setLayout(null);
        this.getContentPane().add(jPanel);
        this.setVisible(true);
        showJDialog("请选择操作符");
        while (true) {
            int a = 0;
            int b = 0;
            int c = 0;
            if (flag == 1) {
                if (!jTextField.getText().equals("")) a = Integer.parseInt(jTextField.getText());
                if (!jTextField2.getText().equals("")) b = Integer.parseInt(jTextField2.getText());
                c = a + b;
                jTextField3.setText(String.valueOf(c));
                this.setVisible(true);
            } else if (flag == 2) {
                if (!jTextField.getText().equals("")) a = Integer.parseInt(jTextField.getText());
                if (!jTextField2.getText().equals("")) b = Integer.parseInt(jTextField2.getText());
                c = a - b;
                jTextField3.setText(String.valueOf(c));
                this.setVisible(true);
            } else if (flag == 3) {
                if (!jTextField.getText().equals("")) a = Integer.parseInt(jTextField.getText());
                if (!jTextField2.getText().equals("")) b = Integer.parseInt(jTextField2.getText());
                c = a * b;
                jTextField3.setText(String.valueOf(c));
                this.setVisible(true);
            } else {
                if (!jTextField.getText().equals("")) a = Integer.parseInt(jTextField.getText());
                if (jTextField2.getText().equals("")) b = 1;
                else b = Integer.parseInt(jTextField2.getText());
                if (b == 0) {
                    showJDialog("除数不能为0");
                    Thread.sleep(5000);
                } else {
                    c = a / b;
                    jTextField3.setText(String.valueOf(c));
                    this.setVisible(true);
                }
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //去除按钮的边框
        jButton.setBorderPainted(true);
        //去除按钮的背景
        jButton.setContentAreaFilled(true);
        //去除按钮的边框
        jButton1.setBorderPainted(true);
        //去除按钮的背景
        jButton1.setContentAreaFilled(true);
        //去除按钮的边框
        jButton2.setBorderPainted(true);
        //去除按钮的背景
        jButton2.setContentAreaFilled(true);
        //去除按钮的边框
        jButton3.setBorderPainted(true);
        //去除按钮的背景
        jButton3.setContentAreaFilled(true);
        this.setVisible(true);
        Object source = e.getSource();
        if (source == jButton) {
            flag = 1;
            //去除按钮的边框
            jButton.setBorderPainted(false);
            //去除按钮的背景
            jButton.setContentAreaFilled(false);
            this.setVisible(true);
        } else if (source == jButton1) {
            flag = 2;
            //去除按钮的边框
            jButton1.setBorderPainted(false);
            //去除按钮的背景
            jButton1.setContentAreaFilled(false);
            this.setVisible(true);
        } else if (source == jButton2) {
            flag = 3;
            //去除按钮的边框
            jButton2.setBorderPainted(false);
            //去除按钮的背景
            jButton2.setContentAreaFilled(false);
            this.setVisible(true);
        } else {
            flag = 4;
            //去除按钮的边框
            jButton3.setBorderPainted(false);
            //去除按钮的背景
            jButton3.setContentAreaFilled(false);
            this.setVisible(true);
        }


    }

    public void showJDialog(String content) {
        //创建一个弹框对象
        JDialog jDialog = new JDialog();
        //给弹框设置大小
        jDialog.setSize(200, 150);
        //让弹框置顶
        jDialog.setAlwaysOnTop(true);
        //让弹框居中
        jDialog.setLocationRelativeTo(null);
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
}
