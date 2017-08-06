package ro.sci.carrental.repository;

import ro.sci.carrental.domain.calendar.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ADMIN on 23-Jul-17.
 */
public class TransactionRepositoryImpl implements TransactionRepository {
    // to be implemented
    private List<Transaction> transactions = new ArrayList<Transaction>();

    public List<Transaction> getAll() {
        return null;
    }

    public List<Transaction> getTransactionbyId(int id) {
        return null;
    }

    public void add(Transaction transaction) {

    }

    public void addAll(List<Transaction> transactions) {

    }

    public void delete(Transaction transaction) {

    }

    public void update(Transaction transaction) {

    }
}
