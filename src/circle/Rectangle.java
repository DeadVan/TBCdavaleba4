package circle;

public class Rectangle {
    private int length;
    private int width;
    public static final int maxLength;
    public static final int maxWidth;

    static {
        maxLength = 15;
        maxWidth = 9;
    }
    public static Rectangle MaxS (Rectangle[] obieqti){
        Rectangle maxs = obieqti[0];
        for (int i =0; i< obieqti.length; i++){
            if(obieqti[i].getS()>maxs.getS()){
                maxs = obieqti[i];
            }
        }
        return maxs;
    }

    public Rectangle(int length){
        setLength(length);
    }
    public Rectangle(int length, int width){
        setLength(length);
        setWidth(width);
    }

//    public Rectangle() {
//        this.width = 7;     პარამეტრიანი კონსტრუქტორი
//    }


    public void setLength(int length) {
        if (length <= maxLength) {
            this.length = length;
        }else {
            this.length = maxLength;
        }
    }

    public void setWidth(int width) {
        if (width <= maxWidth) {
            this.width = width;
        }else {
            this.width = maxWidth;
        }
    }

    public int getS() {
        return length*width;
    }
}
