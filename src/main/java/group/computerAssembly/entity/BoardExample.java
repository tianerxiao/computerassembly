package group.computerAssembly.entity;

import java.util.ArrayList;
import java.util.List;

public class BoardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BoardExample() {
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

        public Criteria andBoardIdIsNull() {
            addCriterion("board_id is null");
            return (Criteria) this;
        }

        public Criteria andBoardIdIsNotNull() {
            addCriterion("board_id is not null");
            return (Criteria) this;
        }

        public Criteria andBoardIdEqualTo(Integer value) {
            addCriterion("board_id =", value, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdNotEqualTo(Integer value) {
            addCriterion("board_id <>", value, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdGreaterThan(Integer value) {
            addCriterion("board_id >", value, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("board_id >=", value, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdLessThan(Integer value) {
            addCriterion("board_id <", value, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdLessThanOrEqualTo(Integer value) {
            addCriterion("board_id <=", value, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdIn(List<Integer> values) {
            addCriterion("board_id in", values, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdNotIn(List<Integer> values) {
            addCriterion("board_id not in", values, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdBetween(Integer value1, Integer value2) {
            addCriterion("board_id between", value1, value2, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdNotBetween(Integer value1, Integer value2) {
            addCriterion("board_id not between", value1, value2, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardNameIsNull() {
            addCriterion("board_name is null");
            return (Criteria) this;
        }

        public Criteria andBoardNameIsNotNull() {
            addCriterion("board_name is not null");
            return (Criteria) this;
        }

        public Criteria andBoardNameEqualTo(String value) {
            addCriterion("board_name =", value, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameNotEqualTo(String value) {
            addCriterion("board_name <>", value, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameGreaterThan(String value) {
            addCriterion("board_name >", value, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameGreaterThanOrEqualTo(String value) {
            addCriterion("board_name >=", value, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameLessThan(String value) {
            addCriterion("board_name <", value, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameLessThanOrEqualTo(String value) {
            addCriterion("board_name <=", value, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameLike(String value) {
            addCriterion("board_name like", value, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameNotLike(String value) {
            addCriterion("board_name not like", value, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameIn(List<String> values) {
            addCriterion("board_name in", values, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameNotIn(List<String> values) {
            addCriterion("board_name not in", values, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameBetween(String value1, String value2) {
            addCriterion("board_name between", value1, value2, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameNotBetween(String value1, String value2) {
            addCriterion("board_name not between", value1, value2, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardPriceIsNull() {
            addCriterion("board_price is null");
            return (Criteria) this;
        }

        public Criteria andBoardPriceIsNotNull() {
            addCriterion("board_price is not null");
            return (Criteria) this;
        }

        public Criteria andBoardPriceEqualTo(String value) {
            addCriterion("board_price =", value, "boardPrice");
            return (Criteria) this;
        }

        public Criteria andBoardPriceNotEqualTo(String value) {
            addCriterion("board_price <>", value, "boardPrice");
            return (Criteria) this;
        }

        public Criteria andBoardPriceGreaterThan(String value) {
            addCriterion("board_price >", value, "boardPrice");
            return (Criteria) this;
        }

        public Criteria andBoardPriceGreaterThanOrEqualTo(String value) {
            addCriterion("board_price >=", value, "boardPrice");
            return (Criteria) this;
        }

        public Criteria andBoardPriceLessThan(String value) {
            addCriterion("board_price <", value, "boardPrice");
            return (Criteria) this;
        }

        public Criteria andBoardPriceLessThanOrEqualTo(String value) {
            addCriterion("board_price <=", value, "boardPrice");
            return (Criteria) this;
        }

        public Criteria andBoardPriceLike(String value) {
            addCriterion("board_price like", value, "boardPrice");
            return (Criteria) this;
        }

        public Criteria andBoardPriceNotLike(String value) {
            addCriterion("board_price not like", value, "boardPrice");
            return (Criteria) this;
        }

        public Criteria andBoardPriceIn(List<String> values) {
            addCriterion("board_price in", values, "boardPrice");
            return (Criteria) this;
        }

        public Criteria andBoardPriceNotIn(List<String> values) {
            addCriterion("board_price not in", values, "boardPrice");
            return (Criteria) this;
        }

        public Criteria andBoardPriceBetween(String value1, String value2) {
            addCriterion("board_price between", value1, value2, "boardPrice");
            return (Criteria) this;
        }

        public Criteria andBoardPriceNotBetween(String value1, String value2) {
            addCriterion("board_price not between", value1, value2, "boardPrice");
            return (Criteria) this;
        }

        public Criteria andBoardDescribeIsNull() {
            addCriterion("board_describe is null");
            return (Criteria) this;
        }

        public Criteria andBoardDescribeIsNotNull() {
            addCriterion("board_describe is not null");
            return (Criteria) this;
        }

        public Criteria andBoardDescribeEqualTo(String value) {
            addCriterion("board_describe =", value, "boardDescribe");
            return (Criteria) this;
        }

        public Criteria andBoardDescribeNotEqualTo(String value) {
            addCriterion("board_describe <>", value, "boardDescribe");
            return (Criteria) this;
        }

        public Criteria andBoardDescribeGreaterThan(String value) {
            addCriterion("board_describe >", value, "boardDescribe");
            return (Criteria) this;
        }

        public Criteria andBoardDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("board_describe >=", value, "boardDescribe");
            return (Criteria) this;
        }

        public Criteria andBoardDescribeLessThan(String value) {
            addCriterion("board_describe <", value, "boardDescribe");
            return (Criteria) this;
        }

        public Criteria andBoardDescribeLessThanOrEqualTo(String value) {
            addCriterion("board_describe <=", value, "boardDescribe");
            return (Criteria) this;
        }

        public Criteria andBoardDescribeLike(String value) {
            addCriterion("board_describe like", value, "boardDescribe");
            return (Criteria) this;
        }

        public Criteria andBoardDescribeNotLike(String value) {
            addCriterion("board_describe not like", value, "boardDescribe");
            return (Criteria) this;
        }

        public Criteria andBoardDescribeIn(List<String> values) {
            addCriterion("board_describe in", values, "boardDescribe");
            return (Criteria) this;
        }

        public Criteria andBoardDescribeNotIn(List<String> values) {
            addCriterion("board_describe not in", values, "boardDescribe");
            return (Criteria) this;
        }

        public Criteria andBoardDescribeBetween(String value1, String value2) {
            addCriterion("board_describe between", value1, value2, "boardDescribe");
            return (Criteria) this;
        }

        public Criteria andBoardDescribeNotBetween(String value1, String value2) {
            addCriterion("board_describe not between", value1, value2, "boardDescribe");
            return (Criteria) this;
        }

        public Criteria andBoardHrefIsNull() {
            addCriterion("board_href is null");
            return (Criteria) this;
        }

        public Criteria andBoardHrefIsNotNull() {
            addCriterion("board_href is not null");
            return (Criteria) this;
        }

        public Criteria andBoardHrefEqualTo(String value) {
            addCriterion("board_href =", value, "boardHref");
            return (Criteria) this;
        }

        public Criteria andBoardHrefNotEqualTo(String value) {
            addCriterion("board_href <>", value, "boardHref");
            return (Criteria) this;
        }

        public Criteria andBoardHrefGreaterThan(String value) {
            addCriterion("board_href >", value, "boardHref");
            return (Criteria) this;
        }

        public Criteria andBoardHrefGreaterThanOrEqualTo(String value) {
            addCriterion("board_href >=", value, "boardHref");
            return (Criteria) this;
        }

        public Criteria andBoardHrefLessThan(String value) {
            addCriterion("board_href <", value, "boardHref");
            return (Criteria) this;
        }

        public Criteria andBoardHrefLessThanOrEqualTo(String value) {
            addCriterion("board_href <=", value, "boardHref");
            return (Criteria) this;
        }

        public Criteria andBoardHrefLike(String value) {
            addCriterion("board_href like", value, "boardHref");
            return (Criteria) this;
        }

        public Criteria andBoardHrefNotLike(String value) {
            addCriterion("board_href not like", value, "boardHref");
            return (Criteria) this;
        }

        public Criteria andBoardHrefIn(List<String> values) {
            addCriterion("board_href in", values, "boardHref");
            return (Criteria) this;
        }

        public Criteria andBoardHrefNotIn(List<String> values) {
            addCriterion("board_href not in", values, "boardHref");
            return (Criteria) this;
        }

        public Criteria andBoardHrefBetween(String value1, String value2) {
            addCriterion("board_href between", value1, value2, "boardHref");
            return (Criteria) this;
        }

        public Criteria andBoardHrefNotBetween(String value1, String value2) {
            addCriterion("board_href not between", value1, value2, "boardHref");
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