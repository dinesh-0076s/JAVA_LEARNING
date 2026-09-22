public class controlstructure{
    public static void main(String[]args){
        int a=10;
        int b=20;
        if(a>b){
            System.out.println("A is greater");

        }
        else{
            System.out.println("B is greater");
        }
        char grade;
        int score=90;
        if(score>=90){
            grade='A';

        }
        else if(score>=80){
            grade='b';

        }
        else if(score>=70){
            grade='c';

        }
        else{
            grade='d';
        }
        int choice=2;
        switch(choice){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
            System.out.println("other");
                break;           
        }
        for (int i=1;i<=10;i++){
            System.out.println(i);
        }
        for (int i=1;i<=10;i++){
            if(i==5){
                break;
            }
            System.out.println(i);

        }
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;

        }
        int j=1;
        do{
            System.out.println(j);
            j++;
        }
        while(j<=10);

    }
}