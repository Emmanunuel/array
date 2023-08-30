public class ArrayLesson{
    public static void main(String[] args){
        //std marks on 6 subjects

        // int[] marks=new int[6];
        // marks[0]=50;
        // marks[1]=60;
        // marks[2]=50;
        // marks[3]=80;
        // marks[4]=70;
        // marks[5]=90;

        // String[] names=new String[6];
        // names[0]="Uzor";
        // names[1]="Kay";
        // names[2]="Jerry";
        // names[3]="Manny";
        // names[4]="Teddy";
        // names[5]="Nath";
        // for (String n:names){
        //     System.out.println(n + "," + " " );
        // }
        String[] Month= {
            "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"
        };
        int i = 1;
        while(i<=12)
        for(String n:Month){
            System.out.println(i + "-" + n);
            i++;
        }
        }
    }