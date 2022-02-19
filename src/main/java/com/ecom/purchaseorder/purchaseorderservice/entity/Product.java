package com.ecom.purchaseorder.purchaseorderservice.entity;

public class Product {

    private int productId;
    private String productName;
    private String productDesc;
    private float productPrice;
    private String productType;
    //private String productImage;

    public Product() {
    }

    public Product(int productId, String productName, String productDesc, float productPrice,
                   //String productImage
                   String productType
    ) {
        this.productId = productId;
        this.productName = productName;
        this.productDesc = productDesc;
        this.productPrice = productPrice;
        //this.productImage = productImage;
        this.productType = productType;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

//    public String getProductImage() {
//        return productImage;
//    }

//    public void setProductImage(String productImage) {
//        this.productImage = productImage;
//    }


    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productDesc='" + productDesc + '\'' +
                ", productPrice=" + productPrice +
                ", productType='" + productType + '\'' +
                '}';
    }
}
