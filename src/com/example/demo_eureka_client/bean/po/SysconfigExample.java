package com.example.demo_eureka_client.bean.po;

import java.util.ArrayList;
import java.util.List;

public class SysconfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysconfigExample() {
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

        public Criteria andParametercodeIsNull() {
            addCriterion("PARAMETERCODE is null");
            return (Criteria) this;
        }

        public Criteria andParametercodeIsNotNull() {
            addCriterion("PARAMETERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andParametercodeEqualTo(String value) {
            addCriterion("PARAMETERCODE =", value, "parametercode");
            return (Criteria) this;
        }

        public Criteria andParametercodeNotEqualTo(String value) {
            addCriterion("PARAMETERCODE <>", value, "parametercode");
            return (Criteria) this;
        }

        public Criteria andParametercodeGreaterThan(String value) {
            addCriterion("PARAMETERCODE >", value, "parametercode");
            return (Criteria) this;
        }

        public Criteria andParametercodeGreaterThanOrEqualTo(String value) {
            addCriterion("PARAMETERCODE >=", value, "parametercode");
            return (Criteria) this;
        }

        public Criteria andParametercodeLessThan(String value) {
            addCriterion("PARAMETERCODE <", value, "parametercode");
            return (Criteria) this;
        }

        public Criteria andParametercodeLessThanOrEqualTo(String value) {
            addCriterion("PARAMETERCODE <=", value, "parametercode");
            return (Criteria) this;
        }

        public Criteria andParametercodeLike(String value) {
            addCriterion("PARAMETERCODE like", value, "parametercode");
            return (Criteria) this;
        }

        public Criteria andParametercodeNotLike(String value) {
            addCriterion("PARAMETERCODE not like", value, "parametercode");
            return (Criteria) this;
        }

        public Criteria andParametercodeIn(List<String> values) {
            addCriterion("PARAMETERCODE in", values, "parametercode");
            return (Criteria) this;
        }

        public Criteria andParametercodeNotIn(List<String> values) {
            addCriterion("PARAMETERCODE not in", values, "parametercode");
            return (Criteria) this;
        }

        public Criteria andParametercodeBetween(String value1, String value2) {
            addCriterion("PARAMETERCODE between", value1, value2, "parametercode");
            return (Criteria) this;
        }

        public Criteria andParametercodeNotBetween(String value1, String value2) {
            addCriterion("PARAMETERCODE not between", value1, value2, "parametercode");
            return (Criteria) this;
        }

        public Criteria andParametertypeIsNull() {
            addCriterion("PARAMETERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andParametertypeIsNotNull() {
            addCriterion("PARAMETERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andParametertypeEqualTo(String value) {
            addCriterion("PARAMETERTYPE =", value, "parametertype");
            return (Criteria) this;
        }

        public Criteria andParametertypeNotEqualTo(String value) {
            addCriterion("PARAMETERTYPE <>", value, "parametertype");
            return (Criteria) this;
        }

        public Criteria andParametertypeGreaterThan(String value) {
            addCriterion("PARAMETERTYPE >", value, "parametertype");
            return (Criteria) this;
        }

        public Criteria andParametertypeGreaterThanOrEqualTo(String value) {
            addCriterion("PARAMETERTYPE >=", value, "parametertype");
            return (Criteria) this;
        }

        public Criteria andParametertypeLessThan(String value) {
            addCriterion("PARAMETERTYPE <", value, "parametertype");
            return (Criteria) this;
        }

        public Criteria andParametertypeLessThanOrEqualTo(String value) {
            addCriterion("PARAMETERTYPE <=", value, "parametertype");
            return (Criteria) this;
        }

        public Criteria andParametertypeLike(String value) {
            addCriterion("PARAMETERTYPE like", value, "parametertype");
            return (Criteria) this;
        }

        public Criteria andParametertypeNotLike(String value) {
            addCriterion("PARAMETERTYPE not like", value, "parametertype");
            return (Criteria) this;
        }

        public Criteria andParametertypeIn(List<String> values) {
            addCriterion("PARAMETERTYPE in", values, "parametertype");
            return (Criteria) this;
        }

        public Criteria andParametertypeNotIn(List<String> values) {
            addCriterion("PARAMETERTYPE not in", values, "parametertype");
            return (Criteria) this;
        }

        public Criteria andParametertypeBetween(String value1, String value2) {
            addCriterion("PARAMETERTYPE between", value1, value2, "parametertype");
            return (Criteria) this;
        }

        public Criteria andParametertypeNotBetween(String value1, String value2) {
            addCriterion("PARAMETERTYPE not between", value1, value2, "parametertype");
            return (Criteria) this;
        }

        public Criteria andParametervalueIsNull() {
            addCriterion("PARAMETERVALUE is null");
            return (Criteria) this;
        }

        public Criteria andParametervalueIsNotNull() {
            addCriterion("PARAMETERVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andParametervalueEqualTo(String value) {
            addCriterion("PARAMETERVALUE =", value, "parametervalue");
            return (Criteria) this;
        }

        public Criteria andParametervalueNotEqualTo(String value) {
            addCriterion("PARAMETERVALUE <>", value, "parametervalue");
            return (Criteria) this;
        }

        public Criteria andParametervalueGreaterThan(String value) {
            addCriterion("PARAMETERVALUE >", value, "parametervalue");
            return (Criteria) this;
        }

        public Criteria andParametervalueGreaterThanOrEqualTo(String value) {
            addCriterion("PARAMETERVALUE >=", value, "parametervalue");
            return (Criteria) this;
        }

        public Criteria andParametervalueLessThan(String value) {
            addCriterion("PARAMETERVALUE <", value, "parametervalue");
            return (Criteria) this;
        }

        public Criteria andParametervalueLessThanOrEqualTo(String value) {
            addCriterion("PARAMETERVALUE <=", value, "parametervalue");
            return (Criteria) this;
        }

        public Criteria andParametervalueLike(String value) {
            addCriterion("PARAMETERVALUE like", value, "parametervalue");
            return (Criteria) this;
        }

        public Criteria andParametervalueNotLike(String value) {
            addCriterion("PARAMETERVALUE not like", value, "parametervalue");
            return (Criteria) this;
        }

        public Criteria andParametervalueIn(List<String> values) {
            addCriterion("PARAMETERVALUE in", values, "parametervalue");
            return (Criteria) this;
        }

        public Criteria andParametervalueNotIn(List<String> values) {
            addCriterion("PARAMETERVALUE not in", values, "parametervalue");
            return (Criteria) this;
        }

        public Criteria andParametervalueBetween(String value1, String value2) {
            addCriterion("PARAMETERVALUE between", value1, value2, "parametervalue");
            return (Criteria) this;
        }

        public Criteria andParametervalueNotBetween(String value1, String value2) {
            addCriterion("PARAMETERVALUE not between", value1, value2, "parametervalue");
            return (Criteria) this;
        }

        public Criteria andParameterdescIsNull() {
            addCriterion("PARAMETERDESC is null");
            return (Criteria) this;
        }

        public Criteria andParameterdescIsNotNull() {
            addCriterion("PARAMETERDESC is not null");
            return (Criteria) this;
        }

        public Criteria andParameterdescEqualTo(String value) {
            addCriterion("PARAMETERDESC =", value, "parameterdesc");
            return (Criteria) this;
        }

        public Criteria andParameterdescNotEqualTo(String value) {
            addCriterion("PARAMETERDESC <>", value, "parameterdesc");
            return (Criteria) this;
        }

        public Criteria andParameterdescGreaterThan(String value) {
            addCriterion("PARAMETERDESC >", value, "parameterdesc");
            return (Criteria) this;
        }

        public Criteria andParameterdescGreaterThanOrEqualTo(String value) {
            addCriterion("PARAMETERDESC >=", value, "parameterdesc");
            return (Criteria) this;
        }

        public Criteria andParameterdescLessThan(String value) {
            addCriterion("PARAMETERDESC <", value, "parameterdesc");
            return (Criteria) this;
        }

        public Criteria andParameterdescLessThanOrEqualTo(String value) {
            addCriterion("PARAMETERDESC <=", value, "parameterdesc");
            return (Criteria) this;
        }

        public Criteria andParameterdescLike(String value) {
            addCriterion("PARAMETERDESC like", value, "parameterdesc");
            return (Criteria) this;
        }

        public Criteria andParameterdescNotLike(String value) {
            addCriterion("PARAMETERDESC not like", value, "parameterdesc");
            return (Criteria) this;
        }

        public Criteria andParameterdescIn(List<String> values) {
            addCriterion("PARAMETERDESC in", values, "parameterdesc");
            return (Criteria) this;
        }

        public Criteria andParameterdescNotIn(List<String> values) {
            addCriterion("PARAMETERDESC not in", values, "parameterdesc");
            return (Criteria) this;
        }

        public Criteria andParameterdescBetween(String value1, String value2) {
            addCriterion("PARAMETERDESC between", value1, value2, "parameterdesc");
            return (Criteria) this;
        }

        public Criteria andParameterdescNotBetween(String value1, String value2) {
            addCriterion("PARAMETERDESC not between", value1, value2, "parameterdesc");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
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