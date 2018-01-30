public class Room {
    int roomNumber = 0;
    int daysRented = 0;
    String roomType = "";
    String occupantName = "";

    public Room (int roomNumber, String roomType) {
        this.roomNumber = roomNumber;
        this.daysRented = 0;
        this.occupantName = null;

        if (roomType.equals("single king")
                || roomType.equals("double queen")
                || roomType.equals("suite")) this.roomType += roomType;
        else this.roomType += "doubleQueen";
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public String getRoomType() {
        return roomType;
    }

    public String getOccupantName() {
        return occupantName;
    }


    public boolean setOccupant(String guestName, int numDays) {
        boolean success = false;

        if (this.occupantName.equals(null)) success = false;
        else {
            this.occupantName += guestName;
            this.daysRented = numDays;
            success = true;
        }

        return success;
    }

}

