import java.util.Scanner;
/*
Import plz;
*/
class Return999{
protected int a(int a){
    if(a!=999){
    a=999;
    }
    return a;
};
public static void main(String args[]){
      Return999 c=new Return999();
      Scanner s=new Scanner(System.in);
      System.out.println(c.a(1));
      }
}
