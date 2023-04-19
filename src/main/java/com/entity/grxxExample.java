package com.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class grxxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public grxxExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andYgidIsNull() {
            addCriterion("ygid is null");
            return (Criteria) this;
        }

        public Criteria andYgidIsNotNull() {
            addCriterion("ygid is not null");
            return (Criteria) this;
        }

        public Criteria andYgidEqualTo(String value) {
            addCriterion("ygid =", value, "ygid");
            return (Criteria) this;
        }

        public Criteria andYgidNotEqualTo(String value) {
            addCriterion("ygid <>", value, "ygid");
            return (Criteria) this;
        }

        public Criteria andYgidGreaterThan(String value) {
            addCriterion("ygid >", value, "ygid");
            return (Criteria) this;
        }

        public Criteria andYgidGreaterThanOrEqualTo(String value) {
            addCriterion("ygid >=", value, "ygid");
            return (Criteria) this;
        }

        public Criteria andYgidLessThan(String value) {
            addCriterion("ygid <", value, "ygid");
            return (Criteria) this;
        }

        public Criteria andYgidLessThanOrEqualTo(String value) {
            addCriterion("ygid <=", value, "ygid");
            return (Criteria) this;
        }

        public Criteria andYgidLike(String value) {
            addCriterion("ygid like", value, "ygid");
            return (Criteria) this;
        }

        public Criteria andYgidNotLike(String value) {
            addCriterion("ygid not like", value, "ygid");
            return (Criteria) this;
        }

        public Criteria andYgidIn(List<String> values) {
            addCriterion("ygid in", values, "ygid");
            return (Criteria) this;
        }

        public Criteria andYgidNotIn(List<String> values) {
            addCriterion("ygid not in", values, "ygid");
            return (Criteria) this;
        }

        public Criteria andYgidBetween(String value1, String value2) {
            addCriterion("ygid between", value1, value2, "ygid");
            return (Criteria) this;
        }

        public Criteria andYgidNotBetween(String value1, String value2) {
            addCriterion("ygid not between", value1, value2, "ygid");
            return (Criteria) this;
        }

        public Criteria andYgxmIsNull() {
            addCriterion("ygxm is null");
            return (Criteria) this;
        }

        public Criteria andYgxmIsNotNull() {
            addCriterion("ygxm is not null");
            return (Criteria) this;
        }

        public Criteria andYgxmEqualTo(String value) {
            addCriterion("ygxm =", value, "ygxm");
            return (Criteria) this;
        }

        public Criteria andYgxmNotEqualTo(String value) {
            addCriterion("ygxm <>", value, "ygxm");
            return (Criteria) this;
        }

        public Criteria andYgxmGreaterThan(String value) {
            addCriterion("ygxm >", value, "ygxm");
            return (Criteria) this;
        }

        public Criteria andYgxmGreaterThanOrEqualTo(String value) {
            addCriterion("ygxm >=", value, "ygxm");
            return (Criteria) this;
        }

        public Criteria andYgxmLessThan(String value) {
            addCriterion("ygxm <", value, "ygxm");
            return (Criteria) this;
        }

        public Criteria andYgxmLessThanOrEqualTo(String value) {
            addCriterion("ygxm <=", value, "ygxm");
            return (Criteria) this;
        }

        public Criteria andYgxmLike(String value) {
            addCriterion("ygxm like", value, "ygxm");
            return (Criteria) this;
        }

        public Criteria andYgxmNotLike(String value) {
            addCriterion("ygxm not like", value, "ygxm");
            return (Criteria) this;
        }

        public Criteria andYgxmIn(List<String> values) {
            addCriterion("ygxm in", values, "ygxm");
            return (Criteria) this;
        }

        public Criteria andYgxmNotIn(List<String> values) {
            addCriterion("ygxm not in", values, "ygxm");
            return (Criteria) this;
        }

        public Criteria andYgxmBetween(String value1, String value2) {
            addCriterion("ygxm between", value1, value2, "ygxm");
            return (Criteria) this;
        }

        public Criteria andYgxmNotBetween(String value1, String value2) {
            addCriterion("ygxm not between", value1, value2, "ygxm");
            return (Criteria) this;
        }

        public Criteria andNlIsNull() {
            addCriterion("nl is null");
            return (Criteria) this;
        }

        public Criteria andNlIsNotNull() {
            addCriterion("nl is not null");
            return (Criteria) this;
        }

        public Criteria andNlEqualTo(String value) {
            addCriterion("nl =", value, "nl");
            return (Criteria) this;
        }

        public Criteria andNlNotEqualTo(String value) {
            addCriterion("nl <>", value, "nl");
            return (Criteria) this;
        }

        public Criteria andNlGreaterThan(String value) {
            addCriterion("nl >", value, "nl");
            return (Criteria) this;
        }

        public Criteria andNlGreaterThanOrEqualTo(String value) {
            addCriterion("nl >=", value, "nl");
            return (Criteria) this;
        }

        public Criteria andNlLessThan(String value) {
            addCriterion("nl <", value, "nl");
            return (Criteria) this;
        }

        public Criteria andNlLessThanOrEqualTo(String value) {
            addCriterion("nl <=", value, "nl");
            return (Criteria) this;
        }

        public Criteria andNlLike(String value) {
            addCriterion("nl like", value, "nl");
            return (Criteria) this;
        }

        public Criteria andNlNotLike(String value) {
            addCriterion("nl not like", value, "nl");
            return (Criteria) this;
        }

        public Criteria andNlIn(List<String> values) {
            addCriterion("nl in", values, "nl");
            return (Criteria) this;
        }

        public Criteria andNlNotIn(List<String> values) {
            addCriterion("nl not in", values, "nl");
            return (Criteria) this;
        }

        public Criteria andNlBetween(String value1, String value2) {
            addCriterion("nl between", value1, value2, "nl");
            return (Criteria) this;
        }

        public Criteria andNlNotBetween(String value1, String value2) {
            addCriterion("nl not between", value1, value2, "nl");
            return (Criteria) this;
        }

        public Criteria andXbIsNull() {
            addCriterion("xb is null");
            return (Criteria) this;
        }

        public Criteria andXbIsNotNull() {
            addCriterion("xb is not null");
            return (Criteria) this;
        }

        public Criteria andXbEqualTo(String value) {
            addCriterion("xb =", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotEqualTo(String value) {
            addCriterion("xb <>", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbGreaterThan(String value) {
            addCriterion("xb >", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbGreaterThanOrEqualTo(String value) {
            addCriterion("xb >=", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLessThan(String value) {
            addCriterion("xb <", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLessThanOrEqualTo(String value) {
            addCriterion("xb <=", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLike(String value) {
            addCriterion("xb like", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotLike(String value) {
            addCriterion("xb not like", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbIn(List<String> values) {
            addCriterion("xb in", values, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotIn(List<String> values) {
            addCriterion("xb not in", values, "xb");
            return (Criteria) this;
        }

        public Criteria andXbBetween(String value1, String value2) {
            addCriterion("xb between", value1, value2, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotBetween(String value1, String value2) {
            addCriterion("xb not between", value1, value2, "xb");
            return (Criteria) this;
        }

        public Criteria andSfzhmIsNull() {
            addCriterion("sfzhm is null");
            return (Criteria) this;
        }

        public Criteria andSfzhmIsNotNull() {
            addCriterion("sfzhm is not null");
            return (Criteria) this;
        }

        public Criteria andSfzhmEqualTo(String value) {
            addCriterion("sfzhm =", value, "sfzhm");
            return (Criteria) this;
        }

        public Criteria andSfzhmNotEqualTo(String value) {
            addCriterion("sfzhm <>", value, "sfzhm");
            return (Criteria) this;
        }

        public Criteria andSfzhmGreaterThan(String value) {
            addCriterion("sfzhm >", value, "sfzhm");
            return (Criteria) this;
        }

        public Criteria andSfzhmGreaterThanOrEqualTo(String value) {
            addCriterion("sfzhm >=", value, "sfzhm");
            return (Criteria) this;
        }

        public Criteria andSfzhmLessThan(String value) {
            addCriterion("sfzhm <", value, "sfzhm");
            return (Criteria) this;
        }

        public Criteria andSfzhmLessThanOrEqualTo(String value) {
            addCriterion("sfzhm <=", value, "sfzhm");
            return (Criteria) this;
        }

        public Criteria andSfzhmLike(String value) {
            addCriterion("sfzhm like", value, "sfzhm");
            return (Criteria) this;
        }

        public Criteria andSfzhmNotLike(String value) {
            addCriterion("sfzhm not like", value, "sfzhm");
            return (Criteria) this;
        }

        public Criteria andSfzhmIn(List<String> values) {
            addCriterion("sfzhm in", values, "sfzhm");
            return (Criteria) this;
        }

        public Criteria andSfzhmNotIn(List<String> values) {
            addCriterion("sfzhm not in", values, "sfzhm");
            return (Criteria) this;
        }

        public Criteria andSfzhmBetween(String value1, String value2) {
            addCriterion("sfzhm between", value1, value2, "sfzhm");
            return (Criteria) this;
        }

        public Criteria andSfzhmNotBetween(String value1, String value2) {
            addCriterion("sfzhm not between", value1, value2, "sfzhm");
            return (Criteria) this;
        }

        public Criteria andRcrqIsNull() {
            addCriterion("rcrq is null");
            return (Criteria) this;
        }

        public Criteria andRcrqIsNotNull() {
            addCriterion("rcrq is not null");
            return (Criteria) this;
        }

        public Criteria andRcrqEqualTo(Date value) {
            addCriterionForJDBCDate("rcrq =", value, "rcrq");
            return (Criteria) this;
        }

        public Criteria andRcrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("rcrq <>", value, "rcrq");
            return (Criteria) this;
        }

        public Criteria andRcrqGreaterThan(Date value) {
            addCriterionForJDBCDate("rcrq >", value, "rcrq");
            return (Criteria) this;
        }

        public Criteria andRcrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rcrq >=", value, "rcrq");
            return (Criteria) this;
        }

        public Criteria andRcrqLessThan(Date value) {
            addCriterionForJDBCDate("rcrq <", value, "rcrq");
            return (Criteria) this;
        }

        public Criteria andRcrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rcrq <=", value, "rcrq");
            return (Criteria) this;
        }

        public Criteria andRcrqIn(List<Date> values) {
            addCriterionForJDBCDate("rcrq in", values, "rcrq");
            return (Criteria) this;
        }

        public Criteria andRcrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("rcrq not in", values, "rcrq");
            return (Criteria) this;
        }

        public Criteria andRcrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rcrq between", value1, value2, "rcrq");
            return (Criteria) this;
        }

        public Criteria andRcrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rcrq not between", value1, value2, "rcrq");
            return (Criteria) this;
        }

        public Criteria andLzrqIsNull() {
            addCriterion("lzrq is null");
            return (Criteria) this;
        }

        public Criteria andLzrqIsNotNull() {
            addCriterion("lzrq is not null");
            return (Criteria) this;
        }

        public Criteria andLzrqEqualTo(Date value) {
            addCriterionForJDBCDate("lzrq =", value, "lzrq");
            return (Criteria) this;
        }

        public Criteria andLzrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("lzrq <>", value, "lzrq");
            return (Criteria) this;
        }

        public Criteria andLzrqGreaterThan(Date value) {
            addCriterionForJDBCDate("lzrq >", value, "lzrq");
            return (Criteria) this;
        }

        public Criteria andLzrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lzrq >=", value, "lzrq");
            return (Criteria) this;
        }

        public Criteria andLzrqLessThan(Date value) {
            addCriterionForJDBCDate("lzrq <", value, "lzrq");
            return (Criteria) this;
        }

        public Criteria andLzrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lzrq <=", value, "lzrq");
            return (Criteria) this;
        }

        public Criteria andLzrqIn(List<Date> values) {
            addCriterionForJDBCDate("lzrq in", values, "lzrq");
            return (Criteria) this;
        }

        public Criteria andLzrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("lzrq not in", values, "lzrq");
            return (Criteria) this;
        }

        public Criteria andLzrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lzrq between", value1, value2, "lzrq");
            return (Criteria) this;
        }

        public Criteria andLzrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lzrq not between", value1, value2, "lzrq");
            return (Criteria) this;
        }

        public Criteria andBzIsNull() {
            addCriterion("bz is null");
            return (Criteria) this;
        }

        public Criteria andBzIsNotNull() {
            addCriterion("bz is not null");
            return (Criteria) this;
        }

        public Criteria andBzEqualTo(String value) {
            addCriterion("bz =", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotEqualTo(String value) {
            addCriterion("bz <>", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThan(String value) {
            addCriterion("bz >", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThanOrEqualTo(String value) {
            addCriterion("bz >=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThan(String value) {
            addCriterion("bz <", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThanOrEqualTo(String value) {
            addCriterion("bz <=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLike(String value) {
            addCriterion("bz like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotLike(String value) {
            addCriterion("bz not like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzIn(List<String> values) {
            addCriterion("bz in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotIn(List<String> values) {
            addCriterion("bz not in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzBetween(String value1, String value2) {
            addCriterion("bz between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotBetween(String value1, String value2) {
            addCriterion("bz not between", value1, value2, "bz");
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