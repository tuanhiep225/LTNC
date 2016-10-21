package mta.th12a.tuanhiep.model;
// Generated Oct 10, 2016 7:18:39 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Products generated by hbm2java
 */
@Entity
@Table(name="PRODUCTS"
    ,schema="dbo"
    ,catalog="LTNC_THOITRANG"
)
public class Products  implements java.io.Serializable {


     private int productId;
     private String productName;
     private String brandId;
     private String productImage;
     private Integer categoryId;
     private Boolean isActive;

    public Products() {
    }

	
    public Products(int productId) {
        this.productId = productId;
    }
    public Products(int productId, String productName, String brandId, String productImage, Integer categoryId, Boolean isActive) {
       this.productId = productId;
       this.productName = productName;
       this.brandId = brandId;
       this.productImage = productImage;
       this.categoryId = categoryId;
       this.isActive = isActive;
    }
   
     @Id 

     @GeneratedValue(strategy=GenerationType.AUTO) //for autonumber
    @Column(name="Product_ID", unique=true, nullable=false)
    public int getProductId() {
        return this.productId;
    }
    
    public void setProductId(int productId) {
        this.productId = productId;
    }

    
    @Column(name="Product_Name", length=200)
    public String getProductName() {
        return this.productName;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }

    
    @Column(name="Brand_ID", length=200)
    public String getBrandId() {
        return this.brandId;
    }
    
    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    
    @Column(name="Product_Image", length=200)
    public String getProductImage() {
        return this.productImage;
    }
    
    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    
    @Column(name="Category_ID")
    public Integer getCategoryId() {
        return this.categoryId;
    }
    
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    
    @Column(name="IsActive")
    public Boolean getIsActive() {
        return this.isActive;
    }
    
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }




}


