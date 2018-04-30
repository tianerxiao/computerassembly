package group.computerAssembly.entity;

import java.util.ArrayList;
import java.util.List;

public class BoardDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BoardDetailExample() {
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

        public Criteria andBoarddIdIsNull() {
            addCriterion("boardd_id is null");
            return (Criteria) this;
        }

        public Criteria andBoarddIdIsNotNull() {
            addCriterion("boardd_id is not null");
            return (Criteria) this;
        }

        public Criteria andBoarddIdEqualTo(Integer value) {
            addCriterion("boardd_id =", value, "boarddId");
            return (Criteria) this;
        }

        public Criteria andBoarddIdNotEqualTo(Integer value) {
            addCriterion("boardd_id <>", value, "boarddId");
            return (Criteria) this;
        }

        public Criteria andBoarddIdGreaterThan(Integer value) {
            addCriterion("boardd_id >", value, "boarddId");
            return (Criteria) this;
        }

        public Criteria andBoarddIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("boardd_id >=", value, "boarddId");
            return (Criteria) this;
        }

        public Criteria andBoarddIdLessThan(Integer value) {
            addCriterion("boardd_id <", value, "boarddId");
            return (Criteria) this;
        }

        public Criteria andBoarddIdLessThanOrEqualTo(Integer value) {
            addCriterion("boardd_id <=", value, "boarddId");
            return (Criteria) this;
        }

        public Criteria andBoarddIdIn(List<Integer> values) {
            addCriterion("boardd_id in", values, "boarddId");
            return (Criteria) this;
        }

        public Criteria andBoarddIdNotIn(List<Integer> values) {
            addCriterion("boardd_id not in", values, "boarddId");
            return (Criteria) this;
        }

        public Criteria andBoarddIdBetween(Integer value1, Integer value2) {
            addCriterion("boardd_id between", value1, value2, "boarddId");
            return (Criteria) this;
        }

        public Criteria andBoarddIdNotBetween(Integer value1, Integer value2) {
            addCriterion("boardd_id not between", value1, value2, "boarddId");
            return (Criteria) this;
        }

        public Criteria andBoarddNameIsNull() {
            addCriterion("boardd_name is null");
            return (Criteria) this;
        }

        public Criteria andBoarddNameIsNotNull() {
            addCriterion("boardd_name is not null");
            return (Criteria) this;
        }

        public Criteria andBoarddNameEqualTo(String value) {
            addCriterion("boardd_name =", value, "boarddName");
            return (Criteria) this;
        }

        public Criteria andBoarddNameNotEqualTo(String value) {
            addCriterion("boardd_name <>", value, "boarddName");
            return (Criteria) this;
        }

        public Criteria andBoarddNameGreaterThan(String value) {
            addCriterion("boardd_name >", value, "boarddName");
            return (Criteria) this;
        }

        public Criteria andBoarddNameGreaterThanOrEqualTo(String value) {
            addCriterion("boardd_name >=", value, "boarddName");
            return (Criteria) this;
        }

        public Criteria andBoarddNameLessThan(String value) {
            addCriterion("boardd_name <", value, "boarddName");
            return (Criteria) this;
        }

        public Criteria andBoarddNameLessThanOrEqualTo(String value) {
            addCriterion("boardd_name <=", value, "boarddName");
            return (Criteria) this;
        }

        public Criteria andBoarddNameLike(String value) {
            addCriterion("boardd_name like", value, "boarddName");
            return (Criteria) this;
        }

        public Criteria andBoarddNameNotLike(String value) {
            addCriterion("boardd_name not like", value, "boarddName");
            return (Criteria) this;
        }

        public Criteria andBoarddNameIn(List<String> values) {
            addCriterion("boardd_name in", values, "boarddName");
            return (Criteria) this;
        }

        public Criteria andBoarddNameNotIn(List<String> values) {
            addCriterion("boardd_name not in", values, "boarddName");
            return (Criteria) this;
        }

        public Criteria andBoarddNameBetween(String value1, String value2) {
            addCriterion("boardd_name between", value1, value2, "boarddName");
            return (Criteria) this;
        }

        public Criteria andBoarddNameNotBetween(String value1, String value2) {
            addCriterion("boardd_name not between", value1, value2, "boarddName");
            return (Criteria) this;
        }

        public Criteria andBoarddCpuIsNull() {
            addCriterion("boardd_cpu is null");
            return (Criteria) this;
        }

        public Criteria andBoarddCpuIsNotNull() {
            addCriterion("boardd_cpu is not null");
            return (Criteria) this;
        }

        public Criteria andBoarddCpuEqualTo(String value) {
            addCriterion("boardd_cpu =", value, "boarddCpu");
            return (Criteria) this;
        }

        public Criteria andBoarddCpuNotEqualTo(String value) {
            addCriterion("boardd_cpu <>", value, "boarddCpu");
            return (Criteria) this;
        }

        public Criteria andBoarddCpuGreaterThan(String value) {
            addCriterion("boardd_cpu >", value, "boarddCpu");
            return (Criteria) this;
        }

        public Criteria andBoarddCpuGreaterThanOrEqualTo(String value) {
            addCriterion("boardd_cpu >=", value, "boarddCpu");
            return (Criteria) this;
        }

        public Criteria andBoarddCpuLessThan(String value) {
            addCriterion("boardd_cpu <", value, "boarddCpu");
            return (Criteria) this;
        }

        public Criteria andBoarddCpuLessThanOrEqualTo(String value) {
            addCriterion("boardd_cpu <=", value, "boarddCpu");
            return (Criteria) this;
        }

        public Criteria andBoarddCpuLike(String value) {
            addCriterion("boardd_cpu like", value, "boarddCpu");
            return (Criteria) this;
        }

        public Criteria andBoarddCpuNotLike(String value) {
            addCriterion("boardd_cpu not like", value, "boarddCpu");
            return (Criteria) this;
        }

        public Criteria andBoarddCpuIn(List<String> values) {
            addCriterion("boardd_cpu in", values, "boarddCpu");
            return (Criteria) this;
        }

        public Criteria andBoarddCpuNotIn(List<String> values) {
            addCriterion("boardd_cpu not in", values, "boarddCpu");
            return (Criteria) this;
        }

        public Criteria andBoarddCpuBetween(String value1, String value2) {
            addCriterion("boardd_cpu between", value1, value2, "boarddCpu");
            return (Criteria) this;
        }

        public Criteria andBoarddCpuNotBetween(String value1, String value2) {
            addCriterion("boardd_cpu not between", value1, value2, "boarddCpu");
            return (Criteria) this;
        }

        public Criteria andBoarddChipsetIsNull() {
            addCriterion("boardd_chipset is null");
            return (Criteria) this;
        }

        public Criteria andBoarddChipsetIsNotNull() {
            addCriterion("boardd_chipset is not null");
            return (Criteria) this;
        }

        public Criteria andBoarddChipsetEqualTo(String value) {
            addCriterion("boardd_chipset =", value, "boarddChipset");
            return (Criteria) this;
        }

        public Criteria andBoarddChipsetNotEqualTo(String value) {
            addCriterion("boardd_chipset <>", value, "boarddChipset");
            return (Criteria) this;
        }

        public Criteria andBoarddChipsetGreaterThan(String value) {
            addCriterion("boardd_chipset >", value, "boarddChipset");
            return (Criteria) this;
        }

        public Criteria andBoarddChipsetGreaterThanOrEqualTo(String value) {
            addCriterion("boardd_chipset >=", value, "boarddChipset");
            return (Criteria) this;
        }

        public Criteria andBoarddChipsetLessThan(String value) {
            addCriterion("boardd_chipset <", value, "boarddChipset");
            return (Criteria) this;
        }

        public Criteria andBoarddChipsetLessThanOrEqualTo(String value) {
            addCriterion("boardd_chipset <=", value, "boarddChipset");
            return (Criteria) this;
        }

        public Criteria andBoarddChipsetLike(String value) {
            addCriterion("boardd_chipset like", value, "boarddChipset");
            return (Criteria) this;
        }

        public Criteria andBoarddChipsetNotLike(String value) {
            addCriterion("boardd_chipset not like", value, "boarddChipset");
            return (Criteria) this;
        }

        public Criteria andBoarddChipsetIn(List<String> values) {
            addCriterion("boardd_chipset in", values, "boarddChipset");
            return (Criteria) this;
        }

        public Criteria andBoarddChipsetNotIn(List<String> values) {
            addCriterion("boardd_chipset not in", values, "boarddChipset");
            return (Criteria) this;
        }

        public Criteria andBoarddChipsetBetween(String value1, String value2) {
            addCriterion("boardd_chipset between", value1, value2, "boarddChipset");
            return (Criteria) this;
        }

        public Criteria andBoarddChipsetNotBetween(String value1, String value2) {
            addCriterion("boardd_chipset not between", value1, value2, "boarddChipset");
            return (Criteria) this;
        }

        public Criteria andBoarddArchIsNull() {
            addCriterion("boardd_arch is null");
            return (Criteria) this;
        }

        public Criteria andBoarddArchIsNotNull() {
            addCriterion("boardd_arch is not null");
            return (Criteria) this;
        }

        public Criteria andBoarddArchEqualTo(String value) {
            addCriterion("boardd_arch =", value, "boarddArch");
            return (Criteria) this;
        }

        public Criteria andBoarddArchNotEqualTo(String value) {
            addCriterion("boardd_arch <>", value, "boarddArch");
            return (Criteria) this;
        }

        public Criteria andBoarddArchGreaterThan(String value) {
            addCriterion("boardd_arch >", value, "boarddArch");
            return (Criteria) this;
        }

        public Criteria andBoarddArchGreaterThanOrEqualTo(String value) {
            addCriterion("boardd_arch >=", value, "boarddArch");
            return (Criteria) this;
        }

        public Criteria andBoarddArchLessThan(String value) {
            addCriterion("boardd_arch <", value, "boarddArch");
            return (Criteria) this;
        }

        public Criteria andBoarddArchLessThanOrEqualTo(String value) {
            addCriterion("boardd_arch <=", value, "boarddArch");
            return (Criteria) this;
        }

        public Criteria andBoarddArchLike(String value) {
            addCriterion("boardd_arch like", value, "boarddArch");
            return (Criteria) this;
        }

        public Criteria andBoarddArchNotLike(String value) {
            addCriterion("boardd_arch not like", value, "boarddArch");
            return (Criteria) this;
        }

        public Criteria andBoarddArchIn(List<String> values) {
            addCriterion("boardd_arch in", values, "boarddArch");
            return (Criteria) this;
        }

        public Criteria andBoarddArchNotIn(List<String> values) {
            addCriterion("boardd_arch not in", values, "boarddArch");
            return (Criteria) this;
        }

        public Criteria andBoarddArchBetween(String value1, String value2) {
            addCriterion("boardd_arch between", value1, value2, "boarddArch");
            return (Criteria) this;
        }

        public Criteria andBoarddArchNotBetween(String value1, String value2) {
            addCriterion("boardd_arch not between", value1, value2, "boarddArch");
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