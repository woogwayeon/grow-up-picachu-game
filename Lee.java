package abstarctGame_hp;

public class Lee extends Character {

    public Lee()
    {
        name = "이상해씨";
        hp = 20;
        energy = 30;
        // 레벨은 안주고
        System.out.println("Lee 캐릭터가 생성되었습니다");
        System.out.println();
        System.out.print("이상해씨");
        printInfo();
    }

    public void eat()
    {
        energy = energy + 5;
    }

    public void sleep()
    {
        energy = energy + 20;
    }

    // level = hp 35마다 증가
    public void levelUp()
    {
        if(hp >= 35)
        {
            level++;
            hp = hp - 35;
        }
        System.out.println("level = " + level +" hp = " + hp);
        System.out.println();
    }

    public boolean play()
    {
        energy = energy - 10;
        hp = hp + 15;
        return checkEnergy();
    }

    public boolean train()
    {
        energy = energy - 10;
        hp = hp + 20;
        levelUp();

        return checkEnergy();
    }

}
