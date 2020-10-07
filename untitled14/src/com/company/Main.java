package com.company;

public class Main {



    public static void main(String[] args) {
        System.out.println("Movies");

        for (Event event: getMovies()) {
            validEvent(event);
            System.out.println("Запись  корректна");
        }
        System.out.println("Theatres");

        for (Event event: getTheatres()) {
            validEvent(event);
            System.out.println("Запись  корректна");
        }
        System.out.println("Все события корректны");

    }

    public static Movie[] getMovies() {
        return new Movie[]{
                new Movie("Начало", 2010, 16),
                new Movie("Тайна Коко ", 1980, 12),
                new Movie("Оно", 1989, 18),
                new Movie(null, 1997, 16)
        };
    }

    public static Theatre[] getTheatres() {
        return new Theatre[]{
                new Theatre("Эраст Фандорин", 2017, 16),
                new Theatre("Борис Годунов", 1989, 16),
                new Theatre("Лебединое озеро", 1983, 12),
                new Theatre("Юнона и Авось", 1968, 16)
        };
    }

    public static void validEvent(Event event){
        if(event.getTitle()!= null && event.getReleaseYear() > 0 && event.getAge() > 0)
            return;
        throw new RuntimeException("Запись  некорректна");
    }
}