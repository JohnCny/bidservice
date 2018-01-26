package com.eccjt.bidservice.casuser.model;

import java.util.ArrayList;
import java.util.List;

public class CasUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CasUserExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCasUserNameIsNull() {
            addCriterion("cas_user_name is null");
            return (Criteria) this;
        }

        public Criteria andCasUserNameIsNotNull() {
            addCriterion("cas_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andCasUserNameEqualTo(String value) {
            addCriterion("cas_user_name =", value, "casUserName");
            return (Criteria) this;
        }

        public Criteria andCasUserNameNotEqualTo(String value) {
            addCriterion("cas_user_name <>", value, "casUserName");
            return (Criteria) this;
        }

        public Criteria andCasUserNameGreaterThan(String value) {
            addCriterion("cas_user_name >", value, "casUserName");
            return (Criteria) this;
        }

        public Criteria andCasUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("cas_user_name >=", value, "casUserName");
            return (Criteria) this;
        }

        public Criteria andCasUserNameLessThan(String value) {
            addCriterion("cas_user_name <", value, "casUserName");
            return (Criteria) this;
        }

        public Criteria andCasUserNameLessThanOrEqualTo(String value) {
            addCriterion("cas_user_name <=", value, "casUserName");
            return (Criteria) this;
        }

        public Criteria andCasUserNameLike(String value) {
            addCriterion("cas_user_name like", value, "casUserName");
            return (Criteria) this;
        }

        public Criteria andCasUserNameNotLike(String value) {
            addCriterion("cas_user_name not like", value, "casUserName");
            return (Criteria) this;
        }

        public Criteria andCasUserNameIn(List<String> values) {
            addCriterion("cas_user_name in", values, "casUserName");
            return (Criteria) this;
        }

        public Criteria andCasUserNameNotIn(List<String> values) {
            addCriterion("cas_user_name not in", values, "casUserName");
            return (Criteria) this;
        }

        public Criteria andCasUserNameBetween(String value1, String value2) {
            addCriterion("cas_user_name between", value1, value2, "casUserName");
            return (Criteria) this;
        }

        public Criteria andCasUserNameNotBetween(String value1, String value2) {
            addCriterion("cas_user_name not between", value1, value2, "casUserName");
            return (Criteria) this;
        }

        public Criteria andSysUserIsNull() {
            addCriterion("sys_user is null");
            return (Criteria) this;
        }

        public Criteria andSysUserIsNotNull() {
            addCriterion("sys_user is not null");
            return (Criteria) this;
        }

        public Criteria andSysUserEqualTo(String value) {
            addCriterion("sys_user =", value, "sysUser");
            return (Criteria) this;
        }

        public Criteria andSysUserNotEqualTo(String value) {
            addCriterion("sys_user <>", value, "sysUser");
            return (Criteria) this;
        }

        public Criteria andSysUserGreaterThan(String value) {
            addCriterion("sys_user >", value, "sysUser");
            return (Criteria) this;
        }

        public Criteria andSysUserGreaterThanOrEqualTo(String value) {
            addCriterion("sys_user >=", value, "sysUser");
            return (Criteria) this;
        }

        public Criteria andSysUserLessThan(String value) {
            addCriterion("sys_user <", value, "sysUser");
            return (Criteria) this;
        }

        public Criteria andSysUserLessThanOrEqualTo(String value) {
            addCriterion("sys_user <=", value, "sysUser");
            return (Criteria) this;
        }

        public Criteria andSysUserLike(String value) {
            addCriterion("sys_user like", value, "sysUser");
            return (Criteria) this;
        }

        public Criteria andSysUserNotLike(String value) {
            addCriterion("sys_user not like", value, "sysUser");
            return (Criteria) this;
        }

        public Criteria andSysUserIn(List<String> values) {
            addCriterion("sys_user in", values, "sysUser");
            return (Criteria) this;
        }

        public Criteria andSysUserNotIn(List<String> values) {
            addCriterion("sys_user not in", values, "sysUser");
            return (Criteria) this;
        }

        public Criteria andSysUserBetween(String value1, String value2) {
            addCriterion("sys_user between", value1, value2, "sysUser");
            return (Criteria) this;
        }

        public Criteria andSysUserNotBetween(String value1, String value2) {
            addCriterion("sys_user not between", value1, value2, "sysUser");
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