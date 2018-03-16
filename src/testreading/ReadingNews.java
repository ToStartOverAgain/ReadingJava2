/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testreading;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 *
 * @author Admin
 */
public class ReadingNews {

    private static ArrayList<News> listNews = new ArrayList<>();

    public static void main(String[] args) throws IOException { // gọi hàm để chạy 
             generateMenu();
    }

    public static void generateMenu() throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("===========================CRAWLER============================");
            System.out.println("1. Get content from url.");
            System.out.println("2. List news.");
            System.out.println("4. Get sport link.");
            System.out.println("5. Print sport link.");
            System.out.println("3. Exist.");
            System.out.println("Please enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    // get content from url.
                    System.out.println("Please enter url (from vnexpress.net only): ");
                    String url = scanner.nextLine();
                    News n = getNewsFromUrl(url);
                    if (n != null) {
                        listNews.add(n);
                    }
                    break;
                case 2:
                    
                    break;
                case 4:
   //                 getSportLinks();
                    break;
                case 5:
  //                  printSportLink();
                    break;
                case 3:
                    System.out.println("See you later!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }

}
       public static News getNewsFromUrl(String url) {
        try {
            Connection cnn = Jsoup.connect(url);
            Document document = cnn.get();

            String time = document.select("#box_details_news .block_timer_share .block_timer").text();
            String title = document.select(".sidebar_1 .title_news_detail").text();
            String description = document.select("#box_details_news .short_intro").text();
            String content = document.select("#box_details_news .fck_detail").text();

            News n = new News();
            n.setId((int) System.currentTimeMillis());
            n.setTitle(title);
            n.setDescription(description);
            n.setContent(content);
            n.setPublicTime(time);
            System.out.println("Get news success!");
            return n;
        } catch (Exception e) {
            System.out.println("Invalid url.");
            return null;
        }
    }
}
