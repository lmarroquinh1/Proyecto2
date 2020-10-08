package Modelo;

import Utils.Utilerias;

public class Empresa extends Cliente {
    private String contacto;
    private int descuento;

      public Empresa(String nombre, String apellido, String nit, String direccion, String contacto, int descuento) {
        super(nombre, apellido, nit, direccion);
        this.contacto = contacto;
        this.descuento = descuento;
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
    public String getNit() {
        return super.getNit();
    }

    @Override
    public String getDireccion() {
        return super.getDireccion();
    }

    public String getContacto() {
        return contacto;
    }

    public int getDescuento() {   return descuento;}

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
        return "["+ Utilerias.getNombreClase(Empresa.class)+"]{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nit='" + nit + '\'' +
                ", direccion='" + direccion + '\'' +
                ", contacto='" + contacto + '\'' +
                ", descuento=" + descuento +
                '}';
    }

}
