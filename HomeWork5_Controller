package Module_5;

public class Controller {
    private API apisk[]=new API[3];

    public Controller() {
        apisk[2]=new APIImpl3();
        apisk[0]=new APIImpl();
        apisk[1]=new APIImpl2();

    }

    //**
    public Room[] requestRooms(int prace, int persons, String city, String hotel){
        Room[] rm2=apisk[0].findRooms(prace, persons, city, hotel);
        Room[] rm3=apisk[1].findRooms(prace, persons, city, hotel);
        Room[] rm1=apisk[2].findRooms(prace, persons, city, hotel);
        Room[] rms=new Room[rm1.length+rm2.length+rm3.length];

        DAOImpl dao=new DAOImpl();
        int cout=0;
        for(int i=0;i<rm1.length;i++){
            rms[cout]=rm1[i];
            //dao.save(rms[cout]);
            cout++;
        }

        for(int i=0;i<rm2.length;i++){
            rms[cout]=rm2[i];
            //dao.save(rms[cout]);
            cout++;
        }

        for(int i=0;i<rm3.length;i++){
            rms[cout]=rm3[i];
            //dao.save(rms[cout]);
            cout++;
        }


        return rms;
    }//**/



    public Room[] check(API api1,API api2){
        Room[] komnata=api1.getRooms();
        Room[] komnata1=api2.getRooms();

        Room[] roomiks=new Room[1000];
        int count=0;
        for(int i=0;i<komnata.length;i++){
            for (int j=i;j<komnata.length;j++){
                if(komnata[i].equals(komnata1[j])){
                    roomiks[count]=komnata[j];
                    count++;
                }
            }
        }

        return roomiks;
    }
}

