package Exercice;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class WindowAction implements WindowListener {
    public void windowOpened(WindowEvent e){}
    public void windowClosing(WindowEvent e)
    {System.exit(0);}
    public void windowClosed(WindowEvent e){}
    public void windowIconified(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}
    public void windowActivated(WindowEvent e){}
    public void windowDeactivated(WindowEvent e){}
}