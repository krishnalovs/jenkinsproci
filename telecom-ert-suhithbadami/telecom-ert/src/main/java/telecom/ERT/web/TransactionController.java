package telecom.ERT.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import telecom.ERT.model.Transaction;
import telecom.ERT.service.TransactionService;

import java.util.List;

@Controller
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping("/generate")
    public String generateAndStoreTransaction() {
        transactionService.generateAndStoreTransaction();
        return "redirect:/transactions/all";
    }

    @GetMapping("/all")
    public String getAllTransactions(Model model) {
        List<Transaction> transactions = transactionService.getAllTransactions();
        model.addAttribute("transactions", transactions);
        return "Bank Transaction";
    }
}
