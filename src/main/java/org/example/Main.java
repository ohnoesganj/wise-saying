package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        App app = new App();
        app.run();
    }
}

class App {
    public void run() throws IOException {
        System.out.println("== 명언 앱 ==");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;

        while (true) {
            System.out.print("명령) ");

            if (br.readLine().equals("등록")) {
                System.out.print("명언: ");
                br.readLine();
                System.out.print("작가: ");
                br.readLine();
                cnt++;
                System.out.println(cnt + "번 명언이 등록되었습니다.");
            } else {
                break;
            }
        }

    }
}