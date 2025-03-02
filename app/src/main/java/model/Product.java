package application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "products")
public class Product {

    @Id
    private String productId;
    private String productCategoryName;
    private Integer productNameLength;
    private Integer productDescriptionLength;
    private Integer productPhotosQty;
    private BigDecimal productWeightG;
    private BigDecimal productLengthCm;
    private BigDecimal productHeightCm;
    private BigDecimal productWidthCm;

    public Product() {}

    public Product(String productId, String productCategoryName, Integer productNameLength, Integer productDescriptionLength, Integer productPhotosQty, BigDecimal productWeightG, BigDecimal productLengthCm, BigDecimal productHeightCm, BigDecimal productWidthCm) {
        this.productId = productId;
        this.productCategoryName = productCategoryName;
        this.productNameLength = productNameLength;
        this.productDescriptionLength = productDescriptionLength;
        this.productPhotosQty = productPhotosQty;
        this.productWeightG = productWeightG;
        this.productLengthCm = productLengthCm;
        this.productHeightCm = productHeightCm;
        this.productWidthCm = productWidthCm;
    }

    public String getProductId() { return productId; }
    public void setProductId(String productId) { this.productId = productId; }

    public String getProductCategoryName() { return productCategoryName; }
    public void setProductCategoryName(String productCategoryName) { this.productCategoryName = productCategoryName; }

    public Integer getProductNameLength() { return productNameLength; }
    public void setProductNameLength(Integer productNameLength) { this.productNameLength = productNameLength; }

    public Integer getProductDescriptionLength() { return productDescriptionLength; }
    public void setProductDescriptionLength(Integer productDescriptionLength) { this.productDescriptionLength = productDescriptionLength; }

    public Integer getProductPhotosQty() { return productPhotosQty; }
    public void setProductPhotosQty(Integer productPhotosQty) { this.productPhotosQty = productPhotosQty; }

    public BigDecimal getProductWeightG() { return productWeightG; }
    public void setProductWeightG(BigDecimal productWeightG) { this.productWeightG = productWeightG; }

    public BigDecimal getProductLengthCm() { return productLengthCm; }
    public void setProductLengthCm(BigDecimal productLengthCm) { this.productLengthCm = productLengthCm; }

    public BigDecimal getProductHeightCm() { return productHeightCm; }
    public void setProductHeightCm(BigDecimal productHeightCm) { this.productHeightCm = productHeightCm; }

    public BigDecimal getProductWidthCm() { return productWidthCm; }
    public void setProductWidthCm(BigDecimal productWidthCm) { this.productWidthCm = productWidthCm; }
}