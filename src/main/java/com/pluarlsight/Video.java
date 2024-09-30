package com.pluarlsight;

public class Video {
    private String title;
    private int durationInMinutes;
    private int amountOfLikes;

    public Video(String title){
        this.title = title;
    }

public void likeVideo(){
        amountOfLikes ++;
    System.out.println("Video liked! Total amount of likes is: " + amountOfLikes);
}
/*public class Video {
    static Scanner scan = new Scanner(System.in); //Makes it so you...  ???
    public static void main(String[] args) {

    }
}*/





}
