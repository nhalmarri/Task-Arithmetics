//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double amountKWD = 86;
        //Formula: Kuwaiti Dinar to US Dollars:   Amount in KWD x 3.25

        double amountUSD = amountKWD*3.25;

        System.out.printf("%.2f KWD = %.2f USD \n", amountKWD, amountUSD);

        //🌶 Vice Versa

        //USD to KWD

        double amountKWD2 = amountUSD*0.31;
        System.out.printf("%.2f USD= %.2f KWD \n", amountUSD, amountKWD2);

        //EURto KWD

        double amountEuro = amountKWD*3.3;

        double amountKWD3 = amountEuro*0.33;


        System.out.printf("%.2f Euro= %.2f KWD ", amountEuro, amountKWD3);

    }
    }
