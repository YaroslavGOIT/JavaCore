package Module_5;

import  java.util.Date;
public class APIImpl3 implements API {
    private Room rt1=new Room(13451L,124,5,new Date(12,325,4),"Vitek","Bubka");
    private Room rt2=new Room(13451L,124,5,new Date(12,325,4),"Vitek","Bubka");
    private Room rt3=new Room(13451L,124,5,new Date(12,325,4),"Vitek","Bubka");
    private Room rt4=new Room(13451L,124,5,new Date(12,325,4),"Vitek","Bubka");
    private Room rt5=new Room(13451L,124,5,new Date(12,325,4),"Vitek","Bubka");

    private Room rooms[]=new Room[]{rt1, rt2, rt3, rt4, rt5};
    public APIImpl3() {
    }

    @Override
    public Room[] findRooms(int prace, int persons, String city, String hotel) {
        Room foundRoom[]=new Room[100];
        for(Room item:rooms){
            boolean cvr=item.getPrice()==prace && item.getPersons()==persons;
            boolean cvr1= city==item.getCityName() && item.getHotelName()==hotel;
            int cout=0;
            if(cvr&&cvr1){
                foundRoom[cout]=item;
                cout++;
            }
        }
        if(foundRoom==null){
            foundRoom[0]=new Room(0,0,0,new Date(0,0,0),"Nothing","Nothing");
        }
        return foundRoom;
    }

    @Override
    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public Room getRt1() {
        return rt1;
    }

    public void setRt1(Room rt1) {
        this.rt1 = rt1;
    }

    public Room getRt2() {
        return rt2;
    }

    public void setRt2(Room rt2) {
        this.rt2 = rt2;
    }

    public Room getRt3() {
        return rt3;
    }

    public void setRt3(Room rt3) {
        this.rt3 = rt3;
    }

    public Room getRt4() {
        return rt4;
    }

    public void setRt4(Room rt4) {
        this.rt4 = rt4;
    }

    public Room getRt5() {
        return rt5;
    }

    public void setRt5(Room rt5) {
        this.rt5 = rt5;
    }
}
