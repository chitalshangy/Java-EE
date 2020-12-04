package cn.edu.zjut.bean;

import org.springframework.beans.factory.InitializingBean;

public class ItemOrder implements IItemOrder, InitializingBean {
    private IItem item;
    private int numItems;

    public ItemOrder() {
        System.out.println("Spring 实例化 ItemOrder...");
    }
    public ItemOrder(IItem item, int numItems) {
        this.item = item;
        this.numItems = numItems;
    }
    //数目自加一
    public void incrementNumItems() {
        setNumItems(getNumItems() + 1);
    }
    //取消订单
    public void cancelOrder() {
        setNumItems(0);
    }
    //获取当前订单总价
    public double getTotalCost() {
        return (getNumItems() * getUnitCost());
    }
    //获得单价
    public double getUnitCost(){
        return item.getCost();
    }
    public IItem getItem() {
        return item;
    }
    public void setItem(IItem item) {
        System.out.println("Spring 注入 item...");
        this.item = item;
    }
    public int getNumItems() {
        return numItems;
    }
    public void setNumItems(int numItems) {
        System.out.println("Spring 注入 numItems...");
        this.numItems = numItems;
    }

    //重写toString方法
    public String toString(){
        return item.getItemID()+" "+item.getTitle()+" "+item.getCost()+" "+numItems;
    }

    public void init() {
        System.out.println("正在执行初始化方法 init...");
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("正在执行初始化方法 afterPropertiesSet...");
    }

    public void destroy(){
        System.out.println("正在执行销毁方法 destroy...");
    }
}
