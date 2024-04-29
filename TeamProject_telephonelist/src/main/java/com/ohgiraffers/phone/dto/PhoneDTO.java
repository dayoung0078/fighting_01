package main.java.com.ohgiraffers.phone.dto;

public class PhoneDTO {


    private String name;
    private int number;
    private String adress;

    public PhoneDTO(String name, int number, String adress) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress; }

public PhoneDTO(String name, int number, String adress){
            this.name = name;
            this.number = number;
            this.adress = adress;
    }



    @Override
    public String toString() {
        return "PhoneDTO{" +
                "name='" + name + '\\' ' +
        ", number=" + number +
                ", adress='" + adress + '\\' ' +
        '}';
    }

}



    //이름 정보 주소
    //게터세터
    //투스티링



