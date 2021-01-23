import java.util.* ;
import java.text.DecimalFormat;

public class Arrvote{
  public static void main(String [] args ){
    Scanner kbd = new Scanner(System.in) ;
    int lp =  kbd.nextInt() ;
    int arr = kbd.nextInt() ;
    Vote obj[] =  new Vote[arr];
    for(int i = 0 ; i < arr ; i++){
      obj[i] = new Vote() ;
    }
    for(int i = 0 ; i < lp ; i++){
      int k =  kbd.nextInt() ;
      obj[k-1].can1 +=  kbd.nextInt() ;
      obj[k-1].can2 += kbd.nextInt() ;
    }
    double totalvotes = 0 ;
    double twas1 = 0 ;
    double twas2 = 0 ;
    for(int i = 0 ; i < arr ; i++){
      char a = 'B' ;
       if(obj[i].can1 > obj[i].can2){
          a= 'A' ;
       }
      int waste1 = 0 ;
       int waste2 = 0 ;
       totalvotes +=  obj[i].can1 + obj[i].can2 ;
       if(a == 'A'){
          waste2 = obj[i].can2 ;
          waste1 = obj[i].can1-((obj[i].can1 + obj[i].can2) / 2 + 1) ;
       }else{
         waste1 = obj[i].can1 ;
         waste2  =  obj[i].can2 - ((obj[i].can1 + obj[i].can2) / 2 + 1) ; 
        } 
        twas1 += waste1 ;
        twas2 += waste2 ; 
        
       System.out.println(a  + " " +waste1 + " " + waste2) ;
    }
    DecimalFormat df = new DecimalFormat("#.0000000000");

    System.out.println(0 + df.format(Math.abs((twas1 - twas2) / totalvotes)) ) ;
    
  }
} 
class Vote{
  int can1 ;
  int can2 ;

  public Vote(){
    can1 = 0 ;
    can2 = 0 ;
  }

  public Vote(int c , int c1){
  can1 = c ;
  can2 = c1 ;  
  }


}