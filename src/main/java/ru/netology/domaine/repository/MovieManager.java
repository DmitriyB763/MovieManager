package ru.netology.domaine.repository;

import ru.netology.domaine.data.DataClass;
import ru.netology.domaine.manager.MovieRepository;

public class MovieManager {
   private MovieRepository repository;

    public MovieManager (MovieRepository repository){
        this.repository = repository;
    }
public void add (DataClass moviesList){
        repository.addMovie(moviesList);
}
public void removeById(int id){
        repository.removeById(id);
}
public DataClass[] findAll(){
      return  repository.findAll();
}
public DataClass[] findLast(){
     return repository.findLast();
}
public DataClass findById(int id){
        DataClass movie = repository.findById(id);
        return movie;
}
public void removeAll(){
        repository.removeAll();


}


}
