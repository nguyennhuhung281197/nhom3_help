package model;

import java.time.LocalDate;

public class Khach_Hang {
    private String name;
    private LocalDate ngaySinh;
    private String diaChi;
    private String anh;

    public Khach_Hang() {
    }

    public Khach_Hang(String name, LocalDate ngaySinh, String diaChi, String anh) {
        this.name = name;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.anh = anh;
    }

    public String getName() {
        return name;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getAnh() {
        return anh;
    }

}
