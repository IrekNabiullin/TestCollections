import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;


public class MyPalindromeString extends JFrame {

    JTextField wordField;

    public MyPalindromeString() {
        super("Палиндром");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel wordPanel = new JPanel();
        wordField = new JTextField(12);
        wordField.setDocument(new PlainDocument() {
            @Override
            public void insertString(int offs, String str, AttributeSet a)
                    throws BadLocationException {
                if (str.matches("[a-zA-Zа-яА-Я]+")) {
                    super.insertString(offs, str, a);
                }
            }
        });

        JButton button = new JButton("Проверить");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
        });

        wordPanel.add(wordField);
        wordPanel.add(button);

        add(wordPanel, BorderLayout.SOUTH);
        setPreferredSize(new Dimension(300, 200));
        setLocationRelativeTo(null);
        setResizable(false);
        pack();
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;

        // переменные для частей рожицы
        Ellipse2D.Double face = new Ellipse2D.Double(100, 50, 100, 100);
        Ellipse2D.Double leftEye = new Ellipse2D.Double(130, 80, 10, 10);
        Ellipse2D.Double rightEye = new Ellipse2D.Double(160, 80, 10, 10);
        Arc2D.Double smile = new Arc2D.Double(120, 100, 60, 20, 0, -180, 0);
        Arc2D.Double pain = new Arc2D.Double(120, 110, 60, 20, 0, 180, 0);

        String word = wordField.getText();

        if (!word.equals("")) {
            g2.draw(face);
            g2.draw(leftEye);
            g2.draw(rightEye);

            if (isPalindrome(word)) {
                g2.draw(smile);
            } else {
                g2.draw(pain);
            }
        }
    }

    // определяет, является ли слово палиндромом
    private static boolean isPalindrome(String word) {
        return word.equalsIgnoreCase(new StringBuilder(word).reverse().toString());
    }

    public static void main(String[] args) {
        new MyPalindromeString();
    }

}

