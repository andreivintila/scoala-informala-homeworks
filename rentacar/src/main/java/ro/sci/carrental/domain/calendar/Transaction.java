package ro.sci.carrental.domain.calendar;

/**
 * Created by ADMIN on 23-Jul-17.
 */
public class Transaction {

    private int id;
    private String name;
    private String argument;

    public Transaction() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArgument() {
        return argument;
    }

    public void setArgument(String argument) {
        this.argument = argument;
    }
}
