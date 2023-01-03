package shared.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * The EndMenu class is the panel that contains the end menu.
 */
public class EndMenu extends JPanel {
    private JButton home;
    private JButton quit;

    protected GridBagConstraints c = new GridBagConstraints();

    protected static final Color LIGHT_RED = new Color(0xde1738);

    public EndMenu(StartMenu homeMenu, JFrame frame) {
        // Layout
        setLayout(new GridBagLayout());

        // Background
        setBackground(new Color(0xAFEEEE));

        // Border
        setBorder(new TitledBorder(new EtchedBorder(), "End of the game"));
        ((TitledBorder) getBorder()).setTitleJustification(TitledBorder.CENTER);

        // Button Home
        home = new JButton("Home");
        home.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // homeMenu.init();
            }
        });
        c.gridx = 0;
        c.gridy = 2;
        c.insets = new Insets(40, 0, 0, 20);
        add(home, c);

        // Button Quit
        quit = new JButton("Quit");
        quit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        quit.setBackground(LIGHT_RED);
        quit.setForeground(Color.WHITE);
        c.gridx = 2;
        c.gridy = 2;
        c.insets = new Insets(40, 20, 0, 0);
        add(quit, c);
    }
}
