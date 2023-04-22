import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class Watch {
    private JLabel label;

    public Watch() {
        JFrame frame = new JFrame("Watch");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(200, 100));
        frame.setLayout(new FlowLayout());

        JPanel panel = new JPanel();
        label = new JLabel();
        label.setFont(new Font("Arial", Font.PLAIN, 36));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(label);
        frame.add(panel);

        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateTime();
            }
        });
        timer.start();

        frame.setVisible(true);
    }

    private void updateTime() {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        label.setText(format.format(new Date()));
    }

    public static void main(String[] args) {
        new Watch();
    }
}
