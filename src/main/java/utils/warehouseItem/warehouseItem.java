package utils.warehouseItem;

import java.sql.Date;

public class warehouseItem {
    private String name;
    private int id;
    private int quantity;
    private Date lastchange;

    public warehouseItem(String name, int id, int quantity, Date lastchange) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.lastchange = lastchange;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getLastchange() {
        return lastchange;
    }

    public void setLastchange(Date lastchange) {
        this.lastchange = lastchange;
    }
}
