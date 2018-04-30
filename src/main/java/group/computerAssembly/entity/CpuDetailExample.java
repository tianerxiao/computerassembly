package group.computerAssembly.entity;

import java.util.ArrayList;
import java.util.List;

public class CpuDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CpuDetailExample() {
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

        public Criteria andCpudIdIsNull() {
            addCriterion("cpud_id is null");
            return (Criteria) this;
        }

        public Criteria andCpudIdIsNotNull() {
            addCriterion("cpud_id is not null");
            return (Criteria) this;
        }

        public Criteria andCpudIdEqualTo(Integer value) {
            addCriterion("cpud_id =", value, "cpudId");
            return (Criteria) this;
        }

        public Criteria andCpudIdNotEqualTo(Integer value) {
            addCriterion("cpud_id <>", value, "cpudId");
            return (Criteria) this;
        }

        public Criteria andCpudIdGreaterThan(Integer value) {
            addCriterion("cpud_id >", value, "cpudId");
            return (Criteria) this;
        }

        public Criteria andCpudIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cpud_id >=", value, "cpudId");
            return (Criteria) this;
        }

        public Criteria andCpudIdLessThan(Integer value) {
            addCriterion("cpud_id <", value, "cpudId");
            return (Criteria) this;
        }

        public Criteria andCpudIdLessThanOrEqualTo(Integer value) {
            addCriterion("cpud_id <=", value, "cpudId");
            return (Criteria) this;
        }

        public Criteria andCpudIdIn(List<Integer> values) {
            addCriterion("cpud_id in", values, "cpudId");
            return (Criteria) this;
        }

        public Criteria andCpudIdNotIn(List<Integer> values) {
            addCriterion("cpud_id not in", values, "cpudId");
            return (Criteria) this;
        }

        public Criteria andCpudIdBetween(Integer value1, Integer value2) {
            addCriterion("cpud_id between", value1, value2, "cpudId");
            return (Criteria) this;
        }

        public Criteria andCpudIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cpud_id not between", value1, value2, "cpudId");
            return (Criteria) this;
        }

        public Criteria andCpudNameIsNull() {
            addCriterion("cpud_name is null");
            return (Criteria) this;
        }

        public Criteria andCpudNameIsNotNull() {
            addCriterion("cpud_name is not null");
            return (Criteria) this;
        }

        public Criteria andCpudNameEqualTo(String value) {
            addCriterion("cpud_name =", value, "cpudName");
            return (Criteria) this;
        }

        public Criteria andCpudNameNotEqualTo(String value) {
            addCriterion("cpud_name <>", value, "cpudName");
            return (Criteria) this;
        }

        public Criteria andCpudNameGreaterThan(String value) {
            addCriterion("cpud_name >", value, "cpudName");
            return (Criteria) this;
        }

        public Criteria andCpudNameGreaterThanOrEqualTo(String value) {
            addCriterion("cpud_name >=", value, "cpudName");
            return (Criteria) this;
        }

        public Criteria andCpudNameLessThan(String value) {
            addCriterion("cpud_name <", value, "cpudName");
            return (Criteria) this;
        }

        public Criteria andCpudNameLessThanOrEqualTo(String value) {
            addCriterion("cpud_name <=", value, "cpudName");
            return (Criteria) this;
        }

        public Criteria andCpudNameLike(String value) {
            addCriterion("cpud_name like", value, "cpudName");
            return (Criteria) this;
        }

        public Criteria andCpudNameNotLike(String value) {
            addCriterion("cpud_name not like", value, "cpudName");
            return (Criteria) this;
        }

        public Criteria andCpudNameIn(List<String> values) {
            addCriterion("cpud_name in", values, "cpudName");
            return (Criteria) this;
        }

        public Criteria andCpudNameNotIn(List<String> values) {
            addCriterion("cpud_name not in", values, "cpudName");
            return (Criteria) this;
        }

        public Criteria andCpudNameBetween(String value1, String value2) {
            addCriterion("cpud_name between", value1, value2, "cpudName");
            return (Criteria) this;
        }

        public Criteria andCpudNameNotBetween(String value1, String value2) {
            addCriterion("cpud_name not between", value1, value2, "cpudName");
            return (Criteria) this;
        }

        public Criteria andCpudVendorIsNull() {
            addCriterion("cpud_vendor is null");
            return (Criteria) this;
        }

        public Criteria andCpudVendorIsNotNull() {
            addCriterion("cpud_vendor is not null");
            return (Criteria) this;
        }

        public Criteria andCpudVendorEqualTo(String value) {
            addCriterion("cpud_vendor =", value, "cpudVendor");
            return (Criteria) this;
        }

        public Criteria andCpudVendorNotEqualTo(String value) {
            addCriterion("cpud_vendor <>", value, "cpudVendor");
            return (Criteria) this;
        }

        public Criteria andCpudVendorGreaterThan(String value) {
            addCriterion("cpud_vendor >", value, "cpudVendor");
            return (Criteria) this;
        }

        public Criteria andCpudVendorGreaterThanOrEqualTo(String value) {
            addCriterion("cpud_vendor >=", value, "cpudVendor");
            return (Criteria) this;
        }

        public Criteria andCpudVendorLessThan(String value) {
            addCriterion("cpud_vendor <", value, "cpudVendor");
            return (Criteria) this;
        }

        public Criteria andCpudVendorLessThanOrEqualTo(String value) {
            addCriterion("cpud_vendor <=", value, "cpudVendor");
            return (Criteria) this;
        }

        public Criteria andCpudVendorLike(String value) {
            addCriterion("cpud_vendor like", value, "cpudVendor");
            return (Criteria) this;
        }

        public Criteria andCpudVendorNotLike(String value) {
            addCriterion("cpud_vendor not like", value, "cpudVendor");
            return (Criteria) this;
        }

        public Criteria andCpudVendorIn(List<String> values) {
            addCriterion("cpud_vendor in", values, "cpudVendor");
            return (Criteria) this;
        }

        public Criteria andCpudVendorNotIn(List<String> values) {
            addCriterion("cpud_vendor not in", values, "cpudVendor");
            return (Criteria) this;
        }

        public Criteria andCpudVendorBetween(String value1, String value2) {
            addCriterion("cpud_vendor between", value1, value2, "cpudVendor");
            return (Criteria) this;
        }

        public Criteria andCpudVendorNotBetween(String value1, String value2) {
            addCriterion("cpud_vendor not between", value1, value2, "cpudVendor");
            return (Criteria) this;
        }

        public Criteria andCpudCoreIsNull() {
            addCriterion("cpud_core is null");
            return (Criteria) this;
        }

        public Criteria andCpudCoreIsNotNull() {
            addCriterion("cpud_core is not null");
            return (Criteria) this;
        }

        public Criteria andCpudCoreEqualTo(String value) {
            addCriterion("cpud_core =", value, "cpudCore");
            return (Criteria) this;
        }

        public Criteria andCpudCoreNotEqualTo(String value) {
            addCriterion("cpud_core <>", value, "cpudCore");
            return (Criteria) this;
        }

        public Criteria andCpudCoreGreaterThan(String value) {
            addCriterion("cpud_core >", value, "cpudCore");
            return (Criteria) this;
        }

        public Criteria andCpudCoreGreaterThanOrEqualTo(String value) {
            addCriterion("cpud_core >=", value, "cpudCore");
            return (Criteria) this;
        }

        public Criteria andCpudCoreLessThan(String value) {
            addCriterion("cpud_core <", value, "cpudCore");
            return (Criteria) this;
        }

        public Criteria andCpudCoreLessThanOrEqualTo(String value) {
            addCriterion("cpud_core <=", value, "cpudCore");
            return (Criteria) this;
        }

        public Criteria andCpudCoreLike(String value) {
            addCriterion("cpud_core like", value, "cpudCore");
            return (Criteria) this;
        }

        public Criteria andCpudCoreNotLike(String value) {
            addCriterion("cpud_core not like", value, "cpudCore");
            return (Criteria) this;
        }

        public Criteria andCpudCoreIn(List<String> values) {
            addCriterion("cpud_core in", values, "cpudCore");
            return (Criteria) this;
        }

        public Criteria andCpudCoreNotIn(List<String> values) {
            addCriterion("cpud_core not in", values, "cpudCore");
            return (Criteria) this;
        }

        public Criteria andCpudCoreBetween(String value1, String value2) {
            addCriterion("cpud_core between", value1, value2, "cpudCore");
            return (Criteria) this;
        }

        public Criteria andCpudCoreNotBetween(String value1, String value2) {
            addCriterion("cpud_core not between", value1, value2, "cpudCore");
            return (Criteria) this;
        }

        public Criteria andCpudMainfreqIsNull() {
            addCriterion("cpud_mainfreq is null");
            return (Criteria) this;
        }

        public Criteria andCpudMainfreqIsNotNull() {
            addCriterion("cpud_mainfreq is not null");
            return (Criteria) this;
        }

        public Criteria andCpudMainfreqEqualTo(String value) {
            addCriterion("cpud_mainfreq =", value, "cpudMainfreq");
            return (Criteria) this;
        }

        public Criteria andCpudMainfreqNotEqualTo(String value) {
            addCriterion("cpud_mainfreq <>", value, "cpudMainfreq");
            return (Criteria) this;
        }

        public Criteria andCpudMainfreqGreaterThan(String value) {
            addCriterion("cpud_mainfreq >", value, "cpudMainfreq");
            return (Criteria) this;
        }

        public Criteria andCpudMainfreqGreaterThanOrEqualTo(String value) {
            addCriterion("cpud_mainfreq >=", value, "cpudMainfreq");
            return (Criteria) this;
        }

        public Criteria andCpudMainfreqLessThan(String value) {
            addCriterion("cpud_mainfreq <", value, "cpudMainfreq");
            return (Criteria) this;
        }

        public Criteria andCpudMainfreqLessThanOrEqualTo(String value) {
            addCriterion("cpud_mainfreq <=", value, "cpudMainfreq");
            return (Criteria) this;
        }

        public Criteria andCpudMainfreqLike(String value) {
            addCriterion("cpud_mainfreq like", value, "cpudMainfreq");
            return (Criteria) this;
        }

        public Criteria andCpudMainfreqNotLike(String value) {
            addCriterion("cpud_mainfreq not like", value, "cpudMainfreq");
            return (Criteria) this;
        }

        public Criteria andCpudMainfreqIn(List<String> values) {
            addCriterion("cpud_mainfreq in", values, "cpudMainfreq");
            return (Criteria) this;
        }

        public Criteria andCpudMainfreqNotIn(List<String> values) {
            addCriterion("cpud_mainfreq not in", values, "cpudMainfreq");
            return (Criteria) this;
        }

        public Criteria andCpudMainfreqBetween(String value1, String value2) {
            addCriterion("cpud_mainfreq between", value1, value2, "cpudMainfreq");
            return (Criteria) this;
        }

        public Criteria andCpudMainfreqNotBetween(String value1, String value2) {
            addCriterion("cpud_mainfreq not between", value1, value2, "cpudMainfreq");
            return (Criteria) this;
        }

        public Criteria andCpudCraftIsNull() {
            addCriterion("cpud_craft is null");
            return (Criteria) this;
        }

        public Criteria andCpudCraftIsNotNull() {
            addCriterion("cpud_craft is not null");
            return (Criteria) this;
        }

        public Criteria andCpudCraftEqualTo(String value) {
            addCriterion("cpud_craft =", value, "cpudCraft");
            return (Criteria) this;
        }

        public Criteria andCpudCraftNotEqualTo(String value) {
            addCriterion("cpud_craft <>", value, "cpudCraft");
            return (Criteria) this;
        }

        public Criteria andCpudCraftGreaterThan(String value) {
            addCriterion("cpud_craft >", value, "cpudCraft");
            return (Criteria) this;
        }

        public Criteria andCpudCraftGreaterThanOrEqualTo(String value) {
            addCriterion("cpud_craft >=", value, "cpudCraft");
            return (Criteria) this;
        }

        public Criteria andCpudCraftLessThan(String value) {
            addCriterion("cpud_craft <", value, "cpudCraft");
            return (Criteria) this;
        }

        public Criteria andCpudCraftLessThanOrEqualTo(String value) {
            addCriterion("cpud_craft <=", value, "cpudCraft");
            return (Criteria) this;
        }

        public Criteria andCpudCraftLike(String value) {
            addCriterion("cpud_craft like", value, "cpudCraft");
            return (Criteria) this;
        }

        public Criteria andCpudCraftNotLike(String value) {
            addCriterion("cpud_craft not like", value, "cpudCraft");
            return (Criteria) this;
        }

        public Criteria andCpudCraftIn(List<String> values) {
            addCriterion("cpud_craft in", values, "cpudCraft");
            return (Criteria) this;
        }

        public Criteria andCpudCraftNotIn(List<String> values) {
            addCriterion("cpud_craft not in", values, "cpudCraft");
            return (Criteria) this;
        }

        public Criteria andCpudCraftBetween(String value1, String value2) {
            addCriterion("cpud_craft between", value1, value2, "cpudCraft");
            return (Criteria) this;
        }

        public Criteria andCpudCraftNotBetween(String value1, String value2) {
            addCriterion("cpud_craft not between", value1, value2, "cpudCraft");
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