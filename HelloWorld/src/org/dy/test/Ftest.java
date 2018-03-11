package org.dy.test;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Ftest extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel jContentPane = null;
    private JTextArea jTextArea = null;
    private JPanel controlPanel = null;
    private JButton openButton = null;
    private JButton closeButton = null;


    private JButton getOpenButton(){
        if (openButton == null){
            openButton = new JButton();
            openButton.setText("写入文本");
            openButton.addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent e){
                    File file = new File("D:/work.txt");
                    try{
                        FileWriter out = new FileWriter(file);
                        String s = jTextArea.getText();
                        out.write(s);
                        out.close();
                    }catch (Exception e1){
                        e1.printStackTrace();
                    }
                }
            });
        }
        return openButton;
    }
    private JButton getCloseButton(){
        if (closeButton == null){
            closeButton = new JButton();
            closeButton.setText("读取文本");
            closeButton.addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent e){
                    File file = new File("D:/work.txt");
                    try{
                        FileReader in = new FileReader(file);
                        char byt[] = new char[1024];
                        int len = in.read(byt);
                        jTextArea.setText(new String(byt,0,len));
                        in.close();
                    }catch (Exception e1){
                        e1.printStackTrace();
                    }
                }
            });
        }
        return closeButton;
    }
    public Ftest(){
        super();
        initialize();
    }
    private void initialize(){
        this.setSize(300,200);
        this.setContentPane(getJContentPane());
        this.setTitle("JFrame");
    }
    private JPanel getJContentPane(){
        if (jContentPane == null){
            jContentPane = new JPanel();
            jContentPane.setLayout(new BorderLayout());
            jContentPane.add(getJTextArea(),BorderLayout.CENTER);
            jContentPane.add(getControlPanel(), BorderLayout.SOUTH);
        }
        return jContentPane;
    }

    public JTextArea getJTextArea() {
        if (jTextArea == null){
            jTextArea = new JTextArea();
        }
        return jTextArea;
    }

    public JPanel getControlPanel() {
        if (controlPanel == null){
            controlPanel = new JPanel();
            controlPanel.setLayout(new BorderLayout());
            controlPanel.add(getOpenButton(),BorderLayout.CENTER);
            controlPanel.add(getCloseButton(),BorderLayout.EAST);
        }

        return controlPanel;
    }
}
