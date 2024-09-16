package levelupgame;

import java.util.Scanner;

public class Play {

    static Scanner sc = new Scanner(System.in);

    public static void gameStart(){

        // 기본 세팅
        System.out.print("player님의 이름을 입력해주세요: ");
        String playerName = sc.nextLine();

        PlayUserDTO playerInfo = new PlayUserDTO(playerName);
        PlayUser player = new PlayUser();

        System.out.print("강아지의 이름을 입력해주세요: ");
        String MyDogName = sc.nextLine();

        MyDogDTO myDogInfo = new MyDogDTO(MyDogName);

        while (true){
            player.printInfo(playerInfo, myDogInfo);
            
            System.out.println("\n\n원하는 사용자 행동을 선택해주세요.(번호로 입력해주세요.)");
            System.out.println("1. 강아지 밥주기");
            System.out.println("2. 강아지 놀아주기");
            System.out.println("3. 강아지 산책시키기");
            System.out.println("4. 강아지 목욕시키기");
            System.out.println("5. 강아지 상태 확인하기");
            System.out.println("6. 게임 종료하기");

            System.out.print("\n입력: ");

            int num = sc.nextInt();

            if (num == 1){
                player.feeding(myDogInfo);
            } else if (num == 2){
                player.with(myDogInfo);
            } else if (num == 3){
                player.walking(myDogInfo);
            } else if (num == 4){
                player.washing(myDogInfo);
            } else if (num == 5){
                continue;
            } else if (num == 6){
                break;
            }

            if (myDogInfo.getLove() == 10 && myDogInfo.getFull()==10){
                myDogInfo.setLevel(myDogInfo.getLevel()+1);
                System.out.println("\n강아지의 레벨이 올라갔어요!!!!");
                System.out.println("현재 강아지의 레벨: "+myDogInfo.getLevel());
                myDogInfo.setLove(0);
                myDogInfo.setFull(0);
            }

            if (myDogInfo.getLevel() == 2){
                System.out.println("강아지는 현재 청소년기입니다!");
            } else if (myDogInfo.getLevel() == 3){
                System.out.println("강아지가 성견이 됐습니다. 그동안 수고하셨습니다!!");
                break;
            }
        }
    };
}
