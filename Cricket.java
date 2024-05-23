import java.util.Scanner;
public class Cricket
{
    public static int i,runs,run,sum=0,c1=0,cn1=0,c0=0,r1,r2,r3,r4,r5,r6;
    public static char ch;
    public static String tname1,tn,tname2,pname1,pname2,pname3,pname4,date,time,venue,tmatch,tw,weather,temp,cc;
    public static Scanner sc=new Scanner(System.in);
    public static void last_over_runs()
    {
        System.out.println("********Last over Runs Data********\n\nPlease enter details of the last over : ");
        System.out.println("Enter Runs of Ball 1 : ");
        r1=sc.nextInt();
        System.out.println("Enter Runs of Ball 2 : ");
        r2=sc.nextInt();
        System.out.println("Enter Runs of Ball 3 : ");
        r3=sc.nextInt();
        System.out.println("Enter Runs of Ball 4 : ");
        r4=sc.nextInt();
        System.out.println("Enter Runs of Ball 5 : ");
        r5=sc.nextInt();
        System.out.println("Enter Runs of Ball 6 : ");
        r6=sc.nextInt();
        System.out.println("Was there any Wicket ? (y/n) : ");
        ch=sc.next().charAt(0);
        System.out.println("Balls | Runs |");
        System.out.println("1     | "+r1+"    | ");
        System.out.println("2     | "+r2+"    | ");
        System.out.println("3     | "+r3+"    | ");
        System.out.println("4     | "+r4+"    | ");
        System.out.println("5     | "+r5+"    | ");
        System.out.println("6     | "+r6+"    | ");
        if(ch=='y')
        System.out.println("Wicket : YES");
        else
        System.out.println("Wicket : NO");
    }
    public static void Average_runs()
    {
        System.out.println("******Average Runs for last over******\nPlease enter details of the last over : ");
        for(i=0;i<6;i++)
        {
            System.out.println("Enter runs for ball "+(i+1)+" : ");
            runs=sc.nextInt();
            sum=sum+runs;
        }
        System.out.println("Average Runs for last over : "+(float)(sum/6));
    }
    public static void player_details()
    {
        System.out.println("Enter Name of Team 1 : ");
        tn=sc.nextLine();
        System.out.println("Enter Name of Player 1 :");
        pname1=sc.nextLine();
        System.out.println("Enter Name of Player 2 :");
        pname2=sc.nextLine();
        System.out.println("Enter Name of Team 2 : ");
        tname2=sc.nextLine();
        System.out.println("Enter Name of Player 1 :");
        pname3=sc.nextLine();
        System.out.println("Enter Name of Player 2 :");
        pname4=sc.nextLine();
        System.out.println("\nTeam "+tn+"\nSr.no | Player Name\n1.    |    "+pname1+"\n2.    |    "+pname2);
        System.out.println("\n\nTeam "+tname2+"\nSr.no | Player Name\n1.    |    "+pname3+"\n2.    |    "+pname4);
        
    }
    public static void match_details()
    {
        System.out.println("********Match Details********");
        System.out.println("Enter Date of the Match : ");
        date=sc.nextLine();
        System.out.println("Enter Time of the Match : ");
        time=sc.nextLine();
        System.out.println("Enter Venue of the Match : ");
        venue=sc.nextLine();
        System.out.println("Enter Type of the Match : ");
        tmatch = sc.nextLine();
        System.out.println("Enter Team Name 1 : ");
        tname1=sc.nextLine();
        System.out.println("Enter Team Name 2 : ");
        tname2=sc.nextLine();
        System.out.println("Enter Captain Name of Team 1 : ");
        pname1=sc.nextLine();
        System.out.println("Enter Captain Name of Team 2 : ");
        pname2=sc.nextLine();
        System.out.println("Enter Toss Winner : ");
        tw=sc.nextLine();
        System.out.println("Enter Weather during the Match: ");
        weather = sc.nextLine();
        System.out.println("Enter Temperature during the Match : ");
        temp=sc.nextLine();
        System.out.println("Enter the Choice of Toss Winning Team : (Batting/Bowling) : ");
        cc=sc.nextLine();
        System.out.println("\n\nHello Viewers! We are here at "+venue+" to enjoy the "+tmatch+" match between"+tname1+" and "+tname2+"!");
        System.out.print("This gentle "+weather+" weather is anticipating the result of today's match. It's Late Evening right now. The Temperature is");
        System.out.print(" "+temp+" degree and it looks as if it is going to be quite pleasant for players.\nThe team captains "+pname1+" and ");
        System.out.print(pname2+" arrived for toss and...."+tw+" has won the toss, and they have chosen to "+cc+" .\n\n");
    }
    public static void predict_runs()
    {
        System.out.println("********Predict Runs for the Team********");
        System.out.println("Enter Team Name : ");
        tname1=sc.nextLine();
        System.out.println("Enter Details for the Last 10 Matches (1 - Win, 0 - Draw, -1 - Lose) : ");
        for(i=0;i<10;i++)
        {
            System.out.println("Enter Detail of Match "+(i+1)+" : ");run=sc.nextInt();sum=sum+runs;
            if(run==1)
            c1++;
            else if(run==-1)
            cn1++;
            else if(run==0)
            c0++;
        }
        System.out.println("Total Points : "+sum);
        if(c1>cn1 && c1>c0)
        System.out.println(tname1+" will won the Match\n");
        else if(cn1>c1 && cn1>c0)
        System.out.println(tname1+" will lose the Match\n");
        else 
        System.out.println(tname1+" decision depend on toss\n");
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int choice;
        System.out.println("********Welcome********\n********CRICKET MATCH********");
        while(true)
        {
            System.out.println("Enter : \n1. Last over runs data\n2. Average runs for the last over\n3. Details of the players");
            System.out.println("4. Details of the match\n5. Predict runs for the team\n6. Exit");
            System.out.println("Enter Your Choice : ");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1 : last_over_runs();break;
                case 2 :Average_runs();break;
                case 3 : player_details();break;
                case 4 : match_details();break;
                case 5 : predict_runs();break;
                case 6 : System.exit(0);break;
                default : System.out.println("Invalid Choice");
            }
        }
    }
}