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
  
  /**
  * This method is the constructor for the AddingMachine class
  * it sets the initial total as 0.
  * @return Nothing.
  */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  /**
  * This method returns the current total in the AddingMachine object.
  * @return int This returns the total property of the object.
  */
  public int getTotal () {
    return 0;
  }
  
  /**
  * This method adds a number to the total property.
  * @param value This is the number to add to the total.
  * @return Nothing.
  */
  public void add (int value) {
  }

  /**
  * This method is subtracts a number from the total property.
  * @param value This is the number to subtract from the total.
  * @return Nothing.
  */
  public void subtract (int value) {
  }

  /**
  * This method returns the string representation of the object.
  * @return String This returns the string represenation of the object.
  */
  public String toString () {
    return "";
  }
  
  /**
  * This method clears the total on the object.
  * @return Nothing.
  */
  public void clear() {
  }
}