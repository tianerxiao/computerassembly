package group.computerAssembly.entity;

import java.util.ArrayList;
import java.util.List;

public class VgaDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VgaDetailExample() {
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

        public Criteria andVgadIdIsNull() {
            addCriterion("vgad_id is null");
            return (Criteria) this;
        }

        public Criteria andVgadIdIsNotNull() {
            addCriterion("vgad_id is not null");
            return (Criteria) this;
        }

        public Criteria andVgadIdEqualTo(Integer value) {
            addCriterion("vgad_id =", value, "vgadId");
            return (Criteria) this;
        }

        public Criteria andVgadIdNotEqualTo(Integer value) {
            addCriterion("vgad_id <>", value, "vgadId");
            return (Criteria) this;
        }

        public Criteria andVgadIdGreaterThan(Integer value) {
            addCriterion("vgad_id >", value, "vgadId");
            return (Criteria) this;
        }

        public Criteria andVgadIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vgad_id >=", value, "vgadId");
            return (Criteria) this;
        }

        public Criteria andVgadIdLessThan(Integer value) {
            addCriterion("vgad_id <", value, "vgadId");
            return (Criteria) this;
        }

        public Criteria andVgadIdLessThanOrEqualTo(Integer value) {
            addCriterion("vgad_id <=", value, "vgadId");
            return (Criteria) this;
        }

        public Criteria andVgadIdIn(List<Integer> values) {
            addCriterion("vgad_id in", values, "vgadId");
            return (Criteria) this;
        }

        public Criteria andVgadIdNotIn(List<Integer> values) {
            addCriterion("vgad_id not in", values, "vgadId");
            return (Criteria) this;
        }

        public Criteria andVgadIdBetween(Integer value1, Integer value2) {
            addCriterion("vgad_id between", value1, value2, "vgadId");
            return (Criteria) this;
        }

        public Criteria andVgadIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vgad_id not between", value1, value2, "vgadId");
            return (Criteria) this;
        }

        public Criteria andVgadNameIsNull() {
            addCriterion("vgad_name is null");
            return (Criteria) this;
        }

        public Criteria andVgadNameIsNotNull() {
            addCriterion("vgad_name is not null");
            return (Criteria) this;
        }

        public Criteria andVgadNameEqualTo(String value) {
            addCriterion("vgad_name =", value, "vgadName");
            return (Criteria) this;
        }

        public Criteria andVgadNameNotEqualTo(String value) {
            addCriterion("vgad_name <>", value, "vgadName");
            return (Criteria) this;
        }

        public Criteria andVgadNameGreaterThan(String value) {
            addCriterion("vgad_name >", value, "vgadName");
            return (Criteria) this;
        }

        public Criteria andVgadNameGreaterThanOrEqualTo(String value) {
            addCriterion("vgad_name >=", value, "vgadName");
            return (Criteria) this;
        }

        public Criteria andVgadNameLessThan(String value) {
            addCriterion("vgad_name <", value, "vgadName");
            return (Criteria) this;
        }

        public Criteria andVgadNameLessThanOrEqualTo(String value) {
            addCriterion("vgad_name <=", value, "vgadName");
            return (Criteria) this;
        }

        public Criteria andVgadNameLike(String value) {
            addCriterion("vgad_name like", value, "vgadName");
            return (Criteria) this;
        }

        public Criteria andVgadNameNotLike(String value) {
            addCriterion("vgad_name not like", value, "vgadName");
            return (Criteria) this;
        }

        public Criteria andVgadNameIn(List<String> values) {
            addCriterion("vgad_name in", values, "vgadName");
            return (Criteria) this;
        }

        public Criteria andVgadNameNotIn(List<String> values) {
            addCriterion("vgad_name not in", values, "vgadName");
            return (Criteria) this;
        }

        public Criteria andVgadNameBetween(String value1, String value2) {
            addCriterion("vgad_name between", value1, value2, "vgadName");
            return (Criteria) this;
        }

        public Criteria andVgadNameNotBetween(String value1, String value2) {
            addCriterion("vgad_name not between", value1, value2, "vgadName");
            return (Criteria) this;
        }

        public Criteria andVgadVenderIsNull() {
            addCriterion("vgad_vender is null");
            return (Criteria) this;
        }

        public Criteria andVgadVenderIsNotNull() {
            addCriterion("vgad_vender is not null");
            return (Criteria) this;
        }

        public Criteria andVgadVenderEqualTo(String value) {
            addCriterion("vgad_vender =", value, "vgadVender");
            return (Criteria) this;
        }

        public Criteria andVgadVenderNotEqualTo(String value) {
            addCriterion("vgad_vender <>", value, "vgadVender");
            return (Criteria) this;
        }

        public Criteria andVgadVenderGreaterThan(String value) {
            addCriterion("vgad_vender >", value, "vgadVender");
            return (Criteria) this;
        }

        public Criteria andVgadVenderGreaterThanOrEqualTo(String value) {
            addCriterion("vgad_vender >=", value, "vgadVender");
            return (Criteria) this;
        }

        public Criteria andVgadVenderLessThan(String value) {
            addCriterion("vgad_vender <", value, "vgadVender");
            return (Criteria) this;
        }

        public Criteria andVgadVenderLessThanOrEqualTo(String value) {
            addCriterion("vgad_vender <=", value, "vgadVender");
            return (Criteria) this;
        }

        public Criteria andVgadVenderLike(String value) {
            addCriterion("vgad_vender like", value, "vgadVender");
            return (Criteria) this;
        }

        public Criteria andVgadVenderNotLike(String value) {
            addCriterion("vgad_vender not like", value, "vgadVender");
            return (Criteria) this;
        }

        public Criteria andVgadVenderIn(List<String> values) {
            addCriterion("vgad_vender in", values, "vgadVender");
            return (Criteria) this;
        }

        public Criteria andVgadVenderNotIn(List<String> values) {
            addCriterion("vgad_vender not in", values, "vgadVender");
            return (Criteria) this;
        }

        public Criteria andVgadVenderBetween(String value1, String value2) {
            addCriterion("vgad_vender between", value1, value2, "vgadVender");
            return (Criteria) this;
        }

        public Criteria andVgadVenderNotBetween(String value1, String value2) {
            addCriterion("vgad_vender not between", value1, value2, "vgadVender");
            return (Criteria) this;
        }

        public Criteria andVgadModelIsNull() {
            addCriterion("vgad_model is null");
            return (Criteria) this;
        }

        public Criteria andVgadModelIsNotNull() {
            addCriterion("vgad_model is not null");
            return (Criteria) this;
        }

        public Criteria andVgadModelEqualTo(String value) {
            addCriterion("vgad_model =", value, "vgadModel");
            return (Criteria) this;
        }

        public Criteria andVgadModelNotEqualTo(String value) {
            addCriterion("vgad_model <>", value, "vgadModel");
            return (Criteria) this;
        }

        public Criteria andVgadModelGreaterThan(String value) {
            addCriterion("vgad_model >", value, "vgadModel");
            return (Criteria) this;
        }

        public Criteria andVgadModelGreaterThanOrEqualTo(String value) {
            addCriterion("vgad_model >=", value, "vgadModel");
            return (Criteria) this;
        }

        public Criteria andVgadModelLessThan(String value) {
            addCriterion("vgad_model <", value, "vgadModel");
            return (Criteria) this;
        }

        public Criteria andVgadModelLessThanOrEqualTo(String value) {
            addCriterion("vgad_model <=", value, "vgadModel");
            return (Criteria) this;
        }

        public Criteria andVgadModelLike(String value) {
            addCriterion("vgad_model like", value, "vgadModel");
            return (Criteria) this;
        }

        public Criteria andVgadModelNotLike(String value) {
            addCriterion("vgad_model not like", value, "vgadModel");
            return (Criteria) this;
        }

        public Criteria andVgadModelIn(List<String> values) {
            addCriterion("vgad_model in", values, "vgadModel");
            return (Criteria) this;
        }

        public Criteria andVgadModelNotIn(List<String> values) {
            addCriterion("vgad_model not in", values, "vgadModel");
            return (Criteria) this;
        }

        public Criteria andVgadModelBetween(String value1, String value2) {
            addCriterion("vgad_model between", value1, value2, "vgadModel");
            return (Criteria) this;
        }

        public Criteria andVgadModelNotBetween(String value1, String value2) {
            addCriterion("vgad_model not between", value1, value2, "vgadModel");
            return (Criteria) this;
        }

        public Criteria andVgadMemoryIsNull() {
            addCriterion("vgad_memory is null");
            return (Criteria) this;
        }

        public Criteria andVgadMemoryIsNotNull() {
            addCriterion("vgad_memory is not null");
            return (Criteria) this;
        }

        public Criteria andVgadMemoryEqualTo(String value) {
            addCriterion("vgad_memory =", value, "vgadMemory");
            return (Criteria) this;
        }

        public Criteria andVgadMemoryNotEqualTo(String value) {
            addCriterion("vgad_memory <>", value, "vgadMemory");
            return (Criteria) this;
        }

        public Criteria andVgadMemoryGreaterThan(String value) {
            addCriterion("vgad_memory >", value, "vgadMemory");
            return (Criteria) this;
        }

        public Criteria andVgadMemoryGreaterThanOrEqualTo(String value) {
            addCriterion("vgad_memory >=", value, "vgadMemory");
            return (Criteria) this;
        }

        public Criteria andVgadMemoryLessThan(String value) {
            addCriterion("vgad_memory <", value, "vgadMemory");
            return (Criteria) this;
        }

        public Criteria andVgadMemoryLessThanOrEqualTo(String value) {
            addCriterion("vgad_memory <=", value, "vgadMemory");
            return (Criteria) this;
        }

        public Criteria andVgadMemoryLike(String value) {
            addCriterion("vgad_memory like", value, "vgadMemory");
            return (Criteria) this;
        }

        public Criteria andVgadMemoryNotLike(String value) {
            addCriterion("vgad_memory not like", value, "vgadMemory");
            return (Criteria) this;
        }

        public Criteria andVgadMemoryIn(List<String> values) {
            addCriterion("vgad_memory in", values, "vgadMemory");
            return (Criteria) this;
        }

        public Criteria andVgadMemoryNotIn(List<String> values) {
            addCriterion("vgad_memory not in", values, "vgadMemory");
            return (Criteria) this;
        }

        public Criteria andVgadMemoryBetween(String value1, String value2) {
            addCriterion("vgad_memory between", value1, value2, "vgadMemory");
            return (Criteria) this;
        }

        public Criteria andVgadMemoryNotBetween(String value1, String value2) {
            addCriterion("vgad_memory not between", value1, value2, "vgadMemory");
            return (Criteria) this;
        }

        public Criteria andVgadCoreIsNull() {
            addCriterion("vgad_core is null");
            return (Criteria) this;
        }

        public Criteria andVgadCoreIsNotNull() {
            addCriterion("vgad_core is not null");
            return (Criteria) this;
        }

        public Criteria andVgadCoreEqualTo(String value) {
            addCriterion("vgad_core =", value, "vgadCore");
            return (Criteria) this;
        }

        public Criteria andVgadCoreNotEqualTo(String value) {
            addCriterion("vgad_core <>", value, "vgadCore");
            return (Criteria) this;
        }

        public Criteria andVgadCoreGreaterThan(String value) {
            addCriterion("vgad_core >", value, "vgadCore");
            return (Criteria) this;
        }

        public Criteria andVgadCoreGreaterThanOrEqualTo(String value) {
            addCriterion("vgad_core >=", value, "vgadCore");
            return (Criteria) this;
        }

        public Criteria andVgadCoreLessThan(String value) {
            addCriterion("vgad_core <", value, "vgadCore");
            return (Criteria) this;
        }

        public Criteria andVgadCoreLessThanOrEqualTo(String value) {
            addCriterion("vgad_core <=", value, "vgadCore");
            return (Criteria) this;
        }

        public Criteria andVgadCoreLike(String value) {
            addCriterion("vgad_core like", value, "vgadCore");
            return (Criteria) this;
        }

        public Criteria andVgadCoreNotLike(String value) {
            addCriterion("vgad_core not like", value, "vgadCore");
            return (Criteria) this;
        }

        public Criteria andVgadCoreIn(List<String> values) {
            addCriterion("vgad_core in", values, "vgadCore");
            return (Criteria) this;
        }

        public Criteria andVgadCoreNotIn(List<String> values) {
            addCriterion("vgad_core not in", values, "vgadCore");
            return (Criteria) this;
        }

        public Criteria andVgadCoreBetween(String value1, String value2) {
            addCriterion("vgad_core between", value1, value2, "vgadCore");
            return (Criteria) this;
        }

        public Criteria andVgadCoreNotBetween(String value1, String value2) {
            addCriterion("vgad_core not between", value1, value2, "vgadCore");
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