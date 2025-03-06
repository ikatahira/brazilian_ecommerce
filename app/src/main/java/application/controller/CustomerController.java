import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import application.service.CustomerService; // Importe o CustomerService
import application.model.Customer; // Importe a entidade Customer
import application.dto.CustomerDTO; // Importe o CustomerDTO
import org.springframework.beans.factory.annotation.Autowired;
import java.util.stream.Collectors;
import application.mapper.CustomerMapper;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService; // Injete o CustomerService

    @GetMapping("/customers")
    public String getAllCustomers(Model model) {
        List<CustomerDTO> customerDTOs = customerService.getAllCustomers(); // Use o CustomerService para buscar os clientes
        List<Customer> customers = customerDTOs.stream()
                .map(CustomerMapper::toEntity) // Converte CustomerDTO para Customer usando o CustomerMapper
                .collect(Collectors.toList());
        model.addAttribute("customers", customers);
        return "customers"; // Nome do arquivo JSP (customers.jsp)
    }
}