package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        App app = new App();
        app.run();
    }
}

class App {
    private List<Quote> quotes = new ArrayList<>();

    public void run() throws IOException {
        System.out.println("== 명언 앱 ==");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;

        while (true) {
            System.out.print("명령) ");
            String command = br.readLine();

            if (command.equals("종료")) {
                System.out.println("명언 앱을 종료합니다.");
                break;
            } else if (command.equals("등록")) {
                System.out.print("명언: ");
                String content = br.readLine();
                System.out.print("작가: ");
                String author = br.readLine();
                cnt++;
                quotes.add(new Quote(cnt, author, content));
                System.out.println(cnt + "번 명언이 등록되었습니다.");
            } else if (command.equals("목록")) {
                printQuotes();
            }
        }
    }

    private void printQuotes() {
        System.out.println("번호 / 작가 / 명언");
        System.out.println("----------------------");
        for (int i = quotes.size() - 1; i >= 0; i--) { // 최신 순으로 출력
            Quote quote = quotes.get(i);
            System.out.printf("%d / %s / %s%n", quote.getId(), quote.getAuthor(), quote.getContent());
        }
    }
}

class Quote {
    int id;
    String author;
    String content;

    public Quote(int id, String author, String content) {
        this.id = id;
        this.author = author;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }
}