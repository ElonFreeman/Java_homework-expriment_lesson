package school.address;

public class address {
 
    private String city,street;

    public address(String city,String street)
    {
        this.city = city;
        this.street = street;
    }
    public void showaddress()
    {
        System.out.println(city + ' ' + street);
    }
}
