package levelupgame;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        // 게임 진행 과정(Application)
        /*
        * 1. 환영 멘트 뿌리기(선택사항)
        * 2. 게임을 시작 할껀지 물어본다.
        * 2-1. start를 입력하면 게임 시작 그 외는 다시 임력하도록 유도한다.
        *
        * 3. 게임이 시작되면  PlayUser로 넘어가 유저 정보의 세팅을 시작한다.
        * 4. 현재 강아지(MyDog)의 상태를 출력해주며 사용자의 행동 가능 목록을 출력한다.
        * */

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("게임에 접속하신걸 환영합니다.");
            System.out.println("게임을 진행하시려면 start를 입력하주세요.");
            System.out.print("입력: ");

            String input = sc.nextLine();

            if (input.toUpperCase().equals("START")){
                Play.gameStart();
                break;
            }       // start를 입력할때 까지 반복
        }

    }
}
