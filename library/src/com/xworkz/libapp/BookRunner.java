package com.xworkz.libapp;

import com.xworkz.libapp.book.Book;

public class BookRunner {
    public static void main(String[] args) {


        Book atomicHabits = new Book();

       // atomicHabits.bookId = 101;
        atomicHabits.setBookId(101);
        int id = atomicHabits.getBookId();
        System.out.println("id = " + id);

       // atomicHabits.bookName = "Atomic Habits: An Easy & Proven Way to Build Good Habits & Break Bad Ones";
       atomicHabits.setBookName("Atomic Habits: An Easy & Proven Way to Build Good Habits & Break Bad Ones");
       String name = atomicHabits.getBookName();
        System.out.println("name = " + name);


       // atomicHabits.price = 27.00;
        atomicHabits.setPrice(27.00);
         double price = atomicHabits.getPrice();
        System.out.println("price = " + price);



       // atomicHabits.author = "James Clear";
        atomicHabits.setAuthor("James Clear");
         String author = atomicHabits.getAuthor();
        System.out.println("author = " + author);


       // atomicHabits.publisher = "Penguin Random House / Avery";
        atomicHabits.setPublisher("Penguin Random House / Avery");
         String publisher = atomicHabits.getPublisher();
        System.out.println("publisher = " + publisher);

        System.out.println(" ----------------------------------------------");


        Book powerOfHabit = new Book();
        powerOfHabit.setBookId(102);
        int id1 = powerOfHabit.getBookId();
        System.out.println("id1 = " + id1);


        powerOfHabit.setBookName("The Power of Habit");
      String name1 =  powerOfHabit.getBookName();
        System.out.println("name = " + name1);

        powerOfHabit.setPrice(100.00);
        double price1 = powerOfHabit.getPrice();
        System.out.println("price = " + price1);

        powerOfHabit.setAuthor("Charles Duhig");
        String author1 = powerOfHabit.getAuthor();
        System.out.println("author = " + author1);

        powerOfHabit.setPublisher("Random House");
        String publisher1 = powerOfHabit.getPublisher();
        System.out.println("publisher = " + publisher1);
        
        
         boolean equal = atomicHabits.equals(powerOfHabit);
        System.out.println("equal = " + equal);

        System.out.println(" ----------------------------------------------");

        Book powerOfHabit1 = new Book();
        powerOfHabit1.setBookId(102);
        int id2 = powerOfHabit1.getBookId();
        System.out.println("id1 = " + id2);


        powerOfHabit1.setBookName("The Power of Habit");
        String name2 =  powerOfHabit1.getBookName();
        System.out.println("name = " + name2);

        powerOfHabit1.setPrice(100.00);
        double price2 = powerOfHabit1.getPrice();
        System.out.println("price = " + price2);

        powerOfHabit1.setAuthor("Charles Duhig");
        String author2 = powerOfHabit1.getAuthor();
        System.out.println("author = " + author2);

        powerOfHabit1.setPublisher("Random House");
        String publisher2 = powerOfHabit1.getPublisher();
        System.out.println("publisher = " + publisher2);

        boolean equals = powerOfHabit.equals(powerOfHabit1);
        System.out.println("equal = " + equals);

        System.out.println(" ----------------------------------------------");
        System.out.println(powerOfHabit.hashCode());
        System.out.println(powerOfHabit1.hashCode());



    }
}
