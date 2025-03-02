package application.dto;

public class SellerDTO {
    private String sellerId;
    private int sellerZipCodePrefix;
    private String sellerCity;
    private String sellerState;

    public SellerDTO() {}

    public SellerDTO(String sellerId, int sellerZipCodePrefix, String sellerCity, String sellerState) {
        this.sellerId = sellerId;
        this.sellerZipCodePrefix = sellerZipCodePrefix;
        this.sellerCity = sellerCity;
        this.sellerState = sellerState;
    }

    public String getSellerId() { return sellerId; }
    public void setSellerId(String sellerId) { this.sellerId = sellerId; }

    public int getSellerZipCodePrefix() { return sellerZipCodePrefix; }
    public void setSellerZipCodePrefix(int sellerZipCodePrefix) { this.sellerZipCodePrefix = sellerZipCodePrefix; }

    public String getSellerCity() { return sellerCity; }
    public void setSellerCity(String sellerCity) { this.sellerCity = sellerCity; }

    public String getSellerState() { return sellerState; }
    public void setSellerState(String sellerState) { this.sellerState = sellerState; }
}