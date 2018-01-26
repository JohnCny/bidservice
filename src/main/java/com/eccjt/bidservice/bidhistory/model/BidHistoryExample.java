package com.eccjt.bidservice.bidhistory.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BidHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BidHistoryExample() {
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

        public Criteria andBidTimeIsNull() {
            addCriterion("bid_time is null");
            return (Criteria) this;
        }

        public Criteria andBidTimeIsNotNull() {
            addCriterion("bid_time is not null");
            return (Criteria) this;
        }

        public Criteria andBidTimeEqualTo(Date value) {
            addCriterion("bid_time =", value, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeNotEqualTo(Date value) {
            addCriterion("bid_time <>", value, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeGreaterThan(Date value) {
            addCriterion("bid_time >", value, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bid_time >=", value, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeLessThan(Date value) {
            addCriterion("bid_time <", value, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeLessThanOrEqualTo(Date value) {
            addCriterion("bid_time <=", value, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeIn(List<Date> values) {
            addCriterion("bid_time in", values, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeNotIn(List<Date> values) {
            addCriterion("bid_time not in", values, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeBetween(Date value1, Date value2) {
            addCriterion("bid_time between", value1, value2, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeNotBetween(Date value1, Date value2) {
            addCriterion("bid_time not between", value1, value2, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidPriceIsNull() {
            addCriterion("bid_price is null");
            return (Criteria) this;
        }

        public Criteria andBidPriceIsNotNull() {
            addCriterion("bid_price is not null");
            return (Criteria) this;
        }

        public Criteria andBidPriceEqualTo(Long value) {
            addCriterion("bid_price =", value, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceNotEqualTo(Long value) {
            addCriterion("bid_price <>", value, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceGreaterThan(Long value) {
            addCriterion("bid_price >", value, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("bid_price >=", value, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceLessThan(Long value) {
            addCriterion("bid_price <", value, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceLessThanOrEqualTo(Long value) {
            addCriterion("bid_price <=", value, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceIn(List<Long> values) {
            addCriterion("bid_price in", values, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceNotIn(List<Long> values) {
            addCriterion("bid_price not in", values, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceBetween(Long value1, Long value2) {
            addCriterion("bid_price between", value1, value2, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceNotBetween(Long value1, Long value2) {
            addCriterion("bid_price not between", value1, value2, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andIsPriorityUsedIsNull() {
            addCriterion("is_priority_used is null");
            return (Criteria) this;
        }

        public Criteria andIsPriorityUsedIsNotNull() {
            addCriterion("is_priority_used is not null");
            return (Criteria) this;
        }

        public Criteria andIsPriorityUsedEqualTo(Byte value) {
            addCriterion("is_priority_used =", value, "isPriorityUsed");
            return (Criteria) this;
        }

        public Criteria andIsPriorityUsedNotEqualTo(Byte value) {
            addCriterion("is_priority_used <>", value, "isPriorityUsed");
            return (Criteria) this;
        }

        public Criteria andIsPriorityUsedGreaterThan(Byte value) {
            addCriterion("is_priority_used >", value, "isPriorityUsed");
            return (Criteria) this;
        }

        public Criteria andIsPriorityUsedGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_priority_used >=", value, "isPriorityUsed");
            return (Criteria) this;
        }

        public Criteria andIsPriorityUsedLessThan(Byte value) {
            addCriterion("is_priority_used <", value, "isPriorityUsed");
            return (Criteria) this;
        }

        public Criteria andIsPriorityUsedLessThanOrEqualTo(Byte value) {
            addCriterion("is_priority_used <=", value, "isPriorityUsed");
            return (Criteria) this;
        }

        public Criteria andIsPriorityUsedIn(List<Byte> values) {
            addCriterion("is_priority_used in", values, "isPriorityUsed");
            return (Criteria) this;
        }

        public Criteria andIsPriorityUsedNotIn(List<Byte> values) {
            addCriterion("is_priority_used not in", values, "isPriorityUsed");
            return (Criteria) this;
        }

        public Criteria andIsPriorityUsedBetween(Byte value1, Byte value2) {
            addCriterion("is_priority_used between", value1, value2, "isPriorityUsed");
            return (Criteria) this;
        }

        public Criteria andIsPriorityUsedNotBetween(Byte value1, Byte value2) {
            addCriterion("is_priority_used not between", value1, value2, "isPriorityUsed");
            return (Criteria) this;
        }

        public Criteria andPriorityLevelIsNull() {
            addCriterion("priority_level is null");
            return (Criteria) this;
        }

        public Criteria andPriorityLevelIsNotNull() {
            addCriterion("priority_level is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityLevelEqualTo(Byte value) {
            addCriterion("priority_level =", value, "priorityLevel");
            return (Criteria) this;
        }

        public Criteria andPriorityLevelNotEqualTo(Byte value) {
            addCriterion("priority_level <>", value, "priorityLevel");
            return (Criteria) this;
        }

        public Criteria andPriorityLevelGreaterThan(Byte value) {
            addCriterion("priority_level >", value, "priorityLevel");
            return (Criteria) this;
        }

        public Criteria andPriorityLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("priority_level >=", value, "priorityLevel");
            return (Criteria) this;
        }

        public Criteria andPriorityLevelLessThan(Byte value) {
            addCriterion("priority_level <", value, "priorityLevel");
            return (Criteria) this;
        }

        public Criteria andPriorityLevelLessThanOrEqualTo(Byte value) {
            addCriterion("priority_level <=", value, "priorityLevel");
            return (Criteria) this;
        }

        public Criteria andPriorityLevelIn(List<Byte> values) {
            addCriterion("priority_level in", values, "priorityLevel");
            return (Criteria) this;
        }

        public Criteria andPriorityLevelNotIn(List<Byte> values) {
            addCriterion("priority_level not in", values, "priorityLevel");
            return (Criteria) this;
        }

        public Criteria andPriorityLevelBetween(Byte value1, Byte value2) {
            addCriterion("priority_level between", value1, value2, "priorityLevel");
            return (Criteria) this;
        }

        public Criteria andPriorityLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("priority_level not between", value1, value2, "priorityLevel");
            return (Criteria) this;
        }

        public Criteria andIsBestPriceIsNull() {
            addCriterion("is_best_price is null");
            return (Criteria) this;
        }

        public Criteria andIsBestPriceIsNotNull() {
            addCriterion("is_best_price is not null");
            return (Criteria) this;
        }

        public Criteria andIsBestPriceEqualTo(Byte value) {
            addCriterion("is_best_price =", value, "isBestPrice");
            return (Criteria) this;
        }

        public Criteria andIsBestPriceNotEqualTo(Byte value) {
            addCriterion("is_best_price <>", value, "isBestPrice");
            return (Criteria) this;
        }

        public Criteria andIsBestPriceGreaterThan(Byte value) {
            addCriterion("is_best_price >", value, "isBestPrice");
            return (Criteria) this;
        }

        public Criteria andIsBestPriceGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_best_price >=", value, "isBestPrice");
            return (Criteria) this;
        }

        public Criteria andIsBestPriceLessThan(Byte value) {
            addCriterion("is_best_price <", value, "isBestPrice");
            return (Criteria) this;
        }

        public Criteria andIsBestPriceLessThanOrEqualTo(Byte value) {
            addCriterion("is_best_price <=", value, "isBestPrice");
            return (Criteria) this;
        }

        public Criteria andIsBestPriceIn(List<Byte> values) {
            addCriterion("is_best_price in", values, "isBestPrice");
            return (Criteria) this;
        }

        public Criteria andIsBestPriceNotIn(List<Byte> values) {
            addCriterion("is_best_price not in", values, "isBestPrice");
            return (Criteria) this;
        }

        public Criteria andIsBestPriceBetween(Byte value1, Byte value2) {
            addCriterion("is_best_price between", value1, value2, "isBestPrice");
            return (Criteria) this;
        }

        public Criteria andIsBestPriceNotBetween(Byte value1, Byte value2) {
            addCriterion("is_best_price not between", value1, value2, "isBestPrice");
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