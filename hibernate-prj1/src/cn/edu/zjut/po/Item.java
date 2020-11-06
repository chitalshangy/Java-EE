package cn.edu.zjut.po;

import java.sql.Blob;

public class Item {
    //private String ISBN;
    //private String title;
    private ItemPK ipk;
    private String description;
    private float cost;
    private Blob image;
    public Item() {
    }
    public Item(ItemPK ipk) {
        this.ipk = ipk;
    }
    public Item(ItemPK ipk, String description,
                float cost, Blob image) {
        this.ipk = ipk;
        this.description=description;
        this.cost=cost;
        this.image=image;
    }

    /*public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    */

    public ItemPK getIpk() {
        return ipk;
    }

    public void setIpk(ItemPK ipk) {
        this.ipk = ipk;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }
}
