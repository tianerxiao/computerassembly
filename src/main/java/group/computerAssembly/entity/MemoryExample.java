package group.computerAssembly.entity;

import java.util.ArrayList;
import java.util.List;

public class MemoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemoryExample() {
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

        public Criteria andMemIdIsNull() {
            addCriterion("mem_id is null");
            return (Criteria) this;
        }

        public Criteria andMemIdIsNotNull() {
            addCriterion("mem_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemIdEqualTo(Integer value) {
            addCriterion("mem_id =", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdNotEqualTo(Integer value) {
            addCriterion("mem_id <>", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdGreaterThan(Integer value) {
            addCriterion("mem_id >", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mem_id >=", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdLessThan(Integer value) {
            addCriterion("mem_id <", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdLessThanOrEqualTo(Integer value) {
            addCriterion("mem_id <=", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdIn(List<Integer> values) {
            addCriterion("mem_id in", values, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdNotIn(List<Integer> values) {
            addCriterion("mem_id not in", values, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdBetween(Integer value1, Integer value2) {
            addCriterion("mem_id between", value1, value2, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mem_id not between", value1, value2, "memId");
            return (Criteria) this;
        }

        public Criteria andMemNameIsNull() {
            addCriterion("mem_name is null");
            return (Criteria) this;
        }

        public Criteria andMemNameIsNotNull() {
            addCriterion("mem_name is not null");
            return (Criteria) this;
        }

        public Criteria andMemNameEqualTo(String value) {
            addCriterion("mem_name =", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameNotEqualTo(String value) {
            addCriterion("mem_name <>", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameGreaterThan(String value) {
            addCriterion("mem_name >", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameGreaterThanOrEqualTo(String value) {
            addCriterion("mem_name >=", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameLessThan(String value) {
            addCriterion("mem_name <", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameLessThanOrEqualTo(String value) {
            addCriterion("mem_name <=", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameLike(String value) {
            addCriterion("mem_name like", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameNotLike(String value) {
            addCriterion("mem_name not like", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameIn(List<String> values) {
            addCriterion("mem_name in", values, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameNotIn(List<String> values) {
            addCriterion("mem_name not in", values, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameBetween(String value1, String value2) {
            addCriterion("mem_name between", value1, value2, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameNotBetween(String value1, String value2) {
            addCriterion("mem_name not between", value1, value2, "memName");
            return (Criteria) this;
        }

        public Criteria andMemPriceIsNull() {
            addCriterion("mem_price is null");
            return (Criteria) this;
        }

        public Criteria andMemPriceIsNotNull() {
            addCriterion("mem_price is not null");
            return (Criteria) this;
        }

        public Criteria andMemPriceEqualTo(String value) {
            addCriterion("mem_price =", value, "memPrice");
            return (Criteria) this;
        }

        public Criteria andMemPriceNotEqualTo(String value) {
            addCriterion("mem_price <>", value, "memPrice");
            return (Criteria) this;
        }

        public Criteria andMemPriceGreaterThan(String value) {
            addCriterion("mem_price >", value, "memPrice");
            return (Criteria) this;
        }

        public Criteria andMemPriceGreaterThanOrEqualTo(String value) {
            addCriterion("mem_price >=", value, "memPrice");
            return (Criteria) this;
        }

        public Criteria andMemPriceLessThan(String value) {
            addCriterion("mem_price <", value, "memPrice");
            return (Criteria) this;
        }

        public Criteria andMemPriceLessThanOrEqualTo(String value) {
            addCriterion("mem_price <=", value, "memPrice");
            return (Criteria) this;
        }

        public Criteria andMemPriceLike(String value) {
            addCriterion("mem_price like", value, "memPrice");
            return (Criteria) this;
        }

        public Criteria andMemPriceNotLike(String value) {
            addCriterion("mem_price not like", value, "memPrice");
            return (Criteria) this;
        }

        public Criteria andMemPriceIn(List<String> values) {
            addCriterion("mem_price in", values, "memPrice");
            return (Criteria) this;
        }

        public Criteria andMemPriceNotIn(List<String> values) {
            addCriterion("mem_price not in", values, "memPrice");
            return (Criteria) this;
        }

        public Criteria andMemPriceBetween(String value1, String value2) {
            addCriterion("mem_price between", value1, value2, "memPrice");
            return (Criteria) this;
        }

        public Criteria andMemPriceNotBetween(String value1, String value2) {
            addCriterion("mem_price not between", value1, value2, "memPrice");
            return (Criteria) this;
        }

        public Criteria andMemDescribeIsNull() {
            addCriterion("mem_describe is null");
            return (Criteria) this;
        }

        public Criteria andMemDescribeIsNotNull() {
            addCriterion("mem_describe is not null");
            return (Criteria) this;
        }

        public Criteria andMemDescribeEqualTo(String value) {
            addCriterion("mem_describe =", value, "memDescribe");
            return (Criteria) this;
        }

        public Criteria andMemDescribeNotEqualTo(String value) {
            addCriterion("mem_describe <>", value, "memDescribe");
            return (Criteria) this;
        }

        public Criteria andMemDescribeGreaterThan(String value) {
            addCriterion("mem_describe >", value, "memDescribe");
            return (Criteria) this;
        }

        public Criteria andMemDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("mem_describe >=", value, "memDescribe");
            return (Criteria) this;
        }

        public Criteria andMemDescribeLessThan(String value) {
            addCriterion("mem_describe <", value, "memDescribe");
            return (Criteria) this;
        }

        public Criteria andMemDescribeLessThanOrEqualTo(String value) {
            addCriterion("mem_describe <=", value, "memDescribe");
            return (Criteria) this;
        }

        public Criteria andMemDescribeLike(String value) {
            addCriterion("mem_describe like", value, "memDescribe");
            return (Criteria) this;
        }

        public Criteria andMemDescribeNotLike(String value) {
            addCriterion("mem_describe not like", value, "memDescribe");
            return (Criteria) this;
        }

        public Criteria andMemDescribeIn(List<String> values) {
            addCriterion("mem_describe in", values, "memDescribe");
            return (Criteria) this;
        }

        public Criteria andMemDescribeNotIn(List<String> values) {
            addCriterion("mem_describe not in", values, "memDescribe");
            return (Criteria) this;
        }

        public Criteria andMemDescribeBetween(String value1, String value2) {
            addCriterion("mem_describe between", value1, value2, "memDescribe");
            return (Criteria) this;
        }

        public Criteria andMemDescribeNotBetween(String value1, String value2) {
            addCriterion("mem_describe not between", value1, value2, "memDescribe");
            return (Criteria) this;
        }

        public Criteria andMemHrefIsNull() {
            addCriterion("mem_href is null");
            return (Criteria) this;
        }

        public Criteria andMemHrefIsNotNull() {
            addCriterion("mem_href is not null");
            return (Criteria) this;
        }

        public Criteria andMemHrefEqualTo(String value) {
            addCriterion("mem_href =", value, "memHref");
            return (Criteria) this;
        }

        public Criteria andMemHrefNotEqualTo(String value) {
            addCriterion("mem_href <>", value, "memHref");
            return (Criteria) this;
        }

        public Criteria andMemHrefGreaterThan(String value) {
            addCriterion("mem_href >", value, "memHref");
            return (Criteria) this;
        }

        public Criteria andMemHrefGreaterThanOrEqualTo(String value) {
            addCriterion("mem_href >=", value, "memHref");
            return (Criteria) this;
        }

        public Criteria andMemHrefLessThan(String value) {
            addCriterion("mem_href <", value, "memHref");
            return (Criteria) this;
        }

        public Criteria andMemHrefLessThanOrEqualTo(String value) {
            addCriterion("mem_href <=", value, "memHref");
            return (Criteria) this;
        }

        public Criteria andMemHrefLike(String value) {
            addCriterion("mem_href like", value, "memHref");
            return (Criteria) this;
        }

        public Criteria andMemHrefNotLike(String value) {
            addCriterion("mem_href not like", value, "memHref");
            return (Criteria) this;
        }

        public Criteria andMemHrefIn(List<String> values) {
            addCriterion("mem_href in", values, "memHref");
            return (Criteria) this;
        }

        public Criteria andMemHrefNotIn(List<String> values) {
            addCriterion("mem_href not in", values, "memHref");
            return (Criteria) this;
        }

        public Criteria andMemHrefBetween(String value1, String value2) {
            addCriterion("mem_href between", value1, value2, "memHref");
            return (Criteria) this;
        }

        public Criteria andMemHrefNotBetween(String value1, String value2) {
            addCriterion("mem_href not between", value1, value2, "memHref");
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