package com.example.demo_eureka_client.bean.po;

import java.util.ArrayList;
import java.util.List;

public class ProBizcodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProBizcodeExample() {
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

        public Criteria andCodenameIsNull() {
            addCriterion("CODENAME is null");
            return (Criteria) this;
        }

        public Criteria andCodenameIsNotNull() {
            addCriterion("CODENAME is not null");
            return (Criteria) this;
        }

        public Criteria andCodenameEqualTo(String value) {
            addCriterion("CODENAME =", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameNotEqualTo(String value) {
            addCriterion("CODENAME <>", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameGreaterThan(String value) {
            addCriterion("CODENAME >", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameGreaterThanOrEqualTo(String value) {
            addCriterion("CODENAME >=", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameLessThan(String value) {
            addCriterion("CODENAME <", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameLessThanOrEqualTo(String value) {
            addCriterion("CODENAME <=", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameLike(String value) {
            addCriterion("CODENAME like", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameNotLike(String value) {
            addCriterion("CODENAME not like", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameIn(List<String> values) {
            addCriterion("CODENAME in", values, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameNotIn(List<String> values) {
            addCriterion("CODENAME not in", values, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameBetween(String value1, String value2) {
            addCriterion("CODENAME between", value1, value2, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameNotBetween(String value1, String value2) {
            addCriterion("CODENAME not between", value1, value2, "codename");
            return (Criteria) this;
        }

        public Criteria andCodevaluesIsNull() {
            addCriterion("CODEVALUES is null");
            return (Criteria) this;
        }

        public Criteria andCodevaluesIsNotNull() {
            addCriterion("CODEVALUES is not null");
            return (Criteria) this;
        }

        public Criteria andCodevaluesEqualTo(String value) {
            addCriterion("CODEVALUES =", value, "codevalues");
            return (Criteria) this;
        }

        public Criteria andCodevaluesNotEqualTo(String value) {
            addCriterion("CODEVALUES <>", value, "codevalues");
            return (Criteria) this;
        }

        public Criteria andCodevaluesGreaterThan(String value) {
            addCriterion("CODEVALUES >", value, "codevalues");
            return (Criteria) this;
        }

        public Criteria andCodevaluesGreaterThanOrEqualTo(String value) {
            addCriterion("CODEVALUES >=", value, "codevalues");
            return (Criteria) this;
        }

        public Criteria andCodevaluesLessThan(String value) {
            addCriterion("CODEVALUES <", value, "codevalues");
            return (Criteria) this;
        }

        public Criteria andCodevaluesLessThanOrEqualTo(String value) {
            addCriterion("CODEVALUES <=", value, "codevalues");
            return (Criteria) this;
        }

        public Criteria andCodevaluesLike(String value) {
            addCriterion("CODEVALUES like", value, "codevalues");
            return (Criteria) this;
        }

        public Criteria andCodevaluesNotLike(String value) {
            addCriterion("CODEVALUES not like", value, "codevalues");
            return (Criteria) this;
        }

        public Criteria andCodevaluesIn(List<String> values) {
            addCriterion("CODEVALUES in", values, "codevalues");
            return (Criteria) this;
        }

        public Criteria andCodevaluesNotIn(List<String> values) {
            addCriterion("CODEVALUES not in", values, "codevalues");
            return (Criteria) this;
        }

        public Criteria andCodevaluesBetween(String value1, String value2) {
            addCriterion("CODEVALUES between", value1, value2, "codevalues");
            return (Criteria) this;
        }

        public Criteria andCodevaluesNotBetween(String value1, String value2) {
            addCriterion("CODEVALUES not between", value1, value2, "codevalues");
            return (Criteria) this;
        }

        public Criteria andCodecnameIsNull() {
            addCriterion("CODECNAME is null");
            return (Criteria) this;
        }

        public Criteria andCodecnameIsNotNull() {
            addCriterion("CODECNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCodecnameEqualTo(String value) {
            addCriterion("CODECNAME =", value, "codecname");
            return (Criteria) this;
        }

        public Criteria andCodecnameNotEqualTo(String value) {
            addCriterion("CODECNAME <>", value, "codecname");
            return (Criteria) this;
        }

        public Criteria andCodecnameGreaterThan(String value) {
            addCriterion("CODECNAME >", value, "codecname");
            return (Criteria) this;
        }

        public Criteria andCodecnameGreaterThanOrEqualTo(String value) {
            addCriterion("CODECNAME >=", value, "codecname");
            return (Criteria) this;
        }

        public Criteria andCodecnameLessThan(String value) {
            addCriterion("CODECNAME <", value, "codecname");
            return (Criteria) this;
        }

        public Criteria andCodecnameLessThanOrEqualTo(String value) {
            addCriterion("CODECNAME <=", value, "codecname");
            return (Criteria) this;
        }

        public Criteria andCodecnameLike(String value) {
            addCriterion("CODECNAME like", value, "codecname");
            return (Criteria) this;
        }

        public Criteria andCodecnameNotLike(String value) {
            addCriterion("CODECNAME not like", value, "codecname");
            return (Criteria) this;
        }

        public Criteria andCodecnameIn(List<String> values) {
            addCriterion("CODECNAME in", values, "codecname");
            return (Criteria) this;
        }

        public Criteria andCodecnameNotIn(List<String> values) {
            addCriterion("CODECNAME not in", values, "codecname");
            return (Criteria) this;
        }

        public Criteria andCodecnameBetween(String value1, String value2) {
            addCriterion("CODECNAME between", value1, value2, "codecname");
            return (Criteria) this;
        }

        public Criteria andCodecnameNotBetween(String value1, String value2) {
            addCriterion("CODECNAME not between", value1, value2, "codecname");
            return (Criteria) this;
        }

        public Criteria andCodeenameIsNull() {
            addCriterion("CODEENAME is null");
            return (Criteria) this;
        }

        public Criteria andCodeenameIsNotNull() {
            addCriterion("CODEENAME is not null");
            return (Criteria) this;
        }

        public Criteria andCodeenameEqualTo(String value) {
            addCriterion("CODEENAME =", value, "codeename");
            return (Criteria) this;
        }

        public Criteria andCodeenameNotEqualTo(String value) {
            addCriterion("CODEENAME <>", value, "codeename");
            return (Criteria) this;
        }

        public Criteria andCodeenameGreaterThan(String value) {
            addCriterion("CODEENAME >", value, "codeename");
            return (Criteria) this;
        }

        public Criteria andCodeenameGreaterThanOrEqualTo(String value) {
            addCriterion("CODEENAME >=", value, "codeename");
            return (Criteria) this;
        }

        public Criteria andCodeenameLessThan(String value) {
            addCriterion("CODEENAME <", value, "codeename");
            return (Criteria) this;
        }

        public Criteria andCodeenameLessThanOrEqualTo(String value) {
            addCriterion("CODEENAME <=", value, "codeename");
            return (Criteria) this;
        }

        public Criteria andCodeenameLike(String value) {
            addCriterion("CODEENAME like", value, "codeename");
            return (Criteria) this;
        }

        public Criteria andCodeenameNotLike(String value) {
            addCriterion("CODEENAME not like", value, "codeename");
            return (Criteria) this;
        }

        public Criteria andCodeenameIn(List<String> values) {
            addCriterion("CODEENAME in", values, "codeename");
            return (Criteria) this;
        }

        public Criteria andCodeenameNotIn(List<String> values) {
            addCriterion("CODEENAME not in", values, "codeename");
            return (Criteria) this;
        }

        public Criteria andCodeenameBetween(String value1, String value2) {
            addCriterion("CODEENAME between", value1, value2, "codeename");
            return (Criteria) this;
        }

        public Criteria andCodeenameNotBetween(String value1, String value2) {
            addCriterion("CODEENAME not between", value1, value2, "codeename");
            return (Criteria) this;
        }

        public Criteria andValidstatusIsNull() {
            addCriterion("VALIDSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andValidstatusIsNotNull() {
            addCriterion("VALIDSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andValidstatusEqualTo(String value) {
            addCriterion("VALIDSTATUS =", value, "validstatus");
            return (Criteria) this;
        }

        public Criteria andValidstatusNotEqualTo(String value) {
            addCriterion("VALIDSTATUS <>", value, "validstatus");
            return (Criteria) this;
        }

        public Criteria andValidstatusGreaterThan(String value) {
            addCriterion("VALIDSTATUS >", value, "validstatus");
            return (Criteria) this;
        }

        public Criteria andValidstatusGreaterThanOrEqualTo(String value) {
            addCriterion("VALIDSTATUS >=", value, "validstatus");
            return (Criteria) this;
        }

        public Criteria andValidstatusLessThan(String value) {
            addCriterion("VALIDSTATUS <", value, "validstatus");
            return (Criteria) this;
        }

        public Criteria andValidstatusLessThanOrEqualTo(String value) {
            addCriterion("VALIDSTATUS <=", value, "validstatus");
            return (Criteria) this;
        }

        public Criteria andValidstatusLike(String value) {
            addCriterion("VALIDSTATUS like", value, "validstatus");
            return (Criteria) this;
        }

        public Criteria andValidstatusNotLike(String value) {
            addCriterion("VALIDSTATUS not like", value, "validstatus");
            return (Criteria) this;
        }

        public Criteria andValidstatusIn(List<String> values) {
            addCriterion("VALIDSTATUS in", values, "validstatus");
            return (Criteria) this;
        }

        public Criteria andValidstatusNotIn(List<String> values) {
            addCriterion("VALIDSTATUS not in", values, "validstatus");
            return (Criteria) this;
        }

        public Criteria andValidstatusBetween(String value1, String value2) {
            addCriterion("VALIDSTATUS between", value1, value2, "validstatus");
            return (Criteria) this;
        }

        public Criteria andValidstatusNotBetween(String value1, String value2) {
            addCriterion("VALIDSTATUS not between", value1, value2, "validstatus");
            return (Criteria) this;
        }

        public Criteria andCodedescIsNull() {
            addCriterion("CODEDESC is null");
            return (Criteria) this;
        }

        public Criteria andCodedescIsNotNull() {
            addCriterion("CODEDESC is not null");
            return (Criteria) this;
        }

        public Criteria andCodedescEqualTo(String value) {
            addCriterion("CODEDESC =", value, "codedesc");
            return (Criteria) this;
        }

        public Criteria andCodedescNotEqualTo(String value) {
            addCriterion("CODEDESC <>", value, "codedesc");
            return (Criteria) this;
        }

        public Criteria andCodedescGreaterThan(String value) {
            addCriterion("CODEDESC >", value, "codedesc");
            return (Criteria) this;
        }

        public Criteria andCodedescGreaterThanOrEqualTo(String value) {
            addCriterion("CODEDESC >=", value, "codedesc");
            return (Criteria) this;
        }

        public Criteria andCodedescLessThan(String value) {
            addCriterion("CODEDESC <", value, "codedesc");
            return (Criteria) this;
        }

        public Criteria andCodedescLessThanOrEqualTo(String value) {
            addCriterion("CODEDESC <=", value, "codedesc");
            return (Criteria) this;
        }

        public Criteria andCodedescLike(String value) {
            addCriterion("CODEDESC like", value, "codedesc");
            return (Criteria) this;
        }

        public Criteria andCodedescNotLike(String value) {
            addCriterion("CODEDESC not like", value, "codedesc");
            return (Criteria) this;
        }

        public Criteria andCodedescIn(List<String> values) {
            addCriterion("CODEDESC in", values, "codedesc");
            return (Criteria) this;
        }

        public Criteria andCodedescNotIn(List<String> values) {
            addCriterion("CODEDESC not in", values, "codedesc");
            return (Criteria) this;
        }

        public Criteria andCodedescBetween(String value1, String value2) {
            addCriterion("CODEDESC between", value1, value2, "codedesc");
            return (Criteria) this;
        }

        public Criteria andCodedescNotBetween(String value1, String value2) {
            addCriterion("CODEDESC not between", value1, value2, "codedesc");
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