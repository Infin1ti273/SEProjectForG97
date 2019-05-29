package views;

import views.components.GotoButton;

import javax.swing.*;
import java.awt.*;

/**
 * IdentityChoosePanel Class.
 * This is the initial panel of the whole system.
 * This is where you get to choose the identity of yours.
 */
class IdentityChoosePanel extends JPanel {
	private StationPanel stationPanel = new StationPanel();
	private ManagerLoginPanel managerLoginPanel = new ManagerLoginPanel();

	/**
	 * The constructor of the IdentityChoosePanel.
	 */
	IdentityChoosePanel() {
		this.setLayout(new GridLayout(3, 1));
		this.add(new JPanel());
		this.add(new MainPanel());
		this.add(new JPanel());

	}

	class MainPanel extends JPanel {
		MainPanel() {
			GotoButton manager = new GotoButton("Manager", managerLoginPanel);
			manager.setFont(new Font("Times New Roman", Font.PLAIN, 30));
			GotoButton user = new GotoButton("User", stationPanel);
			user.setFont(new Font("Times New Roman", Font.PLAIN, 30));

			this.setLayout(new GridLayout(1, 2));
			this.add(manager);
			this.add(user);
		}
	}

}
