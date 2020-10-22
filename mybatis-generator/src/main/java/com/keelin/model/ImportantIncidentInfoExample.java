package com.keelin.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ImportantIncidentInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImportantIncidentInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProvNameIsNull() {
            addCriterion("prov_name is null");
            return (Criteria) this;
        }

        public Criteria andProvNameIsNotNull() {
            addCriterion("prov_name is not null");
            return (Criteria) this;
        }

        public Criteria andProvNameEqualTo(String value) {
            addCriterion("prov_name =", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameNotEqualTo(String value) {
            addCriterion("prov_name <>", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameGreaterThan(String value) {
            addCriterion("prov_name >", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameGreaterThanOrEqualTo(String value) {
            addCriterion("prov_name >=", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameLessThan(String value) {
            addCriterion("prov_name <", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameLessThanOrEqualTo(String value) {
            addCriterion("prov_name <=", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameLike(String value) {
            addCriterion("prov_name like", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameNotLike(String value) {
            addCriterion("prov_name not like", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameIn(List<String> values) {
            addCriterion("prov_name in", values, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameNotIn(List<String> values) {
            addCriterion("prov_name not in", values, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameBetween(String value1, String value2) {
            addCriterion("prov_name between", value1, value2, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameNotBetween(String value1, String value2) {
            addCriterion("prov_name not between", value1, value2, "provName");
            return (Criteria) this;
        }

        public Criteria andProvCodeIsNull() {
            addCriterion("prov_code is null");
            return (Criteria) this;
        }

        public Criteria andProvCodeIsNotNull() {
            addCriterion("prov_code is not null");
            return (Criteria) this;
        }

        public Criteria andProvCodeEqualTo(String value) {
            addCriterion("prov_code =", value, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeNotEqualTo(String value) {
            addCriterion("prov_code <>", value, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeGreaterThan(String value) {
            addCriterion("prov_code >", value, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeGreaterThanOrEqualTo(String value) {
            addCriterion("prov_code >=", value, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeLessThan(String value) {
            addCriterion("prov_code <", value, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeLessThanOrEqualTo(String value) {
            addCriterion("prov_code <=", value, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeLike(String value) {
            addCriterion("prov_code like", value, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeNotLike(String value) {
            addCriterion("prov_code not like", value, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeIn(List<String> values) {
            addCriterion("prov_code in", values, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeNotIn(List<String> values) {
            addCriterion("prov_code not in", values, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeBetween(String value1, String value2) {
            addCriterion("prov_code between", value1, value2, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeNotBetween(String value1, String value2) {
            addCriterion("prov_code not between", value1, value2, "provCode");
            return (Criteria) this;
        }

        public Criteria andIncidentTypeIsNull() {
            addCriterion("incident_type is null");
            return (Criteria) this;
        }

        public Criteria andIncidentTypeIsNotNull() {
            addCriterion("incident_type is not null");
            return (Criteria) this;
        }

        public Criteria andIncidentTypeEqualTo(Integer value) {
            addCriterion("incident_type =", value, "incidentType");
            return (Criteria) this;
        }

        public Criteria andIncidentTypeNotEqualTo(Integer value) {
            addCriterion("incident_type <>", value, "incidentType");
            return (Criteria) this;
        }

        public Criteria andIncidentTypeGreaterThan(Integer value) {
            addCriterion("incident_type >", value, "incidentType");
            return (Criteria) this;
        }

        public Criteria andIncidentTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("incident_type >=", value, "incidentType");
            return (Criteria) this;
        }

        public Criteria andIncidentTypeLessThan(Integer value) {
            addCriterion("incident_type <", value, "incidentType");
            return (Criteria) this;
        }

        public Criteria andIncidentTypeLessThanOrEqualTo(Integer value) {
            addCriterion("incident_type <=", value, "incidentType");
            return (Criteria) this;
        }

        public Criteria andIncidentTypeIn(List<Integer> values) {
            addCriterion("incident_type in", values, "incidentType");
            return (Criteria) this;
        }

        public Criteria andIncidentTypeNotIn(List<Integer> values) {
            addCriterion("incident_type not in", values, "incidentType");
            return (Criteria) this;
        }

        public Criteria andIncidentTypeBetween(Integer value1, Integer value2) {
            addCriterion("incident_type between", value1, value2, "incidentType");
            return (Criteria) this;
        }

        public Criteria andIncidentTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("incident_type not between", value1, value2, "incidentType");
            return (Criteria) this;
        }

        public Criteria andIncidentDescIsNull() {
            addCriterion("incident_desc is null");
            return (Criteria) this;
        }

        public Criteria andIncidentDescIsNotNull() {
            addCriterion("incident_desc is not null");
            return (Criteria) this;
        }

        public Criteria andIncidentDescEqualTo(String value) {
            addCriterion("incident_desc =", value, "incidentDesc");
            return (Criteria) this;
        }

        public Criteria andIncidentDescNotEqualTo(String value) {
            addCriterion("incident_desc <>", value, "incidentDesc");
            return (Criteria) this;
        }

        public Criteria andIncidentDescGreaterThan(String value) {
            addCriterion("incident_desc >", value, "incidentDesc");
            return (Criteria) this;
        }

        public Criteria andIncidentDescGreaterThanOrEqualTo(String value) {
            addCriterion("incident_desc >=", value, "incidentDesc");
            return (Criteria) this;
        }

        public Criteria andIncidentDescLessThan(String value) {
            addCriterion("incident_desc <", value, "incidentDesc");
            return (Criteria) this;
        }

        public Criteria andIncidentDescLessThanOrEqualTo(String value) {
            addCriterion("incident_desc <=", value, "incidentDesc");
            return (Criteria) this;
        }

        public Criteria andIncidentDescLike(String value) {
            addCriterion("incident_desc like", value, "incidentDesc");
            return (Criteria) this;
        }

        public Criteria andIncidentDescNotLike(String value) {
            addCriterion("incident_desc not like", value, "incidentDesc");
            return (Criteria) this;
        }

        public Criteria andIncidentDescIn(List<String> values) {
            addCriterion("incident_desc in", values, "incidentDesc");
            return (Criteria) this;
        }

        public Criteria andIncidentDescNotIn(List<String> values) {
            addCriterion("incident_desc not in", values, "incidentDesc");
            return (Criteria) this;
        }

        public Criteria andIncidentDescBetween(String value1, String value2) {
            addCriterion("incident_desc between", value1, value2, "incidentDesc");
            return (Criteria) this;
        }

        public Criteria andIncidentDescNotBetween(String value1, String value2) {
            addCriterion("incident_desc not between", value1, value2, "incidentDesc");
            return (Criteria) this;
        }

        public Criteria andCommunicaImpactDegreeIsNull() {
            addCriterion("communica_impact_degree is null");
            return (Criteria) this;
        }

        public Criteria andCommunicaImpactDegreeIsNotNull() {
            addCriterion("communica_impact_degree is not null");
            return (Criteria) this;
        }

        public Criteria andCommunicaImpactDegreeEqualTo(String value) {
            addCriterion("communica_impact_degree =", value, "communicaImpactDegree");
            return (Criteria) this;
        }

        public Criteria andCommunicaImpactDegreeNotEqualTo(String value) {
            addCriterion("communica_impact_degree <>", value, "communicaImpactDegree");
            return (Criteria) this;
        }

        public Criteria andCommunicaImpactDegreeGreaterThan(String value) {
            addCriterion("communica_impact_degree >", value, "communicaImpactDegree");
            return (Criteria) this;
        }

        public Criteria andCommunicaImpactDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("communica_impact_degree >=", value, "communicaImpactDegree");
            return (Criteria) this;
        }

        public Criteria andCommunicaImpactDegreeLessThan(String value) {
            addCriterion("communica_impact_degree <", value, "communicaImpactDegree");
            return (Criteria) this;
        }

        public Criteria andCommunicaImpactDegreeLessThanOrEqualTo(String value) {
            addCriterion("communica_impact_degree <=", value, "communicaImpactDegree");
            return (Criteria) this;
        }

        public Criteria andCommunicaImpactDegreeLike(String value) {
            addCriterion("communica_impact_degree like", value, "communicaImpactDegree");
            return (Criteria) this;
        }

        public Criteria andCommunicaImpactDegreeNotLike(String value) {
            addCriterion("communica_impact_degree not like", value, "communicaImpactDegree");
            return (Criteria) this;
        }

        public Criteria andCommunicaImpactDegreeIn(List<String> values) {
            addCriterion("communica_impact_degree in", values, "communicaImpactDegree");
            return (Criteria) this;
        }

        public Criteria andCommunicaImpactDegreeNotIn(List<String> values) {
            addCriterion("communica_impact_degree not in", values, "communicaImpactDegree");
            return (Criteria) this;
        }

        public Criteria andCommunicaImpactDegreeBetween(String value1, String value2) {
            addCriterion("communica_impact_degree between", value1, value2, "communicaImpactDegree");
            return (Criteria) this;
        }

        public Criteria andCommunicaImpactDegreeNotBetween(String value1, String value2) {
            addCriterion("communica_impact_degree not between", value1, value2, "communicaImpactDegree");
            return (Criteria) this;
        }

        public Criteria andIncidentReasonIsNull() {
            addCriterion("incident_reason is null");
            return (Criteria) this;
        }

        public Criteria andIncidentReasonIsNotNull() {
            addCriterion("incident_reason is not null");
            return (Criteria) this;
        }

        public Criteria andIncidentReasonEqualTo(String value) {
            addCriterion("incident_reason =", value, "incidentReason");
            return (Criteria) this;
        }

        public Criteria andIncidentReasonNotEqualTo(String value) {
            addCriterion("incident_reason <>", value, "incidentReason");
            return (Criteria) this;
        }

        public Criteria andIncidentReasonGreaterThan(String value) {
            addCriterion("incident_reason >", value, "incidentReason");
            return (Criteria) this;
        }

        public Criteria andIncidentReasonGreaterThanOrEqualTo(String value) {
            addCriterion("incident_reason >=", value, "incidentReason");
            return (Criteria) this;
        }

        public Criteria andIncidentReasonLessThan(String value) {
            addCriterion("incident_reason <", value, "incidentReason");
            return (Criteria) this;
        }

        public Criteria andIncidentReasonLessThanOrEqualTo(String value) {
            addCriterion("incident_reason <=", value, "incidentReason");
            return (Criteria) this;
        }

        public Criteria andIncidentReasonLike(String value) {
            addCriterion("incident_reason like", value, "incidentReason");
            return (Criteria) this;
        }

        public Criteria andIncidentReasonNotLike(String value) {
            addCriterion("incident_reason not like", value, "incidentReason");
            return (Criteria) this;
        }

        public Criteria andIncidentReasonIn(List<String> values) {
            addCriterion("incident_reason in", values, "incidentReason");
            return (Criteria) this;
        }

        public Criteria andIncidentReasonNotIn(List<String> values) {
            addCriterion("incident_reason not in", values, "incidentReason");
            return (Criteria) this;
        }

        public Criteria andIncidentReasonBetween(String value1, String value2) {
            addCriterion("incident_reason between", value1, value2, "incidentReason");
            return (Criteria) this;
        }

        public Criteria andIncidentReasonNotBetween(String value1, String value2) {
            addCriterion("incident_reason not between", value1, value2, "incidentReason");
            return (Criteria) this;
        }

        public Criteria andCommunicaSafeguardDescIsNull() {
            addCriterion("communica_safeguard_desc is null");
            return (Criteria) this;
        }

        public Criteria andCommunicaSafeguardDescIsNotNull() {
            addCriterion("communica_safeguard_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCommunicaSafeguardDescEqualTo(String value) {
            addCriterion("communica_safeguard_desc =", value, "communicaSafeguardDesc");
            return (Criteria) this;
        }

        public Criteria andCommunicaSafeguardDescNotEqualTo(String value) {
            addCriterion("communica_safeguard_desc <>", value, "communicaSafeguardDesc");
            return (Criteria) this;
        }

        public Criteria andCommunicaSafeguardDescGreaterThan(String value) {
            addCriterion("communica_safeguard_desc >", value, "communicaSafeguardDesc");
            return (Criteria) this;
        }

        public Criteria andCommunicaSafeguardDescGreaterThanOrEqualTo(String value) {
            addCriterion("communica_safeguard_desc >=", value, "communicaSafeguardDesc");
            return (Criteria) this;
        }

        public Criteria andCommunicaSafeguardDescLessThan(String value) {
            addCriterion("communica_safeguard_desc <", value, "communicaSafeguardDesc");
            return (Criteria) this;
        }

        public Criteria andCommunicaSafeguardDescLessThanOrEqualTo(String value) {
            addCriterion("communica_safeguard_desc <=", value, "communicaSafeguardDesc");
            return (Criteria) this;
        }

        public Criteria andCommunicaSafeguardDescLike(String value) {
            addCriterion("communica_safeguard_desc like", value, "communicaSafeguardDesc");
            return (Criteria) this;
        }

        public Criteria andCommunicaSafeguardDescNotLike(String value) {
            addCriterion("communica_safeguard_desc not like", value, "communicaSafeguardDesc");
            return (Criteria) this;
        }

        public Criteria andCommunicaSafeguardDescIn(List<String> values) {
            addCriterion("communica_safeguard_desc in", values, "communicaSafeguardDesc");
            return (Criteria) this;
        }

        public Criteria andCommunicaSafeguardDescNotIn(List<String> values) {
            addCriterion("communica_safeguard_desc not in", values, "communicaSafeguardDesc");
            return (Criteria) this;
        }

        public Criteria andCommunicaSafeguardDescBetween(String value1, String value2) {
            addCriterion("communica_safeguard_desc between", value1, value2, "communicaSafeguardDesc");
            return (Criteria) this;
        }

        public Criteria andCommunicaSafeguardDescNotBetween(String value1, String value2) {
            addCriterion("communica_safeguard_desc not between", value1, value2, "communicaSafeguardDesc");
            return (Criteria) this;
        }

        public Criteria andDutyEnsureIsNull() {
            addCriterion("duty_ensure is null");
            return (Criteria) this;
        }

        public Criteria andDutyEnsureIsNotNull() {
            addCriterion("duty_ensure is not null");
            return (Criteria) this;
        }

        public Criteria andDutyEnsureEqualTo(String value) {
            addCriterion("duty_ensure =", value, "dutyEnsure");
            return (Criteria) this;
        }

        public Criteria andDutyEnsureNotEqualTo(String value) {
            addCriterion("duty_ensure <>", value, "dutyEnsure");
            return (Criteria) this;
        }

        public Criteria andDutyEnsureGreaterThan(String value) {
            addCriterion("duty_ensure >", value, "dutyEnsure");
            return (Criteria) this;
        }

        public Criteria andDutyEnsureGreaterThanOrEqualTo(String value) {
            addCriterion("duty_ensure >=", value, "dutyEnsure");
            return (Criteria) this;
        }

        public Criteria andDutyEnsureLessThan(String value) {
            addCriterion("duty_ensure <", value, "dutyEnsure");
            return (Criteria) this;
        }

        public Criteria andDutyEnsureLessThanOrEqualTo(String value) {
            addCriterion("duty_ensure <=", value, "dutyEnsure");
            return (Criteria) this;
        }

        public Criteria andDutyEnsureLike(String value) {
            addCriterion("duty_ensure like", value, "dutyEnsure");
            return (Criteria) this;
        }

        public Criteria andDutyEnsureNotLike(String value) {
            addCriterion("duty_ensure not like", value, "dutyEnsure");
            return (Criteria) this;
        }

        public Criteria andDutyEnsureIn(List<String> values) {
            addCriterion("duty_ensure in", values, "dutyEnsure");
            return (Criteria) this;
        }

        public Criteria andDutyEnsureNotIn(List<String> values) {
            addCriterion("duty_ensure not in", values, "dutyEnsure");
            return (Criteria) this;
        }

        public Criteria andDutyEnsureBetween(String value1, String value2) {
            addCriterion("duty_ensure between", value1, value2, "dutyEnsure");
            return (Criteria) this;
        }

        public Criteria andDutyEnsureNotBetween(String value1, String value2) {
            addCriterion("duty_ensure not between", value1, value2, "dutyEnsure");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Integer value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Integer value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Integer value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Integer value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Integer> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Integer> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andCrtDateIsNull() {
            addCriterion("crt_date is null");
            return (Criteria) this;
        }

        public Criteria andCrtDateIsNotNull() {
            addCriterion("crt_date is not null");
            return (Criteria) this;
        }

        public Criteria andCrtDateEqualTo(Date value) {
            addCriterion("crt_date =", value, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateNotEqualTo(Date value) {
            addCriterion("crt_date <>", value, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateGreaterThan(Date value) {
            addCriterion("crt_date >", value, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateGreaterThanOrEqualTo(Date value) {
            addCriterion("crt_date >=", value, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateLessThan(Date value) {
            addCriterion("crt_date <", value, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateLessThanOrEqualTo(Date value) {
            addCriterion("crt_date <=", value, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateIn(List<Date> values) {
            addCriterion("crt_date in", values, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateNotIn(List<Date> values) {
            addCriterion("crt_date not in", values, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateBetween(Date value1, Date value2) {
            addCriterion("crt_date between", value1, value2, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateNotBetween(Date value1, Date value2) {
            addCriterion("crt_date not between", value1, value2, "crtDate");
            return (Criteria) this;
        }

        public Criteria andOpDateIsNull() {
            addCriterion("op_date is null");
            return (Criteria) this;
        }

        public Criteria andOpDateIsNotNull() {
            addCriterion("op_date is not null");
            return (Criteria) this;
        }

        public Criteria andOpDateEqualTo(Date value) {
            addCriterion("op_date =", value, "opDate");
            return (Criteria) this;
        }

        public Criteria andOpDateNotEqualTo(Date value) {
            addCriterion("op_date <>", value, "opDate");
            return (Criteria) this;
        }

        public Criteria andOpDateGreaterThan(Date value) {
            addCriterion("op_date >", value, "opDate");
            return (Criteria) this;
        }

        public Criteria andOpDateGreaterThanOrEqualTo(Date value) {
            addCriterion("op_date >=", value, "opDate");
            return (Criteria) this;
        }

        public Criteria andOpDateLessThan(Date value) {
            addCriterion("op_date <", value, "opDate");
            return (Criteria) this;
        }

        public Criteria andOpDateLessThanOrEqualTo(Date value) {
            addCriterion("op_date <=", value, "opDate");
            return (Criteria) this;
        }

        public Criteria andOpDateIn(List<Date> values) {
            addCriterion("op_date in", values, "opDate");
            return (Criteria) this;
        }

        public Criteria andOpDateNotIn(List<Date> values) {
            addCriterion("op_date not in", values, "opDate");
            return (Criteria) this;
        }

        public Criteria andOpDateBetween(Date value1, Date value2) {
            addCriterion("op_date between", value1, value2, "opDate");
            return (Criteria) this;
        }

        public Criteria andOpDateNotBetween(Date value1, Date value2) {
            addCriterion("op_date not between", value1, value2, "opDate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}