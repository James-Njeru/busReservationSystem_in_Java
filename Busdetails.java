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
@Table(name = "busdetails", catalog = "bussystem", schema = "")
@NamedQueries({
    @NamedQuery(name = "Busdetails.findAll", query = "SELECT b FROM Busdetails b"),
    @NamedQuery(name = "Busdetails.findById", query = "SELECT b FROM Busdetails b WHERE b.id = :id"),
    @NamedQuery(name = "Busdetails.findByBusnumber", query = "SELECT b FROM Busdetails b WHERE b.busnumber = :busnumber"),
    @NamedQuery(name = "Busdetails.findByBussource", query = "SELECT b FROM Busdetails b WHERE b.bussource = :bussource"),
    @NamedQuery(name = "Busdetails.findByBusdestination", query = "SELECT b FROM Busdetails b WHERE b.busdestination = :busdestination"),
    @NamedQuery(name = "Busdetails.findByDate", query = "SELECT b FROM Busdetails b WHERE b.date = :date"),
    @NamedQuery(name = "Busdetails.findByTime", query = "SELECT b FROM Busdetails b WHERE b.time = :time"),
    @NamedQuery(name = "Busdetails.findByPrice", query = "SELECT b FROM Busdetails b WHERE b.price = :price"),
    @NamedQuery(name = "Busdetails.findBySeat", query = "SELECT b FROM Busdetails b WHERE b.seat = :seat")})
public class Busdetails implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "busnumber")
    private String busnumber;
    @Basic(optional = false)
    @Column(name = "bussource")
    private String bussource;
    @Basic(optional = false)
    @Column(name = "busdestination")
    private String busdestination;
    @Basic(optional = false)
    @Column(name = "date")
    private String date;
    @Basic(optional = false)
    @Column(name = "time")
    private String time;
    @Basic(optional = false)
    @Column(name = "price")
    private int price;
    @Basic(optional = false)
    @Column(name = "seat")
    private int seat;

    public Busdetails() {
    }

    public Busdetails(Integer id) {
        this.id = id;
    }

    public Busdetails(Integer id, String busnumber, String bussource, String busdestination, String date, String time, int price, int seat) {
        this.id = id;
        this.busnumber = busnumber;
        this.bussource = bussource;
        this.busdestination = busdestination;
        this.date = date;
        this.time = time;
        this.price = price;
        this.seat = seat;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getBusnumber() {
        return busnumber;
    }

    public void setBusnumber(String busnumber) {
        String oldBusnumber = this.busnumber;
        this.busnumber = busnumber;
        changeSupport.firePropertyChange("busnumber", oldBusnumber, busnumber);
    }

    public String getBussource() {
        return bussource;
    }

    public void setBussource(String bussource) {
        String oldBussource = this.bussource;
        this.bussource = bussource;
        changeSupport.firePropertyChange("bussource", oldBussource, bussource);
    }

    public String getBusdestination() {
        return busdestination;
    }

    public void setBusdestination(String busdestination) {
        String oldBusdestination = this.busdestination;
        this.busdestination = busdestination;
        changeSupport.firePropertyChange("busdestination", oldBusdestination, busdestination);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        String oldDate = this.date;
        this.date = date;
        changeSupport.firePropertyChange("date", oldDate, date);
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        String oldTime = this.time;
        this.time = time;
        changeSupport.firePropertyChange("time", oldTime, time);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        int oldPrice = this.price;
        this.price = price;
        changeSupport.firePropertyChange("price", oldPrice, price);
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        int oldSeat = this.seat;
        this.seat = seat;
        changeSupport.firePropertyChange("seat", oldSeat, seat);
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
        if (!(object instanceof Busdetails)) {
            return false;
        }
        Busdetails other = (Busdetails) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "busreservationsystem.Busdetails[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
