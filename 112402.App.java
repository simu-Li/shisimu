import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JTextArea textArea_A=new JTextArea();
    JTextArea textArea_B=new JTextArea();
    //构造方法
    public App() {
        textArea_A.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);

                if ((textArea_A.getText()).equals("simu")&&(e.getKeyCode() == KeyEvent.VK_ENTER)) {
                    textArea_B.setText("输入正确");
                }else {
                    textArea_B.setText("输入错误");
                }
                /*if (e.getKeyCode() == KeyEvent.VK_DOWN){
                    textArea_B.setText("");
                }*/
            }
        });
    }
    //显示窗体方法
    void go(){
        textArea_A.setBounds(100,100,300,300);
        textArea_A.setBackground(Color.pink);
        textArea_B.setBounds(100,500,300,300);
        textArea_B.setBackground(Color.orange);
        myPanel.add(textArea_A);
        myPanel.add(textArea_B);

        JFrame frame = new JFrame("TestGUI");
        myPanel.setLayout(null);
        myPanel.add(label_txt);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,900);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
