package group.computerAssembly.entity;

import java.util.ArrayList;
import java.util.List;

public class PowerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PowerExample() {
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

        public Criteria andPowerIdIsNull() {
            addCriterion("power_id is null");
            return (Criteria) this;
        }

        public Criteria andPowerIdIsNotNull() {
            addCriterion("power_id is not null");
            return (Criteria) this;
        }

        public Criteria andPowerIdEqualTo(Integer value) {
            addCriterion("power_id =", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdNotEqualTo(Integer value) {
            addCriterion("power_id <>", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdGreaterThan(Integer value) {
            addCriterion("power_id >", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("power_id >=", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdLessThan(Integer value) {
            addCriterion("power_id <", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdLessThanOrEqualTo(Integer value) {
            addCriterion("power_id <=", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdIn(List<Integer> values) {
            addCriterion("power_id in", values, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdNotIn(List<Integer> values) {
            addCriterion("power_id not in", values, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdBetween(Integer value1, Integer value2) {
            addCriterion("power_id between", value1, value2, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("power_id not between", value1, value2, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerNameIsNull() {
            addCriterion("power_name is null");
            return (Criteria) this;
        }

        public Criteria andPowerNameIsNotNull() {
            addCriterion("power_name is not null");
            return (Criteria) this;
        }

        public Criteria andPowerNameEqualTo(String value) {
            addCriterion("power_name =", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameNotEqualTo(String value) {
            addCriterion("power_name <>", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameGreaterThan(String value) {
            addCriterion("power_name >", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameGreaterThanOrEqualTo(String value) {
            addCriterion("power_name >=", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameLessThan(String value) {
            addCriterion("power_name <", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameLessThanOrEqualTo(String value) {
            addCriterion("power_name <=", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameLike(String value) {
            addCriterion("power_name like", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameNotLike(String value) {
            addCriterion("power_name not like", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameIn(List<String> values) {
            addCriterion("power_name in", values, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameNotIn(List<String> values) {
            addCriterion("power_name not in", values, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameBetween(String value1, String value2) {
            addCriterion("power_name between", value1, value2, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameNotBetween(String value1, String value2) {
            addCriterion("power_name not between", value1, value2, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerPriceIsNull() {
            addCriterion("power_price is null");
            return (Criteria) this;
        }

        public Criteria andPowerPriceIsNotNull() {
            addCriterion("power_price is not null");
            return (Criteria) this;
        }

        public Criteria andPowerPriceEqualTo(String value) {
            addCriterion("power_price =", value, "powerPrice");
            return (Criteria) this;
        }

        public Criteria andPowerPriceNotEqualTo(String value) {
            addCriterion("power_price <>", value, "powerPrice");
            return (Criteria) this;
        }

        public Criteria andPowerPriceGreaterThan(String value) {
            addCriterion("power_price >", value, "powerPrice");
            return (Criteria) this;
        }

        public Criteria andPowerPriceGreaterThanOrEqualTo(String value) {
            addCriterion("power_price >=", value, "powerPrice");
            return (Criteria) this;
        }

        public Criteria andPowerPriceLessThan(String value) {
            addCriterion("power_price <", value, "powerPrice");
            return (Criteria) this;
        }

        public Criteria andPowerPriceLessThanOrEqualTo(String value) {
            addCriterion("power_price <=", value, "powerPrice");
            return (Criteria) this;
        }

        public Criteria andPowerPriceLike(String value) {
            addCriterion("power_price like", value, "powerPrice");
            return (Criteria) this;
        }

        public Criteria andPowerPriceNotLike(String value) {
            addCriterion("power_price not like", value, "powerPrice");
            return (Criteria) this;
        }

        public Criteria andPowerPriceIn(List<String> values) {
            addCriterion("power_price in", values, "powerPrice");
            return (Criteria) this;
        }

        public Criteria andPowerPriceNotIn(List<String> values) {
            addCriterion("power_price not in", values, "powerPrice");
            return (Criteria) this;
        }

        public Criteria andPowerPriceBetween(String value1, String value2) {
            addCriterion("power_price between", value1, value2, "powerPrice");
            return (Criteria) this;
        }

        public Criteria andPowerPriceNotBetween(String value1, String value2) {
            addCriterion("power_price not between", value1, value2, "powerPrice");
            return (Criteria) this;
        }

        public Criteria andPowerHrefIsNull() {
            addCriterion("power_href is null");
            return (Criteria) this;
        }

        public Criteria andPowerHrefIsNotNull() {
            addCriterion("power_href is not null");
            return (Criteria) this;
        }

        public Criteria andPowerHrefEqualTo(String value) {
            addCriterion("power_href =", value, "powerHref");
            return (Criteria) this;
        }

        public Criteria andPowerHrefNotEqualTo(String value) {
            addCriterion("power_href <>", value, "powerHref");
            return (Criteria) this;
        }

        public Criteria andPowerHrefGreaterThan(String value) {
            addCriterion("power_href >", value, "powerHref");
            return (Criteria) this;
        }

        public Criteria andPowerHrefGreaterThanOrEqualTo(String value) {
            addCriterion("power_href >=", value, "powerHref");
            return (Criteria) this;
        }

        public Criteria andPowerHrefLessThan(String value) {
            addCriterion("power_href <", value, "powerHref");
            return (Criteria) this;
        }

        public Criteria andPowerHrefLessThanOrEqualTo(String value) {
            addCriterion("power_href <=", value, "powerHref");
            return (Criteria) this;
        }

        public Criteria andPowerHrefLike(String value) {
            addCriterion("power_href like", value, "powerHref");
            return (Criteria) this;
        }

        public Criteria andPowerHrefNotLike(String value) {
            addCriterion("power_href not like", value, "powerHref");
            return (Criteria) this;
        }

        public Criteria andPowerHrefIn(List<String> values) {
            addCriterion("power_href in", values, "powerHref");
            return (Criteria) this;
        }

        public Criteria andPowerHrefNotIn(List<String> values) {
            addCriterion("power_href not in", values, "powerHref");
            return (Criteria) this;
        }

        public Criteria andPowerHrefBetween(String value1, String value2) {
            addCriterion("power_href between", value1, value2, "powerHref");
            return (Criteria) this;
        }

        public Criteria andPowerHrefNotBetween(String value1, String value2) {
            addCriterion("power_href not between", value1, value2, "powerHref");
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