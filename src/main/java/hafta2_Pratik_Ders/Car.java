package hafta2_Pratik_Ders;

public class Car {

    // fields
    private String brand;
    private String model;
    private int maxSpeed;
    private int horsePower;
    private int maxGearCount = 6;
    private int gear = 0;

    // Parametreli constructor
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Boş constructor
    public Car() {}

    // ileri gitme metodu
    public void move() {
        System.out.println("İleri gidiyoruz");
    }

    // vites artırma metodu
    public void incrementGear(int gearCount) {
        if (maxGearCount >= gearCount) {
            this.gear = gearCount;
            System.out.println("Vites şu an: " + gear);
        } else {
            System.out.println("Max vites boyutundan fazla giriş yapıldı");
        }
    }

    // brand getter ve setter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // model getter ve setter
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // maxSpeed getter ve setter
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    // horsePower getter ve setter
    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    // gear getter ve setter
    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }
}


