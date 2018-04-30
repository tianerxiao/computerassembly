package group.computerAssembly.entity;

import java.util.ArrayList;
import java.util.List;

public class CpuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CpuExample() {
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

        public Criteria andCpuIdIsNull() {
            addCriterion("cpu_id is null");
            return (Criteria) this;
        }

        public Criteria andCpuIdIsNotNull() {
            addCriterion("cpu_id is not null");
            return (Criteria) this;
        }

        public Criteria andCpuIdEqualTo(Integer value) {
            addCriterion("cpu_id =", value, "cpuId");
            return (Criteria) this;
        }

        public Criteria andCpuIdNotEqualTo(Integer value) {
            addCriterion("cpu_id <>", value, "cpuId");
            return (Criteria) this;
        }

        public Criteria andCpuIdGreaterThan(Integer value) {
            addCriterion("cpu_id >", value, "cpuId");
            return (Criteria) this;
        }

        public Criteria andCpuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cpu_id >=", value, "cpuId");
            return (Criteria) this;
        }

        public Criteria andCpuIdLessThan(Integer value) {
            addCriterion("cpu_id <", value, "cpuId");
            return (Criteria) this;
        }

        public Criteria andCpuIdLessThanOrEqualTo(Integer value) {
            addCriterion("cpu_id <=", value, "cpuId");
            return (Criteria) this;
        }

        public Criteria andCpuIdIn(List<Integer> values) {
            addCriterion("cpu_id in", values, "cpuId");
            return (Criteria) this;
        }

        public Criteria andCpuIdNotIn(List<Integer> values) {
            addCriterion("cpu_id not in", values, "cpuId");
            return (Criteria) this;
        }

        public Criteria andCpuIdBetween(Integer value1, Integer value2) {
            addCriterion("cpu_id between", value1, value2, "cpuId");
            return (Criteria) this;
        }

        public Criteria andCpuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cpu_id not between", value1, value2, "cpuId");
            return (Criteria) this;
        }

        public Criteria andCpuNameIsNull() {
            addCriterion("cpu_name is null");
            return (Criteria) this;
        }

        public Criteria andCpuNameIsNotNull() {
            addCriterion("cpu_name is not null");
            return (Criteria) this;
        }

        public Criteria andCpuNameEqualTo(String value) {
            addCriterion("cpu_name =", value, "cpuName");
            return (Criteria) this;
        }

        public Criteria andCpuNameNotEqualTo(String value) {
            addCriterion("cpu_name <>", value, "cpuName");
            return (Criteria) this;
        }

        public Criteria andCpuNameGreaterThan(String value) {
            addCriterion("cpu_name >", value, "cpuName");
            return (Criteria) this;
        }

        public Criteria andCpuNameGreaterThanOrEqualTo(String value) {
            addCriterion("cpu_name >=", value, "cpuName");
            return (Criteria) this;
        }

        public Criteria andCpuNameLessThan(String value) {
            addCriterion("cpu_name <", value, "cpuName");
            return (Criteria) this;
        }

        public Criteria andCpuNameLessThanOrEqualTo(String value) {
            addCriterion("cpu_name <=", value, "cpuName");
            return (Criteria) this;
        }

        public Criteria andCpuNameLike(String value) {
            addCriterion("cpu_name like", value, "cpuName");
            return (Criteria) this;
        }

        public Criteria andCpuNameNotLike(String value) {
            addCriterion("cpu_name not like", value, "cpuName");
            return (Criteria) this;
        }

        public Criteria andCpuNameIn(List<String> values) {
            addCriterion("cpu_name in", values, "cpuName");
            return (Criteria) this;
        }

        public Criteria andCpuNameNotIn(List<String> values) {
            addCriterion("cpu_name not in", values, "cpuName");
            return (Criteria) this;
        }

        public Criteria andCpuNameBetween(String value1, String value2) {
            addCriterion("cpu_name between", value1, value2, "cpuName");
            return (Criteria) this;
        }

        public Criteria andCpuNameNotBetween(String value1, String value2) {
            addCriterion("cpu_name not between", value1, value2, "cpuName");
            return (Criteria) this;
        }

        public Criteria andCpuPriceIsNull() {
            addCriterion("cpu_price is null");
            return (Criteria) this;
        }

        public Criteria andCpuPriceIsNotNull() {
            addCriterion("cpu_price is not null");
            return (Criteria) this;
        }

        public Criteria andCpuPriceEqualTo(String value) {
            addCriterion("cpu_price =", value, "cpuPrice");
            return (Criteria) this;
        }

        public Criteria andCpuPriceNotEqualTo(String value) {
            addCriterion("cpu_price <>", value, "cpuPrice");
            return (Criteria) this;
        }

        public Criteria andCpuPriceGreaterThan(String value) {
            addCriterion("cpu_price >", value, "cpuPrice");
            return (Criteria) this;
        }

        public Criteria andCpuPriceGreaterThanOrEqualTo(String value) {
            addCriterion("cpu_price >=", value, "cpuPrice");
            return (Criteria) this;
        }

        public Criteria andCpuPriceLessThan(String value) {
            addCriterion("cpu_price <", value, "cpuPrice");
            return (Criteria) this;
        }

        public Criteria andCpuPriceLessThanOrEqualTo(String value) {
            addCriterion("cpu_price <=", value, "cpuPrice");
            return (Criteria) this;
        }

        public Criteria andCpuPriceLike(String value) {
            addCriterion("cpu_price like", value, "cpuPrice");
            return (Criteria) this;
        }

        public Criteria andCpuPriceNotLike(String value) {
            addCriterion("cpu_price not like", value, "cpuPrice");
            return (Criteria) this;
        }

        public Criteria andCpuPriceIn(List<String> values) {
            addCriterion("cpu_price in", values, "cpuPrice");
            return (Criteria) this;
        }

        public Criteria andCpuPriceNotIn(List<String> values) {
            addCriterion("cpu_price not in", values, "cpuPrice");
            return (Criteria) this;
        }

        public Criteria andCpuPriceBetween(String value1, String value2) {
            addCriterion("cpu_price between", value1, value2, "cpuPrice");
            return (Criteria) this;
        }

        public Criteria andCpuPriceNotBetween(String value1, String value2) {
            addCriterion("cpu_price not between", value1, value2, "cpuPrice");
            return (Criteria) this;
        }

        public Criteria andCpuDescribeIsNull() {
            addCriterion("cpu_describe is null");
            return (Criteria) this;
        }

        public Criteria andCpuDescribeIsNotNull() {
            addCriterion("cpu_describe is not null");
            return (Criteria) this;
        }

        public Criteria andCpuDescribeEqualTo(String value) {
            addCriterion("cpu_describe =", value, "cpuDescribe");
            return (Criteria) this;
        }

        public Criteria andCpuDescribeNotEqualTo(String value) {
            addCriterion("cpu_describe <>", value, "cpuDescribe");
            return (Criteria) this;
        }

        public Criteria andCpuDescribeGreaterThan(String value) {
            addCriterion("cpu_describe >", value, "cpuDescribe");
            return (Criteria) this;
        }

        public Criteria andCpuDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("cpu_describe >=", value, "cpuDescribe");
            return (Criteria) this;
        }

        public Criteria andCpuDescribeLessThan(String value) {
            addCriterion("cpu_describe <", value, "cpuDescribe");
            return (Criteria) this;
        }

        public Criteria andCpuDescribeLessThanOrEqualTo(String value) {
            addCriterion("cpu_describe <=", value, "cpuDescribe");
            return (Criteria) this;
        }

        public Criteria andCpuDescribeLike(String value) {
            addCriterion("cpu_describe like", value, "cpuDescribe");
            return (Criteria) this;
        }

        public Criteria andCpuDescribeNotLike(String value) {
            addCriterion("cpu_describe not like", value, "cpuDescribe");
            return (Criteria) this;
        }

        public Criteria andCpuDescribeIn(List<String> values) {
            addCriterion("cpu_describe in", values, "cpuDescribe");
            return (Criteria) this;
        }

        public Criteria andCpuDescribeNotIn(List<String> values) {
            addCriterion("cpu_describe not in", values, "cpuDescribe");
            return (Criteria) this;
        }

        public Criteria andCpuDescribeBetween(String value1, String value2) {
            addCriterion("cpu_describe between", value1, value2, "cpuDescribe");
            return (Criteria) this;
        }

        public Criteria andCpuDescribeNotBetween(String value1, String value2) {
            addCriterion("cpu_describe not between", value1, value2, "cpuDescribe");
            return (Criteria) this;
        }

        public Criteria andCpuHrefIsNull() {
            addCriterion("cpu_href is null");
            return (Criteria) this;
        }

        public Criteria andCpuHrefIsNotNull() {
            addCriterion("cpu_href is not null");
            return (Criteria) this;
        }

        public Criteria andCpuHrefEqualTo(String value) {
            addCriterion("cpu_href =", value, "cpuHref");
            return (Criteria) this;
        }

        public Criteria andCpuHrefNotEqualTo(String value) {
            addCriterion("cpu_href <>", value, "cpuHref");
            return (Criteria) this;
        }

        public Criteria andCpuHrefGreaterThan(String value) {
            addCriterion("cpu_href >", value, "cpuHref");
            return (Criteria) this;
        }

        public Criteria andCpuHrefGreaterThanOrEqualTo(String value) {
            addCriterion("cpu_href >=", value, "cpuHref");
            return (Criteria) this;
        }

        public Criteria andCpuHrefLessThan(String value) {
            addCriterion("cpu_href <", value, "cpuHref");
            return (Criteria) this;
        }

        public Criteria andCpuHrefLessThanOrEqualTo(String value) {
            addCriterion("cpu_href <=", value, "cpuHref");
            return (Criteria) this;
        }

        public Criteria andCpuHrefLike(String value) {
            addCriterion("cpu_href like", value, "cpuHref");
            return (Criteria) this;
        }

        public Criteria andCpuHrefNotLike(String value) {
            addCriterion("cpu_href not like", value, "cpuHref");
            return (Criteria) this;
        }

        public Criteria andCpuHrefIn(List<String> values) {
            addCriterion("cpu_href in", values, "cpuHref");
            return (Criteria) this;
        }

        public Criteria andCpuHrefNotIn(List<String> values) {
            addCriterion("cpu_href not in", values, "cpuHref");
            return (Criteria) this;
        }

        public Criteria andCpuHrefBetween(String value1, String value2) {
            addCriterion("cpu_href between", value1, value2, "cpuHref");
            return (Criteria) this;
        }

        public Criteria andCpuHrefNotBetween(String value1, String value2) {
            addCriterion("cpu_href not between", value1, value2, "cpuHref");
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