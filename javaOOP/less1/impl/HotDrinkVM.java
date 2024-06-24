package JavaOOP.Less1.impl;

import JavaOOP.Less1.Product;
import JavaOOP.Less1.VendingMachine;

import java.util.List;

public class HotDrinkVM extends VendingMachine {
    public HotDrinkVM() {
        super();
    }

    public HotDrinkVM(List<Product> products) {
        super(products);
    }

}