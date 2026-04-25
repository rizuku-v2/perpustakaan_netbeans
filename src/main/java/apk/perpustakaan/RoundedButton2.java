package apk.perpustakaan;

import java.awt.*;
import javax.swing.*;

public class RoundedButton2 extends JButton {

    private int radius = 20;

    public RoundedButton2() {
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        setForeground(Color.WHITE);
        setBackground(new Color(33,150,243));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    public void setRadius(int radius) {
        this.radius = radius;
        repaint();
    }

    public int getRadius() {
        return radius;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // background
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);

        super.paintComponent(g);
        g2.dispose();
    }

    @Override
    protected void paintBorder(Graphics g) {
        // optional border
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(getBackground().darker());
        g2.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, radius, radius);
    }
}