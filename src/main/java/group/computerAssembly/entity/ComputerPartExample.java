package group.computerAssembly.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ComputerPartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComputerPartExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
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