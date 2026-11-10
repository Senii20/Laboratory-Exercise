import javax.swing.JOptionPane;

public class DialogInputs {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Enter your name", "Input", JOptionPane.QUESTION_MESSAGE);
        String ageStr = JOptionPane.showInputDialog(null, "Enter your age", "Input", JOptionPane.QUESTION_MESSAGE);
        int age = Integer.parseInt(ageStr);

        JOptionPane.showMessageDialog(null, "Name: " + name + "\nAge: " + age, "Output", JOptionPane.INFORMATION_MESSAGE);
    }
                                      }
