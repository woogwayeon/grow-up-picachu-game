package abstarctGame_hp;

public class GGobook extends Character{

    public GGobook()
    {
        name = "꼬부기";
        hp = 40;
        energy = 50;
        // 레벨은 안주고
        System.out.println("GGobook 캐릭터가 생성되었습니다");
        System.out.println();
        System.out.print("꼬부기");
        printInfo();
    }

    public void eat()
    {
        energy = energy + 15;
    }

    public void sleep()
    {
        energy = energy + 10;
    }

    // level = hp 50마다 증가
    public void levelUp()
    {
        if(hp >= 50)
        {
            level++;
            hp = hp - 50;
        }
        System.out.println("level = " + level +" hp = " + hp);
        System.out.println();
    }

    public boolean play()
    {
        energy = energy - 30;
        hp = hp + 15;
        return checkEnergy();
    }

    public boolean train()
    {
        energy = energy - 20;
        hp = hp + 30;
        levelUp();
        
        return checkEnergy();
    }
}
