package Lab2.QN9;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MenuExample extends JFrame {
    public MenuExample() {
        super("Menu Example");
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("Option");
        fileMenu.add(new JMenuItem("Option 1"));
        fileMenu.addSeparator();
        fileMenu.add(new JMenuItem("Option 2"));
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);
        JPopupMenu popupMenu = new JPopupMenu();
        popupMenu.add(new JMenuItem("Option"));

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    popupMenu.show(MenuExample.this, e.getX(), e.getY());
                }
            }
        });

        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MenuExample();
    }
}
