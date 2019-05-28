package views;

import data.AppData;
import views.components.ReturnButton;

import javax.swing.*;
import java.awt.*;
import java.util.Stack;

/**
 * 界面测试类修改到此处
 */
class PanelTest {
    //return panel - 应用于所有的界面
    private static JPanel upperPanel = new JPanel();

    //stack - 实现返回键功能
    private static Stack<JPanel> stack = new Stack<>();

    private static JFrame frame = new JFrame("QM scooter system");

    private static StationInformationPanel testPanel = new StationInformationPanel();             //测试用Panel写在这里

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
        testPanel.update();
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