import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.*;
import javax.swing.border.EmptyBorder;


 class BuildForm extends JFrame {

    private JPanel contentPane;
    private JTextField t1,t2,t3,t4,t5,t6,t7;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    BuildForm frame = new BuildForm();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public BuildForm() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
//


        final JTextArea r1 = new JTextArea();
        r1.setBackground(Color.WHITE);
        r1.setBounds(10, 16, 115, 190);
        contentPane.add(r1);
        r1.setFont(new Font("Serif",Font.PLAIN,20));
        r1.setText("Понедельник Вторник Среда Четверг Пятница Субота Воскресенье");
        r1.setLineWrap(true);
        r1.setWrapStyleWord(true);
        ////


        t1 = new JTextField();
        t1.setBackground(Color.WHITE);
        t1.setBounds(135, 22, 100, 20);
        contentPane.add(t1);
        t1.setColumns(10);

        t2 = new JTextField();
        t2.setBackground(Color.WHITE);
        t2.setBounds(135, 49, 100, 20);
        contentPane.add(t2);
        t2.setColumns(10);

        t3 = new JTextField();
        t3.setBackground(Color.WHITE);
        t3.setBounds(135, 77, 100, 20);
        contentPane.add(t3);
        t3.setColumns(10);

        t4 = new JTextField();
        t4.setBackground(Color.WHITE);
        t4.setBounds(135, 103, 100, 20);
        contentPane.add(t4);
        t4.setColumns(10);

        t5 = new JTextField();
        t5.setBackground(Color.WHITE);
        t5.setBounds(135, 130, 100, 20);
        contentPane.add(t5);
        t5.setColumns(10);

        t6 = new JTextField();
        t6.setBackground(Color.WHITE);
        t6.setBounds(135, 157, 100, 20);
        contentPane.add(t6);
        t6.setColumns(10);

        t7 = new JTextField();
        t7.setBackground(Color.WHITE);
        t7.setBounds(135, 184, 100, 20);
        contentPane.add(t7);
        t7.setColumns(10);
/////





        final JTextArea textArea = new JTextArea();
        textArea.setBackground(Color.LIGHT_GRAY);
        textArea.setBounds(550, 16, 219, 190);
        contentPane.add(textArea);
//////


        JButton b1 = new JButton("Вывести");
        b1.setBounds(245, 22, 100, 20);
        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String str = readFromFile();
                textArea.setText(str);
            }
        });
        contentPane.add(b1);

        JButton b2 = new JButton("Вывести");
        b2.setBounds(245, 49, 100, 20);
        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String str = readFromFile();
                textArea.setText(str);
            }
        });
        contentPane.add(b2);

        JButton b3 = new JButton("Вывести");
        b3.setBounds(245, 77, 100, 20);
        b3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String str = readFromFile();
                textArea.setText(str);
            }
        });
        contentPane.add(b3);

        JButton b4 = new JButton("Вывести");
        b4.setBounds(245, 103, 100, 20);
        b4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String str = readFromFile();
                textArea.setText(str);
            }
        });
        contentPane.add(b4);

        JButton b5 = new JButton("Вывести");
        b5.setBounds(245,130 , 100, 20);
        b5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String str = readFromFile();
                textArea.setText(str);
            }
        });
        contentPane.add(b5);

        JButton b6 = new JButton("Вывести");
        b6.setBounds(245, 157, 100, 20);
        b6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String str = readFromFile();
                textArea.setText(str);
            }
        });
        contentPane.add(b6);

        JButton b7 = new JButton("Вывести");
        b7.setBounds(245, 184, 100, 20);
        b7.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String str = readFromFile();
                textArea.setText(str);
            }
        });
        contentPane.add(b7);
        /////



        JButton b8 = new JButton("Сохранить");
        b8.setBounds(350, 22, 100, 20);
        b8.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                saveToFile(t1.getText());
            }
        });
        contentPane.add(b8);

        JButton b9 = new JButton("Сохранить");
        b9.setBounds(350, 49, 100, 20);
        b9.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                saveToFile(t2.getText());
            }
        });
        contentPane.add(b9);

        JButton b10 = new JButton("Сохранить");
        b10.setBounds(350, 77, 100, 20);
        b10.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                saveToFile(t3.getText());
            }
        });
        contentPane.add(b10);


        JButton b11 = new JButton("Сохранить");
        b11.setBounds(350, 103, 100, 20);
        b11.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                saveToFile(t4.getText());
            }
        });
        contentPane.add(b11);

        JButton b12 = new JButton("Сохранить");
        b12.setBounds(350, 130, 100, 20);
        b12.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                saveToFile(t5.getText());
            }
        });
        contentPane.add(b12);

        JButton b13 = new JButton("Сохранить");
        b13.setBounds(350, 157, 100, 20);
        b13.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                saveToFile(t6.getText());
            }
        });
        contentPane.add(b13);

        JButton b14 = new JButton("Сохранить");
        b14.setBounds(350, 184, 100, 20);
        b14.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                saveToFile(t7.getText());
            }
        });
        contentPane.add(b14);
    }
///////////



    static String readFromFile() {
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new FileInputStream("text.txt"));
            return (String) in.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    static void saveToFile(String text) {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("text.txt"));
            out.writeObject(text);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null) {
                    out.flush();
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }


}