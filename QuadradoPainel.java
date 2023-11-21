package t2front;

import javax.swing.*;
import java.awt.*;

public class QuadradoPainel extends JPanel {
    public static final int TAMANHO_QUADRADO = 43;

    public QuadradoPainel(ImageIcon icon) {
        setPreferredSize(new Dimension(TAMANHO_QUADRADO, TAMANHO_QUADRADO));
        setBorder(BorderFactory.createLineBorder(Color.BLACK));

        if (icon != null) {
            JLabel label = new JLabel(icon);
            add(label);
        }
    }
}
