package JavaOOP.Less1.impl;

import JavaOOP.Less1.Product;

import java.time.LocalDate;

public class HotDrink extends Product {
    
    private float volume;
    private String pack;
    private Double temperature;

    public HotDrink(String name, double price, LocalDate releaseDate, Double temperature, String pack, float volume ) {
        super(name, price, releaseDate);
        this.temperature = temperature;
        this.volume = volume;
        this.pack = EPackage.CAN.getMaterial();
    }


    public float getVolume() {
        return volume;
    }

    public String getPack() {
        return pack;
    }

    public Double temperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                "volume=" + volume +
                ", pack='" + pack + '\'' +
                ", temperature=" + temperature +
                '}';
    }
}
