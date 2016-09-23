package Module_5;

import java.util.Date;

/**
 * Created by admin-pc on 23.09.2016.
 */
class APIImpl implements API {
    private Room rooms[];

    public APIImpl() {
        Room rb1=new Room(13451L,124,5,new Date(12,325,4),"Vitek","Bubka");
        Room rb2=new Room(13451L,124,5,new Date(12,325,4),"Vitek","Bubka");
        Room rb3=new Room(13451L,124,5,new Date(12,325,4),"Vitek","Bubka");
        Room rb4=new Room(13451L,124,5,new Date(12,325,4),"Vitek","Bubka");
        Room rb5=new Room(13451L,124,5,new Date(12,325,4),"Vitek","Bubka");
        rooms=new Room[]{rb1,rb2,rb3,rb4,rb5};
    }

    @Override
    public Room[] findRooms(int prace, int persons, String city, String hotel) {
        Room foundRoom[]=new Room[10];
        int cout=0;
        for(Room item:rooms){
            boolean cvr=item.getPrice()==prace && item.getPersons()==persons;
            boolean cvr1= city==item.getCityName() && item.getHotelName()==hotel;
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

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }
}
