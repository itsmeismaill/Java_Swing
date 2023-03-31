package Exercice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MonAction implements ActionListener {
    public void actionPerformed (ActionEvent e) {
        System.out.println ("Une action a eu lieu") ;}

}
 public class TestBouton {
    public TestBouton(){
        JFrame f = new JFrame ("TestBouton");
        Button b = new Button ("Cliquer ici");
        f.setTitle("Evenements");
        f.setSize(500, 350);//f.setBounds(10, 10, 500, 350);
        Container conteneur=f.getContentPane();
        conteneur.setLayout(null);
        b.setBounds(10, 20, 100, 50);
        conteneur.add(b);
        f.add (b) ; f.setVisible (true) ;
        b.addActionListener (new MonAction ());
        f.addWindowListener(new WindowAction());
    }
    public static void main(String args[]) {
        TestBouton test = new TestBouton();}

}