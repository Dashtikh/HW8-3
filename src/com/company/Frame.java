package com.company;

import javax.swing.*;
import java.awt.*;

public class Frame {
    JFrame mainframe = new JFrame("Aqsats");
    JPanel mainpanel = new JPanel(new BorderLayout(5,2));
    JPanel centerpanel = new JPanel(new GridLayout(4,1));
    JLabel title = new JLabel("Hire form",JLabel.CENTER);
    JTextField qest = new JTextField();
    JTextField tedad = new JTextField();
    JTextField hoqoq = new JTextField();
    JTextField NationalCode = new JTextField();
    JButton Submit = new JButton("pardakht");
    public void Startup(){
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainframe.setSize(600, 800);
        mainframe.setLocationRelativeTo(null);
        mainframe.setVisible(true);
        mainframe.add(mainpanel);
        mainpanel.add(centerpanel,BorderLayout.CENTER);
        centerpanel.add(qest);
        centerpanel.add(tedad);
        centerpanel.add(hoqoq);
        centerpanel.add(Submit);
        qest.setBorder(BorderFactory.createTitledBorder("Qest"));
        tedad.setBorder(BorderFactory.createTitledBorder("tedade qest "));
        hoqoq.setBorder(BorderFactory.createTitledBorder("mizane hoqoq"));
        Submit.addActionListener(e->calculater());




    }
    public void calculater(){
        String a, b, c;
        int d , e, f;
        a=qest.getText();
        b=tedad.getText();
        c=hoqoq.getText();
        d=Integer.parseInt(a);
        e=Integer.parseInt(b);
        f=Integer.parseInt(c);
        System.out.println(d);
        f=f-e;
        e=e-1;
        JOptionPane.showMessageDialog(null, "mizane hoqoqe baqi mande shoma = "+f, "resid", JOptionPane.PLAIN_MESSAGE);
        tedad.setText(Integer.toString(e));
        hoqoq.setText(Integer.toString(f));





    }
}
