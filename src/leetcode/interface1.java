package leetcode;

public class interface1 {
//    public int gear;
//    public int speed;
//
//    public interface1(int gear,int speed){
//        this.gear = gear;
//        this.speed = speed;
//
//    }
//
//    public void brake(int dec){
//        speed -= dec;
//    }
//
//    public void acc(int inc){
//       speed += inc ;
//    }
//
//
//    public String getInfo(){
//        return (""+gear+speed);
//    }
    public int gear;
    public int speed;

    public interface1(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }

    public void showInfo(int gear, int speed){
        System.out.println(gear+" "+speed);
    }
}
