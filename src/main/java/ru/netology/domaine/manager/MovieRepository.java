package ru.netology.domaine.manager;

import ru.netology.domaine.data.DataClass;

import java.util.Arrays;

public class MovieRepository {

    private int countMovies = 10;

    public MovieRepository() {
    }


    public MovieRepository(int countMovies) {
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

    public DataClass[] findAll() { //показать все фильмы
        return moviesList;
    }

    public DataClass[] findLast() {
        int length = countMovies; // задаю размер лимита
        if (moviesList.length < countMovies) { //проверяю что размер массива меньше лимита
            length = moviesList.length; // в переменную lenth  запиши новый размер массива
        }
        DataClass[] tmp = new DataClass[length]; // создаю новый массив (времянный)
        for (int i = 0; i < tmp.length; i++) {  //
            tmp[i] = moviesList[moviesList.length - i - 1]; // в   ячейку i массива  tmp кладу из основного массива коследнюю ячейку -i (i  согласно интерации цикла)
        }
        return tmp; // возвращаю массив где фильмы в обратном порядке благодаря строкам 43-45

    }

    public void removeById(int id) { //удаление по id
        int length = moviesList.length - 1; //задаю переменную в которую кладу длинну нового массива (это длинна старого массива -1)
        DataClass[] tmp = new DataClass[length];//создаю новый массив
        int index = 0; // переменная с номером ячейки куда буду копировать
        for (DataClass moviesList : moviesList) { //циклом перебираю элементы массива
            if (moviesList.getId() != id) { //если  текущий элемент не равен указанному
                tmp[index] = moviesList;// то скопируй (соотвественно если не равно - не копирует)
                index++;
            }
        }
        moviesList = tmp;


    }

    public DataClass findById(int id) { // найти по id
       // DataClass findId = null;//задал начальную переменную для возврата (пока не знаем какой id  там будет
        for (DataClass movie : moviesList) { //циклом перебираю элементы массива
            if (movie.getId() == id) {//если  текущий элемент не равен указанному
               return movie;  //кладем возвращаемый id  в эту переменную? возвращаем при выполнении условия
            }


        }

        return null;//иначе возвращаеи null
    }

    public void removeAll (){
        moviesList = new DataClass[0] ;


    }


}


