package abstarctGame;
import java.util.Scanner;

public class PlayGame {

    private Character character;
    private int menu;
    private boolean exit;

    public PlayGame(Character character)
    {
        // 생성자에서 파라미터 받아옴
        this.character = character;
    }

    void printMenu(Scanner sc)
    {
        System.out.println("할 일을 선택하세요");
        System.out.println("1. 밥먹기, 2. 코코낸내, 3. 놀아주기, 4. 헬스장가기, 5. 종료하기");
        System.out.println();
        menu = sc.nextInt();

        play();
    }


    public void play()
    {
        switch (menu)
        {
            case 1: // 밥먹기
                character.eat();
                break;

            case 2: // 코코낸내
                character.sleep();
                break;

            case 3:  // 놀아주기
                exit = character.play();
                break;

            case 4 : // 헬스장
                exit = character.train();
                break;

            case 5 : // 종료하기
                exit = true;
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                break;

            default:
                System.out.println("잘못된 선택입니다. 다시 선택하세요");
                System.out.println();
                System.out.println();
                System.out.println();
        }
        System.out.print(character.name);
        character.printInfo(); // 캐릭터의 동작 후 상태를 확인함!
    }




    // 멤버가 private 이라 setter, getter 맨듦
    void setCharacter(Character character)
    {
        this.character = character;
    }

    Character getCharacter()
    {
        return character;
    }


    void setMenu(int menu)
    {
        this.menu=menu;
    }

    int getMenu()
    {
        return menu;
    }

    public boolean isExit()
    {
        // exit(멤버변수의) getter 역할을 함
        return exit;
    }

    public void setExit(boolean exit)
    {
        this.exit = exit;
    }

} // PlayGame


