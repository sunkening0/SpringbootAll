package com.keelin.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RotationerInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RotationerInfoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andRotationIntervalIsNull() {
            addCriterion("rotation_interval is null");
            return (Criteria) this;
        }

        public Criteria andRotationIntervalIsNotNull() {
            addCriterion("rotation_interval is not null");
            return (Criteria) this;
        }

        public Criteria andRotationIntervalEqualTo(String value) {
            addCriterion("rotation_interval =", value, "rotationInterval");
            return (Criteria) this;
        }

        public Criteria andRotationIntervalNotEqualTo(String value) {
            addCriterion("rotation_interval <>", value, "rotationInterval");
            return (Criteria) this;
        }

        public Criteria andRotationIntervalGreaterThan(String value) {
            addCriterion("rotation_interval >", value, "rotationInterval");
            return (Criteria) this;
        }

        public Criteria andRotationIntervalGreaterThanOrEqualTo(String value) {
            addCriterion("rotation_interval >=", value, "rotationInterval");
            return (Criteria) this;
        }

        public Criteria andRotationIntervalLessThan(String value) {
            addCriterion("rotation_interval <", value, "rotationInterval");
            return (Criteria) this;
        }

        public Criteria andRotationIntervalLessThanOrEqualTo(String value) {
            addCriterion("rotation_interval <=", value, "rotationInterval");
            return (Criteria) this;
        }

        public Criteria andRotationIntervalLike(String value) {
            addCriterion("rotation_interval like", value, "rotationInterval");
            return (Criteria) this;
        }

        public Criteria andRotationIntervalNotLike(String value) {
            addCriterion("rotation_interval not like", value, "rotationInterval");
            return (Criteria) this;
        }

        public Criteria andRotationIntervalIn(List<String> values) {
            addCriterion("rotation_interval in", values, "rotationInterval");
            return (Criteria) this;
        }

        public Criteria andRotationIntervalNotIn(List<String> values) {
            addCriterion("rotation_interval not in", values, "rotationInterval");
            return (Criteria) this;
        }

        public Criteria andRotationIntervalBetween(String value1, String value2) {
            addCriterion("rotation_interval between", value1, value2, "rotationInterval");
            return (Criteria) this;
        }

        public Criteria andRotationIntervalNotBetween(String value1, String value2) {
            addCriterion("rotation_interval not between", value1, value2, "rotationInterval");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNull() {
            addCriterion("phone_number is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNotNull() {
            addCriterion("phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberEqualTo(String value) {
            addCriterion("phone_number =", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotEqualTo(String value) {
            addCriterion("phone_number <>", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThan(String value) {
            addCriterion("phone_number >", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("phone_number >=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThan(String value) {
            addCriterion("phone_number <", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("phone_number <=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLike(String value) {
            addCriterion("phone_number like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotLike(String value) {
            addCriterion("phone_number not like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIn(List<String> values) {
            addCriterion("phone_number in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotIn(List<String> values) {
            addCriterion("phone_number not in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBetween(String value1, String value2) {
            addCriterion("phone_number between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("phone_number not between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andRotationDateIsNull() {
            addCriterion("rotation_date is null");
            return (Criteria) this;
        }

        public Criteria andRotationDateIsNotNull() {
            addCriterion("rotation_date is not null");
            return (Criteria) this;
        }

        public Criteria andRotationDateEqualTo(Date value) {
            addCriterionForJDBCDate("rotation_date =", value, "rotationDate");
            return (Criteria) this;
        }

        public Criteria andRotationDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("rotation_date <>", value, "rotationDate");
            return (Criteria) this;
        }

        public Criteria andRotationDateGreaterThan(Date value) {
            addCriterionForJDBCDate("rotation_date >", value, "rotationDate");
            return (Criteria) this;
        }

        public Criteria andRotationDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rotation_date >=", value, "rotationDate");
            return (Criteria) this;
        }

        public Criteria andRotationDateLessThan(Date value) {
            addCriterionForJDBCDate("rotation_date <", value, "rotationDate");
            return (Criteria) this;
        }

        public Criteria andRotationDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rotation_date <=", value, "rotationDate");
            return (Criteria) this;
        }

        public Criteria andRotationDateIn(List<Date> values) {
            addCriterionForJDBCDate("rotation_date in", values, "rotationDate");
            return (Criteria) this;
        }

        public Criteria andRotationDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("rotation_date not in", values, "rotationDate");
            return (Criteria) this;
        }

        public Criteria andRotationDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rotation_date between", value1, value2, "rotationDate");
            return (Criteria) this;
        }

        public Criteria andRotationDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rotation_date not between", value1, value2, "rotationDate");
            return (Criteria) this;
        }

        public Criteria andIsWhiteIsNull() {
            addCriterion("is_white is null");
            return (Criteria) this;
        }

        public Criteria andIsWhiteIsNotNull() {
            addCriterion("is_white is not null");
            return (Criteria) this;
        }

        public Criteria andIsWhiteEqualTo(Integer value) {
            addCriterion("is_white =", value, "isWhite");
            return (Criteria) this;
        }

        public Criteria andIsWhiteNotEqualTo(Integer value) {
            addCriterion("is_white <>", value, "isWhite");
            return (Criteria) this;
        }

        public Criteria andIsWhiteGreaterThan(Integer value) {
            addCriterion("is_white >", value, "isWhite");
            return (Criteria) this;
        }

        public Criteria andIsWhiteGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_white >=", value, "isWhite");
            return (Criteria) this;
        }

        public Criteria andIsWhiteLessThan(Integer value) {
            addCriterion("is_white <", value, "isWhite");
            return (Criteria) this;
        }

        public Criteria andIsWhiteLessThanOrEqualTo(Integer value) {
            addCriterion("is_white <=", value, "isWhite");
            return (Criteria) this;
        }

        public Criteria andIsWhiteIn(List<Integer> values) {
            addCriterion("is_white in", values, "isWhite");
            return (Criteria) this;
        }

        public Criteria andIsWhiteNotIn(List<Integer> values) {
            addCriterion("is_white not in", values, "isWhite");
            return (Criteria) this;
        }

        public Criteria andIsWhiteBetween(Integer value1, Integer value2) {
            addCriterion("is_white between", value1, value2, "isWhite");
            return (Criteria) this;
        }

        public Criteria andIsWhiteNotBetween(Integer value1, Integer value2) {
            addCriterion("is_white not between", value1, value2, "isWhite");
            return (Criteria) this;
        }

        public Criteria andIsLeaderIsNull() {
            addCriterion("is_leader is null");
            return (Criteria) this;
        }

        public Criteria andIsLeaderIsNotNull() {
            addCriterion("is_leader is not null");
            return (Criteria) this;
        }

        public Criteria andIsLeaderEqualTo(Integer value) {
            addCriterion("is_leader =", value, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsLeaderNotEqualTo(Integer value) {
            addCriterion("is_leader <>", value, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsLeaderGreaterThan(Integer value) {
            addCriterion("is_leader >", value, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_leader >=", value, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsLeaderLessThan(Integer value) {
            addCriterion("is_leader <", value, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("is_leader <=", value, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsLeaderIn(List<Integer> values) {
            addCriterion("is_leader in", values, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsLeaderNotIn(List<Integer> values) {
            addCriterion("is_leader not in", values, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsLeaderBetween(Integer value1, Integer value2) {
            addCriterion("is_leader between", value1, value2, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("is_leader not between", value1, value2, "isLeader");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBackupIsNull() {
            addCriterion("phone_number_backup is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBackupIsNotNull() {
            addCriterion("phone_number_backup is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBackupEqualTo(String value) {
            addCriterion("phone_number_backup =", value, "phoneNumberBackup");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBackupNotEqualTo(String value) {
            addCriterion("phone_number_backup <>", value, "phoneNumberBackup");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBackupGreaterThan(String value) {
            addCriterion("phone_number_backup >", value, "phoneNumberBackup");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBackupGreaterThanOrEqualTo(String value) {
            addCriterion("phone_number_backup >=", value, "phoneNumberBackup");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBackupLessThan(String value) {
            addCriterion("phone_number_backup <", value, "phoneNumberBackup");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBackupLessThanOrEqualTo(String value) {
            addCriterion("phone_number_backup <=", value, "phoneNumberBackup");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBackupLike(String value) {
            addCriterion("phone_number_backup like", value, "phoneNumberBackup");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBackupNotLike(String value) {
            addCriterion("phone_number_backup not like", value, "phoneNumberBackup");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBackupIn(List<String> values) {
            addCriterion("phone_number_backup in", values, "phoneNumberBackup");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBackupNotIn(List<String> values) {
            addCriterion("phone_number_backup not in", values, "phoneNumberBackup");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBackupBetween(String value1, String value2) {
            addCriterion("phone_number_backup between", value1, value2, "phoneNumberBackup");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBackupNotBetween(String value1, String value2) {
            addCriterion("phone_number_backup not between", value1, value2, "phoneNumberBackup");
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