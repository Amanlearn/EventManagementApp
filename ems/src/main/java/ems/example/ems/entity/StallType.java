package ems.example.ems.entity;

public class StallType {
    private String foodStall;
    private String clothStall;
    private String bookStall;
    private String jewelleryStall;
    private String footStall;
    private String ToyStall;

    public StallType() {
    }

    public StallType(String foodStall, String clothStall, String bookStall, String jewelleryStall, String footStall, String toyStall) {
        this.foodStall = foodStall;
        this.clothStall = clothStall;
        this.bookStall = bookStall;
        this.jewelleryStall = jewelleryStall;
        this.footStall = footStall;
        ToyStall = toyStall;
    }

    public String getFoodStall() {
        return foodStall;
    }

    public void setFoodStall(String foodStall) {
        this.foodStall = foodStall;
    }

    public String getClothStall() {
        return clothStall;
    }

    public void setClothStall(String clothStall) {
        this.clothStall = clothStall;
    }

    public String getBookStall() {
        return bookStall;
    }

    public void setBookStall(String bookStall) {
        this.bookStall = bookStall;
    }

    public String getJewelleryStall() {
        return jewelleryStall;
    }

    public void setJewelleryStall(String jewelleryStall) {
        this.jewelleryStall = jewelleryStall;
    }

    public String getFootStall() {
        return footStall;
    }

    public void setFootStall(String footStall) {
        this.footStall = footStall;
    }

    public String getToyStall() {
        return ToyStall;
    }

    public void setToyStall(String toyStall) {
        ToyStall = toyStall;
    }

    @Override
    public String toString() {
        return "StallType{" +
                "foodStall='" + foodStall + '\'' +
                ", clothStall='" + clothStall + '\'' +
                ", bookStall='" + bookStall + '\'' +
                ", jewelleryStall='" + jewelleryStall + '\'' +
                ", footStall='" + footStall + '\'' +
                ", ToyStall='" + ToyStall + '\'' +
                '}';
    }
}
