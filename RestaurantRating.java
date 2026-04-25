package com.example.demo;

public class RestaurantRating {
    public static void main(String[] args) {
    int[]  ratings ={5, 4, 3, 5, 4};
    int sum=0;
        
    // Sort the ratings in descending order
    for (int i = 0; i < ratings.length - 1; i++) {
        for (int j = 0; j < ratings.length - i - 1; j++) {
            if (ratings[j] < ratings[j + 1]) {
                int temp = ratings[j];
                ratings[j] = ratings[j + 1];
                ratings[j + 1] = temp;
            }
        }
    }

    // Calculate the sum of the top 3 ratings
    for (int i = 0; i < 3 && i < ratings.length; i++) {
        sum += ratings[i];
    }

    float average_rating = (float)sum / Math.min(3, ratings.length) ;
    float highest_rating = ratings[0];
    for(int i=1; i<ratings.length; i++){
        if(ratings[i]>highest_rating){
            highest_rating=ratings[i];
        }
    }
    System.out.println("Average rating for top 3 ratings: " + average_rating);
    System.out.println("Highest rating: " + highest_rating);
    
    }
}
    