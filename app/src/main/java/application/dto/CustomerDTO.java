package application.dto;

public class CustomerDTO {
    private String customerId;
    private String customerUniqueId;
    private int customerZipCodePrefix;
    private String customerCity;
    private String customerState;

    public CustomerDTO() {}

    public CustomerDTO(String customerId, String customerUniqueId, int customerZipCodePrefix, String customerCity, String customerState) {
        this.customerId = customerId;
        this.customerUniqueId = customerUniqueId;
        this.customerZipCodePrefix = customerZipCodePrefix;
        this.customerCity = customerCity;
        this.customerState = customerState;
    }

    public String getCustomerId() { return customerId; }
    public void setCustomerId(String customerId) { this.customerId = customerId; }

    public String getCustomerUniqueId() { return customerUniqueId; }
    public void setCustomerUniqueId(String customerUniqueId) { this.customerUniqueId = customerUniqueId; }

    public int getCustomerZipCodePrefix() { return customerZipCodePrefix; }
    public void setCustomerZipCodePrefix(int customerZipCodePrefix) { this.customerZipCodePrefix = customerZipCodePrefix; }

    public String getCustomerCity() { return customerCity; }
    public void setCustomerCity(String customerCity) { this.customerCity = customerCity; }

    public String getCustomerState() { return customerState; }
    public void setCustomerState(String customerState) { this.customerState = customerState; }
}