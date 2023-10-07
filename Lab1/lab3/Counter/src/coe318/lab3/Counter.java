/**
 *
 * @author Immanuel Bereziuk
 */
package coe318.lab3;
public class Counter {
    //Instance variables here
    private int num,mod;
    private Counter left;
    
    
    public Counter(int modulus, Counter left) {
        mod = modulus;
        this.left=left;
    }


    /**
     * @return the modulus
     */
    public int getModulus() {
        return mod;
    }

    /**
     * Returns the Counter to the left attached to this
     * Counter.  Returns null if there is no Counter
     * to the left.
     * @return the left
     */
    public Counter getLeft() {
        return left;
    }

    /**
     * @return the digit
     */
    public int getDigit() {
        return num;
    }

    /**
     * @param digit the digit to set
     */
    public void setDigit(int digit) {
        num = digit;
    }

    /**
     * Increment this counter.  If it rolls over,
     * its left Counter is also incremented if it
     * exists.
     */
    public void increment() {
        num++;
        if(num == mod){
            num=0;
                if(left != null){
                    left.num++;
            }
        }
        
    }

    /** Return the count of this Counter combined
     * with any Counter to its left.
     *
     * @return the count
     */
    public int getCount() {
        if(left != null){
            return(num + mod*left.num);
        }
        else{
            return(num);
        }
        
    }

    /** Returns a String representation of the Counter's
     * total count (including its left neighbour).
     * @return the String representation
     */
    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        return "" + getCount();
    }

}
