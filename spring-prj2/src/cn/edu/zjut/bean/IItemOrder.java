package cn.edu.zjut.bean;

public interface IItemOrder {
    public IItem getItem();
    public int getNumItems();
    public void incrementNumItems();
    public void cancelOrder();
    public double getTotalCost();
    public double getUnitCost();
}
