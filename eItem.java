
package electronic.sho;

public class eItem {

    public eItem() {
    }
    private String name;
    private int minUserAge;
    private boolean hasBatteries;
    private double price;
    public boolean isForKids()
    {
        if(minUserAge<11)
        {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return name +" " + minUserAge +" " + hasBatteries + " "+ price +"\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinUserAge() {
        return minUserAge;
    }

    public void setMinUserAge(int minUserAge) {
        this.minUserAge = minUserAge;
    }

    public boolean isHasBatteries() {
        return hasBatteries;
    }

    public void setHasBatteries(boolean hasBatteries) {
        this.hasBatteries = hasBatteries;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

       
    
    public eItem(String name, int minUserAge, boolean hasBatteries, double price) {
        this.name = name;
        this.minUserAge = minUserAge;
        this.hasBatteries = hasBatteries;
        this.price = price;
    }
    
}
