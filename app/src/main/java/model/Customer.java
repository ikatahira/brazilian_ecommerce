package application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    private String customerId;
    private String customerUniqueId;
    private Integer customerZipCodePrefix;
    private String customerCity;
    private String customerState;

    // Construtor padrão
    public Customer() {
    }

    // Construtor completo
    public Customer(String customerId, String customerUniqueId, Integer customerZipCodePrefix, String customerCity, String customerState) {
        this.customerId = customerId;
        this.customerUniqueId = customerUniqueId;
        this.customerZipCodePrefix = customerZipCodePrefix;
        this.customerCity = customerCity;
        this.customerState = customerState;
    }

    // Getters e Setters
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerUniqueId() {
        return customerUniqueId;
    }

    public void setCustomerUniqueId(String customerUniqueId) {
        this.customerUniqueId = customerUniqueId;
    }

    public Integer getCustomerZipCodePrefix() {
        return customerZipCodePrefix;
    }

    public void setCustomerZipCodePrefix(Integer customerZipCodePrefix) {
        this.customerZipCodePrefix = customerZipCodePrefix;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    public String getCustomerState() {
        return customerState;
    }

    public void setCustomerState(String customerState) {
        this.customerState = customerState;
    }
}