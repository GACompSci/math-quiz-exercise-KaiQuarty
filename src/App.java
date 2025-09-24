public class App {
    public static void main(String[] args) throws Exception {
        Reader reader = new Reader();
        int score = 0;
        int a = Methods.randInt(1, 10);
        int b = Methods.randInt(1, 10);
        int ans1 = a + b;
        int c = Methods.randInt(1, 10);
        int d = Methods.randInt(1, 10);
        int ans2 = c - d;
        int e = Methods.randInt(1, 10);
        int f = Methods.randInt(1, 10);
        int ans3 = e * f;
        double g = Methods.randInt(1, 10);
        double h = Methods.randInt(1, 10);
        double ans4 = g / h;
        Methods.roundDouble(3, ans4);
        int i = Methods.randInt(1, 10);
        int j = Methods.randInt(1, 10);
        int ans5 = i % j;

        System.out.println("What is " + a + " + " + b + "?" );
        int answer1 = reader.getInt("Answer:");
        if (answer1 == ans1){
            System.out.println("Correct!");
            score += 1;
            System.out.println(score + "/1");
        } else {
            System.out.println("incorrect.");
            System.out.println(score + "/1");
        }

        System.out.println("What is " + c + " - " + d + "?" );
        int answer2 = reader.getInt("Answer:");
        if (answer2 == ans2){
            System.out.println("Correct!");
            score += 1;
            System.out.println(score + "/2");
        } else {
            System.out.println("incorrect.");
            System.out.println(score + "/2");
        }
        System.out.println("What is " + e + " * " + f + "?" );
        int answer3 = reader.getInt("Answer:");
        if (answer3 == ans3){
            System.out.println("Correct!");
            score += 1;
            System.out.println(score + "/3");
        } else {
            System.out.println("incorrect.");
            System.out.println(score + "/3");
        }
        System.out.println("What is " + g + " / " + h + "?" );
        double answer4 = reader.getDouble("Answer:");
        if (answer4 == ans4){
            System.out.println("Correct!");
            score += 1;
            System.out.println(score + "/4");
        } else {
            System.out.println("incorrect.");
            System.out.println(score + "/4");
        }
        System.out.println("What is " + i + " % " + j + "?" );
        int answer5 = reader.getInt("Answer:");
        if (answer5 == ans5){
            System.out.println("Correct!");
            score += 1;
            System.out.println(score + "/5");
        } else {
            System.out.println("incorrect.");
            System.out.println(score + "/5");
        }
        if (score >= 4){
            System.out.println("Great Job!");
        }else{
            System.out.println("I would try again.");
        }
    }

}
