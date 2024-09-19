

public class Main {
    public static void main(String[] args) {
        String userNum = "0704163024019", userName="김준원";
        int wallet = 0, input = 0, output = 0;

        ATM user1 = new ATM(userName, userNum, 0, input, output, wallet);

        wallet = ATM.putMoney(1000);
        wallet = ATM.getMoney(10);

    }
}
