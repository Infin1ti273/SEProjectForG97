package views;

import bin.FormatCheck;
import bin.UserManage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The user will be taken here if he clicked manager at the identityChoosePanel.
 * It is for the user to authenticate his nanager identity.
 */
class ManagerLoginPanel extends JPanel {
	private ManagerPanel managerPanel = new ManagerPanel();

	private JTextField answerText;
	private JLabel feedbackLabel;

	/**
	 * The constructor of the ManagerLoginPanel.
	 */
	ManagerLoginPanel() {
		JPanel myPanel = new MyPanel();
		JPanel feedbackPanel = new FeedbackPanel();

		this.setLayout(new GridLayout(3, 1));
		this.add(feedbackPanel);
		this.add(myPanel);
		this.add(new JPanel());

		this.setVisible(true);
	}

	/**
	 * The main Panel for login in the middle of the login panel.
	 */
	class MyPanel extends JPanel implements ActionListener {
		@SuppressWarnings("Duplicates")
		MyPanel() {
			JButton submitButton = new JButton("Submit");
			submitButton.setFont(new Font("Times New Roman", Font.PLAIN, 40));
			submitButton.addActionListener(this);

			answerText = new JTextField(15);
			answerText.setFont(new Font("Times New Roman", Font.PLAIN, 40));

			this.setLayout(new GridLayout(2, 1));
			this.add(answerText);
			this.add(submitButton);
		}

		/**
		 * This is invoked after the user click 'submit'.
		 * The system will check if the input format is correct.
		 * If the format is correct, then it will check if the manager ID exist.
		 *
		 * @param e Action performed by the mouse.
		 */
		public void actionPerformed(ActionEvent e) {
			String actionCommand = e.getActionCommand();
			if (actionCommand.equals("Submit")) {
				if (answerText.getText().length() == 0) {
					answerText.setText("");
					feedbackLabel.setText("You have to type in your manager ID now.");
				} else if ((FormatCheck.isID(answerText.getText()) == 0)) {
					answerText.setText("");
					feedbackLabel.setText("Not in correct format!");
				} else if (!UserManage.login(Integer.parseInt(answerText.getText()))) {
					answerText.setText("");
					feedbackLabel.setText("You haven't registered yet!");
				} else {
					//登录成功
					answerText.setText("");
					feedbackLabel.setText("Please type in your manager ID.");
					Windows.goToPanel(managerPanel);
				}
			}
		}
	}

	class FeedbackPanel extends JPanel {
		FeedbackPanel() {
			feedbackLabel = new JLabel("Please type in your manager ID.");
			feedbackLabel.setFont(new Font("Times New Roman", Font.PLAIN, 40));

			this.setLayout(new GridLayout(2, 1));
			this.add(feedbackLabel);
		}
	}


}
