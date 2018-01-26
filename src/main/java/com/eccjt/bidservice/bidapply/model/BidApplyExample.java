package com.eccjt.bidservice.bidapply.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BidApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BidApplyExample() {
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

        public Criteria andApplyStatusIsNull() {
            addCriterion("apply_status is null");
            return (Criteria) this;
        }

        public Criteria andApplyStatusIsNotNull() {
            addCriterion("apply_status is not null");
            return (Criteria) this;
        }

        public Criteria andApplyStatusEqualTo(Byte value) {
            addCriterion("apply_status =", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusNotEqualTo(Byte value) {
            addCriterion("apply_status <>", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusGreaterThan(Byte value) {
            addCriterion("apply_status >", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("apply_status >=", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusLessThan(Byte value) {
            addCriterion("apply_status <", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusLessThanOrEqualTo(Byte value) {
            addCriterion("apply_status <=", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusIn(List<Byte> values) {
            addCriterion("apply_status in", values, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusNotIn(List<Byte> values) {
            addCriterion("apply_status not in", values, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusBetween(Byte value1, Byte value2) {
            addCriterion("apply_status between", value1, value2, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("apply_status not between", value1, value2, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andBidUserIsNull() {
            addCriterion("bid_user is null");
            return (Criteria) this;
        }

        public Criteria andBidUserIsNotNull() {
            addCriterion("bid_user is not null");
            return (Criteria) this;
        }

        public Criteria andBidUserEqualTo(String value) {
            addCriterion("bid_user =", value, "bidUser");
            return (Criteria) this;
        }

        public Criteria andBidUserNotEqualTo(String value) {
            addCriterion("bid_user <>", value, "bidUser");
            return (Criteria) this;
        }

        public Criteria andBidUserGreaterThan(String value) {
            addCriterion("bid_user >", value, "bidUser");
            return (Criteria) this;
        }

        public Criteria andBidUserGreaterThanOrEqualTo(String value) {
            addCriterion("bid_user >=", value, "bidUser");
            return (Criteria) this;
        }

        public Criteria andBidUserLessThan(String value) {
            addCriterion("bid_user <", value, "bidUser");
            return (Criteria) this;
        }

        public Criteria andBidUserLessThanOrEqualTo(String value) {
            addCriterion("bid_user <=", value, "bidUser");
            return (Criteria) this;
        }

        public Criteria andBidUserLike(String value) {
            addCriterion("bid_user like", value, "bidUser");
            return (Criteria) this;
        }

        public Criteria andBidUserNotLike(String value) {
            addCriterion("bid_user not like", value, "bidUser");
            return (Criteria) this;
        }

        public Criteria andBidUserIn(List<String> values) {
            addCriterion("bid_user in", values, "bidUser");
            return (Criteria) this;
        }

        public Criteria andBidUserNotIn(List<String> values) {
            addCriterion("bid_user not in", values, "bidUser");
            return (Criteria) this;
        }

        public Criteria andBidUserBetween(String value1, String value2) {
            addCriterion("bid_user between", value1, value2, "bidUser");
            return (Criteria) this;
        }

        public Criteria andBidUserNotBetween(String value1, String value2) {
            addCriterion("bid_user not between", value1, value2, "bidUser");
            return (Criteria) this;
        }

        public Criteria andPayedSecDepIsNull() {
            addCriterion("payed_sec_dep is null");
            return (Criteria) this;
        }

        public Criteria andPayedSecDepIsNotNull() {
            addCriterion("payed_sec_dep is not null");
            return (Criteria) this;
        }

        public Criteria andPayedSecDepEqualTo(Long value) {
            addCriterion("payed_sec_dep =", value, "payedSecDep");
            return (Criteria) this;
        }

        public Criteria andPayedSecDepNotEqualTo(Long value) {
            addCriterion("payed_sec_dep <>", value, "payedSecDep");
            return (Criteria) this;
        }

        public Criteria andPayedSecDepGreaterThan(Long value) {
            addCriterion("payed_sec_dep >", value, "payedSecDep");
            return (Criteria) this;
        }

        public Criteria andPayedSecDepGreaterThanOrEqualTo(Long value) {
            addCriterion("payed_sec_dep >=", value, "payedSecDep");
            return (Criteria) this;
        }

        public Criteria andPayedSecDepLessThan(Long value) {
            addCriterion("payed_sec_dep <", value, "payedSecDep");
            return (Criteria) this;
        }

        public Criteria andPayedSecDepLessThanOrEqualTo(Long value) {
            addCriterion("payed_sec_dep <=", value, "payedSecDep");
            return (Criteria) this;
        }

        public Criteria andPayedSecDepIn(List<Long> values) {
            addCriterion("payed_sec_dep in", values, "payedSecDep");
            return (Criteria) this;
        }

        public Criteria andPayedSecDepNotIn(List<Long> values) {
            addCriterion("payed_sec_dep not in", values, "payedSecDep");
            return (Criteria) this;
        }

        public Criteria andPayedSecDepBetween(Long value1, Long value2) {
            addCriterion("payed_sec_dep between", value1, value2, "payedSecDep");
            return (Criteria) this;
        }

        public Criteria andPayedSecDepNotBetween(Long value1, Long value2) {
            addCriterion("payed_sec_dep not between", value1, value2, "payedSecDep");
            return (Criteria) this;
        }

        public Criteria andBidRoomIsNull() {
            addCriterion("bid_room is null");
            return (Criteria) this;
        }

        public Criteria andBidRoomIsNotNull() {
            addCriterion("bid_room is not null");
            return (Criteria) this;
        }

        public Criteria andBidRoomEqualTo(String value) {
            addCriterion("bid_room =", value, "bidRoom");
            return (Criteria) this;
        }

        public Criteria andBidRoomNotEqualTo(String value) {
            addCriterion("bid_room <>", value, "bidRoom");
            return (Criteria) this;
        }

        public Criteria andBidRoomGreaterThan(String value) {
            addCriterion("bid_room >", value, "bidRoom");
            return (Criteria) this;
        }

        public Criteria andBidRoomGreaterThanOrEqualTo(String value) {
            addCriterion("bid_room >=", value, "bidRoom");
            return (Criteria) this;
        }

        public Criteria andBidRoomLessThan(String value) {
            addCriterion("bid_room <", value, "bidRoom");
            return (Criteria) this;
        }

        public Criteria andBidRoomLessThanOrEqualTo(String value) {
            addCriterion("bid_room <=", value, "bidRoom");
            return (Criteria) this;
        }

        public Criteria andBidRoomLike(String value) {
            addCriterion("bid_room like", value, "bidRoom");
            return (Criteria) this;
        }

        public Criteria andBidRoomNotLike(String value) {
            addCriterion("bid_room not like", value, "bidRoom");
            return (Criteria) this;
        }

        public Criteria andBidRoomIn(List<String> values) {
            addCriterion("bid_room in", values, "bidRoom");
            return (Criteria) this;
        }

        public Criteria andBidRoomNotIn(List<String> values) {
            addCriterion("bid_room not in", values, "bidRoom");
            return (Criteria) this;
        }

        public Criteria andBidRoomBetween(String value1, String value2) {
            addCriterion("bid_room between", value1, value2, "bidRoom");
            return (Criteria) this;
        }

        public Criteria andBidRoomNotBetween(String value1, String value2) {
            addCriterion("bid_room not between", value1, value2, "bidRoom");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNull() {
            addCriterion("subject is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNotNull() {
            addCriterion("subject is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectEqualTo(String value) {
            addCriterion("subject =", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotEqualTo(String value) {
            addCriterion("subject <>", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThan(String value) {
            addCriterion("subject >", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("subject >=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThan(String value) {
            addCriterion("subject <", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThanOrEqualTo(String value) {
            addCriterion("subject <=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLike(String value) {
            addCriterion("subject like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotLike(String value) {
            addCriterion("subject not like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectIn(List<String> values) {
            addCriterion("subject in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotIn(List<String> values) {
            addCriterion("subject not in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectBetween(String value1, String value2) {
            addCriterion("subject between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotBetween(String value1, String value2) {
            addCriterion("subject not between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
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