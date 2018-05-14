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

        public Criteria andPartTableIdIsNull() {
            addCriterion("part_table_id is null");
            return (Criteria) this;
        }

        public Criteria andPartTableIdIsNotNull() {
            addCriterion("part_table_id is not null");
            return (Criteria) this;
        }

        public Criteria andPartTableIdEqualTo(String value) {
            addCriterion("part_table_id =", value, "partTableId");
            return (Criteria) this;
        }

        public Criteria andPartTableIdNotEqualTo(String value) {
            addCriterion("part_table_id <>", value, "partTableId");
            return (Criteria) this;
        }

        public Criteria andPartTableIdGreaterThan(String value) {
            addCriterion("part_table_id >", value, "partTableId");
            return (Criteria) this;
        }

        public Criteria andPartTableIdGreaterThanOrEqualTo(String value) {
            addCriterion("part_table_id >=", value, "partTableId");
            return (Criteria) this;
        }

        public Criteria andPartTableIdLessThan(String value) {
            addCriterion("part_table_id <", value, "partTableId");
            return (Criteria) this;
        }

        public Criteria andPartTableIdLessThanOrEqualTo(String value) {
            addCriterion("part_table_id <=", value, "partTableId");
            return (Criteria) this;
        }

        public Criteria andPartTableIdLike(String value) {
            addCriterion("part_table_id like", value, "partTableId");
            return (Criteria) this;
        }

        public Criteria andPartTableIdNotLike(String value) {
            addCriterion("part_table_id not like", value, "partTableId");
            return (Criteria) this;
        }

        public Criteria andPartTableIdIn(List<String> values) {
            addCriterion("part_table_id in", values, "partTableId");
            return (Criteria) this;
        }

        public Criteria andPartTableIdNotIn(List<String> values) {
            addCriterion("part_table_id not in", values, "partTableId");
            return (Criteria) this;
        }

        public Criteria andPartTableIdBetween(String value1, String value2) {
            addCriterion("part_table_id between", value1, value2, "partTableId");
            return (Criteria) this;
        }

        public Criteria andPartTableIdNotBetween(String value1, String value2) {
            addCriterion("part_table_id not between", value1, value2, "partTableId");
            return (Criteria) this;
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

        public Criteria andBoardIdIsNull() {
            addCriterion("board_id is null");
            return (Criteria) this;
        }

        public Criteria andBoardIdIsNotNull() {
            addCriterion("board_id is not null");
            return (Criteria) this;
        }

        public Criteria andBoardIdEqualTo(Integer value) {
            addCriterion("board_id =", value, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdNotEqualTo(Integer value) {
            addCriterion("board_id <>", value, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdGreaterThan(Integer value) {
            addCriterion("board_id >", value, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("board_id >=", value, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdLessThan(Integer value) {
            addCriterion("board_id <", value, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdLessThanOrEqualTo(Integer value) {
            addCriterion("board_id <=", value, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdIn(List<Integer> values) {
            addCriterion("board_id in", values, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdNotIn(List<Integer> values) {
            addCriterion("board_id not in", values, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdBetween(Integer value1, Integer value2) {
            addCriterion("board_id between", value1, value2, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdNotBetween(Integer value1, Integer value2) {
            addCriterion("board_id not between", value1, value2, "boardId");
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

        public Criteria andPartTableNameIsNull() {
            addCriterion("part_table_name is null");
            return (Criteria) this;
        }

        public Criteria andPartTableNameIsNotNull() {
            addCriterion("part_table_name is not null");
            return (Criteria) this;
        }

        public Criteria andPartTableNameEqualTo(String value) {
            addCriterion("part_table_name =", value, "partTableName");
            return (Criteria) this;
        }

        public Criteria andPartTableNameNotEqualTo(String value) {
            addCriterion("part_table_name <>", value, "partTableName");
            return (Criteria) this;
        }

        public Criteria andPartTableNameGreaterThan(String value) {
            addCriterion("part_table_name >", value, "partTableName");
            return (Criteria) this;
        }

        public Criteria andPartTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("part_table_name >=", value, "partTableName");
            return (Criteria) this;
        }

        public Criteria andPartTableNameLessThan(String value) {
            addCriterion("part_table_name <", value, "partTableName");
            return (Criteria) this;
        }

        public Criteria andPartTableNameLessThanOrEqualTo(String value) {
            addCriterion("part_table_name <=", value, "partTableName");
            return (Criteria) this;
        }

        public Criteria andPartTableNameLike(String value) {
            addCriterion("part_table_name like", value, "partTableName");
            return (Criteria) this;
        }

        public Criteria andPartTableNameNotLike(String value) {
            addCriterion("part_table_name not like", value, "partTableName");
            return (Criteria) this;
        }

        public Criteria andPartTableNameIn(List<String> values) {
            addCriterion("part_table_name in", values, "partTableName");
            return (Criteria) this;
        }

        public Criteria andPartTableNameNotIn(List<String> values) {
            addCriterion("part_table_name not in", values, "partTableName");
            return (Criteria) this;
        }

        public Criteria andPartTableNameBetween(String value1, String value2) {
            addCriterion("part_table_name between", value1, value2, "partTableName");
            return (Criteria) this;
        }

        public Criteria andPartTableNameNotBetween(String value1, String value2) {
            addCriterion("part_table_name not between", value1, value2, "partTableName");
            return (Criteria) this;
        }

        public Criteria andPartTableDescribeIsNull() {
            addCriterion("part_table_describe is null");
            return (Criteria) this;
        }

        public Criteria andPartTableDescribeIsNotNull() {
            addCriterion("part_table_describe is not null");
            return (Criteria) this;
        }

        public Criteria andPartTableDescribeEqualTo(String value) {
            addCriterion("part_table_describe =", value, "partTableDescribe");
            return (Criteria) this;
        }

        public Criteria andPartTableDescribeNotEqualTo(String value) {
            addCriterion("part_table_describe <>", value, "partTableDescribe");
            return (Criteria) this;
        }

        public Criteria andPartTableDescribeGreaterThan(String value) {
            addCriterion("part_table_describe >", value, "partTableDescribe");
            return (Criteria) this;
        }

        public Criteria andPartTableDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("part_table_describe >=", value, "partTableDescribe");
            return (Criteria) this;
        }

        public Criteria andPartTableDescribeLessThan(String value) {
            addCriterion("part_table_describe <", value, "partTableDescribe");
            return (Criteria) this;
        }

        public Criteria andPartTableDescribeLessThanOrEqualTo(String value) {
            addCriterion("part_table_describe <=", value, "partTableDescribe");
            return (Criteria) this;
        }

        public Criteria andPartTableDescribeLike(String value) {
            addCriterion("part_table_describe like", value, "partTableDescribe");
            return (Criteria) this;
        }

        public Criteria andPartTableDescribeNotLike(String value) {
            addCriterion("part_table_describe not like", value, "partTableDescribe");
            return (Criteria) this;
        }

        public Criteria andPartTableDescribeIn(List<String> values) {
            addCriterion("part_table_describe in", values, "partTableDescribe");
            return (Criteria) this;
        }

        public Criteria andPartTableDescribeNotIn(List<String> values) {
            addCriterion("part_table_describe not in", values, "partTableDescribe");
            return (Criteria) this;
        }

        public Criteria andPartTableDescribeBetween(String value1, String value2) {
            addCriterion("part_table_describe between", value1, value2, "partTableDescribe");
            return (Criteria) this;
        }

        public Criteria andPartTableDescribeNotBetween(String value1, String value2) {
            addCriterion("part_table_describe not between", value1, value2, "partTableDescribe");
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