package hafta5_Pratik_Ders;

public class EnumsExample {
    public static void main(String[] args) {

        for (Day day : Day.values()){
            System.out.println(day);
        }

        System.out.println("Direction");

        System.out.println(Direction.NORTH.name() + "-" + Direction.NORTH.ordinal() + "-" + Direction.NORTH.getAngle());
        System.out.println(Direction.EAST.name() + "-" + Direction.EAST.ordinal() + "-" + Direction.EAST.getAngle());
        System.out.println(Direction.WEST.name() + "-" + Direction.WEST.ordinal() + "-" + Direction.WEST.getAngle());
        System.out.println(Direction.SOUTH.name() + "-" + Direction.SOUTH.ordinal() + "-" + Direction.SOUTH.getAngle());



    }

}
