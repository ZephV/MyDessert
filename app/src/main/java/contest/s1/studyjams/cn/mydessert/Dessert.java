package contest.s1.studyjams.cn.mydessert;

public class Dessert {

    private String name;

    private int imageId;

    public Dessert(String name,int imageId){

        this.name = name;

        this.imageId = imageId;
    }

    public String getName(){
        return name;
    }

    public int getImageId(){
        return imageId;
    }
}
