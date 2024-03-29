package models;

import java.util.Locale;

public class Seat implements models.IParseModel {
    private Long idSeat;
    private ELocation location;
    private String seatPosition;
    private EStatus status;

    public Seat() {
    }

    public Seat(long idSeat, models.ELocation location, String seatPosition, models.EStatus status) {
        this.idSeat = idSeat;
        this.location = location;
        this.seatPosition = seatPosition;
        this.status = status;
    }




    public long getIdSeat() {
        return idSeat;
    }

    public void setIdSeat(long idSeat) {
        this.idSeat = idSeat;
    }

    public models.ELocation getLocation() {
        return location;
    }

    public void setLocation(models.ELocation location) {
        this.location = location;
    }

    public String getSeatPosition() {
        return seatPosition;
    }

    public void setSeatPosition(String seatPosition) {
        this.seatPosition = seatPosition;
    }

    public models.EStatus getStatus() {
        return status;
    }

    public void setStatus(models.EStatus status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s", idSeat, location, seatPosition, status);
    }

    @Override
    public Object parse(String line) {
        String[] str = line.split(",");
        Seat s = new Seat(Long.parseLong(str[0]), models.ELocation.valueOf(str[1].toUpperCase()), str[2], models.EStatus.valueOf(str[3]));
        return s;
    }
}
