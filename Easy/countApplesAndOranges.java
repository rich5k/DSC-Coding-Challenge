package Easy;

/**
 *
 * @author Richard Anatsui
 */
import java.util.*;

/**
 *
 * @author Richard
 */
public class countApplesAndOranges {
    private int start;
    private int end;
    private int locA;
    private int locO;
    private int sizeA;
    private int [] applesA;
    private int sizeO;
    private int [] orangesO;
    
    /**
     * creating default constructor
     */
    public countApplesAndOranges (){
        this.start=0;
        this.end=0;
        this.locA=0;
        this.locO=0;
        this.sizeA=0;
        this.applesA= new int[5];
        this.sizeO=0;
        this.orangesO= new int[5];
    }

    /**getter for start
     * @return start
     */
    public int getStart() {
        return start;
    }

    /**
     * setter for start
     * @param start 
     */
    public void setStart(int start) {
        this.start = start;
    }

    /**
     * getter for end
     * @return end
     */
    public int getEnd() {
        return end;
    }

    /**
     * setter for end
     * @param end 
     */
    public void setEnd(int end) {
        this.end = end;
    }

    /**
     * getter for LocA
     * @return locA
     */
    public int getLocA() {
        return locA;
    }

    /**
     * setter for locA
     * @param locA 
     */
    public void setLocA(int locA) {
        this.locA = locA;
    }

    /**
     * getter for locO
     * @return locO
     */
    public int getLocO() {
        return locO;
    }

    /**
     * setter for locO
     * @param locO 
     */
    public void setLocO(int locO) {
        this.locO = locO;
    }

    /**
     * getter for sizeA
     * @return sizeA
     */
    public int getSizeA() {
        return sizeA;
    }

    /**
     * setter for sizeA
     * @param sizeA 
     */
    public void setSizeA(int sizeA) {
        this.sizeA = sizeA;
    }

    /**
     * getter for ApplesA
     * @return applesA
     */
    public int[] getApplesA() {
        return applesA;
    }

    /**
     * setter for ApplesA
     * @param applesA 
     */
    public void setApplesA(int[] applesA) {
        this.applesA = applesA;
    }

    /**
     * getter for sizeO
     * @return sizeO
     */
    public int getSizeO() {
        return sizeO;
    }

    /**
     * setter for sizeO
     * @param sizeO 
     */
    public void setSizeO(int sizeO) {
        this.sizeO = sizeO;
    }

    /**
     * getter for orangesO
     * @return orangesO
     */
    public int[] getOrangesO() {
        return orangesO;
    }

    /**
     * setter for orangesO
     * @param orangesO 
     */
    public void setOrangesO(int[] orangesO) {
        this.orangesO = orangesO;
    }
    
    /**
     *adds a distance of an apple to applesA
     * @param apple
     * @param index
     */
    public void addApple(int apple, int index){
        this.applesA[index]=apple;
    }
    
    /**
     *adds a distance of an orange to orangesO
     * @param orange
     * @param index
     */
    public void addOrange(int orange, int index){
        this.orangesO[index]=orange;
    }
    
    /**
     *calculates the number of apples on Sam's roof
     * @return count
     */
    public int applesOnRoof(){
        int count=0;
        int distance=0;
        for(int i=0; i<getApplesA().length; i++ ){
            distance=getLocA()+getApplesA()[i];
            if(distance>= getStart() && distance <= getEnd()){
                count++;
            }
        }
        return count;
    }
    
    /**
     *calculates the number of oranges on Sam's roof
     * @return count
     */
    public int orangesOnRoof(){
        int count=0;
        int distance=0;
        for(int i=0; i<getOrangesO().length; i++ ){
            distance=getLocO()+getOrangesO()[i];
            if(distance>= getStart() && distance <= getEnd()){
                count++;
            }
        }
        return count;
    }
    
    /**
     *testing out countApplesAndOranges class
     * @param args
     */
    public static void main(String args[]){
        countApplesAndOranges c1 = new countApplesAndOranges();
        Scanner scan =new Scanner(System.in);
        for(int i =0; i<5;i++){
            String data = scan.nextLine(); //getting input
            String [] numbers=data.split(" ");
            //assign the right values to the varoius instance variables
            for(int j =0; j<numbers.length;j++){
                if(i==0){
                    if(j==0){
                        c1.setStart(Integer.parseInt(numbers[j]));
                    }
                    else{
                        c1.setEnd(Integer.parseInt(numbers[j]));
                    }
                }
                else if (i==1){
                    if(j==0){
                        c1.setLocA(Integer.parseInt(numbers[j]));
                    }
                    else{
                        c1.setLocO(Integer.parseInt(numbers[j]));
                    }
                }
                else if (i==2){
                    if(j==0){
                        c1.setSizeA(Integer.parseInt(numbers[j]));
                    }
                    else{
                        c1.setSizeO(Integer.parseInt(numbers[j]));
                    }
                }
                else if (i==3){
                    
                    c1.addApple(Integer.parseInt(numbers[j]),j);
                }
                else{
                    c1.addOrange(Integer.parseInt(numbers[j]),j);
                }
            }
        }
        
        //prints out the number of apples on roof
        System.out.println(c1.applesOnRoof());
        //prints out the number of oranges on roof
        System.out.println(c1.orangesOnRoof());
        
    }
}
