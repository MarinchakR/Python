package JavaOOP.Less1.impl;


public enum EPackage {
    PLASTIC("пластик"), GLASS("стекло"), POLYETILEN("Полиэтилен"), CAN("жестяная банка");

    private final String material;

    EPackage(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}