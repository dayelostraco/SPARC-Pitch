package sparc.pitch.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * User: Dayel Ostraco
 * Date: 8/1/12
 * Time: 8:10 PM
 */
@Entity
@Table(schema = "SPARC_PITCH", name = "PITCH")
public class Pitch implements Serializable {

    @Id
    @Column(name = "ID", nullable = false, updatable = false)
    private String id;

    @Column(name = "PRODUCT_NAME", nullable = false)
    private String productName;

    @Column(name = "MISSION", nullable = true)
    private String mission;

    @Column(name = "PITCH", nullable = true)
    private String pitch;

    @Column(name = "BENEFITS", nullable = true)
    private String benefits;

    @Column(name = "COST", nullable = true)
    private String cost;

    @Column(name = "ACTION_STATEMENT", nullable = true)
    private String actionStatement;

    @Column(name = "STATS", nullable = true)
    private String stats;

    @Column(name = "OBJECTIONS", nullable = true)
    private String objections;

    @Column(name = "CREATED_BY", nullable = false)
    private String createdBy;

    @Column(name = "CREATED_DT", nullable = false)
    private Date createdDate;

    @Column(name = "LAST_MOD_DT", nullable = false)
    private Date lastModDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public String getPitch() {
        return pitch;
    }

    public void setPitch(String pitch) {
        this.pitch = pitch;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getActionStatement() {
        return actionStatement;
    }

    public void setActionStatement(String actionStatement) {
        this.actionStatement = actionStatement;
    }

    public String getStats() {
        return stats;
    }

    public void setStats(String stats) {
        this.stats = stats;
    }

    public String getObjections() {
        return objections;
    }

    public void setObjections(String objections) {
        this.objections = objections;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastModDate() {
        return lastModDate;
    }

    public void setLastModDate(Date lastModDate) {
        this.lastModDate = lastModDate;
    }
}