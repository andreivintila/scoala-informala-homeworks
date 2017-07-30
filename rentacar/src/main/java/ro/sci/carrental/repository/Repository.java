package ro.sci.carrental.repository;

import java.util.List;

/**
 * Created by ADMIN on 23-Jul-17.
 */
public interface Repository<T> {
    void addAll(List<T> t);

    void add(T t);

    void delete(T t);

    void update(T t);
}
