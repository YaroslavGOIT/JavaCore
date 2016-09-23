package Module_5;


import java.util.Date;
class APIImpl2 implements API {
    private Room rooms[];
    APIImpl2() {
        Room rg1=new Room(13451L,124,5,new Date(12,325,4),"Vitek","Bubka");
        Room rg2=new Room(13451L,124,5,new Date(12,325,4),"Vitek","Bubka");
        Room rg3=new Room(13451L,124,5,new Date(12,325,4),"Vitek","Bubka");
        Room rg4=new Room(13451L,124,5,new Date(12,325,4),"Vitek","Bubka");
        Room rg5=new Room(13451L,124,5,new Date(12,325,4),"Vitek","Bubka");

        rooms=new Room[]{rg1,rg2,rg3,rg4,rg5};
    }

    @Override
    public Room[] findRooms(int prace, int persons, String city, String hotel) {
        Room foundRoom[]=new Room[100];
        for(Room item:rooms){
            boolean cvr=item.getPrice()==prace && item.getPersons()==persons;
            boolean cvr1 = city==item.getCityName() && item.getHotelName()==hotel;
            int cout=0;
            if(cvr&&cvr1){
                foundRoom[cout]=item;
                cout++;
            }
        }
        return foundRoom;
    }

    public Room[] getRooms() {
        return rooms;
    }
}