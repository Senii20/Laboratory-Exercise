import javax.swing.JOptionPane;

public class NameInput {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Enter your name", "Example", JOptionPane.QUESTION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Hello, " + name + "!", "Example", JOptionPane.INFORMATION_MESSAGE);
    }
}
