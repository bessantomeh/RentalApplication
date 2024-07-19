package rentalapplication;

abstract class Building {
     private String address;
     private String name;
     private double size;
     
     public Building(String address, String name, double size){
         this.address=address;
         this.name=name;
         this.size=size;
     }
     
     public String getAddress() {
        return address;
    }
     
    public String getName() {
        return name;
    }
    
    public double getSize() {
        return size;
    }
    
    @Override
    public String toString() {
        return name + " at " + address;
    }

}
