package com.keelin.model;

import java.util.Date;

public class ImportantIncidentInfo {
    private Long id;

    private String provName;

    private String provCode;

    private Integer incidentType;

    private String incidentDesc;

    private String communicaImpactDegree;

    private String incidentReason;

    private String communicaSafeguardDesc;

    private String dutyEnsure;

    private Integer isDelete;

    private Date crtDate;

    private Date opDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProvName() {
        return provName;
    }

    public void setProvName(String provName) {
        this.provName = provName == null ? null : provName.trim();
    }

    public String getProvCode() {
        return provCode;
    }

    public void setProvCode(String provCode) {
        this.provCode = provCode == null ? null : provCode.trim();
    }

    public Integer getIncidentType() {
        return incidentType;
    }

    public void setIncidentType(Integer incidentType) {
        this.incidentType = incidentType;
    }

    public String getIncidentDesc() {
        return incidentDesc;
    }

    public void setIncidentDesc(String incidentDesc) {
        this.incidentDesc = incidentDesc == null ? null : incidentDesc.trim();
    }

    public String getCommunicaImpactDegree() {
        return communicaImpactDegree;
    }

    public void setCommunicaImpactDegree(String communicaImpactDegree) {
        this.communicaImpactDegree = communicaImpactDegree == null ? null : communicaImpactDegree.trim();
    }

    public String getIncidentReason() {
        return incidentReason;
    }

    public void setIncidentReason(String incidentReason) {
        this.incidentReason = incidentReason == null ? null : incidentReason.trim();
    }

    public String getCommunicaSafeguardDesc() {
        return communicaSafeguardDesc;
    }

    public void setCommunicaSafeguardDesc(String communicaSafeguardDesc) {
        this.communicaSafeguardDesc = communicaSafeguardDesc == null ? null : communicaSafeguardDesc.trim();
    }

    public String getDutyEnsure() {
        return dutyEnsure;
    }

    public void setDutyEnsure(String dutyEnsure) {
        this.dutyEnsure = dutyEnsure == null ? null : dutyEnsure.trim();
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Date getCrtDate() {
        return crtDate;
    }

    public void setCrtDate(Date crtDate) {
        this.crtDate = crtDate;
    }

    public Date getOpDate() {
        return opDate;
    }

    public void setOpDate(Date opDate) {
        this.opDate = opDate;
    }
}