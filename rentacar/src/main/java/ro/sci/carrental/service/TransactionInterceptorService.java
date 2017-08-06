package ro.sci.carrental.service;

import ro.sci.carrental.domain.calendar.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ADMIN on 23-Jul-17.
 */
public interface TransactionInterceptorService {
    /**
     * Find same make cars in system.
     */
    List<Transaction> findTransactionbyId(int id);
    /**
     * find all
     */
    List<Transaction> findAll(ArrayList<Transaction> transactions);
}
