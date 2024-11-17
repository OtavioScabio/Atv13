package com.example.atv13;

import java.sql.SQLException;
import java.util.List;

//Otavio Gabriel Ribeiro Scabio - RA 1110482223043

public interface ICRUDDao<T> {
    void insert(T t) throws SQLException;
    void update(T t) throws SQLException;
    void delete(long id) throws SQLException;
    T findOne(long id) throws SQLException;
    List<T> findAll() throws SQLException;
}
