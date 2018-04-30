package group.computerAssembly.entity;

import java.util.ArrayList;
import java.util.List;

public class PowerDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PowerDetailExample() {
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

        public Criteria andPowerdIdIsNull() {
            addCriterion("powerd_id is null");
            return (Criteria) this;
        }

        public Criteria andPowerdIdIsNotNull() {
            addCriterion("powerd_id is not null");
            return (Criteria) this;
        }

        public Criteria andPowerdIdEqualTo(Integer value) {
            addCriterion("powerd_id =", value, "powerdId");
            return (Criteria) this;
        }

        public Criteria andPowerdIdNotEqualTo(Integer value) {
            addCriterion("powerd_id <>", value, "powerdId");
            return (Criteria) this;
        }

        public Criteria andPowerdIdGreaterThan(Integer value) {
            addCriterion("powerd_id >", value, "powerdId");
            return (Criteria) this;
        }

        public Criteria andPowerdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("powerd_id >=", value, "powerdId");
            return (Criteria) this;
        }

        public Criteria andPowerdIdLessThan(Integer value) {
            addCriterion("powerd_id <", value, "powerdId");
            return (Criteria) this;
        }

        public Criteria andPowerdIdLessThanOrEqualTo(Integer value) {
            addCriterion("powerd_id <=", value, "powerdId");
            return (Criteria) this;
        }

        public Criteria andPowerdIdIn(List<Integer> values) {
            addCriterion("powerd_id in", values, "powerdId");
            return (Criteria) this;
        }

        public Criteria andPowerdIdNotIn(List<Integer> values) {
            addCriterion("powerd_id not in", values, "powerdId");
            return (Criteria) this;
        }

        public Criteria andPowerdIdBetween(Integer value1, Integer value2) {
            addCriterion("powerd_id between", value1, value2, "powerdId");
            return (Criteria) this;
        }

        public Criteria andPowerdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("powerd_id not between", value1, value2, "powerdId");
            return (Criteria) this;
        }

        public Criteria andPowerdNameIsNull() {
            addCriterion("powerd_name is null");
            return (Criteria) this;
        }

        public Criteria andPowerdNameIsNotNull() {
            addCriterion("powerd_name is not null");
            return (Criteria) this;
        }

        public Criteria andPowerdNameEqualTo(String value) {
            addCriterion("powerd_name =", value, "powerdName");
            return (Criteria) this;
        }

        public Criteria andPowerdNameNotEqualTo(String value) {
            addCriterion("powerd_name <>", value, "powerdName");
            return (Criteria) this;
        }

        public Criteria andPowerdNameGreaterThan(String value) {
            addCriterion("powerd_name >", value, "powerdName");
            return (Criteria) this;
        }

        public Criteria andPowerdNameGreaterThanOrEqualTo(String value) {
            addCriterion("powerd_name >=", value, "powerdName");
            return (Criteria) this;
        }

        public Criteria andPowerdNameLessThan(String value) {
            addCriterion("powerd_name <", value, "powerdName");
            return (Criteria) this;
        }

        public Criteria andPowerdNameLessThanOrEqualTo(String value) {
            addCriterion("powerd_name <=", value, "powerdName");
            return (Criteria) this;
        }

        public Criteria andPowerdNameLike(String value) {
            addCriterion("powerd_name like", value, "powerdName");
            return (Criteria) this;
        }

        public Criteria andPowerdNameNotLike(String value) {
            addCriterion("powerd_name not like", value, "powerdName");
            return (Criteria) this;
        }

        public Criteria andPowerdNameIn(List<String> values) {
            addCriterion("powerd_name in", values, "powerdName");
            return (Criteria) this;
        }

        public Criteria andPowerdNameNotIn(List<String> values) {
            addCriterion("powerd_name not in", values, "powerdName");
            return (Criteria) this;
        }

        public Criteria andPowerdNameBetween(String value1, String value2) {
            addCriterion("powerd_name between", value1, value2, "powerdName");
            return (Criteria) this;
        }

        public Criteria andPowerdNameNotBetween(String value1, String value2) {
            addCriterion("powerd_name not between", value1, value2, "powerdName");
            return (Criteria) this;
        }

        public Criteria andPowerdPowerIsNull() {
            addCriterion("powerd_power is null");
            return (Criteria) this;
        }

        public Criteria andPowerdPowerIsNotNull() {
            addCriterion("powerd_power is not null");
            return (Criteria) this;
        }

        public Criteria andPowerdPowerEqualTo(String value) {
            addCriterion("powerd_power =", value, "powerdPower");
            return (Criteria) this;
        }

        public Criteria andPowerdPowerNotEqualTo(String value) {
            addCriterion("powerd_power <>", value, "powerdPower");
            return (Criteria) this;
        }

        public Criteria andPowerdPowerGreaterThan(String value) {
            addCriterion("powerd_power >", value, "powerdPower");
            return (Criteria) this;
        }

        public Criteria andPowerdPowerGreaterThanOrEqualTo(String value) {
            addCriterion("powerd_power >=", value, "powerdPower");
            return (Criteria) this;
        }

        public Criteria andPowerdPowerLessThan(String value) {
            addCriterion("powerd_power <", value, "powerdPower");
            return (Criteria) this;
        }

        public Criteria andPowerdPowerLessThanOrEqualTo(String value) {
            addCriterion("powerd_power <=", value, "powerdPower");
            return (Criteria) this;
        }

        public Criteria andPowerdPowerLike(String value) {
            addCriterion("powerd_power like", value, "powerdPower");
            return (Criteria) this;
        }

        public Criteria andPowerdPowerNotLike(String value) {
            addCriterion("powerd_power not like", value, "powerdPower");
            return (Criteria) this;
        }

        public Criteria andPowerdPowerIn(List<String> values) {
            addCriterion("powerd_power in", values, "powerdPower");
            return (Criteria) this;
        }

        public Criteria andPowerdPowerNotIn(List<String> values) {
            addCriterion("powerd_power not in", values, "powerdPower");
            return (Criteria) this;
        }

        public Criteria andPowerdPowerBetween(String value1, String value2) {
            addCriterion("powerd_power between", value1, value2, "powerdPower");
            return (Criteria) this;
        }

        public Criteria andPowerdPowerNotBetween(String value1, String value2) {
            addCriterion("powerd_power not between", value1, value2, "powerdPower");
            return (Criteria) this;
        }

        public Criteria andPowerdStandardIsNull() {
            addCriterion("powerd_standard is null");
            return (Criteria) this;
        }

        public Criteria andPowerdStandardIsNotNull() {
            addCriterion("powerd_standard is not null");
            return (Criteria) this;
        }

        public Criteria andPowerdStandardEqualTo(String value) {
            addCriterion("powerd_standard =", value, "powerdStandard");
            return (Criteria) this;
        }

        public Criteria andPowerdStandardNotEqualTo(String value) {
            addCriterion("powerd_standard <>", value, "powerdStandard");
            return (Criteria) this;
        }

        public Criteria andPowerdStandardGreaterThan(String value) {
            addCriterion("powerd_standard >", value, "powerdStandard");
            return (Criteria) this;
        }

        public Criteria andPowerdStandardGreaterThanOrEqualTo(String value) {
            addCriterion("powerd_standard >=", value, "powerdStandard");
            return (Criteria) this;
        }

        public Criteria andPowerdStandardLessThan(String value) {
            addCriterion("powerd_standard <", value, "powerdStandard");
            return (Criteria) this;
        }

        public Criteria andPowerdStandardLessThanOrEqualTo(String value) {
            addCriterion("powerd_standard <=", value, "powerdStandard");
            return (Criteria) this;
        }

        public Criteria andPowerdStandardLike(String value) {
            addCriterion("powerd_standard like", value, "powerdStandard");
            return (Criteria) this;
        }

        public Criteria andPowerdStandardNotLike(String value) {
            addCriterion("powerd_standard not like", value, "powerdStandard");
            return (Criteria) this;
        }

        public Criteria andPowerdStandardIn(List<String> values) {
            addCriterion("powerd_standard in", values, "powerdStandard");
            return (Criteria) this;
        }

        public Criteria andPowerdStandardNotIn(List<String> values) {
            addCriterion("powerd_standard not in", values, "powerdStandard");
            return (Criteria) this;
        }

        public Criteria andPowerdStandardBetween(String value1, String value2) {
            addCriterion("powerd_standard between", value1, value2, "powerdStandard");
            return (Criteria) this;
        }

        public Criteria andPowerdStandardNotBetween(String value1, String value2) {
            addCriterion("powerd_standard not between", value1, value2, "powerdStandard");
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