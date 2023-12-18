package project01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {

    private JPanel panel;
    private JTextField tField;
    private JButton[] buttons;
    private String[] labels = {
            "Backspace", "", "", "CE", "C",
            "7", "8", "9", "/", "sqrt",
            "4", "5", "6", "x", "%",
            "1", "2", "3", "-", "1/x",
            "0", "+/-", ".", "+", "=",
            "SIN", "LOG", "ABS", "", ""  //버튼 배열
    };

    private StringBuilder input;
    private double result;
    private String operator;

    public Calculator() {
        tField = new JTextField(35);
        panel = new JPanel();
        tField.setText("0.");
        tField.setEnabled(false);

        panel.setLayout(new GridLayout(6, 5, 3, 3)); // 레이아웃을 6x5로 변경
        buttons = new JButton[labels.length];
        input = new StringBuilder();
        result = 0;
        operator = "";

        for (int i = 0; i < labels.length; i++) {
            buttons[i] = new JButton(labels[i]);
            buttons[i].addActionListener(new ButtonClickListener());
            if (i % 5 >= 3 || i >= 25) // 색상 지정 조건 변경
                buttons[i].setForeground(Color.red);
            else
                buttons[i].setForeground(Color.blue);
            buttons[i].setBackground(Color.yellow);
            panel.add(buttons[i]);
        }

        add(tField, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
        pack();
    }


    // ActionListener를 구현한 내부 클래스
    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            String command = source.getText();

            if (command.equals("=")) {
                calculate();
            } else if (command.equals("C")) {
                clearAll();
            } else if (command.equals("CE")) {
                clearLastEntry();
            } else if (command.equals("Backspace")) {
                clearLastEntry();
            } else if (command.equals("sqrt")) {
                sqrtOperation();
            } else if (command.equals("+/-")) {
            	toggleSignOperation();
            } else if (command.equals("1/x")) {
                reciprocalOperation();
            } else if (command.equals("SIN")) {
                sinOperation();
            } else if (command.equals("LOG")) {
                logOperation();
            } else if (command.equals("ABS")) {
                absOperation();
            } else if (isOperator(command)) {
                if (!input.toString().isEmpty()) {
                    result = Double.parseDouble(input.toString());
                    operator = command;
                    input.setLength(0);
                }
            } else {
                input.append(command);
                tField.setText(input.toString());
            }
        }

        private boolean isOperator(String command) {
            return command.equals("+") || command.equals("-") || command.equals("x") || command.equals("/") || command.equals("%")
                    || command.equals("sqrt") || command.equals("1/x")|| command.equals("+/-");
        }
    }

    
    
    private void sqrtOperation() {//루트 계산 메소드
        if (!input.toString().isEmpty()) {
            double currentInput = Double.parseDouble(input.toString());
            if (currentInput >= 0) {
                result = Math.sqrt(currentInput);
                tField.setText(Double.toString(result));
                input.setLength(0); // 입력 초기화
            } else {
                JOptionPane.showMessageDialog(null, "Invalid input for sqrt!", "Error", JOptionPane.ERROR_MESSAGE);
                clearAll();
            }
        }
    }
    
    private void toggleSignOperation() {//+/- 계산 메소드
        if (!input.toString().isEmpty()) {
            // 입력값을 double 형으로 변환
            double inputValue = Double.parseDouble(input.toString());

            // 입력값의 부호를 전환
            inputValue = -inputValue;

            // 전환된 값으로 input 업데이트
            input.setLength(0);
            input.append(Double.toString(inputValue));

            // 텍스트 필드에 업데이트된 값 표시
            tField.setText(input.toString());
        }
    }
    
    private void reciprocalOperation() {//역수 계산 메소드
        if (!input.toString().isEmpty()) {
            double currentInput = Double.parseDouble(input.toString());
            if (currentInput != 0) {
                result = 1 / currentInput;
                tField.setText(Double.toString(result));
                input.setLength(0); // 입력 초기화
            } else {
                JOptionPane.showMessageDialog(null, "Cannot divide by zero!", "Error", JOptionPane.ERROR_MESSAGE);
                clearAll();
            }
        }
    }
    
    private void sinOperation() {//sin계산 메소드
        if (!input.toString().isEmpty()) {
            // 입력값을 double 형으로 변환
            double inputValue = Double.parseDouble(input.toString());

            // 입력값을 라디안으로 변환 (도에서 라디안으로 변환)
            double radianValue = Math.toRadians(inputValue);

            // 사인 값 계산
            result = Math.sin(radianValue);

            // 결과를 텍스트 필드에 표시
            tField.setText(Double.toString(result));

            // 입력 초기화
            input.setLength(0);
        }
    }

    private void logOperation() {//밑이 10인 로그 계산 메소드
        if (!input.toString().isEmpty()) {
            // 입력값을 double 형으로 변환
            double inputValue = Double.parseDouble(input.toString());

            // 입력값이 양수인지 확인
            if (inputValue > 0) {
                // 밑이 10인 로그 값 계산
                result = Math.log10(inputValue);

                // 결과를 텍스트 필드에 표시
                tField.setText(Double.toString(result));
            } else {
                // 오류 메시지 표시
                JOptionPane.showMessageDialog(null, "Invalid input for logarithm (must be > 0)!", "Error", JOptionPane.ERROR_MESSAGE);
            }

            // 입력 초기화
            input.setLength(0);
        }
    }

    private void absOperation() {//절댓값 계산 메소드
        if (!input.toString().isEmpty()) {
            result = Math.abs(Double.parseDouble(input.toString()));
            tField.setText(Double.toString(result));
            input.setLength(0);
        }
    }
    
    private void calculate() {//계산기 메소드
        if (!input.toString().isEmpty() && !operator.isEmpty()) {
            double currentInput = Double.parseDouble(input.toString());
            switch (operator) {
                case "+":
                    result += currentInput;
                    break;
                case "-":
                    result -= currentInput;
                    break;
                case "x":
                    result *= currentInput;
                    break;
                case "/":
                    if (currentInput != 0) {
                        result /= currentInput;
                    } else {
                        JOptionPane.showMessageDialog(null, "Cannot divide by zero!", "Error", JOptionPane.ERROR_MESSAGE);
                        clearAll();
                        return;
                    }
                    break;
                case "%":
                    result %= currentInput;
                    break;
                case "sqrt":
                    if (currentInput >= 0) {
                        result = Math.sqrt(currentInput);
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid input for sqrt!", "Error", JOptionPane.ERROR_MESSAGE);
                        clearAll();
                        return;
                    }
                    break;
                case "1/x":
                    if (currentInput != 0) {
                        result = 1 / currentInput;
                    } else {
                        JOptionPane.showMessageDialog(null, "Cannot divide by zero!", "Error", JOptionPane.ERROR_MESSAGE);
                        clearAll();
                        return;
                    }
                    break;
            }

            tField.setText(Double.toString(result));
            input.setLength(0);
            operator = ""; // 연산자 초기화
        }
    }

    private void clearLastEntry() {//CE및 Backspace구현
        if (input.length() > 0) {
            input.deleteCharAt(input.length() - 1);
        }
        tField.setText(input.toString());
    }

    private void clearAll() {//C구현
        input.setLength(0);
        result = 0;
        operator = "";
        tField.setText("0.");
    }

    public static void main(String[] args) {//메인함수
        Calculator s = new Calculator();
    }
}
