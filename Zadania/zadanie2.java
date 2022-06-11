package Zadania;

public class zadanie2 {
    public static void main(String[] args) {
        int[] doommyArray = Arrays.copyOf(fillArray(), fillArray().length);
        int doommyIndex = index();
        int doommyElement = doommyArray[doommyIndex];
        int userNumber;
        boolean toRepeat = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println(Arrays.toString(doommyArray));
        System.out.println(doommyIndex);
        System.out.println(doommyElement);

        System.out.println("Угадайте число от 0 до 10");

        while (toRepeat)  {
            for (int counter = 0; counter < 3; counter++) {

                System.out.print("Enter the number: ");
                userNumber = scanner.nextInt();
                if (userNumber == doommyElement) {
                    System.out.println("You're guess the number");
                    break;
                } else if (counter < 2) {
                    System.out.println("Try one more time. " + (2 - counter) + " rounds less");
                }
                System.out.println("You have no more tryes");
            }
            System.out.println("Do You want to repeat the game \n" + "Y / N:");
            if (repeatGame() == toRepeat){
                System.out.println("Game begin again \n");
            }else {
                System.out.println("Game over \n");
                toRepeat = false;
            }
        }
    }

    public static int fillRandomInt (){
        Random random = new Random();
        int i = random.nextInt(11);
        return i;
    }

    public static int [] fillArray () {
        int i = 10;
        int [] arr = new int[i];
        for (int a = 0; a < arr.length; a++) {
            arr[a] = fillRandomInt();
        }
        return arr;
    }

    public static int index (){
        Random random = new Random();
        int index = random.nextInt(fillArray().length -1);
        return index;
    }

    public static boolean repeatGame (){
        boolean toRepeat = true;
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if(answer.equals("N")) toRepeat = false;
        else if (answer.equals("Y"));
        return toRepeat;
    }
}