public class School{
    private String name;
    private Address address;
    private int years;
    private boolean graduated;
    private String major;
    private String degree;

    public School(String name, Address address, int years, boolean graduated, String major, String degree){
        this.name = name;
        this.address = address;
        this.years = years;
        this.graduated = graduated;
        this.major = major;
        this.degree = degree;
    }
}