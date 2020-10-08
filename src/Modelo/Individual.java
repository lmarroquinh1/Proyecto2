package Modelo;

import Utils.Utilerias;

public class Individual extends Cliente {
 private String DPI;

    public Individual(String nombre, String apellido, String nit, String direccion, String DPI) {
        super(nombre, apellido, nit, direccion);
        this.DPI = DPI;
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public String getApellido() {
        return super.getApellido();
    }

    @Override
    public String getNit() {
        return super.getNit();
    }

    @Override
    public String getDireccion() {
        return super.getDireccion();
    }

    public String getDPI() {
        return DPI;
    }


    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public void setNit(String nit) {
        super.setNit(nit);
    }

    @Override
    public void setDireccion(String direccion) {
        super.setDireccion(direccion);
    }

    @Override
    public String toString() {
        return "["+ Utilerias.getNombreClase(Individual.class)+"]{" +
                "id=" + id +
                ", DPI='" + DPI + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nit='" + nit + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }


}
