package tn.esprit.spring.Services;

import java.util.List;

public interface IServiceCrud<T> {

 void deleteData(Long id);

 T createData(T data);

 T updateData(Long id, T data);

 List<T> findAll();

}
