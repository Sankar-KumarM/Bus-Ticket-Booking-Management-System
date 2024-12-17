package Bus.Reservation;

public class Bus {
    private int busNo;
    private boolean ac;
    private int capacity; // we should put the get and set methods.


    Bus(int no, boolean ac, int cap){
        this.busNo=no;
        this.ac=ac;
        this.capacity=cap;
    }

    public int getBusNo() {
        return busNo;
    }

    public void setBusNo(int no) {
        busNo = no;
    }

    public boolean isAC() {
        return ac;
    }

    public void setAC(boolean ac) {
        ac = ac;
    }

    public int getCapacity() {  //accessor method
        return capacity;
    }

    public void setCapacity(int cap) { // mutator method
        capacity = cap;
    }

    public void dispplayBusInfo(){
        System.out.println("Bus No: "+busNo+"; Ac: "+ ac+ "; Total Capacity: "+capacity);

    }
}


