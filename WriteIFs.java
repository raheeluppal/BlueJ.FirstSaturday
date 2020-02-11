
/**
 * Write a description of class WriteIFs here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WriteIFs
{
 
    public void playerDied(boolean player1) {
        // Write an IF statement that checks “player1.isAlive()” 
        // and if that’s false, calls “displayGameOver(player1)”
        if (!isAlive(player1) == true){
           
            displayGameOver(player1);
        
   
    }
}
    
    public String thermoSTAT(int room) {
        // Write an IF statement that checks the 
        // “temperature(room)” and if that check is less than 70, 
        // calls “heatOn()” else calls “coolOn()”
        if(room < 70){
            heatOn();
            return "heating";
        }
        else{
            coolOn();
            return "cooling";

        
        //return this.ss;
            
            }
    }

    public void fireplaceControl(Object fireplace1) {
        // Write an IF statement that checks 
        // “outsideTemp()” is less than 50 
        // AND 
        // “insideTemp()” is less than 62, 
        // calls “startAFire(fireplace1)”
        if(outsideTemp() <50 && (insideTemp() <62)){
            startAFire(fireplace1);

    }
}
    public void checkFuel(double fuelLevel) {
        // Write an IF statement that checks “fuelLevel” 
        // and if that check is less than 0.08, calls “refuel()”

    }


    
    /**
     *  Pay no attention to the code below this point.
     * 
     * 
     * instance variables
     * / 
  


  /**
   * Constructor for objects of class WriteIFs
   */
   int x;
   int tt_t;
   int tt_s;
   int oo1, oo2;
   String ss;
  public WriteIFs()
  
  {
      // initialise instance variables
      int x = 0;
      int tt_t = 0;
      int tt_s = 1;
      String ss = "";
      int oo1 = 61;
      int oo2 = 49;
  }

    // associated routines
    public boolean isAlive(boolean p) {
        return !p;
    }
    private int tempurature(int t) {
        return t+2;
    }
    private void heatOn() {
        //this.ss = "heating";
    }
    private void coolOn() {
       // this.ss = "cooling";
    }
 
    private int insideTemp() {
      //  return oo1;
      return 0;
    }
    private int outsideTemp() {
       // return oo2;
             return 0;

    }
    private void startAFire(Object o) {
       // this.tt_s = 213;
    }
    private void refuel() {
       // this.x = 99;
    }
    private void displayGameOver(boolean b) {
       // this.ss = "Game Over!";
    }
}
