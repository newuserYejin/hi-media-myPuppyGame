package levelupgame;

public class MyDogDTO {
    private String name;
    private int level = 1;
    private int full=9;
    private int love=9;

    public MyDogDTO() {}

    public MyDogDTO(String name) {
        this.name = name;
    }

    public int getFull() {
        return full;
    }

    public void setFull(int full) {
        this.full = full;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "MyDogDTO [name=" + name + ", level=" + level + ", full=" + full;
    }
}
