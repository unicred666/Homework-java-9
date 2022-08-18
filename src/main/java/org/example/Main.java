package org.example;


public class Main {
    public static void main(String[] args) {
        Post post = new Post();

        post.name = "Вася";
        post.surname = "Иванов";
        post.birthday = new FormDate();
        post.birthday.day = 3;
        post.subscription = true;

    }
}
