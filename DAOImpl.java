package Module_5;

/**
 * Created by admin-pc on 23.09.2016.
 */
class DAOImpl implements DAO {
    @Override
    public void save(Room room) {
        System.out.println("Room in hotel " + room.getHotelName() + " was save");
        //return room;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println("Room in hotel " + room.getHotelName() + " was delete");
        return false;
    }

    @Override
    public Room update(Room room) {
        System.out.println("Room in hotel " + room.getHotelName() + " was update");
        return room;
    }

    @Override
    public Room findById(long id) {
        System.out.println("Room find by id: " + id);
        return null;
    }
}