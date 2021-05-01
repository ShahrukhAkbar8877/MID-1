
package shahrukhQ2;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Cities")
@NamedQueries({
    @NamedQuery(name = "Cities.findAll", query = "SELECT c FROM Cities c"),
    @NamedQuery(name = "Cities.findByCityID", query = "SELECT c FROM Cities c WHERE c.cID = :cID"),
    @NamedQuery(name = "Cities.findByCityName", query = "SELECT c FROM Cities c WHERE c.cName = :cName")})
public class Cities implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "City_ID")
    private Integer cID;
    @Column(name = "City_Name")
    private Character cName;

    public Cities() {
    }

    public Cities(Integer cityID) {
        this.cID = cityID;
    }

    public Integer getCityID() {
        return cID;
    }

    public void setCityID(Integer cityID) {
        this.cID = cityID;
    }

    public Character getCityName() {
        return cName;
    }

    public void setCityName(Character cityName) {
        this.cName = cityName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cID != null ? cID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cities)) {
            return false;
        }
        Cities other = (Cities) object;
        if ((this.cID == null && other.cID != null) || (this.cID != null && !this.cID.equals(other.cID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "shahrukhQ2.Cities[ cityID=" + cID + " ]";
    }
    
}
