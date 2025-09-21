import java.util.Scanner;
public class FootballPlayer {
    public static void main(String[] args){
        //Task 1
        String name;
        int age;
        double height;
        int jersey_number;
        int weight;
        Scanner values=new Scanner(System.in);

        System.out.println("please enter your name:");
        name=values.next();
        System.out.println("please enter your age:");
        age=values.nextInt();
        System.out.println("please enter your height:");
        height=values.nextDouble();
        System.out.println("please enter your weight:");
        weight=values.nextInt();
        System.out.println("please enter your jersey number:");
        jersey_number=values.nextInt();

        System.out.println("Player Name- "+ name);
        System.out.println("Age- "+ age);
        System.out.println("Height- "+ height+ "m");
        System.out.println("Weight- "+ weight+"lbs");
        System.out.println("Jersey number- "+ jersey_number);


        //Task2
        final float pound=0.45359237f;
        final int meter=100;
        float lbs_kgs=weight*pound;
        double m_to_cm=height/meter;

        System.out.println("Player Name- "+ name);
        System.out.println("Age- "+ age);
        System.out.println("Height- "+ m_to_cm+ "m");
        System.out.println("Weight- "+ lbs_kgs+"kgs");
        System.out.println("Jersey number- "+ jersey_number);

        //Task3
        System.out.println("current age:"+ age);
        ++age;
        System.out.println("Jersey number: "+--jersey_number);

        //Task4
        System.out.println("");
        if ((18<=age && age<=35 && weight>=90 )){
            System.out.println("Eligible");

        }
        else{
            System.out.println("Not Eligible");
            if(age<18){
                System.out.println("Player has a problem; underage");
            }
            if (lbs_kgs>=90){
                System.out.println("Student has a problem: overweight");
            }
        }
        System.out.println("The Not section");
        if (!(18<=age && age<=35 && weight>=90 )){
            System.out.println("Eligible");

        }
        else{
            System.out.println("Not Eligible");
        }


        //task5
        //Under 20 → Rising Star
        // 20–30 → Prime Player
        //Over 30 → Veteran
        System.out.println("");
        String category;
        if (age<20){
            category="Rising star";
        }
        else if (age<=30) {
            category="Prime player";
            
        } else {
            category="Veteran";
            
        }
        System.out.println("Category: "+category);

        //task6
        //1 = Goalkeeper,
        // 2= defender,
        //5- defender
        // 6 =midfielder, 
        //7 = Winger, 
        // 8=midfielder
        //9 = Striker, 
        //10 = Playmaker, 
        //11 = Winger,
        System.out.println(" ");
        String position;
        switch (jersey_number) {
            case 1:
                position="Goalkeeper";
                System.out.println("position is:"+ position);
                break;

            case 2:
                position="Defender";
                System.out.println("position is:"+ position);
                break;
        
            case 5:
                position="Defender";
                System.out.println("position is:"+ position);
                break;
            case 6:
                position="Midfielder";
                System.out.println("position is:"+ position);
                break;

            case 7:
                position="Winger";
                System.out.println("position is:"+ position);
                break;
            
            case 8:
                position="Midfielder";
                System.out.println("position is:"+ position);
                break;
            
            case 9:
                position="Striker";
                System.out.println("position is:"+ position);
                break;

            case 10:
                position="Playmaker";
                System.out.println("position is:"+ position);
                break;
            
            case 11:
                position="Winger";
                System.out.println("position is:"+ position);
                break;
            default:
                System.out.println("Player position not known");
                break;

        }
        //Task 7A
         String position1;
         System.out.println(" ");
         System.out.println("Task 7A");
        switch (jersey_number) {
            case 1:
                position1="Goalkeeper";
                System.out.println("position is:"+ position1);
                break;

            case 2:
                position1="Defender";
                System.out.println("position is:"+ position1);
                
        
            case 5:
                position1="Defender";
                System.out.println("position is:"+ position1);
                break;

            case 6:
                position1="Midfielder";
                System.out.println("position is:"+ position1);
                

            case 7:
                position1="Winger";
                System.out.println("position is:"+ position1);
                
            
            case 8:
                position1="Midfielder";
                System.out.println("position is:"+ position1);
                break;
            
            case 9:
                position1="Striker";
                System.out.println("position is:"+ position1);
                break;

            case 10:
                position1="Playmaker";
                System.out.println("position is:"+ position1);
                break;
            
            case 11:
                position1="Winger";
                System.out.println("position is:"+ position1);
                break;
            
            default:
                System.out.println("“Player position not known");
                break; 
        }
        //Task B
        System.out.println("");
        System.out.println("Task 7B");
        String position2;
        switch (jersey_number) {
            case 1:
                position2="Goalkeeper";
                System.out.println("position is:"+ position2);
                break;

            case 2:
            case 5:
                position2="Defender";
                System.out.println("position is:"+ position2);
                break;

            case 6:
            case 8:
                position2="Midfielder";
                System.out.println("position is:"+ position2);
                break;
                

            case 7:
            case 11:
                position2="Winger";
                System.out.println("position is:"+ position2);
            
            case 9:
                position2="Striker";
                System.out.println("position is:"+ position2);
                break;

            case 10:
                position2="Playmaker";
                System.out.println("position is:"+ position2);
                break;
            
            
            default:
                System.out.println("“Player position not known");
                break; 
        }
        
        //Task 8
        System.out.println("");
        if (category=="Prime Player"  ){
            if (weight<80){
                System.out.println(" Player in starting lineup");
            }
            else{
            System.out.println(" Player on bench");
            }   

        }
        else{
            System.out.println(" Player on bench");
        }

        //task 9
        System.out.println(" ");
        String eligible;
        eligible = (18<=age && age<=35 && weight>=90)? "Play":"Rest";
        System.out.println(eligible);

        
        









        values.close();

    }
}
