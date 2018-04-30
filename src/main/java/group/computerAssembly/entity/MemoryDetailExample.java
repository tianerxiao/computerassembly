package group.computerAssembly.entity;

import java.util.ArrayList;
import java.util.List;

public class MemoryDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemoryDetailExample() {
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

        public Criteria andMemdIdIsNull() {
            addCriterion("memd_id is null");
            return (Criteria) this;
        }

        public Criteria andMemdIdIsNotNull() {
            addCriterion("memd_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemdIdEqualTo(Integer value) {
            addCriterion("memd_id =", value, "memdId");
            return (Criteria) this;
        }

        public Criteria andMemdIdNotEqualTo(Integer value) {
            addCriterion("memd_id <>", value, "memdId");
            return (Criteria) this;
        }

        public Criteria andMemdIdGreaterThan(Integer value) {
            addCriterion("memd_id >", value, "memdId");
            return (Criteria) this;
        }

        public Criteria andMemdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("memd_id >=", value, "memdId");
            return (Criteria) this;
        }

        public Criteria andMemdIdLessThan(Integer value) {
            addCriterion("memd_id <", value, "memdId");
            return (Criteria) this;
        }

        public Criteria andMemdIdLessThanOrEqualTo(Integer value) {
            addCriterion("memd_id <=", value, "memdId");
            return (Criteria) this;
        }

        public Criteria andMemdIdIn(List<Integer> values) {
            addCriterion("memd_id in", values, "memdId");
            return (Criteria) this;
        }

        public Criteria andMemdIdNotIn(List<Integer> values) {
            addCriterion("memd_id not in", values, "memdId");
            return (Criteria) this;
        }

        public Criteria andMemdIdBetween(Integer value1, Integer value2) {
            addCriterion("memd_id between", value1, value2, "memdId");
            return (Criteria) this;
        }

        public Criteria andMemdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("memd_id not between", value1, value2, "memdId");
            return (Criteria) this;
        }

        public Criteria andMemdNameIsNull() {
            addCriterion("memd_name is null");
            return (Criteria) this;
        }

        public Criteria andMemdNameIsNotNull() {
            addCriterion("memd_name is not null");
            return (Criteria) this;
        }

        public Criteria andMemdNameEqualTo(String value) {
            addCriterion("memd_name =", value, "memdName");
            return (Criteria) this;
        }

        public Criteria andMemdNameNotEqualTo(String value) {
            addCriterion("memd_name <>", value, "memdName");
            return (Criteria) this;
        }

        public Criteria andMemdNameGreaterThan(String value) {
            addCriterion("memd_name >", value, "memdName");
            return (Criteria) this;
        }

        public Criteria andMemdNameGreaterThanOrEqualTo(String value) {
            addCriterion("memd_name >=", value, "memdName");
            return (Criteria) this;
        }

        public Criteria andMemdNameLessThan(String value) {
            addCriterion("memd_name <", value, "memdName");
            return (Criteria) this;
        }

        public Criteria andMemdNameLessThanOrEqualTo(String value) {
            addCriterion("memd_name <=", value, "memdName");
            return (Criteria) this;
        }

        public Criteria andMemdNameLike(String value) {
            addCriterion("memd_name like", value, "memdName");
            return (Criteria) this;
        }

        public Criteria andMemdNameNotLike(String value) {
            addCriterion("memd_name not like", value, "memdName");
            return (Criteria) this;
        }

        public Criteria andMemdNameIn(List<String> values) {
            addCriterion("memd_name in", values, "memdName");
            return (Criteria) this;
        }

        public Criteria andMemdNameNotIn(List<String> values) {
            addCriterion("memd_name not in", values, "memdName");
            return (Criteria) this;
        }

        public Criteria andMemdNameBetween(String value1, String value2) {
            addCriterion("memd_name between", value1, value2, "memdName");
            return (Criteria) this;
        }

        public Criteria andMemdNameNotBetween(String value1, String value2) {
            addCriterion("memd_name not between", value1, value2, "memdName");
            return (Criteria) this;
        }

        public Criteria andMemdTypeIsNull() {
            addCriterion("memd_type is null");
            return (Criteria) this;
        }

        public Criteria andMemdTypeIsNotNull() {
            addCriterion("memd_type is not null");
            return (Criteria) this;
        }

        public Criteria andMemdTypeEqualTo(String value) {
            addCriterion("memd_type =", value, "memdType");
            return (Criteria) this;
        }

        public Criteria andMemdTypeNotEqualTo(String value) {
            addCriterion("memd_type <>", value, "memdType");
            return (Criteria) this;
        }

        public Criteria andMemdTypeGreaterThan(String value) {
            addCriterion("memd_type >", value, "memdType");
            return (Criteria) this;
        }

        public Criteria andMemdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("memd_type >=", value, "memdType");
            return (Criteria) this;
        }

        public Criteria andMemdTypeLessThan(String value) {
            addCriterion("memd_type <", value, "memdType");
            return (Criteria) this;
        }

        public Criteria andMemdTypeLessThanOrEqualTo(String value) {
            addCriterion("memd_type <=", value, "memdType");
            return (Criteria) this;
        }

        public Criteria andMemdTypeLike(String value) {
            addCriterion("memd_type like", value, "memdType");
            return (Criteria) this;
        }

        public Criteria andMemdTypeNotLike(String value) {
            addCriterion("memd_type not like", value, "memdType");
            return (Criteria) this;
        }

        public Criteria andMemdTypeIn(List<String> values) {
            addCriterion("memd_type in", values, "memdType");
            return (Criteria) this;
        }

        public Criteria andMemdTypeNotIn(List<String> values) {
            addCriterion("memd_type not in", values, "memdType");
            return (Criteria) this;
        }

        public Criteria andMemdTypeBetween(String value1, String value2) {
            addCriterion("memd_type between", value1, value2, "memdType");
            return (Criteria) this;
        }

        public Criteria andMemdTypeNotBetween(String value1, String value2) {
            addCriterion("memd_type not between", value1, value2, "memdType");
            return (Criteria) this;
        }

        public Criteria andMemdFreqIsNull() {
            addCriterion("memd_freq is null");
            return (Criteria) this;
        }

        public Criteria andMemdFreqIsNotNull() {
            addCriterion("memd_freq is not null");
            return (Criteria) this;
        }

        public Criteria andMemdFreqEqualTo(String value) {
            addCriterion("memd_freq =", value, "memdFreq");
            return (Criteria) this;
        }

        public Criteria andMemdFreqNotEqualTo(String value) {
            addCriterion("memd_freq <>", value, "memdFreq");
            return (Criteria) this;
        }

        public Criteria andMemdFreqGreaterThan(String value) {
            addCriterion("memd_freq >", value, "memdFreq");
            return (Criteria) this;
        }

        public Criteria andMemdFreqGreaterThanOrEqualTo(String value) {
            addCriterion("memd_freq >=", value, "memdFreq");
            return (Criteria) this;
        }

        public Criteria andMemdFreqLessThan(String value) {
            addCriterion("memd_freq <", value, "memdFreq");
            return (Criteria) this;
        }

        public Criteria andMemdFreqLessThanOrEqualTo(String value) {
            addCriterion("memd_freq <=", value, "memdFreq");
            return (Criteria) this;
        }

        public Criteria andMemdFreqLike(String value) {
            addCriterion("memd_freq like", value, "memdFreq");
            return (Criteria) this;
        }

        public Criteria andMemdFreqNotLike(String value) {
            addCriterion("memd_freq not like", value, "memdFreq");
            return (Criteria) this;
        }

        public Criteria andMemdFreqIn(List<String> values) {
            addCriterion("memd_freq in", values, "memdFreq");
            return (Criteria) this;
        }

        public Criteria andMemdFreqNotIn(List<String> values) {
            addCriterion("memd_freq not in", values, "memdFreq");
            return (Criteria) this;
        }

        public Criteria andMemdFreqBetween(String value1, String value2) {
            addCriterion("memd_freq between", value1, value2, "memdFreq");
            return (Criteria) this;
        }

        public Criteria andMemdFreqNotBetween(String value1, String value2) {
            addCriterion("memd_freq not between", value1, value2, "memdFreq");
            return (Criteria) this;
        }

        public Criteria andMemdSizeIsNull() {
            addCriterion("memd_size is null");
            return (Criteria) this;
        }

        public Criteria andMemdSizeIsNotNull() {
            addCriterion("memd_size is not null");
            return (Criteria) this;
        }

        public Criteria andMemdSizeEqualTo(String value) {
            addCriterion("memd_size =", value, "memdSize");
            return (Criteria) this;
        }

        public Criteria andMemdSizeNotEqualTo(String value) {
            addCriterion("memd_size <>", value, "memdSize");
            return (Criteria) this;
        }

        public Criteria andMemdSizeGreaterThan(String value) {
            addCriterion("memd_size >", value, "memdSize");
            return (Criteria) this;
        }

        public Criteria andMemdSizeGreaterThanOrEqualTo(String value) {
            addCriterion("memd_size >=", value, "memdSize");
            return (Criteria) this;
        }

        public Criteria andMemdSizeLessThan(String value) {
            addCriterion("memd_size <", value, "memdSize");
            return (Criteria) this;
        }

        public Criteria andMemdSizeLessThanOrEqualTo(String value) {
            addCriterion("memd_size <=", value, "memdSize");
            return (Criteria) this;
        }

        public Criteria andMemdSizeLike(String value) {
            addCriterion("memd_size like", value, "memdSize");
            return (Criteria) this;
        }

        public Criteria andMemdSizeNotLike(String value) {
            addCriterion("memd_size not like", value, "memdSize");
            return (Criteria) this;
        }

        public Criteria andMemdSizeIn(List<String> values) {
            addCriterion("memd_size in", values, "memdSize");
            return (Criteria) this;
        }

        public Criteria andMemdSizeNotIn(List<String> values) {
            addCriterion("memd_size not in", values, "memdSize");
            return (Criteria) this;
        }

        public Criteria andMemdSizeBetween(String value1, String value2) {
            addCriterion("memd_size between", value1, value2, "memdSize");
            return (Criteria) this;
        }

        public Criteria andMemdSizeNotBetween(String value1, String value2) {
            addCriterion("memd_size not between", value1, value2, "memdSize");
            return (Criteria) this;
        }

        public Criteria andMemdDescribeIsNull() {
            addCriterion("memd_describe is null");
            return (Criteria) this;
        }

        public Criteria andMemdDescribeIsNotNull() {
            addCriterion("memd_describe is not null");
            return (Criteria) this;
        }

        public Criteria andMemdDescribeEqualTo(String value) {
            addCriterion("memd_describe =", value, "memdDescribe");
            return (Criteria) this;
        }

        public Criteria andMemdDescribeNotEqualTo(String value) {
            addCriterion("memd_describe <>", value, "memdDescribe");
            return (Criteria) this;
        }

        public Criteria andMemdDescribeGreaterThan(String value) {
            addCriterion("memd_describe >", value, "memdDescribe");
            return (Criteria) this;
        }

        public Criteria andMemdDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("memd_describe >=", value, "memdDescribe");
            return (Criteria) this;
        }

        public Criteria andMemdDescribeLessThan(String value) {
            addCriterion("memd_describe <", value, "memdDescribe");
            return (Criteria) this;
        }

        public Criteria andMemdDescribeLessThanOrEqualTo(String value) {
            addCriterion("memd_describe <=", value, "memdDescribe");
            return (Criteria) this;
        }

        public Criteria andMemdDescribeLike(String value) {
            addCriterion("memd_describe like", value, "memdDescribe");
            return (Criteria) this;
        }

        public Criteria andMemdDescribeNotLike(String value) {
            addCriterion("memd_describe not like", value, "memdDescribe");
            return (Criteria) this;
        }

        public Criteria andMemdDescribeIn(List<String> values) {
            addCriterion("memd_describe in", values, "memdDescribe");
            return (Criteria) this;
        }

        public Criteria andMemdDescribeNotIn(List<String> values) {
            addCriterion("memd_describe not in", values, "memdDescribe");
            return (Criteria) this;
        }

        public Criteria andMemdDescribeBetween(String value1, String value2) {
            addCriterion("memd_describe between", value1, value2, "memdDescribe");
            return (Criteria) this;
        }

        public Criteria andMemdDescribeNotBetween(String value1, String value2) {
            addCriterion("memd_describe not between", value1, value2, "memdDescribe");
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