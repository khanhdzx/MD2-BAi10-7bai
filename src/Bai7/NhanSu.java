package Bai7;

public class NhanSu {
    private String name;
    private String genDer;
    private int birthDay;

    public NhanSu() {
    }

    public NhanSu(String name, String genDer, int birthDay) {
        this.name = name;
        this.genDer = genDer;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenDer() {
        return genDer;
    }

    public void setGenDer(String genDer) {
        this.genDer = genDer;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "NhanSu { " +
                "name = " + name + '\'' +
                ", genDer = " + genDer + '\'' +
                ", dateOfBirth = " + birthDay +
                '}';
    }
}

