package views;

import bin.AppState;
import bin.StationManage;
import data.AppData;
import views.components.ReturnButton;

import javax.swing.*;
import java.awt.*;
import java.util.Stack;

/**
 * Test GUI
 */
class PanelTest {
    // return panel - apply to all GUI
    private static JPanel upperPanel = new JPanel();

    // stack - implement return function
    private static Stack<JPanel> stack = new Stack<>();

    private static JFrame frame = new JFrame("QM scooter system");

    private static IdentityChoosePanel testPanel = new IdentityChoosePanel();           //panel for testing

    public static void main(String[] args) {
        new AppData();
        init();
        upperPanel.setVisible(true);
        upperPanel.add(new JLabel("Testing for single panel..."));
        setState();


        frame.add(testPanel, BorderLayout.CENTER);
        stack.push(testPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private static void setState() {
        StationManage.chooseStation("A");
//        testPanel.update();
    }

    private static void init() {
        frame.setSize(1200, 1000);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        upperPanel.setLayout(new BorderLayout());
        upperPanel.add(new ReturnButton("return"), BorderLayout.WEST);
        upperPanel.setVisible(false);
        frame.add(upperPanel, BorderLayout.NORTH);
    }
}