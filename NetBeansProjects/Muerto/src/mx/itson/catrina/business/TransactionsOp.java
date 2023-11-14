package mx.itson.catrina.business;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import mx.itson.catrina.entities.Transaction;
import mx.itson.catrina.enums.TransactionType;
import static mx.itson.catrina.enums.TransactionType.Deposit;
import static mx.itson.catrina.enums.TransactionType.Withdrawal;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author marcmartinez
 */
public class TransactionsOp {

    double janauary = 0, february = 0, march = 0, april = 0;
    double may = 0, june = 0, july = 0, august = 0;
    double september = 0, october = 0, november = 0, december = 0;

    //PRUEBA SUBIR
    /**
     * This method helps us organize a list of dates and calculations that is
     * saved in the Account class.
     *
     * @param month month is the main parameter that will be used to make
     * calculations
     * @param transactions Saves the transactions that were made in an ArrayList
     * @return returns all transactions that were made
     */
    public List<Transaction> Obtain(String month, List<Transaction> transactions) {

        List<Transaction> transactionMonth = new ArrayList<>();
        DateFormat dateFormat = new SimpleDateFormat("MM");
        DateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yy");
        Collections.sort(transactions);
        // transactions.sort((m1, m2) -> m1.getDate().compareTo(m2.getDate()));
        int postion = 0;
        double subtotal = 0;

        for (Transaction t : transactions) {
            if (dateFormat.format(t.getDate()).equals("01")) {
                if (t.getType() == TransactionType.Deposit) {
                    janauary += t.getAmount();
                } else if (t.getType() == TransactionType.Withdrawal) {
                    janauary -= t.getAmount();
                }
            } else if (dateFormat.format(t.getDate()).equals("02")) {
                if (t.getType() == TransactionType.Deposit) {
                    february += t.getAmount();
                } else if (t.getType() == TransactionType.Withdrawal) {
                    february -= t.getAmount();
                }
            } else if (dateFormat.format(t.getDate()).equals("03")) {
                if (t.getType() == TransactionType.Deposit) {
                    march += t.getAmount();
                } else if (t.getType() == TransactionType.Withdrawal) {
                    march -= t.getAmount();
                }
            } else if (dateFormat.format(t.getDate()).equals("04")) {
                if (t.getType() == TransactionType.Deposit) {
                    april += t.getAmount();
                } else if (t.getType() == TransactionType.Withdrawal) {
                    april -= t.getAmount();
                }
            } else if (dateFormat.format(t.getDate()).equals("05")) {
                if (t.getType() == TransactionType.Deposit) {
                    may += t.getAmount();
                } else if (t.getType() == TransactionType.Withdrawal) {
                    may -= t.getAmount();
                }
            } else if (dateFormat.format(t.getDate()).equals("06")) {
                if (t.getType() == TransactionType.Deposit) {
                    june += t.getAmount();
                } else if (t.getType() == TransactionType.Withdrawal) {
                    june -= t.getAmount();
                }
            } else if (dateFormat.format(t.getDate()).equals("07")) {
                if (t.getType() == TransactionType.Deposit) {
                    july += t.getAmount();
                } else if (t.getType() == TransactionType.Withdrawal) {
                    july -= t.getAmount();
                }
            } else if (dateFormat.format(t.getDate()).equals("08")) {
                if (t.getType() == TransactionType.Deposit) {
                    august += t.getAmount();
                } else if (t.getType() == TransactionType.Withdrawal) {
                    august -= t.getAmount();
                }
            } else if (dateFormat.format(t.getDate()).equals("09")) {
                if (t.getType() == TransactionType.Deposit) {
                    september += t.getAmount();
                } else if (t.getType() == TransactionType.Withdrawal) {
                    september -= t.getAmount();
                }
            } else if (dateFormat.format(t.getDate()).equals("10")) {
                if (t.getType() == TransactionType.Deposit) {
                    october += t.getAmount();
                } else if (t.getType() == TransactionType.Withdrawal) {
                    october -= t.getAmount();
                }
            } else if (dateFormat.format(t.getDate()).equals("11")) {
                if (t.getType() == TransactionType.Deposit) {
                    november += t.getAmount();
                } else if (t.getType() == TransactionType.Withdrawal) {
                    november -= t.getAmount();
                }
            } else if (dateFormat.format(t.getDate()).equals("12")) {
                if (t.getType() == TransactionType.Deposit) {
                    december += t.getAmount();
                } else if (t.getType() == TransactionType.Withdrawal) {
                    december -= t.getAmount();
                }

            }

        }

        switch (month.trim()) {
            case "Janauary": {
                for (Transaction t : transactions) {
                    if (dateFormat.format(t.getDate()).equals("01")) {
                        Transaction transactionOp = new Transaction();
                        transactionOp.setOperationDescription(t.getDescription());
                        transactionOp.setTransactionId(t.getTransactionId());
                        transactionOp.setOperationDate(dateFormat1.format(t.getDate()));
                        switch (t.getType()) {
                            case Deposit: {
                                transactionOp.setDeposit(t.getAmount());
                                if (postion == 0) {
                                    transactionOp.setSubtotal(transactionOp.getDeposit());
                                    subtotal += transactionOp.getDeposit();
                                } else {
                                    transactionOp.setSubtotal((subtotal + transactionOp.getDeposit()));
                                    subtotal += transactionOp.getDeposit();
                                }

                            }
                            case Withdrawal: {
                                transactionOp.setWithDraw(t.getAmount());
                                if (postion == 0) {
                                    transactionOp.setSubtotal(transactionOp.getWithDraw());
                                    subtotal -= transactionOp.getWithDraw();
                                } else {
                                    transactionOp.setSubtotal((subtotal - transactionOp.getWithDraw()));
                                    subtotal -= transactionOp.getWithDraw();

                                }

                            }
                            default: {

                            }

                        }
                        postion++;
                        transactionMonth.add(transactionOp);

                    }

                }

            }

            case "February": {
                for (Transaction t : transactions) {
                    if (dateFormat.format(t.getDate()).equals("02")) {
                        Transaction transactionOp = new Transaction();
                        transactionOp.setOperationDescription(t.getDescription());
                        transactionOp.setTransactionId(t.getTransactionId());
                        transactionOp.setOperationDate(dateFormat1.format(t.getDate()));

                        switch (t.getType()) {
                            case Deposit: {
                                transactionOp.setDeposit(t.getAmount());
                                if (postion == 0) {
                                    transactionOp.setSubtotal((janauary + transactionOp.getDeposit()));
                                    subtotal = janauary + transactionOp.getDeposit();
                                } else {
                                    transactionOp.setSubtotal((int) (subtotal + transactionOp.getDeposit()));
                                    subtotal += transactionOp.getDeposit();
                                }
                            }
                            case Withdrawal: {
                                transactionOp.setWithDraw(t.getAmount());
                                if (postion == 0) {
                                    transactionOp.setSubtotal((janauary - transactionOp.getWithDraw()));
                                    subtotal = janauary - transactionOp.getWithDraw();

                                } else {
                                    transactionOp.setSubtotal((subtotal - transactionOp.getWithDraw()));
                                    subtotal -= transactionOp.getWithDraw();
                                }

                            }
                            default: {

                            }

                        }
                        postion++;
                        transactionMonth.add(transactionOp);

                    }
                }

            }

            case "March": {
                for (Transaction t : transactions) {
                    if (dateFormat.format(t.getDate()).equals("03")) {
                        Transaction transactionOp = new Transaction();
                        transactionOp.setOperationDescription(t.getDescription());
                        transactionOp.setTransactionId(t.getTransactionId());
                        transactionOp.setOperationDate(dateFormat1.format(t.getDate()));

                        switch (t.getType()) {
                            case Deposit: {
                                transactionOp.setDeposit(t.getAmount());
                                if (postion == 0) {
                                    transactionOp.setSubtotal((janauary + february + transactionOp.getDeposit()));
                                    subtotal = janauary + february + transactionOp.getDeposit();
                                } else {
                                    transactionOp.setSubtotal((subtotal + transactionOp.getDeposit()));
                                    subtotal += transactionOp.getDeposit();
                                }
                            }
                            case Withdrawal: {
                                transactionOp.setWithDraw(t.getAmount());
                                if (postion == 0) {
                                    transactionOp.setSubtotal((janauary + february - transactionOp.getWithDraw()));
                                    subtotal = janauary + february - transactionOp.getWithDraw();

                                } else {
                                    transactionOp.setSubtotal((subtotal - transactionOp.getWithDraw()));
                                    subtotal -= transactionOp.getWithDraw();
                                }

                            }
                            default: {

                            }

                        }
                        postion++;
                        transactionMonth.add(transactionOp);

                    }
                }

            }

            case "April": {
                for (Transaction t : transactions) {
                    if (dateFormat.format(t.getDate()).equals("04")) {
                        Transaction transactionOp = new Transaction();
                        transactionOp.setOperationDescription(t.getDescription());
                        transactionOp.setTransactionId(t.getTransactionId());
                        transactionOp.setOperationDate(dateFormat1.format(t.getDate()));

                        switch (t.getType()) {
                            case Deposit: {
                                transactionOp.setDeposit(t.getAmount());
                                if (postion == 0) {
                                    transactionOp.setSubtotal((janauary + february + march + transactionOp.getDeposit()));
                                    subtotal = janauary + february + march + transactionOp.getDeposit();
                                } else {
                                    transactionOp.setSubtotal((subtotal + transactionOp.getDeposit()));
                                    subtotal += transactionOp.getDeposit();
                                }

                            }
                            case Withdrawal: {
                                transactionOp.setWithDraw(t.getAmount());
                                if (postion == 0) {
                                    transactionOp.setSubtotal((janauary + february + march - transactionOp.getWithDraw()));
                                    subtotal = janauary + february + march - transactionOp.getWithDraw();
                                } else {
                                    transactionOp.setSubtotal((subtotal - transactionOp.getWithDraw()));
                                    subtotal -= transactionOp.getWithDraw();

                                }

                            }
                            default: {

                            }

                        }
                        postion++;
                        transactionMonth.add(transactionOp);

                    }

                }

            }

            case "May": {
                for (Transaction t : transactions) {
                    Transaction transactionOp = new Transaction();

                    if (dateFormat.format(t.getDate()).equals("05")) {
                        transactionOp.setOperationDescription(t.getDescription());
                        transactionOp.setTransactionId(t.getTransactionId());
                        transactionOp.setOperationDate(dateFormat1.format(t.getDate()));

                        switch (t.getType()) {
                            case Deposit: {
                                transactionOp.setDeposit(t.getAmount());
                                if (postion == 0) {
                                    transactionOp.setSubtotal((janauary + february + march + april + transactionOp.getDeposit()));
                                    subtotal = janauary + february + march + april + transactionOp.getDeposit();
                                } else {
                                    transactionOp.setSubtotal((int) (subtotal + transactionOp.getDeposit()));
                                    subtotal += transactionOp.getDeposit();
                                }
                            }
                            case Withdrawal: {
                                transactionOp.setWithDraw(t.getAmount());
                                if (postion == 0) {
                                    transactionOp.setSubtotal((janauary + february + march + april - transactionOp.getWithDraw()));
                                    subtotal = janauary + february + march + april - transactionOp.getWithDraw();

                                } else {
                                    transactionOp.setSubtotal((subtotal - transactionOp.getWithDraw()));
                                    subtotal -= transactionOp.getWithDraw();
                                }

                            }
                            default: {

                            }

                        }
                        postion++;
                        transactionMonth.add(transactionOp);

                    }
                }

            }

            case "June": {
                for (Transaction t : transactions) {
                    Transaction transactionOp = new Transaction();

                    if (dateFormat.format(t.getDate()).equals("06")) {
                        transactionOp.setOperationDescription(t.getDescription());
                        transactionOp.setTransactionId(t.getTransactionId());
                        transactionOp.setOperationDate(dateFormat1.format(t.getDate()));
                        switch (t.getType()) {
                            case Deposit: {
                                transactionOp.setDeposit(t.getAmount());
                                if (postion == 0) {
                                    transactionOp.setSubtotal((janauary + february + march + april + may + transactionOp.getDeposit()));
                                    subtotal = janauary + february + march + april + may + transactionOp.getDeposit();
                                } else {
                                    transactionOp.setSubtotal((subtotal + transactionOp.getDeposit()));
                                    subtotal += transactionOp.getDeposit();
                                }
                            }
                            case Withdrawal: {
                                transactionOp.setWithDraw(t.getAmount());
                                if (postion == 0) {
                                    transactionOp.setSubtotal((janauary + february + march + april + may - transactionOp.getWithDraw()));
                                    subtotal = janauary + february + march + april + may - transactionOp.getWithDraw();

                                } else {
                                    transactionOp.setSubtotal((subtotal - transactionOp.getWithDraw()));
                                    subtotal -= transactionOp.getWithDraw();
                                }

                            }
                            default: {

                            }

                        }
                        postion++;
                        transactionMonth.add(transactionOp);

                    }
                }

            }

            case "July": {
                for (Transaction t : transactions) {
                    Transaction transactionOp = new Transaction();

                    if (dateFormat.format(t.getDate()).equals("07")) {
                        transactionOp.setOperationDescription(t.getDescription());
                        transactionOp.setTransactionId(t.getTransactionId());
                        transactionOp.setOperationDate(dateFormat1.format(t.getDate()));

                        switch (t.getType()) {
                            case Deposit: {
                                transactionOp.setDeposit(t.getAmount());
                                if (postion == 0) {
                                    transactionOp.setSubtotal((janauary + february + march + april + may + june + transactionOp.getDeposit()));
                                    subtotal = janauary + february + march + april + may + june + transactionOp.getDeposit();
                                } else {
                                    transactionOp.setSubtotal((subtotal + transactionOp.getDeposit()));
                                    subtotal += transactionOp.getDeposit();
                                }
                            }
                            case Withdrawal: {
                                transactionOp.setWithDraw(t.getAmount());
                                if (postion == 0) {
                                    transactionOp.setSubtotal((janauary + february + march + april + may + june - transactionOp.getWithDraw()));
                                    subtotal = janauary + february + march + april + may + june - transactionOp.getWithDraw();

                                } else {
                                    transactionOp.setSubtotal((subtotal - transactionOp.getWithDraw()));
                                    subtotal -= transactionOp.getWithDraw();
                                }

                            }
                            default: {

                            }

                        }
                        postion++;
                        transactionMonth.add(transactionOp);

                    }
                }

            }

            case "August": {
                for (Transaction t : transactions) {
                    Transaction transactionOp = new Transaction();

                    if (dateFormat.format(t.getDate()).equals("08")) {
                        transactionOp.setOperationDescription(t.getDescription());
                        transactionOp.setTransactionId(t.getTransactionId());
                        transactionOp.setOperationDate(dateFormat1.format(t.getDate()));

                        switch (t.getType()) {
                            case Deposit: {
                                transactionOp.setDeposit(t.getAmount());
                                if (postion == 0) {
                                    transactionOp.setSubtotal((janauary + february + march + april + may + june + july + transactionOp.getDeposit()));
                                    subtotal = janauary + february + march + april + may + june + july + transactionOp.getDeposit();
                                } else {
                                    transactionOp.setSubtotal((subtotal + transactionOp.getDeposit()));
                                    subtotal += transactionOp.getDeposit();
                                }
                            }
                            case Withdrawal: {
                                transactionOp.setWithDraw(t.getAmount());
                                if (postion == 0) {
                                    transactionOp.setSubtotal((janauary + february + march + april + may + june + july - transactionOp.getWithDraw()));
                                    subtotal = janauary + february + march + april + may + june + july - transactionOp.getWithDraw();

                                } else {
                                    transactionOp.setSubtotal((subtotal - transactionOp.getWithDraw()));
                                    subtotal -= transactionOp.getWithDraw();
                                }

                            }
                            default: {

                            }

                        }
                        postion++;
                        transactionMonth.add(transactionOp);
                        JOptionPane.showMessageDialog(null, "Esta vacio");
                    }
                }

            }

            case "September": {
                for (Transaction t : transactions) {
                    if (dateFormat.format(t.getDate()).equals("09")) {
                        Transaction transactionOp = new Transaction();

                        transactionOp.setOperationDescription(t.getDescription());
                        transactionOp.setTransactionId(t.getTransactionId());
                        transactionOp.setOperationDate(dateFormat1.format(t.getDate()));
                        switch (t.getType()) {
                            case Deposit: {
                                transactionOp.setDeposit(t.getAmount());
                                if (postion == 0) {
                                    transactionOp.setSubtotal((janauary + february + march + april + may + june + july + august + transactionOp.getDeposit()));
                                    subtotal = janauary + february + march + april + may + june + july + august + transactionOp.getDeposit();
                                } else {
                                    transactionOp.setSubtotal((subtotal + transactionOp.getDeposit()));
                                    subtotal += transactionOp.getDeposit();
                                }

                            }
                            case Withdrawal: {
                                transactionOp.setWithDraw(t.getAmount());
                                if (postion == 0) {
                                    transactionOp.setSubtotal((janauary + february + march + april + may + june + august - transactionOp.getWithDraw()));
                                    subtotal = janauary + february + march + april + may + june + august - transactionOp.getWithDraw();
                                } else {
                                    transactionOp.setSubtotal((subtotal - transactionOp.getWithDraw()));
                                    subtotal -= transactionOp.getWithDraw();

                                }

                            }
                            default: {

                            }

                        }
                        postion++;
                        transactionMonth.add(transactionOp);

                    }

                }

            }

            case "October": {
                for (Transaction t : transactions) {
                    if (dateFormat.format(t.getDate()).equals("10")) {
                        Transaction transactionOp = new Transaction();

                        transactionOp.setOperationDescription(t.getDescription());
                        transactionOp.setTransactionId(t.getTransactionId());
                        transactionOp.setOperationDate(dateFormat1.format(t.getDate()));

                        switch (t.getType()) {
                            case Deposit: {
                                transactionOp.setDeposit(t.getAmount());
                                if (postion == 0) {
                                    transactionOp.setSubtotal((janauary + february + march + april + may + june + july + august + september + transactionOp.getDeposit()));
                                    subtotal = janauary + february + march + april + may + june + july + august + september + transactionOp.getDeposit();
                                } else {
                                    transactionOp.setSubtotal((subtotal + transactionOp.getDeposit()));
                                    subtotal += transactionOp.getDeposit();
                                }
                            }
                            case Withdrawal: {
                                transactionOp.setWithDraw(t.getAmount());
                                if (postion == 0) {
                                    transactionOp.setSubtotal((janauary + february + march + april + may + june + july + august + september - transactionOp.getWithDraw()));
                                    subtotal = janauary + february + march + april + may + june + july + august + september - transactionOp.getWithDraw();

                                } else {
                                    transactionOp.setSubtotal((subtotal - transactionOp.getWithDraw()));
                                    subtotal -= transactionOp.getWithDraw();
                                }

                            }
                            default: {

                            }

                        }
                        postion++;
                        transactionMonth.add(transactionOp);

                    }
                }

            }

            case "November": {
                for (Transaction t : transactions) {
                    if (dateFormat.format(t.getDate()).equals("11")) {
                        Transaction transactionOp = new Transaction();

                        transactionOp.setOperationDescription(t.getDescription());
                        transactionOp.setTransactionId(t.getTransactionId());
                        transactionOp.setOperationDate(dateFormat1.format(t.getDate()));

                        switch (t.getType()) {
                            case Deposit: {
                                transactionOp.setDeposit(t.getAmount());
                                if (postion == 0) {
                                    transactionOp.setSubtotal((janauary + february + march + april + may + june + july + august + september + october + transactionOp.getDeposit()));
                                    subtotal = janauary + february + march + april + may + june + july + august + september + october + transactionOp.getDeposit();
                                } else {
                                    transactionOp.setSubtotal((subtotal + transactionOp.getDeposit()));
                                    subtotal += transactionOp.getDeposit();
                                }
                            }
                            case Withdrawal: {
                                transactionOp.setWithDraw(t.getAmount());
                                if (postion == 0) {
                                    transactionOp.setSubtotal((janauary + february + march + april + may + june + july + august + september + october - transactionOp.getWithDraw()));
                                    subtotal = janauary + february + march + april + may + june + july + august + september + october - transactionOp.getWithDraw();

                                } else {
                                    transactionOp.setSubtotal((subtotal - transactionOp.getWithDraw()));
                                    subtotal -= transactionOp.getWithDraw();
                                }

                            }
                            default: {

                            }

                        }
                        postion++;
                        transactionMonth.add(transactionOp);

                    }
                }

            }

            case "December": {
                for (Transaction t : transactions) {
                    if (dateFormat.format(t.getDate()).equals("12")) {
                        Transaction transactionOp = new Transaction();

                        transactionOp.setOperationDescription(t.getDescription());
                        transactionOp.setTransactionId(t.getTransactionId());
                        transactionOp.setOperationDate(dateFormat1.format(t.getDate()));

                        switch (t.getType()) {
                            case Deposit: {
                                transactionOp.setDeposit(t.getAmount());
                                if (postion == 0) {
                                    transactionOp.setSubtotal((janauary + february + march + april + may + june + september + october + november + transactionOp.getDeposit()));
                                    subtotal = janauary + february + march + april + may + june + september + october + november + transactionOp.getDeposit();
                                } else {
                                    transactionOp.setSubtotal((subtotal + transactionOp.getDeposit()));
                                    subtotal += transactionOp.getDeposit();
                                }
                            }
                            case Withdrawal: {
                                transactionOp.setWithDraw(t.getAmount());
                                if (postion == 0) {
                                    transactionOp.setSubtotal((janauary + february + march + april + may + june + september + october + november - transactionOp.getWithDraw()));
                                    subtotal = janauary + february + march + april + may + june + september + october + november - transactionOp.getWithDraw();

                                } else {
                                    transactionOp.setSubtotal((subtotal - transactionOp.getWithDraw()));
                                    subtotal -= transactionOp.getWithDraw();
                                }

                            }
                            default: {

                            }

                        }
                        postion++;
                        transactionMonth.add(transactionOp);

                    }

                }

            }

            default: {

            }

        }
        return transactionMonth;
    }

//PERIOD SUMMARY Tansactions
    /**
     * PERIOD SUMMARY Tansactions
     *
     * @param month is used to calculate each month
     * @param transaction ArrayList for the calcul
     * @return startingBalance is total
     */
    public double getStartingBalance(String month, List<Transaction> transaction) {
        double startingBalance = 0;
        if (month.equals("Janauary ")) {
            startingBalance = 0;
        } else if (month.equals("February ")) {
            startingBalance = janauary;
        } else if (month.equals("March ")) {
            startingBalance = janauary + february;
        } else if (month.equals("April ")) {
            startingBalance = janauary + february + march;
        } else if (month.equals("May")) {
            startingBalance = janauary + february + march + april;
        } else if (month.equals("June")) {
            startingBalance = janauary + february + march + april + may;
        } else if (month.equals("July")) {
            startingBalance = janauary + february + march + april + may + june;
        } else if (month.equals("August")) {
            startingBalance = janauary + february + march + april + may + june + july;
        } else if (month.equals("September")) {
            startingBalance = janauary + february + march + april + may + june + july + august;
        } else if (month.equals("October")) {
            startingBalance = janauary + february + march + april + may + june + july + august + september;
        } else if (month.equals("November ")) {
            startingBalance = janauary + february + march + april + may + june + july + august + september + october;
        } else if (month.equals("December")) {
            startingBalance = janauary + february + march + april + may + june + july + august + september + october + november;

        }
        return startingBalance;
    }

}
