/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.na5cent.resourcelocal.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author GAME
 */
@Entity
@Table(name = "locations")
public class Location implements Serializable{
    @Id
    @Column(name = "location_id")
    private Integer id;
    @Column(name = "street address", length = 40)
    private String streeAddress;
    @Column(name = "postal_code")
    private String postalCode;
    private String city;
    
    public Location () {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStreeAddress() {
        return streeAddress;
    }

    public void setStreeAddress(String streeAddress) {
        this.streeAddress = streeAddress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.streeAddress, other.streeAddress)) {
            return false;
        }
        if (!Objects.equals(this.postalCode, other.postalCode)) {
            return false;
        }
        if (!Objects.equals(this.city, other.city)) {
            return false;
        }
        return true;
    }
    
}
