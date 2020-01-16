/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busreservationsystem;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Jimmy
 */
@Entity
@Table(name = "employeedetails", catalog = "bussystem", schema = "")
@NamedQueries({
    @NamedQuery(name = "Employeedetails.findAll", query = "SELECT e FROM Employeedetails e"),
    @NamedQuery(name = "Employeedetails.findById", query = "SELECT e FROM Employeedetails e WHERE e.id = :id"),
    @NamedQuery(name = "Employeedetails.findByName", query = "SELECT e FROM Employeedetails e WHERE e.name = :name"),
    @NamedQuery(name = "Employeedetails.findByPhoneno", query = "SELECT e FROM Employeedetails e WHERE e.phoneno = :phoneno")})
public class Employeedetails implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "phoneno")
    private String phoneno;

    public Employeedetails() {
    }

    public Employeedetails(Integer id) {
        this.id = id;
    }

    public Employeedetails(Integer id, String name, String phoneno) {
        this.id = id;
        this.name = name;
        this.phoneno = phoneno;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        String oldPhoneno = this.phoneno;
        this.phoneno = phoneno;
        changeSupport.firePropertyChange("phoneno", oldPhoneno, phoneno);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employeedetails)) {
            return false;
        }
        Employeedetails other = (Employeedetails) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "busreservationsystem.Employeedetails[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
