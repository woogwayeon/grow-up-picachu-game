package abstarctGame_hp;

public class Picachu extends Character{

    public Picachu()
    {
        name = "피카츄";
        hp = 30;
        energy = 50;
        // 레벨은 안주고
        System.out.println("Picachu 캐릭터가 생성되었습니다");
        System.out.println();
        System.out.print("피카츄");
        printInfo();
    }

    public void eat()
    {
        energy = energy + 10;
    }
    // 먹는 일을 해요

    public void sleep()
    {
        energy = energy + 5;
    }// 자는 일을 해요

    public void levelUp()
    {
        if( hp >= 40 )
        {
            level++;
            hp = hp - 40;
        }
//        System.out.println("level = " + level +" hp = " + hp);
//        System.out.println();
    }
    // 경험치가 얼만큼 차면 레벨이 올라가고

    public boolean play()
    {
        energy = energy - 20;
        hp = hp + 5;
        levelUp();

        return checkEnergy();
    };
    // 놀다가 너무 많이 놀면 죽을수도 있음 - 죽을 수 있는지 아닌지 리턴받음

    public boolean train()
    {
        energy = energy - 15;
        hp = hp + 20;
        levelUp();

        return checkEnergy();
    };
    // 훈련도 하다 죽을수 있음 중간중간 체크하며 확인
}
