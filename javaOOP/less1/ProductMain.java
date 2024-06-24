package JavaOOP.Less1;

import JavaOOP.Less1.impl.BottleOfWater;
import JavaOOP.Less1.impl.EPackage;
import JavaOOP.Less1.impl.HotDrink;
import JavaOOP.Less1.impl.HotDrinkVM;
import JavaOOP.Less1.impl.WaterVendingMachine;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductMain {
    public static void main(String[] args) {
        Product bottle1 = new BottleOfWater("Родники", 55, LocalDate.of(2024, 5, 1));

        Product bottle2 = new BottleOfWater("Родники Газированная", 55, LocalDate.of(2024, 5, 1),
                true, EPackage.GLASS.getMaterial(), 0.5F);

        Product HotCan1 = new HotDrink("Быстро Кофе", 55, LocalDate.of(2024, 5, 1),
                65, EPackage.CAN.getMaterial(), 0.5);

        VendingMachine vm = new WaterVendingMachine();

        VendingMachine vm1 = new HotDrinkVM();

        System.out.println(vm.getProducts());

        vm.addProducts(List.of(bottle1, bottle1, bottle1, bottle2, bottle2, bottle2));

        vm1.addProducts(List.of(HotCan1, HotCan1, HotCan1, HotCan1, HotCan1, HotCan1))

        System.out.println(vm.getProducts());

        vm.getProduct("Родники");

        System.out.println(vm.getProducts());
    }
}