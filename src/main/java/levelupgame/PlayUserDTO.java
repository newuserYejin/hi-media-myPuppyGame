package levelupgame;

public class PlayUserDTO {

    private String name;
    private int coin;

    public PlayUserDTO(String name) {
        this.name=name;
        this.coin=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCoin() {
        return coin;
    }

    @Override
    public String toString() {
        return name+"의 현재 보유 coin은 " + coin + "입니다.";
    }

}
