package M3_ass7;

public class Yahtzee
{
        public static void main(String[] args)
        {
            int a=keeprolling();
            System.out.println(a);
        }

    public static int rolldice()
    {
        double randomNumber = Math.random();
        randomNumber = randomNumber * 5;
        randomNumber = randomNumber + 1;
        int random = (int) randomNumber;
        return random;
    }



    public static int keeprolling()
    {
        int dice1=rolldice();
        int dice2=rolldice();
        int dice3=rolldice();
        int dice4=rolldice();
        int dice5=rolldice();
        int count=1;
        while(!((dice1==dice2) && (dice1==dice3) && (dice1==dice4) && (dice1==dice5)))
        {
            dice1=rolldice();
            dice2=rolldice();
            dice3=rolldice();
            dice4=rolldice();
            dice5=rolldice();
            count=count+1;
        }
        return count;
    }

}



