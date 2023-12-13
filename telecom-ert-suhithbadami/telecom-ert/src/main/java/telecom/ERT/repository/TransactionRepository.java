package telecom.ERT.repository;

	import org.springframework.data.jpa.repository.JpaRepository;

import telecom.ERT.model.Transaction;

	public interface TransactionRepository extends JpaRepository<Transaction, Long> {
	    // Define custom queries if needed
	}

