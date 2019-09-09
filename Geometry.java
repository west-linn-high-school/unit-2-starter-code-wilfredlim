public class Geometry{
    public static void main(String[] args){
    int sides=7;
    int radius=5;
    final int PI=22/7;
    System.out.println("A heptaon has " + sides + " sides.");
    System.out.println("A decagon has " + (sides + 3) + " sides.");
    System.out.println("A dodecagon has " + (sides + radius) + " sides.");
    System.out.print("The circumference of a circel with a radius");
    System.out.print(" of " + radius + " is " + 2*PI*radius + ".");
} 
}