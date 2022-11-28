package ru.netology.domaine.manager;

import ru.netology.domaine.data.DataClass;

import java.util.Arrays;

public class MovieManager {

  private  int countMovies = 10;

    public MovieManager() {
    }

    public MovieManager(int countMovies) {
        this.countMovies = countMovies;
    }

    //создал массив для хранения фильмов, изначально пустой
   private DataClass[] moviesList = new DataClass[0];

    //добавить фильм
    public void addMovie(DataClass movie) {
//создаю новый массив на 1 больше
        DataClass[] tmp = Arrays.copyOf(moviesList, moviesList.length + 1); // метод копирования из старого массива в новый
            /*int length = moviesList.length+1;
            DataClass[] tmp = new DataClass[length];
            //копирую из старого массива в новый
            System.arraycopy(movie,0,tmp,0,moviesList.length);*/
        //кладу в новый массив новый фильм
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        moviesList = tmp;
    }
    public DataClass[] findAll(){
        return moviesList;
    }

    public DataClass[] findLast () {
        int length = countMovies; // задаю размер лимита
        if (moviesList.length < countMovies) { //проверяю что размер массива меньше лимита
            length = moviesList.length; // в переменную lenth  запиши новый размер массива
        }
        DataClass[] tmp = new DataClass[length]; // создаю новый массив (времянный)
        for (int i = 0; i < tmp.length;i++){  //
            tmp[i] = moviesList[moviesList.length -i - 1]; // в   ячейку i массива  tmp кладу из основного массива коследнюю ячейку -i (i  согласно интерации цикла)
        }
        return tmp; // возвращаю массив где фильмы в обратном порядке благодаря строкам 43-45

    }


}

