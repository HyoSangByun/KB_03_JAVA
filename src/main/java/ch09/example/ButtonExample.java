package ch09.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

//GUI
public class ButtonExample extends JFrame {

    // 필드 - UI 컴포넌트 선언
    private JTextField messageFiled; // == input 태그 유사
    private JButton sendButton; // button 태그 유사

    // 중첩 인터페이스
    public interface MessageHandler {
        /**
         * 메시지를 처리하는 메서드
         *
         * @param message
         */
        void processMessage(String message);
    }


    // 기본 생성자
    public ButtonExample() {
        // 기본 JFrame 설정
        setTitle("중첩 클래스, 익명 객체 예제");
        setSize(400, 100);
        setLocationRelativeTo(null); //화면 중앙 배치
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //X버튼 종료
        setLayout(new FlowLayout());

        // UI 컴포넌트 초기화
        messageFiled = new JTextField(20);
        sendButton = new JButton("콘솔에 출력");

        // UI 컴포넌트를 JFrame에 추가
        add(new JLabel("메시지 : "));
        add(messageFiled);
        add(sendButton);

        /*중첩 인터페이스를 익명 내부 클래스를 이용해서 구현*/
        // 하나의 내부 인터페이스를 2가지 방법으로 구현
        MessageHandler handler1 = new MessageHandler() {
            @Override
            public void processMessage(String message) {
                System.out.println("message = " + message);
            }
        };

        MessageHandler handler2 = new MessageHandler() {
            @Override
            public void processMessage(String message) {

                // 현재 시간 + message
                String currentTime =
                        LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

                System.out.printf("[%s] %s \n", currentTime, message);
            }
        };

        // sendButton 클릭 시 동작을 익명 내부 클래스로 구현
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // JTextFiled에 작성된 값 얻어오기
                String message = messageFiled.getText();

                if (message.isEmpty()) { // 미작성 시
                    // HTML alert() 와 비슷
                    JOptionPane.showMessageDialog(ButtonExample.this, "전송할 메세지를 입력해주세요.", "오류", JOptionPane.ERROR_MESSAGE);
                } else {
                    // message가 입력되었을 때
                    // 중첩 인터페이스를 구현한 방법을 이용해서 mesggae 출력
                    handler1.processMessage(message);
                    handler2.processMessage(message);

                    //입력 필드 초기화
                    messageFiled.setText("");
                }
            }
        });
    }
}
