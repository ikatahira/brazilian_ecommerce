// OrderPaymentService.java
public interface OrderPaymentService {
    List<OrderPayment> getAllOrderPayments();
    OrderPayment getOrderPaymentById(String id);
    void saveOrderPayment(OrderPayment orderPayment);
    void deleteOrderPayment(String id);
}

// OrderPaymentServiceImpl.java (Crie esta classe se ela não existir)
@Service
public class OrderPaymentServiceImpl implements OrderPaymentService {
    @Autowired
    private OrderPaymentRepository orderPaymentRepository;

    @Override
    public List<OrderPayment> getAllOrderPayments() {
        return orderPaymentRepository.findAll();
    }

    @Override
    public OrderPayment getOrderPaymentById(String id) {
        return orderPaymentRepository.findById(id).orElse(null);
    }

    @Override
    public void saveOrderPayment(OrderPayment orderPayment) {
        orderPaymentRepository.save(orderPayment);
    }

    @Override
    public void deleteOrderPayment(String id) {
        orderPaymentRepository.deleteById(id);
    }
}