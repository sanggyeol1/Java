package project01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImageLabelTest extends JFrame {
    private JPanel panel;
    private JLabel label;
    private JButton leftButton;
    private JButton centerButton;
    private JButton rightButton;
    private ImageIcon[] images;
    private int currentImageIndex = 0; // 현재 이미지의 인덱스를 추적합니다.

    public ImageLabelTest() {
        setTitle("이미지 뷰어");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        panel = new JPanel();
        label = new JLabel();
        images = new ImageIcon[] {
            new ImageIcon("C:/Users/한상결/Desktop/cat.jpg"),
            new ImageIcon("C:/Users/한상결/Desktop/dino.jpg"),
            new ImageIcon("C:/Users/한상결/Desktop/dog.png")
        };

        // 초기 이미지 설정
        label.setIcon(images[currentImageIndex]);
        panel.add(label, BorderLayout.CENTER);

        // 왼쪽 버튼
        leftButton = new JButton("Left");
        leftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 왼쪽 이미지로 이동
                if (currentImageIndex > 0) {
                    currentImageIndex--;
                    label.setIcon(images[currentImageIndex]);
                }
            }
        });

        // 중앙 버튼
        centerButton = new JButton("Center");
        centerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 가운데 이미지로 이동
                currentImageIndex = images.length / 2; // 가운데 인덱스 계산
                label.setIcon(images[currentImageIndex]);
            }
        });

        // 오른쪽 버튼
        rightButton = new JButton("Right");
        rightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 오른쪽 이미지로 이동
                if (currentImageIndex < images.length - 1) {
                    currentImageIndex++;
                    label.setIcon(images[currentImageIndex]);
                }
            }
        });

        // 버튼 패널
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(leftButton);
        buttonPanel.add(centerButton); // 중앙 버튼 추가
        buttonPanel.add(rightButton);

        // 패널을 프레임에 추가
        add(buttonPanel, BorderLayout.SOUTH);
        add(panel, BorderLayout.CENTER);
        
        // 프레임을 화면에 표시
        setVisible(true);
    }

    public static void main(String[] args) {
        new ImageLabelTest();
    }
}
