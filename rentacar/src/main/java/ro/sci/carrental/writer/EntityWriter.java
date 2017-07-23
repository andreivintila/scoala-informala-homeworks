package ro.sci.carrental.writer;

import java.io.File;
import java.util.List;

/**
 * Created by ADMIN on 23-Jul-17.
 */
public interface EntityWriter<T> {

    /**
     * Writes objects to a specified file
     * @param t Objects to write
     * @param file File output
     */
    void writeObjects(List<T> t, File file);
}