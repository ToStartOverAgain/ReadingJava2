/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testreading;

/**
 *
 * @author Admin
 */
public class News {
    private int id;
    private String title;
    private String description;
    private String publicTime;
    private String content;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPublicTime() {
        return publicTime;
    }

    public void setPublicTime(String publicTime) {
        this.publicTime = publicTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    public void printNews(){
        System.out.println("publicTime :" + this.publicTime);
        System.out.println("title:" + this.title);
        System.out.println("content :"+ this.content);
        System.out.println("Description:" + this.description);
    }
}
