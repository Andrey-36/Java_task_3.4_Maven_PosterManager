//package ru.netology.domain;
//
//import ru.netology.manager.CartFilm;
//
//public class Main {
//    public static void main(String[] args) {
//        PosterManager first = new PosterManager(1, 1, "filmone", 1);
//        PosterManager second = new PosterManager(2, 2, "filmtwo", 2);
//        PosterManager third = new PosterManager(3, 3, "filmthree", 3);
//        PosterManager fourth = new PosterManager(4, 4, "filmfour", 4);
//        PosterManager fifth = new PosterManager(5, 5, "filmfive", 5);
//        PosterManager sixth = new PosterManager(6, 6, "filmsix", 6);
//        PosterManager seventh = new PosterManager(7, 7, "filmseven", 7);
//        PosterManager eighth = new PosterManager(8, 8, "filmeight", 8);
//        PosterManager ninth = new PosterManager(9, 9, "filmnine", 9);
//        PosterManager tenth = new PosterManager(10, 10, "filmten", 10);
//
//        CartFilm manager = new CartFilm();
//        manager.save(first);
//        manager.save(second);
//        manager.save(third);
//        manager.save(fourth);
//        manager.save(fifth);
//        manager.save(sixth);
//        manager.save(seventh);
//        manager.save(eighth);
//        manager.save(ninth);
//        manager.save(tenth);
//}
////    добавление нового элемента в массив
////        String[] names = {
////                "Petya",
////                "Sveta",
////                "Olya",
////                "Anya"
////        };
////        String newNames = "Kolya";
////
////
////        String[] tmp = new String[names.length + 1];
////        for (int i = 0; i < names.length; i++) {
////            tmp[i] = names[i];
////        }
////        tmp[tmp.length - 1] = newNames;
////
////        names = tmp;
//
////    удаление элемента
////        String[] names = {
////                "Petya",
////                "Sveta",
////                "Olya",
////                "Anya",
////                "Kolya"
////        };
////        String removeName = "Olya";
////
////        String[] tmp = new String[names.length - 1];
////        int copyToIndex = 0;                        // ячейка куда копируем
////        for (int i = 0; i < names.length; i++) {    // i - ячейка откуда копируем
////            if(!names[i].equals(removeName)) {
////                tmp[copyToIndex] = names[i];
////                copyToIndex++;
////            }
////        }
////        names = tmp;
//    }