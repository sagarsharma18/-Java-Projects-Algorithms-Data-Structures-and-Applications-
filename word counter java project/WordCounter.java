import javax.swing.*;
import java.awt.event.*;

public class WordCounter extends JFrame implements ActionListener {

    private JTextArea inputArea;  // Text area for user input
    private JLabel wordCountLabel; // Label to display word count

    public WordCounter() {
        super("Word Counter");  // Set window title

        // Create components
        inputArea = new JTextArea(10, 50);  // Increase rows and columns for larger input area
        wordCountLabel = new JLabel("Word Count: 0");

        // Create a button to trigger word counting
        JButton countButton = new JButton("Count Words");
        countButton.addActionListener(this);  // Add action listener to the button

        // Add components to the frame
        JPanel contentPane = new JPanel();
        contentPane.add(new JScrollPane(inputArea));  // Add scrollbar to text area

        // Enhanced layout for better organization
        BoxLayout boxLayout = new BoxLayout(contentPane, BoxLayout.Y_AXIS);
        contentPane.setLayout(boxLayout);
        contentPane.add(wordCountLabel);
        contentPane.add(countButton);

        // Configure frame properties
        setContentPane(contentPane);
        pack();  // Adjust frame size to fit components, may not be full screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window on screen
        setVisible(true);
        // Attempt to maximize the window for full screen (may not work on all systems)
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String paragraph = inputArea.getText();
        int wordCount = 0;

        if (!paragraph.isEmpty()) {
            // Split the paragraph into words using a regular expression
            wordCount = paragraph.split("\\s+").length;
        }

        wordCountLabel.setText("Word Count: " + wordCount);
    }

    public static void main(String[] args) {
        new WordCounter();
    }
}
