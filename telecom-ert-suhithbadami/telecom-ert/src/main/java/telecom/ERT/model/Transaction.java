package telecom.ERT.model;


	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;

	import javax.persistence.*;

	@Entity
	@Table(name = "transaction_table") // Specify the actual table name in your database
	public class Transaction {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
	    private Long id; // Primary key

	    @Column(name = "transaction_id", nullable = false, length = 12)
	    private String transactionId; // 12-digit numeric transaction ID

	    @Column(name = "reference_number", nullable = false, length = 12)
	    private String referenceNumber; // 12-digit numeric reference number

	    @Column(name = "mobile_number", nullable = false)
	    private String mobileNumber;

	    @Column(name = "bank_name", nullable = false)
	    private String bankName;

	    @Column(name = "amount", nullable = false)
	    private Double amount; // Assuming amount is a numeric value

	    @Column(name = "payment_method", nullable = false)
	    private String paymentMethod;
	    
	    public Transaction(Long id, String transactionId, String referenceNumber, String mobileNumber, String bankName,
				Double amount, String paymentMethod) {
			super();
			this.id = id;
			this.transactionId = transactionId;
			this.referenceNumber = referenceNumber;
			this.mobileNumber = mobileNumber;
			this.bankName = bankName;
			this.amount = amount;
			this.paymentMethod = paymentMethod;
		}
		public Transaction() {
			
		}


	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getTransactionId() {
	        return transactionId;
	    }

	    public void setTransactionId(String string) {
	        this.transactionId = string;
	    }

	    public String getReferenceNumber() {
	        return referenceNumber;
	    }

	    public void setReferenceNumber(String string) {
	        this.referenceNumber = string;
	    }

	    public String getMobileNumber() {
	        return mobileNumber;
	    }

	    public void setMobileNumber(String mobileNumber) {
	        this.mobileNumber = mobileNumber;
	    }

	    public String getBankName() {
	        return bankName;
	    }

	    public void setBankName(String bankName) {
	        this.bankName = bankName;
	    }

	    public Double getAmount() {
	        return amount;
	    }

	    public void setAmount(Double amount) {
	        this.amount = amount;
	    }

	    public String getPaymentMethod() {
	        return paymentMethod;
	    }

	    public void setPaymentMethod(String paymentMethod) {
	        this.paymentMethod = paymentMethod;
	    }
	
		
	    
	}

