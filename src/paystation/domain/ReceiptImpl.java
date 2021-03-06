/**
 * Implementation of Receipt.
 *
 *
 * This source code is from the book "Flexible, Reliable Software: Using
 * Patterns and Agile Development" published 2010 by CRC Press. Author: Henrik B
 * Christensen Computer Science Department Aarhus University
 *
 * This source code is provided WITHOUT ANY WARRANTY either expressed or
 * implied. You may study, use, modify, and distribute it for non-commercial
 * purposes. For any commercial use, see http://www.baerbak.com/
 */
package paystation.domain;

public class ReceiptImpl implements Receipt {

    private int value;
    private int moneyInserted;

    public ReceiptImpl(int value, int moneyInserted) {
        this.value = value;
        this.moneyInserted = moneyInserted;
    }
    @Override
    public int value() {
        return value;
    }
    
    public int getMoneyInserted() {
        return moneyInserted;
    }
}
