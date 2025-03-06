package application.dto;

public class CustomerDTO {
    private String customerId;
    private String customerUniqueId;
    private String customerZipCodePrefix;
    private String customerCity;
    private String customerState;

    public CustomerDTO() {}

    public CustomerDTO(String customerId, String customerUniqueId, String customerZipCodePrefix, String customerCity, String customerState) {
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

    public String getCustomerZipCodePrefix() { return customerZipCodePrefix; }
    public void setCustomerZipCodePrefix(String customerZipCodePrefix) { this.customerZipCodePrefix = customerZipCodePrefix; }

    public String getCustomerCity() { return customerCity; }
    public void setCustomerCity(String customerCity) { this.customerCity = customerCity; }

    public String getCustomerState() { return customerState; }
    public void setCustomerState(String customerState) { this.customerState = customerState; }
}