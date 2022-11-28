package ru.netology.domaine.data;

public class DataClass {
    private String name;  //поле содержащие имя фильма
    private String genre; //поле содержащие жанр фильма
    private int id; // поле содержащие id  фильма

    public DataClass() {
    }

    public DataClass(String name, String genre, int id) {
        this.name = name;
        this.genre = genre;
        this.id = id;
    }

    //сформировал getter`ы и setter`ы на поля
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
