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
        AppData appData = new AppData();
        init();
        upperPanel.setVisible(true);
        upperPanel.add(new JLabel("单界面测试中,不要使用返回键"));
        setState();


        frame.add(testPanel, BorderLayout.CENTER);
        stack.push(testPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * 借/还页测试专用方法
     * 1.选定站点
     * 2.初始化视图
     */
    private static void setState() {
        testPanel.update();
    }

    private static void init() {
        /*
        frame的样式，不要修改
         */
        frame.setSize(1200, 1000);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        /*
        界面上方返回按钮的样式，不要修改
         */
        upperPanel.setLayout(new BorderLayout());
        upperPanel.add(new ReturnButton("return"), BorderLayout.WEST);
        upperPanel.setVisible(false);
        frame.add(upperPanel, BorderLayout.NORTH);

    }
}