
import java.util.*;
public class RelationshipManager {

    public RelationshipManager()
    {
        //Ask();
    }
    public void Ask()
    {
        System.out.println("\nWhat is the Command?");
    }
    public String[] Receive()
    {
        Scanner SCANNER = new Scanner(System.in);
        String x=SCANNER.nextLine();
        return x.split(" ");
    }

    public static void main(String []args)
    {
        RelationshipManager i=new RelationshipManager();
        String[][] nameList= new String[100][2];
        while(true)
        {
            i.Ask();
            String[] arr=i.Receive();
            //Create a 2 dimensional array and store the name and the relationship added

            //for (String x:arr) System.out.println(x);
            //System.out.println(arr[0]);
            if(arr[0].equals("add"))
            {
                if(arr.length<2)
                {
                    System.out.println("add command failed. e.g add Gerald OR add Gerald weekly");
                    continue;
                }
                int j;
                for(j=0;j<100;j++)
                {
                    if(nameList[j][0]==null)
                    {
                        nameList[j][0]=arr[1];
                        break;
                    }
                }
                switch (arr[2]){
                    case "weekly":
                        nameList[j][1]="weekly";
                        System.out.println("Person added to meet up weekly");
                        break;
                    case "monthly":
                        nameList[j][1]="monthly";
                        System.out.println("Person added to meet up monthly");
                        break;
                    case "quarterly":
                        nameList[j][1]="quaterly";
                        System.out.println("Person added to meet up quarterly(3 months)");
                        break;
                    case "halfyearly":
                        nameList[j][1]="weekly";
                        System.out.println("Person added to meet up every 6 months");
                        break;
                    case "yearly":
                        nameList[j][1]="yearly";
                        System.out.println("Person added to meet up yearly");
                        break;
                    case "biyearly":
                        nameList[j][1]="biyearly";
                        System.out.println("Person added to meet up biyearly");
                        break;
                    default:
                            break;
                }

            }
            else if(arr[0].equals("RManager"))
            {
                //System.out.println(arr[2]+" "+arr[1]);
                boolean real=false;
                if(arr.length<3)
                {
                    System.out.println("Please enter the correct command:\n e.g. RManager Gerald weekly");
                    continue;
                }
                for(int j=0;j<100;j++){
                    if(nameList[j][0]==null)break;
                    if(nameList[j][0].equals(arr[1]))
                    {
                        nameList[j][1]=arr[2];
                        System.out.println("You have updated "+arr[1]+" to "+arr[2]);
                        real=true;
                        break;
                    }

                }
                if(real==false)
                System.out.println("This person does not exist");
            }
            else if (arr[0].equals("list"))
            {
                System.out.println("Here are the names and routine meeting of people:\n");
                for (int j=0;j<100;j++)
                {
                    if (nameList[j][0]==null)break;
                    int z=j+1;
                    System.out.print( z+". "+ nameList[j][0] + " "+nameList[j][1]+"\n");
                }
            }

            else System.out.println("Command error, type again!");
        }

    }
}

