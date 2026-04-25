package apk.perpustakaan;

import javax.swing.*;
import java.awt.*;

public class RoundedPanel extends JPanel {

    private int cornerRadius = 30;

    public RoundedPanel() {
        setOpaque(false);
    }

    public RoundedPanel(int radius) {
        this.cornerRadius = radius;
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        // anti-alias biar halus
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // SHADOW (bayangan)
        g2.setColor(new Color(0, 0, 0, 50)); // transparan
        g2.fillRoundRect(5, 5, getWidth()-5, getHeight()-5, cornerRadius, cornerRadius);

        // BACKGROUND utama
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth()-5, getHeight()-5, cornerRadius, cornerRadius);

        super.paintComponent(g);
    }
}