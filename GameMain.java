package abstarctGame_hp;
import java.util.Scanner;

public class GameMain {
    public static void main(String[] args) {

//        Picachu picachu = new Picachu();
//        Lee lee = new Lee();
//        GGobook ggobook = new GGobook();

        Scanner sc = new Scanner(System.in);

        Character character = null;
        PlayGame pg = null;

        System.out.println("원하는 캐릭터를 선택하세요");
        System.out.println("1. 피카츄 , 2. 꼬북이 , 3. 이상해씨");
        int x  = sc.nextInt();

        switch (x)
        {
            case 1:
                character = new Picachu();
                break;

            case 2:
                character = new GGobook();
                break;

            case 3:
                character = new Lee();
                break;

            default:
                System.out.println("잘못선택함 다시하삼");
        }

        if( character == null )
        {
            System.out.println("게임을 종료합니당");
            return;
        } else
        {
            pg = new PlayGame(character);
            // 인자로 보냄
        }



        while( pg.isExit()==false )
        {
            pg.printMenu(sc);

//            if(pg.isExit()==true)
//            {
//                System.out.println("게임프로그램을 종료합니다");
//                break;
//            }else
//            {
//                // 프로그램을 그대로 진행함 -> 유저가 게임을 다시 선택해야함
//                pg.printMenu(sc);
//            }
        }

        System.out.println("게임프로그램을 종료합니다");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();




    } // main()
} // GameMain
