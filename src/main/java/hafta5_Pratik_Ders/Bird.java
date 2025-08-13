package hafta5_Pratik_Ders;

public record Bird(int numberEggs,String name ) {
    public Bird(int numberEggs, String name, String nickname){
        this(numberEggs, name + "-" + nickname);


    }
}
