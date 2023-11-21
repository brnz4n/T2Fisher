package t2front;

import javax.swing.*;
import java.awt.Dimension;

public class Botao extends JButton {
    public Botao(String texto) {
        super(texto);
        setPreferredSize(new Dimension(240, 100));
    }
}
