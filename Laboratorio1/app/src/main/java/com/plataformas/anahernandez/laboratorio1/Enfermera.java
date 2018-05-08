package com.plataformas.anahernandez.laboratorio1;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by anahernandez on 5/7/18.
 */

public class Enfermera implements Parcelable {
    private String nombre;
    private double sueldo;
    private String areaServicio;

    protected Enfermera(Parcel in) {
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                ", Sueldo: " + sueldo +
                ", Area de Servicio: " + areaServicio;
    }

    public Enfermera(String nombre, double sueldo, String areaServicio) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.areaServicio = areaServicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getAreaServicio() {
        return areaServicio;
    }

    public void setAreaServicio(String areaServicio) {
        this.areaServicio = areaServicio;
    }

    public static final Creator<Enfermera> CREATOR = new Creator<Enfermera>() {
        @Override
        public Enfermera createFromParcel(Parcel in) {
            return new Enfermera(in);
        }

        @Override
        public Enfermera[] newArray(int size) {
            return new Enfermera[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }
}
