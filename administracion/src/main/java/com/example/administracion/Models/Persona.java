package com.example.administracion.Models;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombres")
    private String nombres;
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "estado_civil")
    private String estadoCivil; // EstadoCivil
    @Column(name = "cedula")
    private String cedula;
    @Column(name = "sexo")
    private char sexo;
    @Column(name = "ciudad")
    private String ciudad;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;
    @Column(name = "anio_entrada")
    private Date anioEntrada;

    public Persona(){

    }
    public Persona(long idP) {
        this.id = idP;
    }


    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombre) {
        this.nombres = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellido) {
        this.apellidos = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getAnioEntrada() {
        return anioEntrada;
    }

    public void setAnioEntrada(Date birthday) {
        this.anioEntrada = birthday;
    }

    // public EstadoCivil getEstadoCivil() {
    // return estadoCivil;
    // }

    // public void setEstadoCivil(EstadoCivil estadoCivil) {
    // this.estadoCivil = estadoCivil;
    // }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "nombre=" + nombres + ", apellido=" + apellidos + ", cedula=" + cedula + '}';
    }

    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

}
