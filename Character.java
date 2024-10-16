package abstarctGame_hp;

public abstract class Character {

     /*
        성장 게임입니다
        일정 경험치가 쌓이면 레벨이 올라감
        캐릭터는 다마고치처럼 먹는 일을 함
     */

    protected String name; // 이름
    protected int hp;      // 체력
    protected int level;   // 레벨
    protected int energy;  // 에너지

    Character(){}

    public abstract void eat();       // 먹는 일을 해요
    public abstract void sleep();     // 자는 일을 해요
    public abstract void levelUp();   // 경험치가 얼만큼 차면 레벨이 올라가고
    public abstract boolean play();   // 놀다가 너무 많이 놀면 죽을수도 있음 - 죽을 수 있는지 아닌지 리턴받음
    public abstract boolean train();  // 훈련도 하다 죽을수 있음 중간중간 체크하며 확인

    public boolean checkEnergy()
    {
        boolean ret = false;
        if(energy <= 0)
        {
            ret = true;  // 에너지가 0보다 작으면 뒤짐니다..
            System.out.println("에너지가 " + energy + "이 되어 쓰러졌습니다");
            System.out.println();
        }
        else
        {
            ret = false;
        }
        return ret;
    }  // 에너지 체크는 여기서 정의


    public void printInfo()
    {
        System.out.println("의 정보 출력");
        System.out.println("=== * === * === * === * ===");
        System.out.println(" - hp = " + hp);
        System.out.println(" - energy = " + energy);
        System.out.println(" - level = " + level);
        System.out.println("=== * === * === * === * ===");
        System.out.println();
        // 더하기를 하면 String 타입으로 변환된다 !
    }

} // MakeGameMain

