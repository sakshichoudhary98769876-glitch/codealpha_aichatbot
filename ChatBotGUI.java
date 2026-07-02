import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ChatBotGUI extends JFrame implements ActionListener {

    JTextArea chatArea;
    JTextField inputField;
    JButton sendButton, clearButton, exitButton;

    public ChatBotGUI() {

        setTitle("AI ChatBot");
        setSize(700, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Chat Area
        chatArea = new JTextArea();
        chatArea.setEditable(false);
        chatArea.setFont(new Font("Arial", Font.PLAIN, 18));
        chatArea.setLineWrap(true);
        chatArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(chatArea);

        // Bottom Panel
        JPanel bottomPanel = new JPanel(new BorderLayout());

        inputField = new JTextField();
        inputField.setFont(new Font("Arial", Font.PLAIN, 18));

        sendButton = new JButton("Send");
        clearButton = new JButton("Clear");
        exitButton = new JButton("Exit");

        JPanel buttonPanel = new JPanel();

        buttonPanel.add(sendButton);
        buttonPanel.add(clearButton);
        buttonPanel.add(exitButton);

        bottomPanel.add(inputField, BorderLayout.CENTER);
        bottomPanel.add(buttonPanel, BorderLayout.EAST);

        add(scrollPane, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        chatArea.append("Bot: Hello! I am your AI ChatBot.\n");
        chatArea.append("Bot: Ask me anything.\n\n");

        setVisible(true);

        SwingUtilities.invokeLater(() -> {
            sendButton.addActionListener(this);
            clearButton.addActionListener(this);
            exitButton.addActionListener(this);
            inputField.addActionListener(this);
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == sendButton || e.getSource() == inputField) {

            String userMessage = inputField.getText().trim();

            if (userMessage.isEmpty()) {
                return;
            }

            chatArea.append("You: " + userMessage + "\n");
            ChatHistory.add("You: " + userMessage);

            String response = ChatBotLogic.getResponse(userMessage);
            chatArea.append("Bot: "  +  response  + "\n\n");
            ChatHistory.add("Bot: " + response);

            inputField.setText("");

        } else if (e.getSource() == clearButton) {

            chatArea.setText("");
            chatArea.append("Bot: Chat cleared.\n\n");

        } else if (e.getSource() == exitButton) {

            JOptionPane.showMessageDialog(this,
                    "Thank you for using AI ChatBot!");
            System.exit(0);
        }
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> new ChatBotGUI());

    }
}