package cse360assignment02;

/**
* A simple program that can add and subtract from a count in addition,
* it can return the to total and be cleared.
*
* @author  Ben Bousquet
* @version 1.0
* @since   2020-10-07 
*/
public class AddingMachine {
  private int total;
  private String history;
  
  /**
  * This method is the constructor for the AddingMachine class
  * it sets the initial total as 0.
  * @return Nothing.
  */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    this.history = "0";
  }
  
  /**
  * This method returns the current total in the AddingMachine object.
  * @return int This returns the total property of the object.
  */
  public int getTotal () {
    return this.total;
  }
  
  /**
  * This method adds a number to the total property and adds the operation to the history.
  * @param value This is the number to add to the total.
  * @return Nothing.
  */
  public void add (int value) {
	  this.total += value;
	  this.history = String.format("%s + %s", this.history, value);
  }

  /**
  * This method is subtracts a number from the total property and adds the operation to the history.
  * @param value This is the number to subtract from the total.
  * @return Nothing.
  */
  public void subtract (int value) {
	  this.total -= value;
	  this.history = String.format("%s - %s", this.history, value);
  }

  /**
  * This method returns the string representation of the object.
  * @return String This returns the history of all the operations on the total.
  */
  public String toString () {
    return this.history;
  }
  
  /**
  * This method clears the total and history on the object.
  * @return Nothing.
  */
  public void clear() {
	  this.total = 0;
	  this.history = "0";
  }
  
  public static void main(String[] args)
  {
	  AddingMachine myCalculator = new AddingMachine();
	  myCalculator.add (4); 
	  myCalculator.subtract (2); 
	  myCalculator.add(5);
	  System.out.println(myCalculator.toString());
  }
}

