import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddNum extends JFrame implements ActionListener {
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton b1,b2,b3,b4;
    public AddNum(){
          super("CALCULATRICE");
          l1=new JLabel("la premiere valeur");
          l2=new JLabel("la deuxieme valeur");
          l3=new JLabel("resultat");
          t1=new JTextField(10);
          t2=new JTextField(10);
          t3=new JTextField(10);
          b1=new JButton(" Somme");
          b2=new JButton("soustraction");
          b3=new JButton("multiplication");
          b4=new JButton("division");
          setLayout(new FlowLayout(FlowLayout.LEFT,150,10));
          add(l1);
          add(t1);
          add(l2);
          add(t2);
          add(l3);
          add(t3);
          add(b1);
          add(b2);
          add(b3);
          add(b4);
          b1.addActionListener(this);
          b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x = Integer.parseInt(t1.getText());
                int y = Integer.parseInt(t2.getText());
                int difference = x - y;
                t3.setText(String.valueOf(difference));
            }
        });
          b3.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  int x = Integer.parseInt(t1.getText());
                  int y = Integer.parseInt(t2.getText());
                  int mult=x*y;
                  t3.setText(String.valueOf(mult));
              }
          });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x = Integer.parseInt(t1.getText());
                int y = Integer.parseInt(t2.getText());
                if (y==0){
                    t3.setText("impossible");
                }
                else {
                    double div = x/y;
                    t3.setText(String.valueOf(div));
                }
            }
        });
          setSize(400,400);
          setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int x = Integer.parseInt(t1.getText());
        int y = Integer.parseInt(t2.getText());
        int sum = x+y;
        t3.setText(String.valueOf(sum));
    }
}
