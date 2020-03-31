package leetcode;

public class interface2 extends interface1 {
//    public int seatH;
//
//    public interface2(int gear, int speed, int startHeight){
//        super(gear, speed);
//        seatH = startHeight;
//    }
//
////    public void seatH(int val){
////        seatH = val;
////    }
//
//    @Override
//    public String getInfo(){
//        return (super.getInfo()+ seatH);
//    }
     public int seatH;

     public interface2(int gear, int speed, int seatH){
         super(gear, speed);
         this.seatH = seatH;

     }

     public void incSpeed(int acc){
         System.out.println(acc);
     }

}
