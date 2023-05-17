package model;

import model.Khach_Hang;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Khach_hang_Manage {

    private List<Khach_Hang>  list = new ArrayList<>();

    public Khach_hang_Manage() {

        list.add(new Khach_Hang("Nguyen Van A", LocalDate.of(1997, 1, 11), "Ha noi", "a.png"));
        list.add(new Khach_Hang("Nguyen Van B", LocalDate.of(1997, 2, 10), "Ha noi", "a.png"));
        list.add(new Khach_Hang("Nguyen Van C", LocalDate.of(1997, 3, 9), "Ha noi", "a.png"));
        list.add(new Khach_Hang("Nguyen Van D", LocalDate.of(1997, 4, 8), "Ha noi", "a.png"));
        list.add(new Khach_Hang("Nguyen Van E", LocalDate.of(1997, 5, 7), "Ha noi", "a.png"));
        list.add(new Khach_Hang("Nguyen Van F", LocalDate.of(1997, 6, 6), "Ha noi", "a.png"));

    }

    public List<Khach_Hang> getList() {
        return list;
    }

}
