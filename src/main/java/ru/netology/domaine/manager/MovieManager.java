package ru.netology.domaine.manager;

import ru.netology.domaine.data.DataClass;

public class MovieManager {

    public static void main(String[] args) {
//создал экземпляры класса
        DataClass first = new DataClass ("вперед","комедия",1);
        DataClass second = new DataClass("бладшот","боевик",2);
        DataClass third = new DataClass("отель белград","боевик",3);
        DataClass four = new DataClass("джентельмены","боевик",4);
        DataClass five = new DataClass("тролли","комедия",5);
        DataClass six = new DataClass("человек-невидимка","ужасы",6);
        DataClass seven = new DataClass("трансформеры","боевик",7);
        DataClass eight = new DataClass("мстители","боевик",8);
        DataClass nine = new DataClass("желеный человек","боевик",9);
        DataClass ten = new DataClass("ночь в музее","комедия",10);

        //создал массив для хранения фильмов
        DataClass[] movie = new DataClass[0];
//добавить фильм
        public void addMovie (DataClass movie) {
//создаю новый массив на 1 больше
            int length = movie.length+1;
            DataClass[] tmp = new DataClass[length];
            //копирую из старого массива в новый
            System.arraycopy(movie,0,tmp,0,movie.length);
            //кладу в новый массив новый фильм
            int lastIndex = tmp.length - 1;
            tmp[lastIndex] = movie;
            movie = tmp;




        }





    }
}
