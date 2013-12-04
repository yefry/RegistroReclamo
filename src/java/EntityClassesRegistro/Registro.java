/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityClassesRegistro;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Luffy
 */
@Entity
@Table(name = "REGISTRO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Registro.findAll", query = "SELECT r FROM Registro r"),
    @NamedQuery(name = "Registro.findByIdReclamo", query = "SELECT r FROM Registro r WHERE r.idReclamo = :idReclamo"),
    @NamedQuery(name = "Registro.findByNombreCliente", query = "SELECT r FROM Registro r WHERE r.nombreCliente = :nombreCliente"),
    @NamedQuery(name = "Registro.findByCedula", query = "SELECT r FROM Registro r WHERE r.cedula = :cedula"),
    @NamedQuery(name = "Registro.findByDireccionAccidente", query = "SELECT r FROM Registro r WHERE r.direccionAccidente = :direccionAccidente"),
    @NamedQuery(name = "Registro.findByFecha", query = "SELECT r FROM Registro r WHERE r.fecha = :fecha"),
    @NamedQuery(name = "Registro.findByDescripcion", query = "SELECT r FROM Registro r WHERE r.descripcion = :descripcion"),
    @NamedQuery(name = "Registro.findByTelefono", query = "SELECT r FROM Registro r WHERE r.telefono = :telefono"),
    @NamedQuery(name = "Registro.findByEmail", query = "SELECT r FROM Registro r WHERE r.email = :email")})
public class Registro implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_RECLAMO")
    private Integer idReclamo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "NOMBRE_CLIENTE")
    private String nombreCliente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CEDULA")
    private long cedula;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "DIRECCION_ACCIDENTE")
    private String direccionAccidente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TELEFONO")
    private long telefono;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 20)
    @Column(name = "EMAIL")
    private String email;

    public Registro() {
    }

    public Registro(Integer idReclamo) {
        this.idReclamo = idReclamo;
    }

    public Registro(Integer idReclamo, String nombreCliente, long cedula, String direccionAccidente, Date fecha, String descripcion, long telefono) {
        this.idReclamo = idReclamo;
        this.nombreCliente = nombreCliente;
        this.cedula = cedula;
        this.direccionAccidente = direccionAccidente;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.telefono = telefono;
    }

    public Integer getIdReclamo() {
        return idReclamo;
    }

    public void setIdReclamo(Integer idReclamo) {
        this.idReclamo = idReclamo;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public String getDireccionAccidente() {
        return direccionAccidente;
    }

    public void setDireccionAccidente(String direccionAccidente) {
        this.direccionAccidente = direccionAccidente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idReclamo != null ? idReclamo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Registro)) {
            return false;
        }
        Registro other = (Registro) object;
        if ((this.idReclamo == null && other.idReclamo != null) || (this.idReclamo != null && !this.idReclamo.equals(other.idReclamo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EntityClassesRegistro.Registro[ idReclamo=" + idReclamo + " ]";
    }
    
}
