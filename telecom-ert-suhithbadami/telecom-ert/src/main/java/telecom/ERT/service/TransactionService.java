package telecom.ERT.service;


	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import telecom.ERT.model.Transaction;
import telecom.ERT.repository.TransactionRepository;

import java.util.List;
	import java.util.Random;

	@Service
	public class TransactionService {
	    @Autowired
	    private TransactionRepository transactionRepository;

	    public Transaction generateAndStoreTransaction() {
	        Transaction transaction = new Transaction();
	        transaction.setTransactionId(generateRandomNumericValue(12));
	        transaction.setReferenceNumber(generateRandomNumericValue(12));

	        return transactionRepository.save(transaction);
	    }

	    public List<Transaction> getAllTransactions() {
	        return transactionRepository.findAll();
	    }

	    private String generateRandomNumericValue(int length) {
	        Random random = new Random();
	        StringBuilder sb = new StringBuilder(length);

	        for (int i = 0; i < length; i++) {
	            sb.append(random.nextInt(10));
	        }

	        return sb.toString();
	    }
	}


