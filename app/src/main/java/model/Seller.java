package application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sellers")
public class Seller {

    @Id
    private String sellerId;
    private String sellerZipCodePrefix;
    private String sellerCity;
    private String sellerState;

    // Getters e Setters
    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerZipCodePrefix() {
        return sellerZipCodePrefix;
    }

    public void setSellerZipCodePrefix(String sellerZipCodePrefix) {
        this.sellerZipCodePrefix = sellerZipCodePrefix;
    }

    public String getSellerCity() {
        return sellerCity;
    }

    public void setSellerCity(String sellerCity) {
        this.sellerCity = sellerCity;
    }

    public String getSellerState() {
        return sellerState;
    }

    public void setSellerState(String sellerState) {
        this.sellerState = sellerState;
    }
}