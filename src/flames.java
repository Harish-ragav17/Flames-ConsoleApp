import java.util.Scanner;
import java.util.*;
class flames {
    static int count=0,total=0,done=0;
    static char[] fl ={'F','L','A','M','E','S'};
    static Scanner inp= new Scanner(System.in);
    public static void Flames(int iteration)
    {  int count=1,i=0;
        System.out.println(iteration);
        while(true){
            if(fl[i]=='.') {
                if (i == 5) {
                    i = 0;
                } else {
                    i++;
                }
            }
            else if(count==iteration)
            {  fl[i]='.';
                done++;
                System.out.println(fl);
                count=1;
                if(i==5)
                {
                    i=0;
                }
                else
                {
                    i++;
                }
                if(done==5)
                {
                    for(int x=0;x<5;x++)
                    {
                        if(fl[x]!='.')
                        {
                            switch(fl[x]){
                                case 'F':
                                    System.out.println("Friend");
                                    break;
                                case 'L':
                                    System.out.println("Love");
                                    break;
                                case 'A':
                                    System.out.println("Affection");
                                    break;
                                case 'M':
                                    System.out.println("Marraige");
                                    break;
                                case 'E':
                                    System.out.println("Enemy");
                                    break;
                                case 'S':
                                    System.out.println("Sister");
                                    break;
                            }
                        }
                    }
                    break;
                }

            }
            else if(i==5)
            {
                i=0;
                count++;
            }
            else {
                i++;
                count++;
            }
            // System.out.print("Count: "+count+" "+"i:"+i+" "+done);
        }
    }
    public static void samechar(String name1,String name2)
    {   total=name1.length()+name2.length();
        char na1[]=name1.toLowerCase().toCharArray();
        char na2[]=name2.toLowerCase().toCharArray();
       // char temp = ' ';
        for(int i=0;i<name1.length();i++)
        {
            for(int j=0;j<name2.length();j++)
            {
                if (na1[i]==na2[j])
                {
                    na2[j]='.';
                    na1[i]='.';
                    count++;
                    break;
                    /*for(int k=0;k<name1.length();k++)
                    {
                        if(na1[k]==temp)
                        {
                            na1[i]='.';
                        }
                }*/
            }

            }
        }
        System.out.println(na1);
        System.out.println(na2);
        Flames((total-count));

    }

    public static void main(String[] args) {
        samechar(inp.nextLine(), inp.nextLine());

    }
}
