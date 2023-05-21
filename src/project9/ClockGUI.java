package project9;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ClockGUI extends JFrame {

    private static final long serialVersionUID = 1L;

    private JLabel hourLabel, minuteLabel, secondLabel;

    public ClockGUI() {
        setTitle("时钟");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 初始化界面元素
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 48);
        hourLabel = new JLabel();
        hourLabel.setFont(font);
        panel.add(hourLabel, BorderLayout.WEST);
        minuteLabel = new JLabel();
        minuteLabel.setFont(font);
        panel.add(minuteLabel, BorderLayout.CENTER);
        secondLabel = new JLabel();
        secondLabel.setFont(font);
        panel.add(secondLabel, BorderLayout.EAST);
        JPanel labelPanel = new JPanel(new GridLayout(1, 3));
        labelPanel.setBackground(Color.WHITE);
        labelPanel.add(hourLabel);
        labelPanel.add(minuteLabel);
        labelPanel.add(secondLabel);
        panel.add(labelPanel, BorderLayout.CENTER);

        add(panel);
        setVisible(true);
    }

    public void setHour(int hour) {
        hourLabel.setText(getTimeString(hour));
    }

    public void setMinute(int minute) {
        minuteLabel.setText(getTimeString(minute));
    }

    public void setSecond(int second) {
        secondLabel.setText(getTimeString(second));
    }

    private String getTimeString(int value) {
        String str = "";
        if (value < 10) {
            str += "0";
        }
        str += value;
        return str;
    }

    public static void main(String[] args) {
        ClockGUI gui = new ClockGUI();
        Thread hourThread = new Thread(new HourRunnable(gui));
        Thread minuteThread = new Thread(new MinuteRunnable(gui));
        Thread secondThread = new Thread(new SecondRunnable(gui));
        hourThread.start();
        minuteThread.start();
        secondThread.start();
    }

}

class HourRunnable implements Runnable {

    private ClockGUI gui;

    public HourRunnable(ClockGUI gui) {
        this.gui = gui;
    }

    public void run() {
        while (true) {
            Calendar calendar = Calendar.getInstance();
            int hour = calendar.get(Calendar.HOUR_OF_DAY);
            gui.setHour(hour);
            try {
                Thread.sleep(1000 * 60 * 60); // 每隔一小时更新一次
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

class MinuteRunnable implements Runnable {

    private ClockGUI gui;

    public MinuteRunnable(ClockGUI gui) {
        this.gui = gui;
    }

    public void run() {
        while (true) {
            Calendar calendar = Calendar.getInstance();
            int minute = calendar.get(Calendar.MINUTE);
            gui.setMinute(minute);
            try {
                Thread.sleep(1000 * 60); // 每隔一分钟更新一次
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

class SecondRunnable implements Runnable {

    private ClockGUI gui;

    public SecondRunnable(ClockGUI gui) {
        this.gui = gui;
    }

    public void run() {
        while (true) {
            Calendar calendar = Calendar.getInstance();
            int second = calendar.get(Calendar.SECOND);
            gui.setSecond(second);
            try {
                Thread.sleep(1000); // 每秒更新一次
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

