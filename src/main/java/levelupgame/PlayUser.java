package levelupgame;

import java.util.Scanner;

public class PlayUser {

    MyDog myDog = new MyDog();

    public void printInfo(PlayUserDTO playerInfo, MyDogDTO myDogInfo){
        System.out.println("\n현재 "+playerInfo.getName()+"님의 강아지 "+ myDogInfo.getName()+"의 현재 상태는");
        System.out.print("배부름: ");

        for (int i=0; i<myDogInfo.getFull(); i++){
            System.out.print("|||||||");
        }

        for (int i=0; i<10 - myDogInfo.getFull(); i++){
            System.out.print("|-----|");
        }

        System.out.print("\n애정도: ");

        for (int i=0; i<myDogInfo.getLove(); i++){
            System.out.print("|||||||");
        }

        for (int i=0; i<10 - myDogInfo.getLove(); i++){
            System.out.print("|-----|");
        }
    }

    public void feeding(MyDogDTO myDogInfo){
        System.out.println("주인: 강아지 밥주는 중\n");

        myDog.eating(myDogInfo,myDogInfo.getFull());
    }

    public void with(MyDogDTO myDogInfo){
        System.out.println("주인: 강아지 놀아주는 중\n");

        myDog.playing(myDogInfo,myDogInfo.getLove());
    }

    public void walking(MyDogDTO myDogInfo){
        System.out.println("주인: 강아지 산책하는 중\n");

        myDog.walking(myDogInfo,myDogInfo.getLove());
    }

    public void washing(MyDogDTO myDogInfo) {
        System.out.println("주인: 강아지 목욕시키는 중\n");

        myDog.washing(myDogInfo, myDogInfo.getLove(), myDogInfo.getFull());
    }

}
