package group.computerAssembly.entity;

import java.util.ArrayList;
import java.util.List;

public class VgaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VgaExample() {
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

        public Criteria andVgaIdIsNull() {
            addCriterion("vga_id is null");
            return (Criteria) this;
        }

        public Criteria andVgaIdIsNotNull() {
            addCriterion("vga_id is not null");
            return (Criteria) this;
        }

        public Criteria andVgaIdEqualTo(Integer value) {
            addCriterion("vga_id =", value, "vgaId");
            return (Criteria) this;
        }

        public Criteria andVgaIdNotEqualTo(Integer value) {
            addCriterion("vga_id <>", value, "vgaId");
            return (Criteria) this;
        }

        public Criteria andVgaIdGreaterThan(Integer value) {
            addCriterion("vga_id >", value, "vgaId");
            return (Criteria) this;
        }

        public Criteria andVgaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vga_id >=", value, "vgaId");
            return (Criteria) this;
        }

        public Criteria andVgaIdLessThan(Integer value) {
            addCriterion("vga_id <", value, "vgaId");
            return (Criteria) this;
        }

        public Criteria andVgaIdLessThanOrEqualTo(Integer value) {
            addCriterion("vga_id <=", value, "vgaId");
            return (Criteria) this;
        }

        public Criteria andVgaIdIn(List<Integer> values) {
            addCriterion("vga_id in", values, "vgaId");
            return (Criteria) this;
        }

        public Criteria andVgaIdNotIn(List<Integer> values) {
            addCriterion("vga_id not in", values, "vgaId");
            return (Criteria) this;
        }

        public Criteria andVgaIdBetween(Integer value1, Integer value2) {
            addCriterion("vga_id between", value1, value2, "vgaId");
            return (Criteria) this;
        }

        public Criteria andVgaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vga_id not between", value1, value2, "vgaId");
            return (Criteria) this;
        }

        public Criteria andVgaNameIsNull() {
            addCriterion("vga_name is null");
            return (Criteria) this;
        }

        public Criteria andVgaNameIsNotNull() {
            addCriterion("vga_name is not null");
            return (Criteria) this;
        }

        public Criteria andVgaNameEqualTo(String value) {
            addCriterion("vga_name =", value, "vgaName");
            return (Criteria) this;
        }

        public Criteria andVgaNameNotEqualTo(String value) {
            addCriterion("vga_name <>", value, "vgaName");
            return (Criteria) this;
        }

        public Criteria andVgaNameGreaterThan(String value) {
            addCriterion("vga_name >", value, "vgaName");
            return (Criteria) this;
        }

        public Criteria andVgaNameGreaterThanOrEqualTo(String value) {
            addCriterion("vga_name >=", value, "vgaName");
            return (Criteria) this;
        }

        public Criteria andVgaNameLessThan(String value) {
            addCriterion("vga_name <", value, "vgaName");
            return (Criteria) this;
        }

        public Criteria andVgaNameLessThanOrEqualTo(String value) {
            addCriterion("vga_name <=", value, "vgaName");
            return (Criteria) this;
        }

        public Criteria andVgaNameLike(String value) {
            addCriterion("vga_name like", value, "vgaName");
            return (Criteria) this;
        }

        public Criteria andVgaNameNotLike(String value) {
            addCriterion("vga_name not like", value, "vgaName");
            return (Criteria) this;
        }

        public Criteria andVgaNameIn(List<String> values) {
            addCriterion("vga_name in", values, "vgaName");
            return (Criteria) this;
        }

        public Criteria andVgaNameNotIn(List<String> values) {
            addCriterion("vga_name not in", values, "vgaName");
            return (Criteria) this;
        }

        public Criteria andVgaNameBetween(String value1, String value2) {
            addCriterion("vga_name between", value1, value2, "vgaName");
            return (Criteria) this;
        }

        public Criteria andVgaNameNotBetween(String value1, String value2) {
            addCriterion("vga_name not between", value1, value2, "vgaName");
            return (Criteria) this;
        }

        public Criteria andVgaPriceIsNull() {
            addCriterion("vga_price is null");
            return (Criteria) this;
        }

        public Criteria andVgaPriceIsNotNull() {
            addCriterion("vga_price is not null");
            return (Criteria) this;
        }

        public Criteria andVgaPriceEqualTo(String value) {
            addCriterion("vga_price =", value, "vgaPrice");
            return (Criteria) this;
        }

        public Criteria andVgaPriceNotEqualTo(String value) {
            addCriterion("vga_price <>", value, "vgaPrice");
            return (Criteria) this;
        }

        public Criteria andVgaPriceGreaterThan(String value) {
            addCriterion("vga_price >", value, "vgaPrice");
            return (Criteria) this;
        }

        public Criteria andVgaPriceGreaterThanOrEqualTo(String value) {
            addCriterion("vga_price >=", value, "vgaPrice");
            return (Criteria) this;
        }

        public Criteria andVgaPriceLessThan(String value) {
            addCriterion("vga_price <", value, "vgaPrice");
            return (Criteria) this;
        }

        public Criteria andVgaPriceLessThanOrEqualTo(String value) {
            addCriterion("vga_price <=", value, "vgaPrice");
            return (Criteria) this;
        }

        public Criteria andVgaPriceLike(String value) {
            addCriterion("vga_price like", value, "vgaPrice");
            return (Criteria) this;
        }

        public Criteria andVgaPriceNotLike(String value) {
            addCriterion("vga_price not like", value, "vgaPrice");
            return (Criteria) this;
        }

        public Criteria andVgaPriceIn(List<String> values) {
            addCriterion("vga_price in", values, "vgaPrice");
            return (Criteria) this;
        }

        public Criteria andVgaPriceNotIn(List<String> values) {
            addCriterion("vga_price not in", values, "vgaPrice");
            return (Criteria) this;
        }

        public Criteria andVgaPriceBetween(String value1, String value2) {
            addCriterion("vga_price between", value1, value2, "vgaPrice");
            return (Criteria) this;
        }

        public Criteria andVgaPriceNotBetween(String value1, String value2) {
            addCriterion("vga_price not between", value1, value2, "vgaPrice");
            return (Criteria) this;
        }

        public Criteria andVgaHrefIsNull() {
            addCriterion("vga_href is null");
            return (Criteria) this;
        }

        public Criteria andVgaHrefIsNotNull() {
            addCriterion("vga_href is not null");
            return (Criteria) this;
        }

        public Criteria andVgaHrefEqualTo(String value) {
            addCriterion("vga_href =", value, "vgaHref");
            return (Criteria) this;
        }

        public Criteria andVgaHrefNotEqualTo(String value) {
            addCriterion("vga_href <>", value, "vgaHref");
            return (Criteria) this;
        }

        public Criteria andVgaHrefGreaterThan(String value) {
            addCriterion("vga_href >", value, "vgaHref");
            return (Criteria) this;
        }

        public Criteria andVgaHrefGreaterThanOrEqualTo(String value) {
            addCriterion("vga_href >=", value, "vgaHref");
            return (Criteria) this;
        }

        public Criteria andVgaHrefLessThan(String value) {
            addCriterion("vga_href <", value, "vgaHref");
            return (Criteria) this;
        }

        public Criteria andVgaHrefLessThanOrEqualTo(String value) {
            addCriterion("vga_href <=", value, "vgaHref");
            return (Criteria) this;
        }

        public Criteria andVgaHrefLike(String value) {
            addCriterion("vga_href like", value, "vgaHref");
            return (Criteria) this;
        }

        public Criteria andVgaHrefNotLike(String value) {
            addCriterion("vga_href not like", value, "vgaHref");
            return (Criteria) this;
        }

        public Criteria andVgaHrefIn(List<String> values) {
            addCriterion("vga_href in", values, "vgaHref");
            return (Criteria) this;
        }

        public Criteria andVgaHrefNotIn(List<String> values) {
            addCriterion("vga_href not in", values, "vgaHref");
            return (Criteria) this;
        }

        public Criteria andVgaHrefBetween(String value1, String value2) {
            addCriterion("vga_href between", value1, value2, "vgaHref");
            return (Criteria) this;
        }

        public Criteria andVgaHrefNotBetween(String value1, String value2) {
            addCriterion("vga_href not between", value1, value2, "vgaHref");
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