package Exercice;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
public class MonForm extends JFrame {
    Container conteneur=null;
    JTextField t;
    JButton b;
    public MonForm() {
        this.setTitle("Formulaire avec bouton");
        this.setSize(new Dimension(500,500));
        WindowAdapter win=new WindowAdapter(){
            public void windowClosing(WindowEvent e){System.exit(0);}
        };
        this.addWindowListener(win);
        conteneur=this.getContentPane();
        conteneur.setLayout(null);
        t=new JTextField("texte");
        conteneur.add(t);
        t.setBounds(30,50,100,40);
        b=new JButton();
        conteneur.add(b);
        b.setText("Test");
        b.setBounds(10,20,100,20);
        conteneur.add(b);
        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent evt){
                t.setText("texte changé");
            }
        });

    }
    public static void main(String[] args) {
        new MonForm().setVisible(true);
    }
}