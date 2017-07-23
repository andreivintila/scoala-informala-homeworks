package ro.sci.carrental.repository;

import ro.sci.carrental.domain.calendar.Transaction;

import java.util.List;

/**
 * Created by ADMIN on 23-Jul-17.
 */
public interface TransactionRepository {
    /**
     * Get all
     */
    List<Transaction> getAll();
    /**
     * Get by
     */
    List<Transaction> getTransactionbyId(int id);
    /**
     * Add
     */
    void add(Transaction transaction);
    /**
     * Add all
     */
    void addAll(List<Transaction> transactions);
    /**
     * Delete
     */
    void delete(Transaction transaction);
    /**
     * Update
     */
    void update(Transaction transaction);

}
