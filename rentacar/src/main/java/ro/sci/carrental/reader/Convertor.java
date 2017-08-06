package ro.sci.carrental.reader;

/**
 * Created by ADMIN on 23-Jul-17.
 */
/**
 * Generic interface for string to object conversion
 */
public interface Convertor<T> {

    /**
     * Convert string from file for Object persistence
     * @param convertedString
     * @return
     * @throws InvalidEntityException When reading invalid data from file
     */
    T convert(String convertedString) throws InvalidEntityException;
}
