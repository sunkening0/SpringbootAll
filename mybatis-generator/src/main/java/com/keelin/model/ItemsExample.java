package com.keelin.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItemsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemsExample() {
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

        public Criteria andTaskIdIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(String value) {
            addCriterion("task_id =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(String value) {
            addCriterion("task_id <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(String value) {
            addCriterion("task_id >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("task_id >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(String value) {
            addCriterion("task_id <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(String value) {
            addCriterion("task_id <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLike(String value) {
            addCriterion("task_id like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotLike(String value) {
            addCriterion("task_id not like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<String> values) {
            addCriterion("task_id in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<String> values) {
            addCriterion("task_id not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(String value1, String value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(String value1, String value2) {
            addCriterion("task_id not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andWsidIsNull() {
            addCriterion("wsid is null");
            return (Criteria) this;
        }

        public Criteria andWsidIsNotNull() {
            addCriterion("wsid is not null");
            return (Criteria) this;
        }

        public Criteria andWsidEqualTo(String value) {
            addCriterion("wsid =", value, "wsid");
            return (Criteria) this;
        }

        public Criteria andWsidNotEqualTo(String value) {
            addCriterion("wsid <>", value, "wsid");
            return (Criteria) this;
        }

        public Criteria andWsidGreaterThan(String value) {
            addCriterion("wsid >", value, "wsid");
            return (Criteria) this;
        }

        public Criteria andWsidGreaterThanOrEqualTo(String value) {
            addCriterion("wsid >=", value, "wsid");
            return (Criteria) this;
        }

        public Criteria andWsidLessThan(String value) {
            addCriterion("wsid <", value, "wsid");
            return (Criteria) this;
        }

        public Criteria andWsidLessThanOrEqualTo(String value) {
            addCriterion("wsid <=", value, "wsid");
            return (Criteria) this;
        }

        public Criteria andWsidLike(String value) {
            addCriterion("wsid like", value, "wsid");
            return (Criteria) this;
        }

        public Criteria andWsidNotLike(String value) {
            addCriterion("wsid not like", value, "wsid");
            return (Criteria) this;
        }

        public Criteria andWsidIn(List<String> values) {
            addCriterion("wsid in", values, "wsid");
            return (Criteria) this;
        }

        public Criteria andWsidNotIn(List<String> values) {
            addCriterion("wsid not in", values, "wsid");
            return (Criteria) this;
        }

        public Criteria andWsidBetween(String value1, String value2) {
            addCriterion("wsid between", value1, value2, "wsid");
            return (Criteria) this;
        }

        public Criteria andWsidNotBetween(String value1, String value2) {
            addCriterion("wsid not between", value1, value2, "wsid");
            return (Criteria) this;
        }

        public Criteria andHandleNetuseridIsNull() {
            addCriterion("handle_netuserid is null");
            return (Criteria) this;
        }

        public Criteria andHandleNetuseridIsNotNull() {
            addCriterion("handle_netuserid is not null");
            return (Criteria) this;
        }

        public Criteria andHandleNetuseridEqualTo(String value) {
            addCriterion("handle_netuserid =", value, "handleNetuserid");
            return (Criteria) this;
        }

        public Criteria andHandleNetuseridNotEqualTo(String value) {
            addCriterion("handle_netuserid <>", value, "handleNetuserid");
            return (Criteria) this;
        }

        public Criteria andHandleNetuseridGreaterThan(String value) {
            addCriterion("handle_netuserid >", value, "handleNetuserid");
            return (Criteria) this;
        }

        public Criteria andHandleNetuseridGreaterThanOrEqualTo(String value) {
            addCriterion("handle_netuserid >=", value, "handleNetuserid");
            return (Criteria) this;
        }

        public Criteria andHandleNetuseridLessThan(String value) {
            addCriterion("handle_netuserid <", value, "handleNetuserid");
            return (Criteria) this;
        }

        public Criteria andHandleNetuseridLessThanOrEqualTo(String value) {
            addCriterion("handle_netuserid <=", value, "handleNetuserid");
            return (Criteria) this;
        }

        public Criteria andHandleNetuseridLike(String value) {
            addCriterion("handle_netuserid like", value, "handleNetuserid");
            return (Criteria) this;
        }

        public Criteria andHandleNetuseridNotLike(String value) {
            addCriterion("handle_netuserid not like", value, "handleNetuserid");
            return (Criteria) this;
        }

        public Criteria andHandleNetuseridIn(List<String> values) {
            addCriterion("handle_netuserid in", values, "handleNetuserid");
            return (Criteria) this;
        }

        public Criteria andHandleNetuseridNotIn(List<String> values) {
            addCriterion("handle_netuserid not in", values, "handleNetuserid");
            return (Criteria) this;
        }

        public Criteria andHandleNetuseridBetween(String value1, String value2) {
            addCriterion("handle_netuserid between", value1, value2, "handleNetuserid");
            return (Criteria) this;
        }

        public Criteria andHandleNetuseridNotBetween(String value1, String value2) {
            addCriterion("handle_netuserid not between", value1, value2, "handleNetuserid");
            return (Criteria) this;
        }

        public Criteria andHandleResultIsNull() {
            addCriterion("handle_result is null");
            return (Criteria) this;
        }

        public Criteria andHandleResultIsNotNull() {
            addCriterion("handle_result is not null");
            return (Criteria) this;
        }

        public Criteria andHandleResultEqualTo(String value) {
            addCriterion("handle_result =", value, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleResultNotEqualTo(String value) {
            addCriterion("handle_result <>", value, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleResultGreaterThan(String value) {
            addCriterion("handle_result >", value, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleResultGreaterThanOrEqualTo(String value) {
            addCriterion("handle_result >=", value, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleResultLessThan(String value) {
            addCriterion("handle_result <", value, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleResultLessThanOrEqualTo(String value) {
            addCriterion("handle_result <=", value, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleResultLike(String value) {
            addCriterion("handle_result like", value, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleResultNotLike(String value) {
            addCriterion("handle_result not like", value, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleResultIn(List<String> values) {
            addCriterion("handle_result in", values, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleResultNotIn(List<String> values) {
            addCriterion("handle_result not in", values, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleResultBetween(String value1, String value2) {
            addCriterion("handle_result between", value1, value2, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleResultNotBetween(String value1, String value2) {
            addCriterion("handle_result not between", value1, value2, "handleResult");
            return (Criteria) this;
        }

        public Criteria andTaskKeyIsNull() {
            addCriterion("task_key is null");
            return (Criteria) this;
        }

        public Criteria andTaskKeyIsNotNull() {
            addCriterion("task_key is not null");
            return (Criteria) this;
        }

        public Criteria andTaskKeyEqualTo(String value) {
            addCriterion("task_key =", value, "taskKey");
            return (Criteria) this;
        }

        public Criteria andTaskKeyNotEqualTo(String value) {
            addCriterion("task_key <>", value, "taskKey");
            return (Criteria) this;
        }

        public Criteria andTaskKeyGreaterThan(String value) {
            addCriterion("task_key >", value, "taskKey");
            return (Criteria) this;
        }

        public Criteria andTaskKeyGreaterThanOrEqualTo(String value) {
            addCriterion("task_key >=", value, "taskKey");
            return (Criteria) this;
        }

        public Criteria andTaskKeyLessThan(String value) {
            addCriterion("task_key <", value, "taskKey");
            return (Criteria) this;
        }

        public Criteria andTaskKeyLessThanOrEqualTo(String value) {
            addCriterion("task_key <=", value, "taskKey");
            return (Criteria) this;
        }

        public Criteria andTaskKeyLike(String value) {
            addCriterion("task_key like", value, "taskKey");
            return (Criteria) this;
        }

        public Criteria andTaskKeyNotLike(String value) {
            addCriterion("task_key not like", value, "taskKey");
            return (Criteria) this;
        }

        public Criteria andTaskKeyIn(List<String> values) {
            addCriterion("task_key in", values, "taskKey");
            return (Criteria) this;
        }

        public Criteria andTaskKeyNotIn(List<String> values) {
            addCriterion("task_key not in", values, "taskKey");
            return (Criteria) this;
        }

        public Criteria andTaskKeyBetween(String value1, String value2) {
            addCriterion("task_key between", value1, value2, "taskKey");
            return (Criteria) this;
        }

        public Criteria andTaskKeyNotBetween(String value1, String value2) {
            addCriterion("task_key not between", value1, value2, "taskKey");
            return (Criteria) this;
        }

        public Criteria andHandleCompanyIsNull() {
            addCriterion("handle_company is null");
            return (Criteria) this;
        }

        public Criteria andHandleCompanyIsNotNull() {
            addCriterion("handle_company is not null");
            return (Criteria) this;
        }

        public Criteria andHandleCompanyEqualTo(String value) {
            addCriterion("handle_company =", value, "handleCompany");
            return (Criteria) this;
        }

        public Criteria andHandleCompanyNotEqualTo(String value) {
            addCriterion("handle_company <>", value, "handleCompany");
            return (Criteria) this;
        }

        public Criteria andHandleCompanyGreaterThan(String value) {
            addCriterion("handle_company >", value, "handleCompany");
            return (Criteria) this;
        }

        public Criteria andHandleCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("handle_company >=", value, "handleCompany");
            return (Criteria) this;
        }

        public Criteria andHandleCompanyLessThan(String value) {
            addCriterion("handle_company <", value, "handleCompany");
            return (Criteria) this;
        }

        public Criteria andHandleCompanyLessThanOrEqualTo(String value) {
            addCriterion("handle_company <=", value, "handleCompany");
            return (Criteria) this;
        }

        public Criteria andHandleCompanyLike(String value) {
            addCriterion("handle_company like", value, "handleCompany");
            return (Criteria) this;
        }

        public Criteria andHandleCompanyNotLike(String value) {
            addCriterion("handle_company not like", value, "handleCompany");
            return (Criteria) this;
        }

        public Criteria andHandleCompanyIn(List<String> values) {
            addCriterion("handle_company in", values, "handleCompany");
            return (Criteria) this;
        }

        public Criteria andHandleCompanyNotIn(List<String> values) {
            addCriterion("handle_company not in", values, "handleCompany");
            return (Criteria) this;
        }

        public Criteria andHandleCompanyBetween(String value1, String value2) {
            addCriterion("handle_company between", value1, value2, "handleCompany");
            return (Criteria) this;
        }

        public Criteria andHandleCompanyNotBetween(String value1, String value2) {
            addCriterion("handle_company not between", value1, value2, "handleCompany");
            return (Criteria) this;
        }

        public Criteria andHandleGroupNameIsNull() {
            addCriterion("handle_group_name is null");
            return (Criteria) this;
        }

        public Criteria andHandleGroupNameIsNotNull() {
            addCriterion("handle_group_name is not null");
            return (Criteria) this;
        }

        public Criteria andHandleGroupNameEqualTo(String value) {
            addCriterion("handle_group_name =", value, "handleGroupName");
            return (Criteria) this;
        }

        public Criteria andHandleGroupNameNotEqualTo(String value) {
            addCriterion("handle_group_name <>", value, "handleGroupName");
            return (Criteria) this;
        }

        public Criteria andHandleGroupNameGreaterThan(String value) {
            addCriterion("handle_group_name >", value, "handleGroupName");
            return (Criteria) this;
        }

        public Criteria andHandleGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("handle_group_name >=", value, "handleGroupName");
            return (Criteria) this;
        }

        public Criteria andHandleGroupNameLessThan(String value) {
            addCriterion("handle_group_name <", value, "handleGroupName");
            return (Criteria) this;
        }

        public Criteria andHandleGroupNameLessThanOrEqualTo(String value) {
            addCriterion("handle_group_name <=", value, "handleGroupName");
            return (Criteria) this;
        }

        public Criteria andHandleGroupNameLike(String value) {
            addCriterion("handle_group_name like", value, "handleGroupName");
            return (Criteria) this;
        }

        public Criteria andHandleGroupNameNotLike(String value) {
            addCriterion("handle_group_name not like", value, "handleGroupName");
            return (Criteria) this;
        }

        public Criteria andHandleGroupNameIn(List<String> values) {
            addCriterion("handle_group_name in", values, "handleGroupName");
            return (Criteria) this;
        }

        public Criteria andHandleGroupNameNotIn(List<String> values) {
            addCriterion("handle_group_name not in", values, "handleGroupName");
            return (Criteria) this;
        }

        public Criteria andHandleGroupNameBetween(String value1, String value2) {
            addCriterion("handle_group_name between", value1, value2, "handleGroupName");
            return (Criteria) this;
        }

        public Criteria andHandleGroupNameNotBetween(String value1, String value2) {
            addCriterion("handle_group_name not between", value1, value2, "handleGroupName");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andHandleCommentIsNull() {
            addCriterion("handle_comment is null");
            return (Criteria) this;
        }

        public Criteria andHandleCommentIsNotNull() {
            addCriterion("handle_comment is not null");
            return (Criteria) this;
        }

        public Criteria andHandleCommentEqualTo(String value) {
            addCriterion("handle_comment =", value, "handleComment");
            return (Criteria) this;
        }

        public Criteria andHandleCommentNotEqualTo(String value) {
            addCriterion("handle_comment <>", value, "handleComment");
            return (Criteria) this;
        }

        public Criteria andHandleCommentGreaterThan(String value) {
            addCriterion("handle_comment >", value, "handleComment");
            return (Criteria) this;
        }

        public Criteria andHandleCommentGreaterThanOrEqualTo(String value) {
            addCriterion("handle_comment >=", value, "handleComment");
            return (Criteria) this;
        }

        public Criteria andHandleCommentLessThan(String value) {
            addCriterion("handle_comment <", value, "handleComment");
            return (Criteria) this;
        }

        public Criteria andHandleCommentLessThanOrEqualTo(String value) {
            addCriterion("handle_comment <=", value, "handleComment");
            return (Criteria) this;
        }

        public Criteria andHandleCommentLike(String value) {
            addCriterion("handle_comment like", value, "handleComment");
            return (Criteria) this;
        }

        public Criteria andHandleCommentNotLike(String value) {
            addCriterion("handle_comment not like", value, "handleComment");
            return (Criteria) this;
        }

        public Criteria andHandleCommentIn(List<String> values) {
            addCriterion("handle_comment in", values, "handleComment");
            return (Criteria) this;
        }

        public Criteria andHandleCommentNotIn(List<String> values) {
            addCriterion("handle_comment not in", values, "handleComment");
            return (Criteria) this;
        }

        public Criteria andHandleCommentBetween(String value1, String value2) {
            addCriterion("handle_comment between", value1, value2, "handleComment");
            return (Criteria) this;
        }

        public Criteria andHandleCommentNotBetween(String value1, String value2) {
            addCriterion("handle_comment not between", value1, value2, "handleComment");
            return (Criteria) this;
        }

        public Criteria andHandleUsernameIsNull() {
            addCriterion("handle_username is null");
            return (Criteria) this;
        }

        public Criteria andHandleUsernameIsNotNull() {
            addCriterion("handle_username is not null");
            return (Criteria) this;
        }

        public Criteria andHandleUsernameEqualTo(String value) {
            addCriterion("handle_username =", value, "handleUsername");
            return (Criteria) this;
        }

        public Criteria andHandleUsernameNotEqualTo(String value) {
            addCriterion("handle_username <>", value, "handleUsername");
            return (Criteria) this;
        }

        public Criteria andHandleUsernameGreaterThan(String value) {
            addCriterion("handle_username >", value, "handleUsername");
            return (Criteria) this;
        }

        public Criteria andHandleUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("handle_username >=", value, "handleUsername");
            return (Criteria) this;
        }

        public Criteria andHandleUsernameLessThan(String value) {
            addCriterion("handle_username <", value, "handleUsername");
            return (Criteria) this;
        }

        public Criteria andHandleUsernameLessThanOrEqualTo(String value) {
            addCriterion("handle_username <=", value, "handleUsername");
            return (Criteria) this;
        }

        public Criteria andHandleUsernameLike(String value) {
            addCriterion("handle_username like", value, "handleUsername");
            return (Criteria) this;
        }

        public Criteria andHandleUsernameNotLike(String value) {
            addCriterion("handle_username not like", value, "handleUsername");
            return (Criteria) this;
        }

        public Criteria andHandleUsernameIn(List<String> values) {
            addCriterion("handle_username in", values, "handleUsername");
            return (Criteria) this;
        }

        public Criteria andHandleUsernameNotIn(List<String> values) {
            addCriterion("handle_username not in", values, "handleUsername");
            return (Criteria) this;
        }

        public Criteria andHandleUsernameBetween(String value1, String value2) {
            addCriterion("handle_username between", value1, value2, "handleUsername");
            return (Criteria) this;
        }

        public Criteria andHandleUsernameNotBetween(String value1, String value2) {
            addCriterion("handle_username not between", value1, value2, "handleUsername");
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