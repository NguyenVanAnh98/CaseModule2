package services;

import models.Show;

import java.util.List;

public interface IModelService<T>{
    void create(T t);

    void create(Show show);

    List<T> getAll();
     void update(T t);
     void delete(long id);
     long nextId();
     T findById(long id);
}
