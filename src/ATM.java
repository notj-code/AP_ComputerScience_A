import java.math.BigInteger;

public class ATM {
    private String userName, idNum;
    private int intIdNum, input, output, bankInfo, walletInfo;
    private int interestRate = (int) (Math.random()*10);

    public ATM() {
        userName = ""; idNum = ""; intIdNum = 0;
        input = 0; output = 0; bankInfo = 0;
    }

    public ATM(String name, String idNumber, int intId, int in, int out, int wallet) {
        userName = name;
        idNum = idNumber;
        intIdNum = intId;
        input = in;
        output = out;
        walletInfo = wallet;
    }

    public int putMoney(int a) {
        bankInfo += a;
        walletInfo -= a;
        System.out.println("Current: " + bankInfo + "$");
        System.out.println("Your Wallet" + walletInfo + "$");
        return bankInfo;
    }

    public int getMoney(int a) {
        bankInfo -= a;
        walletInfo += a;
        System.out.println("Current: " + bankInfo +  + "$");
        System.out.println("Your Wallet" + walletInfo + "$");
        return bankInfo;
    }

    public void displayInfo() {


        System.out.println("Name: " + userName);
        System.out.println("ID: " + idNum);
    }

    /*public int checkSum(BigInteger a) {
        BigInteger L = (a%10)/1,
        K = (a%100)/10,
        J = (a%1000)/100,
        I = (a%10000)/1000,
        H = (a%100000)/10000,
        G = (a%1000000)/100000,
        F = (a%10000000)/1000000,
        E = (a%100000000)/10000000,
        D = (a%1000000000)/100000000,
        C = (a%10000000000)/1000000000,
        B = (a%100000000000)/10000000000,
        A = (a%1000000000000)/100000000000;

        (11-(2*A+3*B+4*C+5*D+6*E+7*F+8*G+9*H+2*I+3*J+4*K+5*L)%11)%10
        System.out.print("Checksum number equals to" + ());
    } */




}
