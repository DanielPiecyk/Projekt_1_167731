import java.util.Scanner;
class Main {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    int sterowanie;
    double pom1,pom2,wynik;
    do{
    System.out.println("1. Oblicz pole kwadratu ");
    System.out.println("2. Oblicz pole prostokąta");
    System.out.println("3. Oblicz pole trójkąta");
    System.out.println("4. Oblicz pole koła");
    System.out.println("5. Zakończ ");
    sterowanie = sc.nextInt();
      switch(sterowanie)
        {
          case 1 : 
            {
              System.out.println("podaj a :");
              pom1 = sc.nextDouble();
              wynik = pom1*pom1;
              System.out.println("wynik : "+ wynik);
              break;
            }
          case 2 : 
            {
              System.out.println("podaj a :");
              pom1 = sc.nextDouble();
              System.out.println("podaj b :");
              pom2 = sc.nextDouble();
              wynik = pom1*pom2;
              System.out.println("wynik : "+ wynik);
              break;
            }
          case 3 : 
            {
              System.out.println("podaj a :");
              pom1 = sc.nextDouble();
              System.out.println("podaj h :");
              pom2 = sc.nextDouble();
              wynik = (pom1*pom2)/2;
              System.out.println("wynik : "+ wynik);
              break;
            }
          case 4 : 
            {
              System.out.println("podaj r :");
              pom1 = sc.nextDouble();
              wynik = pom1*pom1*3.14;
              System.out.println("wynik : "+ wynik);
              break;
            }
            case 5 : {break;}
          default :
            {
              System.out.println("wprowadzono złą wartość ");
              break;
            }
        }
      
    }while(sterowanie!=5);
    sc.close();
  }
}