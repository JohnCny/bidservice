package com.eccjt.bidservice.subject.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SubjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SubjectExample() {
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

        public Criteria andBidIntervalIsNull() {
            addCriterion("bid_interval is null");
            return (Criteria) this;
        }

        public Criteria andBidIntervalIsNotNull() {
            addCriterion("bid_interval is not null");
            return (Criteria) this;
        }

        public Criteria andBidIntervalEqualTo(Integer value) {
            addCriterion("bid_interval =", value, "bidInterval");
            return (Criteria) this;
        }

        public Criteria andBidIntervalNotEqualTo(Integer value) {
            addCriterion("bid_interval <>", value, "bidInterval");
            return (Criteria) this;
        }

        public Criteria andBidIntervalGreaterThan(Integer value) {
            addCriterion("bid_interval >", value, "bidInterval");
            return (Criteria) this;
        }

        public Criteria andBidIntervalGreaterThanOrEqualTo(Integer value) {
            addCriterion("bid_interval >=", value, "bidInterval");
            return (Criteria) this;
        }

        public Criteria andBidIntervalLessThan(Integer value) {
            addCriterion("bid_interval <", value, "bidInterval");
            return (Criteria) this;
        }

        public Criteria andBidIntervalLessThanOrEqualTo(Integer value) {
            addCriterion("bid_interval <=", value, "bidInterval");
            return (Criteria) this;
        }

        public Criteria andBidIntervalIn(List<Integer> values) {
            addCriterion("bid_interval in", values, "bidInterval");
            return (Criteria) this;
        }

        public Criteria andBidIntervalNotIn(List<Integer> values) {
            addCriterion("bid_interval not in", values, "bidInterval");
            return (Criteria) this;
        }

        public Criteria andBidIntervalBetween(Integer value1, Integer value2) {
            addCriterion("bid_interval between", value1, value2, "bidInterval");
            return (Criteria) this;
        }

        public Criteria andBidIntervalNotBetween(Integer value1, Integer value2) {
            addCriterion("bid_interval not between", value1, value2, "bidInterval");
            return (Criteria) this;
        }

        public Criteria andBidLadderIsNull() {
            addCriterion("bid_ladder is null");
            return (Criteria) this;
        }

        public Criteria andBidLadderIsNotNull() {
            addCriterion("bid_ladder is not null");
            return (Criteria) this;
        }

        public Criteria andBidLadderEqualTo(Integer value) {
            addCriterion("bid_ladder =", value, "bidLadder");
            return (Criteria) this;
        }

        public Criteria andBidLadderNotEqualTo(Integer value) {
            addCriterion("bid_ladder <>", value, "bidLadder");
            return (Criteria) this;
        }

        public Criteria andBidLadderGreaterThan(Integer value) {
            addCriterion("bid_ladder >", value, "bidLadder");
            return (Criteria) this;
        }

        public Criteria andBidLadderGreaterThanOrEqualTo(Integer value) {
            addCriterion("bid_ladder >=", value, "bidLadder");
            return (Criteria) this;
        }

        public Criteria andBidLadderLessThan(Integer value) {
            addCriterion("bid_ladder <", value, "bidLadder");
            return (Criteria) this;
        }

        public Criteria andBidLadderLessThanOrEqualTo(Integer value) {
            addCriterion("bid_ladder <=", value, "bidLadder");
            return (Criteria) this;
        }

        public Criteria andBidLadderIn(List<Integer> values) {
            addCriterion("bid_ladder in", values, "bidLadder");
            return (Criteria) this;
        }

        public Criteria andBidLadderNotIn(List<Integer> values) {
            addCriterion("bid_ladder not in", values, "bidLadder");
            return (Criteria) this;
        }

        public Criteria andBidLadderBetween(Integer value1, Integer value2) {
            addCriterion("bid_ladder between", value1, value2, "bidLadder");
            return (Criteria) this;
        }

        public Criteria andBidLadderNotBetween(Integer value1, Integer value2) {
            addCriterion("bid_ladder not between", value1, value2, "bidLadder");
            return (Criteria) this;
        }

        public Criteria andBidTypeIsNull() {
            addCriterion("bid_type is null");
            return (Criteria) this;
        }

        public Criteria andBidTypeIsNotNull() {
            addCriterion("bid_type is not null");
            return (Criteria) this;
        }

        public Criteria andBidTypeEqualTo(String value) {
            addCriterion("bid_type =", value, "bidType");
            return (Criteria) this;
        }

        public Criteria andBidTypeNotEqualTo(String value) {
            addCriterion("bid_type <>", value, "bidType");
            return (Criteria) this;
        }

        public Criteria andBidTypeGreaterThan(String value) {
            addCriterion("bid_type >", value, "bidType");
            return (Criteria) this;
        }

        public Criteria andBidTypeGreaterThanOrEqualTo(String value) {
            addCriterion("bid_type >=", value, "bidType");
            return (Criteria) this;
        }

        public Criteria andBidTypeLessThan(String value) {
            addCriterion("bid_type <", value, "bidType");
            return (Criteria) this;
        }

        public Criteria andBidTypeLessThanOrEqualTo(String value) {
            addCriterion("bid_type <=", value, "bidType");
            return (Criteria) this;
        }

        public Criteria andBidTypeLike(String value) {
            addCriterion("bid_type like", value, "bidType");
            return (Criteria) this;
        }

        public Criteria andBidTypeNotLike(String value) {
            addCriterion("bid_type not like", value, "bidType");
            return (Criteria) this;
        }

        public Criteria andBidTypeIn(List<String> values) {
            addCriterion("bid_type in", values, "bidType");
            return (Criteria) this;
        }

        public Criteria andBidTypeNotIn(List<String> values) {
            addCriterion("bid_type not in", values, "bidType");
            return (Criteria) this;
        }

        public Criteria andBidTypeBetween(String value1, String value2) {
            addCriterion("bid_type between", value1, value2, "bidType");
            return (Criteria) this;
        }

        public Criteria andBidTypeNotBetween(String value1, String value2) {
            addCriterion("bid_type not between", value1, value2, "bidType");
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

        public Criteria andDeadlineIsNull() {
            addCriterion("deadline is null");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNotNull() {
            addCriterion("deadline is not null");
            return (Criteria) this;
        }

        public Criteria andDeadlineEqualTo(Date value) {
            addCriterion("deadline =", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotEqualTo(Date value) {
            addCriterion("deadline <>", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThan(Date value) {
            addCriterion("deadline >", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThanOrEqualTo(Date value) {
            addCriterion("deadline >=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThan(Date value) {
            addCriterion("deadline <", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThanOrEqualTo(Date value) {
            addCriterion("deadline <=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineIn(List<Date> values) {
            addCriterion("deadline in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotIn(List<Date> values) {
            addCriterion("deadline not in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineBetween(Date value1, Date value2) {
            addCriterion("deadline between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotBetween(Date value1, Date value2) {
            addCriterion("deadline not between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andDealTypeIsNull() {
            addCriterion("deal_type is null");
            return (Criteria) this;
        }

        public Criteria andDealTypeIsNotNull() {
            addCriterion("deal_type is not null");
            return (Criteria) this;
        }

        public Criteria andDealTypeEqualTo(String value) {
            addCriterion("deal_type =", value, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeNotEqualTo(String value) {
            addCriterion("deal_type <>", value, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeGreaterThan(String value) {
            addCriterion("deal_type >", value, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeGreaterThanOrEqualTo(String value) {
            addCriterion("deal_type >=", value, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeLessThan(String value) {
            addCriterion("deal_type <", value, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeLessThanOrEqualTo(String value) {
            addCriterion("deal_type <=", value, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeLike(String value) {
            addCriterion("deal_type like", value, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeNotLike(String value) {
            addCriterion("deal_type not like", value, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeIn(List<String> values) {
            addCriterion("deal_type in", values, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeNotIn(List<String> values) {
            addCriterion("deal_type not in", values, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeBetween(String value1, String value2) {
            addCriterion("deal_type between", value1, value2, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeNotBetween(String value1, String value2) {
            addCriterion("deal_type not between", value1, value2, "dealType");
            return (Criteria) this;
        }

        public Criteria andIsBidStartIsNull() {
            addCriterion("is_bid_start is null");
            return (Criteria) this;
        }

        public Criteria andIsBidStartIsNotNull() {
            addCriterion("is_bid_start is not null");
            return (Criteria) this;
        }

        public Criteria andIsBidStartEqualTo(Byte value) {
            addCriterion("is_bid_start =", value, "isBidStart");
            return (Criteria) this;
        }

        public Criteria andIsBidStartNotEqualTo(Byte value) {
            addCriterion("is_bid_start <>", value, "isBidStart");
            return (Criteria) this;
        }

        public Criteria andIsBidStartGreaterThan(Byte value) {
            addCriterion("is_bid_start >", value, "isBidStart");
            return (Criteria) this;
        }

        public Criteria andIsBidStartGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_bid_start >=", value, "isBidStart");
            return (Criteria) this;
        }

        public Criteria andIsBidStartLessThan(Byte value) {
            addCriterion("is_bid_start <", value, "isBidStart");
            return (Criteria) this;
        }

        public Criteria andIsBidStartLessThanOrEqualTo(Byte value) {
            addCriterion("is_bid_start <=", value, "isBidStart");
            return (Criteria) this;
        }

        public Criteria andIsBidStartIn(List<Byte> values) {
            addCriterion("is_bid_start in", values, "isBidStart");
            return (Criteria) this;
        }

        public Criteria andIsBidStartNotIn(List<Byte> values) {
            addCriterion("is_bid_start not in", values, "isBidStart");
            return (Criteria) this;
        }

        public Criteria andIsBidStartBetween(Byte value1, Byte value2) {
            addCriterion("is_bid_start between", value1, value2, "isBidStart");
            return (Criteria) this;
        }

        public Criteria andIsBidStartNotBetween(Byte value1, Byte value2) {
            addCriterion("is_bid_start not between", value1, value2, "isBidStart");
            return (Criteria) this;
        }

        public Criteria andIsBidBestIsNull() {
            addCriterion("is_bid_best is null");
            return (Criteria) this;
        }

        public Criteria andIsBidBestIsNotNull() {
            addCriterion("is_bid_best is not null");
            return (Criteria) this;
        }

        public Criteria andIsBidBestEqualTo(Byte value) {
            addCriterion("is_bid_best =", value, "isBidBest");
            return (Criteria) this;
        }

        public Criteria andIsBidBestNotEqualTo(Byte value) {
            addCriterion("is_bid_best <>", value, "isBidBest");
            return (Criteria) this;
        }

        public Criteria andIsBidBestGreaterThan(Byte value) {
            addCriterion("is_bid_best >", value, "isBidBest");
            return (Criteria) this;
        }

        public Criteria andIsBidBestGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_bid_best >=", value, "isBidBest");
            return (Criteria) this;
        }

        public Criteria andIsBidBestLessThan(Byte value) {
            addCriterion("is_bid_best <", value, "isBidBest");
            return (Criteria) this;
        }

        public Criteria andIsBidBestLessThanOrEqualTo(Byte value) {
            addCriterion("is_bid_best <=", value, "isBidBest");
            return (Criteria) this;
        }

        public Criteria andIsBidBestIn(List<Byte> values) {
            addCriterion("is_bid_best in", values, "isBidBest");
            return (Criteria) this;
        }

        public Criteria andIsBidBestNotIn(List<Byte> values) {
            addCriterion("is_bid_best not in", values, "isBidBest");
            return (Criteria) this;
        }

        public Criteria andIsBidBestBetween(Byte value1, Byte value2) {
            addCriterion("is_bid_best between", value1, value2, "isBidBest");
            return (Criteria) this;
        }

        public Criteria andIsBidBestNotBetween(Byte value1, Byte value2) {
            addCriterion("is_bid_best not between", value1, value2, "isBidBest");
            return (Criteria) this;
        }

        public Criteria andIsRePrShownIsNull() {
            addCriterion("is_re_pr_shown is null");
            return (Criteria) this;
        }

        public Criteria andIsRePrShownIsNotNull() {
            addCriterion("is_re_pr_shown is not null");
            return (Criteria) this;
        }

        public Criteria andIsRePrShownEqualTo(Byte value) {
            addCriterion("is_re_pr_shown =", value, "isRePrShown");
            return (Criteria) this;
        }

        public Criteria andIsRePrShownNotEqualTo(Byte value) {
            addCriterion("is_re_pr_shown <>", value, "isRePrShown");
            return (Criteria) this;
        }

        public Criteria andIsRePrShownGreaterThan(Byte value) {
            addCriterion("is_re_pr_shown >", value, "isRePrShown");
            return (Criteria) this;
        }

        public Criteria andIsRePrShownGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_re_pr_shown >=", value, "isRePrShown");
            return (Criteria) this;
        }

        public Criteria andIsRePrShownLessThan(Byte value) {
            addCriterion("is_re_pr_shown <", value, "isRePrShown");
            return (Criteria) this;
        }

        public Criteria andIsRePrShownLessThanOrEqualTo(Byte value) {
            addCriterion("is_re_pr_shown <=", value, "isRePrShown");
            return (Criteria) this;
        }

        public Criteria andIsRePrShownIn(List<Byte> values) {
            addCriterion("is_re_pr_shown in", values, "isRePrShown");
            return (Criteria) this;
        }

        public Criteria andIsRePrShownNotIn(List<Byte> values) {
            addCriterion("is_re_pr_shown not in", values, "isRePrShown");
            return (Criteria) this;
        }

        public Criteria andIsRePrShownBetween(Byte value1, Byte value2) {
            addCriterion("is_re_pr_shown between", value1, value2, "isRePrShown");
            return (Criteria) this;
        }

        public Criteria andIsRePrShownNotBetween(Byte value1, Byte value2) {
            addCriterion("is_re_pr_shown not between", value1, value2, "isRePrShown");
            return (Criteria) this;
        }

        public Criteria andIsRoundsIsNull() {
            addCriterion("is_rounds is null");
            return (Criteria) this;
        }

        public Criteria andIsRoundsIsNotNull() {
            addCriterion("is_rounds is not null");
            return (Criteria) this;
        }

        public Criteria andIsRoundsEqualTo(Byte value) {
            addCriterion("is_rounds =", value, "isRounds");
            return (Criteria) this;
        }

        public Criteria andIsRoundsNotEqualTo(Byte value) {
            addCriterion("is_rounds <>", value, "isRounds");
            return (Criteria) this;
        }

        public Criteria andIsRoundsGreaterThan(Byte value) {
            addCriterion("is_rounds >", value, "isRounds");
            return (Criteria) this;
        }

        public Criteria andIsRoundsGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_rounds >=", value, "isRounds");
            return (Criteria) this;
        }

        public Criteria andIsRoundsLessThan(Byte value) {
            addCriterion("is_rounds <", value, "isRounds");
            return (Criteria) this;
        }

        public Criteria andIsRoundsLessThanOrEqualTo(Byte value) {
            addCriterion("is_rounds <=", value, "isRounds");
            return (Criteria) this;
        }

        public Criteria andIsRoundsIn(List<Byte> values) {
            addCriterion("is_rounds in", values, "isRounds");
            return (Criteria) this;
        }

        public Criteria andIsRoundsNotIn(List<Byte> values) {
            addCriterion("is_rounds not in", values, "isRounds");
            return (Criteria) this;
        }

        public Criteria andIsRoundsBetween(Byte value1, Byte value2) {
            addCriterion("is_rounds between", value1, value2, "isRounds");
            return (Criteria) this;
        }

        public Criteria andIsRoundsNotBetween(Byte value1, Byte value2) {
            addCriterion("is_rounds not between", value1, value2, "isRounds");
            return (Criteria) this;
        }

        public Criteria andIsPriorityIsNull() {
            addCriterion("is_priority is null");
            return (Criteria) this;
        }

        public Criteria andIsPriorityIsNotNull() {
            addCriterion("is_priority is not null");
            return (Criteria) this;
        }

        public Criteria andIsPriorityEqualTo(Byte value) {
            addCriterion("is_priority =", value, "isPriority");
            return (Criteria) this;
        }

        public Criteria andIsPriorityNotEqualTo(Byte value) {
            addCriterion("is_priority <>", value, "isPriority");
            return (Criteria) this;
        }

        public Criteria andIsPriorityGreaterThan(Byte value) {
            addCriterion("is_priority >", value, "isPriority");
            return (Criteria) this;
        }

        public Criteria andIsPriorityGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_priority >=", value, "isPriority");
            return (Criteria) this;
        }

        public Criteria andIsPriorityLessThan(Byte value) {
            addCriterion("is_priority <", value, "isPriority");
            return (Criteria) this;
        }

        public Criteria andIsPriorityLessThanOrEqualTo(Byte value) {
            addCriterion("is_priority <=", value, "isPriority");
            return (Criteria) this;
        }

        public Criteria andIsPriorityIn(List<Byte> values) {
            addCriterion("is_priority in", values, "isPriority");
            return (Criteria) this;
        }

        public Criteria andIsPriorityNotIn(List<Byte> values) {
            addCriterion("is_priority not in", values, "isPriority");
            return (Criteria) this;
        }

        public Criteria andIsPriorityBetween(Byte value1, Byte value2) {
            addCriterion("is_priority between", value1, value2, "isPriority");
            return (Criteria) this;
        }

        public Criteria andIsPriorityNotBetween(Byte value1, Byte value2) {
            addCriterion("is_priority not between", value1, value2, "isPriority");
            return (Criteria) this;
        }

        public Criteria andManagerIsNull() {
            addCriterion("manager is null");
            return (Criteria) this;
        }

        public Criteria andManagerIsNotNull() {
            addCriterion("manager is not null");
            return (Criteria) this;
        }

        public Criteria andManagerEqualTo(String value) {
            addCriterion("manager =", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotEqualTo(String value) {
            addCriterion("manager <>", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerGreaterThan(String value) {
            addCriterion("manager >", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerGreaterThanOrEqualTo(String value) {
            addCriterion("manager >=", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerLessThan(String value) {
            addCriterion("manager <", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerLessThanOrEqualTo(String value) {
            addCriterion("manager <=", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerLike(String value) {
            addCriterion("manager like", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotLike(String value) {
            addCriterion("manager not like", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerIn(List<String> values) {
            addCriterion("manager in", values, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotIn(List<String> values) {
            addCriterion("manager not in", values, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerBetween(String value1, String value2) {
            addCriterion("manager between", value1, value2, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotBetween(String value1, String value2) {
            addCriterion("manager not between", value1, value2, "manager");
            return (Criteria) this;
        }

        public Criteria andProjectIsNull() {
            addCriterion("project is null");
            return (Criteria) this;
        }

        public Criteria andProjectIsNotNull() {
            addCriterion("project is not null");
            return (Criteria) this;
        }

        public Criteria andProjectEqualTo(String value) {
            addCriterion("project =", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotEqualTo(String value) {
            addCriterion("project <>", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectGreaterThan(String value) {
            addCriterion("project >", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectGreaterThanOrEqualTo(String value) {
            addCriterion("project >=", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLessThan(String value) {
            addCriterion("project <", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLessThanOrEqualTo(String value) {
            addCriterion("project <=", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLike(String value) {
            addCriterion("project like", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotLike(String value) {
            addCriterion("project not like", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectIn(List<String> values) {
            addCriterion("project in", values, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotIn(List<String> values) {
            addCriterion("project not in", values, "project");
            return (Criteria) this;
        }

        public Criteria andProjectBetween(String value1, String value2) {
            addCriterion("project between", value1, value2, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotBetween(String value1, String value2) {
            addCriterion("project not between", value1, value2, "project");
            return (Criteria) this;
        }

        public Criteria andPauseTimeIsNull() {
            addCriterion("pause_time is null");
            return (Criteria) this;
        }

        public Criteria andPauseTimeIsNotNull() {
            addCriterion("pause_time is not null");
            return (Criteria) this;
        }

        public Criteria andPauseTimeEqualTo(Date value) {
            addCriterion("pause_time =", value, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andPauseTimeNotEqualTo(Date value) {
            addCriterion("pause_time <>", value, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andPauseTimeGreaterThan(Date value) {
            addCriterion("pause_time >", value, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andPauseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pause_time >=", value, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andPauseTimeLessThan(Date value) {
            addCriterion("pause_time <", value, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andPauseTimeLessThanOrEqualTo(Date value) {
            addCriterion("pause_time <=", value, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andPauseTimeIn(List<Date> values) {
            addCriterion("pause_time in", values, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andPauseTimeNotIn(List<Date> values) {
            addCriterion("pause_time not in", values, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andPauseTimeBetween(Date value1, Date value2) {
            addCriterion("pause_time between", value1, value2, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andPauseTimeNotBetween(Date value1, Date value2) {
            addCriterion("pause_time not between", value1, value2, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andReserverPriceIsNull() {
            addCriterion("reserver_price is null");
            return (Criteria) this;
        }

        public Criteria andReserverPriceIsNotNull() {
            addCriterion("reserver_price is not null");
            return (Criteria) this;
        }

        public Criteria andReserverPriceEqualTo(Long value) {
            addCriterion("reserver_price =", value, "reserverPrice");
            return (Criteria) this;
        }

        public Criteria andReserverPriceNotEqualTo(Long value) {
            addCriterion("reserver_price <>", value, "reserverPrice");
            return (Criteria) this;
        }

        public Criteria andReserverPriceGreaterThan(Long value) {
            addCriterion("reserver_price >", value, "reserverPrice");
            return (Criteria) this;
        }

        public Criteria andReserverPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("reserver_price >=", value, "reserverPrice");
            return (Criteria) this;
        }

        public Criteria andReserverPriceLessThan(Long value) {
            addCriterion("reserver_price <", value, "reserverPrice");
            return (Criteria) this;
        }

        public Criteria andReserverPriceLessThanOrEqualTo(Long value) {
            addCriterion("reserver_price <=", value, "reserverPrice");
            return (Criteria) this;
        }

        public Criteria andReserverPriceIn(List<Long> values) {
            addCriterion("reserver_price in", values, "reserverPrice");
            return (Criteria) this;
        }

        public Criteria andReserverPriceNotIn(List<Long> values) {
            addCriterion("reserver_price not in", values, "reserverPrice");
            return (Criteria) this;
        }

        public Criteria andReserverPriceBetween(Long value1, Long value2) {
            addCriterion("reserver_price between", value1, value2, "reserverPrice");
            return (Criteria) this;
        }

        public Criteria andReserverPriceNotBetween(Long value1, Long value2) {
            addCriterion("reserver_price not between", value1, value2, "reserverPrice");
            return (Criteria) this;
        }

        public Criteria andSecurityDepositIsNull() {
            addCriterion("security_deposit is null");
            return (Criteria) this;
        }

        public Criteria andSecurityDepositIsNotNull() {
            addCriterion("security_deposit is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityDepositEqualTo(Long value) {
            addCriterion("security_deposit =", value, "securityDeposit");
            return (Criteria) this;
        }

        public Criteria andSecurityDepositNotEqualTo(Long value) {
            addCriterion("security_deposit <>", value, "securityDeposit");
            return (Criteria) this;
        }

        public Criteria andSecurityDepositGreaterThan(Long value) {
            addCriterion("security_deposit >", value, "securityDeposit");
            return (Criteria) this;
        }

        public Criteria andSecurityDepositGreaterThanOrEqualTo(Long value) {
            addCriterion("security_deposit >=", value, "securityDeposit");
            return (Criteria) this;
        }

        public Criteria andSecurityDepositLessThan(Long value) {
            addCriterion("security_deposit <", value, "securityDeposit");
            return (Criteria) this;
        }

        public Criteria andSecurityDepositLessThanOrEqualTo(Long value) {
            addCriterion("security_deposit <=", value, "securityDeposit");
            return (Criteria) this;
        }

        public Criteria andSecurityDepositIn(List<Long> values) {
            addCriterion("security_deposit in", values, "securityDeposit");
            return (Criteria) this;
        }

        public Criteria andSecurityDepositNotIn(List<Long> values) {
            addCriterion("security_deposit not in", values, "securityDeposit");
            return (Criteria) this;
        }

        public Criteria andSecurityDepositBetween(Long value1, Long value2) {
            addCriterion("security_deposit between", value1, value2, "securityDeposit");
            return (Criteria) this;
        }

        public Criteria andSecurityDepositNotBetween(Long value1, Long value2) {
            addCriterion("security_deposit not between", value1, value2, "securityDeposit");
            return (Criteria) this;
        }

        public Criteria andStartPriceIsNull() {
            addCriterion("start_price is null");
            return (Criteria) this;
        }

        public Criteria andStartPriceIsNotNull() {
            addCriterion("start_price is not null");
            return (Criteria) this;
        }

        public Criteria andStartPriceEqualTo(Long value) {
            addCriterion("start_price =", value, "startPrice");
            return (Criteria) this;
        }

        public Criteria andStartPriceNotEqualTo(Long value) {
            addCriterion("start_price <>", value, "startPrice");
            return (Criteria) this;
        }

        public Criteria andStartPriceGreaterThan(Long value) {
            addCriterion("start_price >", value, "startPrice");
            return (Criteria) this;
        }

        public Criteria andStartPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("start_price >=", value, "startPrice");
            return (Criteria) this;
        }

        public Criteria andStartPriceLessThan(Long value) {
            addCriterion("start_price <", value, "startPrice");
            return (Criteria) this;
        }

        public Criteria andStartPriceLessThanOrEqualTo(Long value) {
            addCriterion("start_price <=", value, "startPrice");
            return (Criteria) this;
        }

        public Criteria andStartPriceIn(List<Long> values) {
            addCriterion("start_price in", values, "startPrice");
            return (Criteria) this;
        }

        public Criteria andStartPriceNotIn(List<Long> values) {
            addCriterion("start_price not in", values, "startPrice");
            return (Criteria) this;
        }

        public Criteria andStartPriceBetween(Long value1, Long value2) {
            addCriterion("start_price between", value1, value2, "startPrice");
            return (Criteria) this;
        }

        public Criteria andStartPriceNotBetween(Long value1, Long value2) {
            addCriterion("start_price not between", value1, value2, "startPrice");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andSubjectNameIsNull() {
            addCriterion("subject_name is null");
            return (Criteria) this;
        }

        public Criteria andSubjectNameIsNotNull() {
            addCriterion("subject_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectNameEqualTo(String value) {
            addCriterion("subject_name =", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotEqualTo(String value) {
            addCriterion("subject_name <>", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameGreaterThan(String value) {
            addCriterion("subject_name >", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("subject_name >=", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameLessThan(String value) {
            addCriterion("subject_name <", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameLessThanOrEqualTo(String value) {
            addCriterion("subject_name <=", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameLike(String value) {
            addCriterion("subject_name like", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotLike(String value) {
            addCriterion("subject_name not like", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameIn(List<String> values) {
            addCriterion("subject_name in", values, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotIn(List<String> values) {
            addCriterion("subject_name not in", values, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameBetween(String value1, String value2) {
            addCriterion("subject_name between", value1, value2, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotBetween(String value1, String value2) {
            addCriterion("subject_name not between", value1, value2, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusIsNull() {
            addCriterion("subject_status is null");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusIsNotNull() {
            addCriterion("subject_status is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusEqualTo(Byte value) {
            addCriterion("subject_status =", value, "subjectStatus");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusNotEqualTo(Byte value) {
            addCriterion("subject_status <>", value, "subjectStatus");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusGreaterThan(Byte value) {
            addCriterion("subject_status >", value, "subjectStatus");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("subject_status >=", value, "subjectStatus");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusLessThan(Byte value) {
            addCriterion("subject_status <", value, "subjectStatus");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusLessThanOrEqualTo(Byte value) {
            addCriterion("subject_status <=", value, "subjectStatus");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusIn(List<Byte> values) {
            addCriterion("subject_status in", values, "subjectStatus");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusNotIn(List<Byte> values) {
            addCriterion("subject_status not in", values, "subjectStatus");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusBetween(Byte value1, Byte value2) {
            addCriterion("subject_status between", value1, value2, "subjectStatus");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("subject_status not between", value1, value2, "subjectStatus");
            return (Criteria) this;
        }

        public Criteria andSubjectRemarkIsNull() {
            addCriterion("subject_remark is null");
            return (Criteria) this;
        }

        public Criteria andSubjectRemarkIsNotNull() {
            addCriterion("subject_remark is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectRemarkEqualTo(String value) {
            addCriterion("subject_remark =", value, "subjectRemark");
            return (Criteria) this;
        }

        public Criteria andSubjectRemarkNotEqualTo(String value) {
            addCriterion("subject_remark <>", value, "subjectRemark");
            return (Criteria) this;
        }

        public Criteria andSubjectRemarkGreaterThan(String value) {
            addCriterion("subject_remark >", value, "subjectRemark");
            return (Criteria) this;
        }

        public Criteria andSubjectRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("subject_remark >=", value, "subjectRemark");
            return (Criteria) this;
        }

        public Criteria andSubjectRemarkLessThan(String value) {
            addCriterion("subject_remark <", value, "subjectRemark");
            return (Criteria) this;
        }

        public Criteria andSubjectRemarkLessThanOrEqualTo(String value) {
            addCriterion("subject_remark <=", value, "subjectRemark");
            return (Criteria) this;
        }

        public Criteria andSubjectRemarkLike(String value) {
            addCriterion("subject_remark like", value, "subjectRemark");
            return (Criteria) this;
        }

        public Criteria andSubjectRemarkNotLike(String value) {
            addCriterion("subject_remark not like", value, "subjectRemark");
            return (Criteria) this;
        }

        public Criteria andSubjectRemarkIn(List<String> values) {
            addCriterion("subject_remark in", values, "subjectRemark");
            return (Criteria) this;
        }

        public Criteria andSubjectRemarkNotIn(List<String> values) {
            addCriterion("subject_remark not in", values, "subjectRemark");
            return (Criteria) this;
        }

        public Criteria andSubjectRemarkBetween(String value1, String value2) {
            addCriterion("subject_remark between", value1, value2, "subjectRemark");
            return (Criteria) this;
        }

        public Criteria andSubjectRemarkNotBetween(String value1, String value2) {
            addCriterion("subject_remark not between", value1, value2, "subjectRemark");
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