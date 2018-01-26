package com.eccjt.bidservice.sysorg.model;

import java.util.ArrayList;
import java.util.List;

public class SysOrgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysOrgExample() {
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

        public Criteria andOrgNameIsNull() {
            addCriterion("org_name is null");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNotNull() {
            addCriterion("org_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNameEqualTo(String value) {
            addCriterion("org_name =", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotEqualTo(String value) {
            addCriterion("org_name <>", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThan(String value) {
            addCriterion("org_name >", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("org_name >=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThan(String value) {
            addCriterion("org_name <", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThanOrEqualTo(String value) {
            addCriterion("org_name <=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLike(String value) {
            addCriterion("org_name like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotLike(String value) {
            addCriterion("org_name not like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameIn(List<String> values) {
            addCriterion("org_name in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotIn(List<String> values) {
            addCriterion("org_name not in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameBetween(String value1, String value2) {
            addCriterion("org_name between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotBetween(String value1, String value2) {
            addCriterion("org_name not between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andPresentOrgIsNull() {
            addCriterion("present_org is null");
            return (Criteria) this;
        }

        public Criteria andPresentOrgIsNotNull() {
            addCriterion("present_org is not null");
            return (Criteria) this;
        }

        public Criteria andPresentOrgEqualTo(String value) {
            addCriterion("present_org =", value, "presentOrg");
            return (Criteria) this;
        }

        public Criteria andPresentOrgNotEqualTo(String value) {
            addCriterion("present_org <>", value, "presentOrg");
            return (Criteria) this;
        }

        public Criteria andPresentOrgGreaterThan(String value) {
            addCriterion("present_org >", value, "presentOrg");
            return (Criteria) this;
        }

        public Criteria andPresentOrgGreaterThanOrEqualTo(String value) {
            addCriterion("present_org >=", value, "presentOrg");
            return (Criteria) this;
        }

        public Criteria andPresentOrgLessThan(String value) {
            addCriterion("present_org <", value, "presentOrg");
            return (Criteria) this;
        }

        public Criteria andPresentOrgLessThanOrEqualTo(String value) {
            addCriterion("present_org <=", value, "presentOrg");
            return (Criteria) this;
        }

        public Criteria andPresentOrgLike(String value) {
            addCriterion("present_org like", value, "presentOrg");
            return (Criteria) this;
        }

        public Criteria andPresentOrgNotLike(String value) {
            addCriterion("present_org not like", value, "presentOrg");
            return (Criteria) this;
        }

        public Criteria andPresentOrgIn(List<String> values) {
            addCriterion("present_org in", values, "presentOrg");
            return (Criteria) this;
        }

        public Criteria andPresentOrgNotIn(List<String> values) {
            addCriterion("present_org not in", values, "presentOrg");
            return (Criteria) this;
        }

        public Criteria andPresentOrgBetween(String value1, String value2) {
            addCriterion("present_org between", value1, value2, "presentOrg");
            return (Criteria) this;
        }

        public Criteria andPresentOrgNotBetween(String value1, String value2) {
            addCriterion("present_org not between", value1, value2, "presentOrg");
            return (Criteria) this;
        }

        public Criteria andOrgTokenIsNull() {
            addCriterion("org_token is null");
            return (Criteria) this;
        }

        public Criteria andOrgTokenIsNotNull() {
            addCriterion("org_token is not null");
            return (Criteria) this;
        }

        public Criteria andOrgTokenEqualTo(String value) {
            addCriterion("org_token =", value, "orgToken");
            return (Criteria) this;
        }

        public Criteria andOrgTokenNotEqualTo(String value) {
            addCriterion("org_token <>", value, "orgToken");
            return (Criteria) this;
        }

        public Criteria andOrgTokenGreaterThan(String value) {
            addCriterion("org_token >", value, "orgToken");
            return (Criteria) this;
        }

        public Criteria andOrgTokenGreaterThanOrEqualTo(String value) {
            addCriterion("org_token >=", value, "orgToken");
            return (Criteria) this;
        }

        public Criteria andOrgTokenLessThan(String value) {
            addCriterion("org_token <", value, "orgToken");
            return (Criteria) this;
        }

        public Criteria andOrgTokenLessThanOrEqualTo(String value) {
            addCriterion("org_token <=", value, "orgToken");
            return (Criteria) this;
        }

        public Criteria andOrgTokenLike(String value) {
            addCriterion("org_token like", value, "orgToken");
            return (Criteria) this;
        }

        public Criteria andOrgTokenNotLike(String value) {
            addCriterion("org_token not like", value, "orgToken");
            return (Criteria) this;
        }

        public Criteria andOrgTokenIn(List<String> values) {
            addCriterion("org_token in", values, "orgToken");
            return (Criteria) this;
        }

        public Criteria andOrgTokenNotIn(List<String> values) {
            addCriterion("org_token not in", values, "orgToken");
            return (Criteria) this;
        }

        public Criteria andOrgTokenBetween(String value1, String value2) {
            addCriterion("org_token between", value1, value2, "orgToken");
            return (Criteria) this;
        }

        public Criteria andOrgTokenNotBetween(String value1, String value2) {
            addCriterion("org_token not between", value1, value2, "orgToken");
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