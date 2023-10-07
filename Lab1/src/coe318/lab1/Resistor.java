/**
 * A Resistor models an ideal resistor that obeys Ohm's Law.
 *
 * @author Immanuel Bereziuk
 */
package coe318.lab1;

public class Resistor {
//Instantiate 2 variables for resisitance and voltage
private double resist;
private double volt;
//TODO Add instance variables (Hint: you only need 2!)

    /**
     * Create an ideal Resistor. The initial current through and voltage across
     * the Resistor are zero.
     *
     * @param resistance resistance in Ohms
     */
    public Resistor(double resistance) {
//set the value of resist to the value of resistance 
        resist=resistance;
    }

    /**
     * Returns the value of the resistor in Ohms.
     *
     * @return the resistance
     */
    
    public double getResistance() {
//return the value of resist when called to
        return resist;
    }

    /**
     * Returns the voltage across the resistor.
     *
     * @return the voltage
     */
    public double getVoltage() {
//FIX THIS so that it returns the actual voltage
        return volt;
    }

    /**
     * Sets the value of the voltage across the resistor.
     *
     * @param voltage the voltage to set
     */
    public void setVoltage(double voltage) {
//created conditional statements that set the value of volt to voltahe when in range
        if(50>=voltage&&voltage>=-50){
            volt=voltage;
        }
        else{
            System.out.println("Error: voltage value beyond limit");
        }
    }

    /**
     * Returns the current through the Resistor.
     *
     * @return the current
     */
    public double getCurrent() {
//retyrb current (calculated using basic ohms law
        return (volt/resist);
    }

    /**
     * Sets the value of the current through the resistor.
     *
     * @param current the current to set
     */
    public void setCurrent(double current) {
        //set the voltage based on the current
        if(5>=current&&current>=-5){
            volt=(current*resist);
        }
        else{
            System.out.println("Error: current value beyond limit");
        }

    }

    /**
     * Returns the power (in Watts) dissipated by the Resistor.
     *
     * @return the power
     */
    public double getPower() {
//return power using the formula for power (v^2/R)
        return (volt*volt)/resist;
    }

    /**
     * A simple example of using a Resistor.
     * <p>
     * The output should be:
     * <pre>
     * Creating a 50 Ohm resistor (r1)
     * Its resistance is 50.0 Ohms
     * Its current is 0.0 Amps
     * Its voltage is 0.0 Volts
     * * Its power is 0.0 Watts
     * Creating a 100 Ohm resistor (r2)
     * Its resistance is 100.0 Ohms
     * Setting r1's current to 10 Amps
     * Error: current value beyond limit
     * Setting r1's current to 2 Amps
     * Its current is 2.0 Amps
     * Its voltage is 100.0 Volts
     * Its power is 200.0 Watts
     * Setting r1's voltage to 90 Volts
     * Error: voltage value beyond limit
     * Setting r1's voltage to 50 Volts
     * Its current is 1.0 Amps
     * Setting r2's current to 3 Amps
     * Its voltage is 300.0 Volts
     * </pre>
     *
     * @param args (Command line arguments not used.)
     */
    public static void main(String[] args) {
        Resistor r1, r2;
        System.out.println("Creating a 50 Ohm resistor (r1)");
        r1 = new Resistor(50.0);
        System.out.println("Its resistance is "
                + r1.getResistance() + " Ohms");
        System.out.println("Its current is "
                + r1.getCurrent() + " Amps");
        System.out.println("Its voltage is "
                + r1.getVoltage() + " Volts");
        System.out.println("Its power is "
                + r1.getPower() + " Watts");
        System.out.println("Creating a 100 Ohm resistor (r2)");
        r2 = new Resistor(100.0);
        System.out.println("Its resistance is "
                + r2.getResistance() + " Ohms");
        System.out.println("Setting r1's current to 10 Amps");
        r1.setCurrent(10.0);
        System.out.println("Setting r1's current to 2 Amps");
        r1.setCurrent(2.0);
        System.out.println("Its current is "
                + r1.getCurrent() + " Amps");
        System.out.println("Its voltage is "
                + r1.getVoltage() + " Volts");
        System.out.println("Its power is "
                + r1.getPower() + " Watts");
        System.out.println("Setting r1's voltage to 90 Volts");
        r1.setVoltage(90.0);
        System.out.println("Setting r1's voltage to 50 Volts");
        r1.setVoltage(50.0);
        System.out.println("Its current is "
                + r1.getCurrent() + " Amps");
        System.out.println("Setting r2's current to 3 Amps");
        r2.setCurrent(3.0);
        System.out.println("Its voltage is "
                + r2.getVoltage() + " Volts");
    }
}
