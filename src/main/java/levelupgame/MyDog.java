package levelupgame;

import java.util.Scanner;

public class MyDog {

    public void eating(MyDogDTO myDogInfo, int full){
        if (full == 10){
            System.out.println("강아지: 퉤, 안먹어 퉤퉤!!! 이미 배부르다 멍!!!!");
        } else{
            myDogInfo.setFull(full+1);
            System.out.println("강아지: 흐음...배가 불러온다 멍...좋다 멍!!!!🍗");
        }
    }

    public  void playing(MyDogDTO myDogInfo, int love){
        if (love == 10){
            System.out.println("강아지: 놀기 싫다 멍. 나는 혼자만의 시간이 필요하다 멍.");
        }else {
            System.out.println("강아지: 같이 노는거 너무 좋다!!! 멍!!!!!");
            myDogInfo.setLove(love+1);
        }
    }

    public void walking(MyDogDTO myDogInfo, int love){
        if (love == 10){
            System.out.println("강아지: 싫다 멍. 안나간다 멍. 나가기 싫다!!!");
        }else {
            System.out.println("강아지: 같이 산책 많이 하자 멍❤️");
            myDogInfo.setLove(love+1);
        }
    }

    public void washing(MyDogDTO myDogInfo, int love, int full){
        if (love == 0){
            System.out.println("강아지: 이미 사랑이 없다.. 됐다 저리 가라 멍.. 미워..");
        } else {
            System.out.println("강아지: 내가 더러웠어 멍..?");
            myDogInfo.setLove(love-1);
        }

        if (full == 0){
            System.out.println("강아지: 이미 배고파 죽기 직전이다 멍....☠️");
        } else{
            System.out.println("강아지: 한바탕하니 배가 고프다...");
            myDogInfo.setFull(full-1);
        }
    }


}
