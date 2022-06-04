import java.util.Scanner;
import java.util.Random;
import java.lang.String;
 class Rps{
    int usr,usrs;
    int com,coms;
    String us,co,desi;
    Rps(int u, int c){
        usr=u;
        com=c;
    }
   String userna(){
        switch(usr){
            case 1:us="You Have Choose |Rock|";
            break;
            case 2:us="You Have Choose |Paper|";
            break;
            case 3:us="You Have Choose |Scissor|";
            break;
            default:us="You Have Entered Wrong Letter";
        }
        return us;
    }
    String compna(){
        if(usr==1 || usr==2 || usr==3){
        switch(com){
            case 0:co="I Have Choosen |Rock|";
            break;
            case 1:co="I Have Choosen |Paper|";
            break;
            case 2:co="I Have Choosen |Scissor|";
            break;
        }
        return co;
    }
    else{
        co="Go To hell";
        return co;
    }
    }
    String windesi(){
        if(usr==1 && com==0){
            desi="Match Draw";
        }
        else if(usr==1 && com==1){
            desi="I Win";
        }
        else if(usr==1 && com==2){
            desi="You Win";
        }
        if(usr==2 && com==0){
            desi="You Win";
        }
        else if(usr==2 && com==1){
            desi="Match Draw";
        }
        else if(usr==2 && com==2){
            desi="I Win";
        }
        if(usr==3 && com==0){
            desi="I Win";
        }
        else if(usr==3 && com==1){
            desi="You Win";
        }
        else if(usr==3 && com==2){
            desi="Match Draw";
        }
        return desi;
    }
    int usrscore(){
        if(desi=="Match Draw" || desi=="I Win"){
            usrs=usrs+0;
        }
        else if(desi=="You Win"){
            usrs=usrs+1;
        }
        return usrs;
    }
    int comscore(){
        if(desi=="Match Draw" || desi=="You Win"){
            coms=coms+0;
        }
        else if(desi=="I Win"){
            coms=coms+1;
        }
        return coms;
    }
 }
 public class RockPaperScissors{
    public static void main(String[] args) {
        int comp,user,i=1,j,userscore=0,compscore=0;
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        System.out.println("-------------------------");
        System.out.println("| Rock | Paper | Scissor |");
        System.out.print("-------------------------\t");
        System.out.println("Welcome To The Game....");
        System.out.println("How Many Rounds Do You Need..");
        j=sc.nextInt();
        while(i<=j){
        System.out.println("Enter The Number");
        System.out.println("-------------------------------");
        System.out.println("| 1.Rock | 2.Paper | 3.Scissor |");
        System.out.println("-------------------------------");
        System.out.println("-----------------");
        System.out.println("| Round " + i+" |");
        System.out.println("----------------");
        i=i+1;
        comp=ra.nextInt(3);
        user=sc.nextInt();
        Rps rp = new Rps(user, comp);
        System.out.println(rp.userna());
        System.out.println(rp.compna());
        System.out.println(rp.windesi());
        userscore= userscore + rp.usrscore();
        compscore= compscore + rp.comscore();
        System.out.println("\t\t\t\t ----------------");
        System.out.println("\t\t\t\t|   Score Board  |");
        System.out.println("\t\t\t\t ----------------");
        System.out.println("\t\t\t\t| You    |    Me |");
        System.out.println("\t\t\t\t|        |       |");
        System.out.print("\t\t\t\t| " + userscore  );
        System.out.print("      |    ");
        System.out.print(compscore);
        System.out.println("  |");
        System.out.println("\t\t\t\t|        |       |");
        System.out.println("\t\t\t\t ----------------");
        }
        if(userscore>compscore){
 
     System.out.println("   ███████████████████████████████████████████  ");
     System.out.println("   █▄─█─▄█─▄▄─█▄─██─▄███▄─█▀▀▀█─▄█▄─▄█▄─▀█▄─▄█ ");
     System.out.println("   ██▄─▄██─██─██─██─█████─█─█─█─███─███─█▄▀─██ ");
     System.out.println("   ▀▀▄▄▄▀▀▄▄▄▄▀▀▄▄▄▄▀▀▀▀▀▄▄▄▀▄▄▄▀▀▄▄▄▀▄▄▄▀▀▄▄▀  ");
        }
        else if(userscore==compscore){

            System.out.println("█████████████████████████████████████████████████████████████");
            System.out.println("█▄─▀█▀─▄██▀▄─██─▄─▄─█─▄▄▄─█─█─███▄─▄▄▀█▄─▄▄▀██▀▄─██▄─█▀▀▀█─▄█");
            System.out.println("██─█▄█─███─▀─████─███─███▀█─▄─████─██─██─▄─▄██─▀─███─█─█─█─██");
            System.out.println("▀▄▄▄▀▄▄▄▀▄▄▀▄▄▀▀▄▄▄▀▀▄▄▄▄▄▀▄▀▄▀▀▀▄▄▄▄▀▀▄▄▀▄▄▀▄▄▀▄▄▀▀▄▄▄▀▄▄▄▀▀");
        }
        else{

            System.out.println("█████████████████████████████");
            System.out.println("█▄─▄███▄─█▀▀▀█─▄█▄─▄█▄─▀█▄─▄█");
            System.out.println("██─█████─█─█─█─███─███─█▄▀─██");
            System.out.println("▀▄▄▄▀▀▀▀▄▄▄▀▄▄▄▀▀▄▄▄▀▄▄▄▀▀▄▄▀");
        }
    }

}