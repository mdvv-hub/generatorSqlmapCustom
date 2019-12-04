package com.sinosoft.wjysweb.web.bean.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andOrdersidIsNull() {
            addCriterion("OrdersId is null");
            return (Criteria) this;
        }

        public Criteria andOrdersidIsNotNull() {
            addCriterion("OrdersId is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersidEqualTo(String value) {
            addCriterion("OrdersId =", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidNotEqualTo(String value) {
            addCriterion("OrdersId <>", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidGreaterThan(String value) {
            addCriterion("OrdersId >", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidGreaterThanOrEqualTo(String value) {
            addCriterion("OrdersId >=", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidLessThan(String value) {
            addCriterion("OrdersId <", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidLessThanOrEqualTo(String value) {
            addCriterion("OrdersId <=", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidLike(String value) {
            addCriterion("OrdersId like", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidNotLike(String value) {
            addCriterion("OrdersId not like", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidIn(List<String> values) {
            addCriterion("OrdersId in", values, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidNotIn(List<String> values) {
            addCriterion("OrdersId not in", values, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidBetween(String value1, String value2) {
            addCriterion("OrdersId between", value1, value2, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidNotBetween(String value1, String value2) {
            addCriterion("OrdersId not between", value1, value2, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersnameIsNull() {
            addCriterion("OrdersName is null");
            return (Criteria) this;
        }

        public Criteria andOrdersnameIsNotNull() {
            addCriterion("OrdersName is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersnameEqualTo(String value) {
            addCriterion("OrdersName =", value, "ordersname");
            return (Criteria) this;
        }

        public Criteria andOrdersnameNotEqualTo(String value) {
            addCriterion("OrdersName <>", value, "ordersname");
            return (Criteria) this;
        }

        public Criteria andOrdersnameGreaterThan(String value) {
            addCriterion("OrdersName >", value, "ordersname");
            return (Criteria) this;
        }

        public Criteria andOrdersnameGreaterThanOrEqualTo(String value) {
            addCriterion("OrdersName >=", value, "ordersname");
            return (Criteria) this;
        }

        public Criteria andOrdersnameLessThan(String value) {
            addCriterion("OrdersName <", value, "ordersname");
            return (Criteria) this;
        }

        public Criteria andOrdersnameLessThanOrEqualTo(String value) {
            addCriterion("OrdersName <=", value, "ordersname");
            return (Criteria) this;
        }

        public Criteria andOrdersnameLike(String value) {
            addCriterion("OrdersName like", value, "ordersname");
            return (Criteria) this;
        }

        public Criteria andOrdersnameNotLike(String value) {
            addCriterion("OrdersName not like", value, "ordersname");
            return (Criteria) this;
        }

        public Criteria andOrdersnameIn(List<String> values) {
            addCriterion("OrdersName in", values, "ordersname");
            return (Criteria) this;
        }

        public Criteria andOrdersnameNotIn(List<String> values) {
            addCriterion("OrdersName not in", values, "ordersname");
            return (Criteria) this;
        }

        public Criteria andOrdersnameBetween(String value1, String value2) {
            addCriterion("OrdersName between", value1, value2, "ordersname");
            return (Criteria) this;
        }

        public Criteria andOrdersnameNotBetween(String value1, String value2) {
            addCriterion("OrdersName not between", value1, value2, "ordersname");
            return (Criteria) this;
        }

        public Criteria andOrdersdescriptionIsNull() {
            addCriterion("OrdersDescription is null");
            return (Criteria) this;
        }

        public Criteria andOrdersdescriptionIsNotNull() {
            addCriterion("OrdersDescription is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersdescriptionEqualTo(String value) {
            addCriterion("OrdersDescription =", value, "ordersdescription");
            return (Criteria) this;
        }

        public Criteria andOrdersdescriptionNotEqualTo(String value) {
            addCriterion("OrdersDescription <>", value, "ordersdescription");
            return (Criteria) this;
        }

        public Criteria andOrdersdescriptionGreaterThan(String value) {
            addCriterion("OrdersDescription >", value, "ordersdescription");
            return (Criteria) this;
        }

        public Criteria andOrdersdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("OrdersDescription >=", value, "ordersdescription");
            return (Criteria) this;
        }

        public Criteria andOrdersdescriptionLessThan(String value) {
            addCriterion("OrdersDescription <", value, "ordersdescription");
            return (Criteria) this;
        }

        public Criteria andOrdersdescriptionLessThanOrEqualTo(String value) {
            addCriterion("OrdersDescription <=", value, "ordersdescription");
            return (Criteria) this;
        }

        public Criteria andOrdersdescriptionLike(String value) {
            addCriterion("OrdersDescription like", value, "ordersdescription");
            return (Criteria) this;
        }

        public Criteria andOrdersdescriptionNotLike(String value) {
            addCriterion("OrdersDescription not like", value, "ordersdescription");
            return (Criteria) this;
        }

        public Criteria andOrdersdescriptionIn(List<String> values) {
            addCriterion("OrdersDescription in", values, "ordersdescription");
            return (Criteria) this;
        }

        public Criteria andOrdersdescriptionNotIn(List<String> values) {
            addCriterion("OrdersDescription not in", values, "ordersdescription");
            return (Criteria) this;
        }

        public Criteria andOrdersdescriptionBetween(String value1, String value2) {
            addCriterion("OrdersDescription between", value1, value2, "ordersdescription");
            return (Criteria) this;
        }

        public Criteria andOrdersdescriptionNotBetween(String value1, String value2) {
            addCriterion("OrdersDescription not between", value1, value2, "ordersdescription");
            return (Criteria) this;
        }

        public Criteria andOrderspriceIsNull() {
            addCriterion("OrdersPrice is null");
            return (Criteria) this;
        }

        public Criteria andOrderspriceIsNotNull() {
            addCriterion("OrdersPrice is not null");
            return (Criteria) this;
        }

        public Criteria andOrderspriceEqualTo(BigDecimal value) {
            addCriterion("OrdersPrice =", value, "ordersprice");
            return (Criteria) this;
        }

        public Criteria andOrderspriceNotEqualTo(BigDecimal value) {
            addCriterion("OrdersPrice <>", value, "ordersprice");
            return (Criteria) this;
        }

        public Criteria andOrderspriceGreaterThan(BigDecimal value) {
            addCriterion("OrdersPrice >", value, "ordersprice");
            return (Criteria) this;
        }

        public Criteria andOrderspriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OrdersPrice >=", value, "ordersprice");
            return (Criteria) this;
        }

        public Criteria andOrderspriceLessThan(BigDecimal value) {
            addCriterion("OrdersPrice <", value, "ordersprice");
            return (Criteria) this;
        }

        public Criteria andOrderspriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OrdersPrice <=", value, "ordersprice");
            return (Criteria) this;
        }

        public Criteria andOrderspriceIn(List<BigDecimal> values) {
            addCriterion("OrdersPrice in", values, "ordersprice");
            return (Criteria) this;
        }

        public Criteria andOrderspriceNotIn(List<BigDecimal> values) {
            addCriterion("OrdersPrice not in", values, "ordersprice");
            return (Criteria) this;
        }

        public Criteria andOrderspriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OrdersPrice between", value1, value2, "ordersprice");
            return (Criteria) this;
        }

        public Criteria andOrderspriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OrdersPrice not between", value1, value2, "ordersprice");
            return (Criteria) this;
        }

        public Criteria andTradenameIsNull() {
            addCriterion("TradeName is null");
            return (Criteria) this;
        }

        public Criteria andTradenameIsNotNull() {
            addCriterion("TradeName is not null");
            return (Criteria) this;
        }

        public Criteria andTradenameEqualTo(String value) {
            addCriterion("TradeName =", value, "tradename");
            return (Criteria) this;
        }

        public Criteria andTradenameNotEqualTo(String value) {
            addCriterion("TradeName <>", value, "tradename");
            return (Criteria) this;
        }

        public Criteria andTradenameGreaterThan(String value) {
            addCriterion("TradeName >", value, "tradename");
            return (Criteria) this;
        }

        public Criteria andTradenameGreaterThanOrEqualTo(String value) {
            addCriterion("TradeName >=", value, "tradename");
            return (Criteria) this;
        }

        public Criteria andTradenameLessThan(String value) {
            addCriterion("TradeName <", value, "tradename");
            return (Criteria) this;
        }

        public Criteria andTradenameLessThanOrEqualTo(String value) {
            addCriterion("TradeName <=", value, "tradename");
            return (Criteria) this;
        }

        public Criteria andTradenameLike(String value) {
            addCriterion("TradeName like", value, "tradename");
            return (Criteria) this;
        }

        public Criteria andTradenameNotLike(String value) {
            addCriterion("TradeName not like", value, "tradename");
            return (Criteria) this;
        }

        public Criteria andTradenameIn(List<String> values) {
            addCriterion("TradeName in", values, "tradename");
            return (Criteria) this;
        }

        public Criteria andTradenameNotIn(List<String> values) {
            addCriterion("TradeName not in", values, "tradename");
            return (Criteria) this;
        }

        public Criteria andTradenameBetween(String value1, String value2) {
            addCriterion("TradeName between", value1, value2, "tradename");
            return (Criteria) this;
        }

        public Criteria andTradenameNotBetween(String value1, String value2) {
            addCriterion("TradeName not between", value1, value2, "tradename");
            return (Criteria) this;
        }

        public Criteria andTradenumIsNull() {
            addCriterion("TradeNum is null");
            return (Criteria) this;
        }

        public Criteria andTradenumIsNotNull() {
            addCriterion("TradeNum is not null");
            return (Criteria) this;
        }

        public Criteria andTradenumEqualTo(Integer value) {
            addCriterion("TradeNum =", value, "tradenum");
            return (Criteria) this;
        }

        public Criteria andTradenumNotEqualTo(Integer value) {
            addCriterion("TradeNum <>", value, "tradenum");
            return (Criteria) this;
        }

        public Criteria andTradenumGreaterThan(Integer value) {
            addCriterion("TradeNum >", value, "tradenum");
            return (Criteria) this;
        }

        public Criteria andTradenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("TradeNum >=", value, "tradenum");
            return (Criteria) this;
        }

        public Criteria andTradenumLessThan(Integer value) {
            addCriterion("TradeNum <", value, "tradenum");
            return (Criteria) this;
        }

        public Criteria andTradenumLessThanOrEqualTo(Integer value) {
            addCriterion("TradeNum <=", value, "tradenum");
            return (Criteria) this;
        }

        public Criteria andTradenumIn(List<Integer> values) {
            addCriterion("TradeNum in", values, "tradenum");
            return (Criteria) this;
        }

        public Criteria andTradenumNotIn(List<Integer> values) {
            addCriterion("TradeNum not in", values, "tradenum");
            return (Criteria) this;
        }

        public Criteria andTradenumBetween(Integer value1, Integer value2) {
            addCriterion("TradeNum between", value1, value2, "tradenum");
            return (Criteria) this;
        }

        public Criteria andTradenumNotBetween(Integer value1, Integer value2) {
            addCriterion("TradeNum not between", value1, value2, "tradenum");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusIsNull() {
            addCriterion("PaymentStatus is null");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusIsNotNull() {
            addCriterion("PaymentStatus is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusEqualTo(String value) {
            addCriterion("PaymentStatus =", value, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusNotEqualTo(String value) {
            addCriterion("PaymentStatus <>", value, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusGreaterThan(String value) {
            addCriterion("PaymentStatus >", value, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusGreaterThanOrEqualTo(String value) {
            addCriterion("PaymentStatus >=", value, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusLessThan(String value) {
            addCriterion("PaymentStatus <", value, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusLessThanOrEqualTo(String value) {
            addCriterion("PaymentStatus <=", value, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusLike(String value) {
            addCriterion("PaymentStatus like", value, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusNotLike(String value) {
            addCriterion("PaymentStatus not like", value, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusIn(List<String> values) {
            addCriterion("PaymentStatus in", values, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusNotIn(List<String> values) {
            addCriterion("PaymentStatus not in", values, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusBetween(String value1, String value2) {
            addCriterion("PaymentStatus between", value1, value2, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusNotBetween(String value1, String value2) {
            addCriterion("PaymentStatus not between", value1, value2, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneeidIsNull() {
            addCriterion("OrderConsigneeId is null");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneeidIsNotNull() {
            addCriterion("OrderConsigneeId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneeidEqualTo(String value) {
            addCriterion("OrderConsigneeId =", value, "orderconsigneeid");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneeidNotEqualTo(String value) {
            addCriterion("OrderConsigneeId <>", value, "orderconsigneeid");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneeidGreaterThan(String value) {
            addCriterion("OrderConsigneeId >", value, "orderconsigneeid");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneeidGreaterThanOrEqualTo(String value) {
            addCriterion("OrderConsigneeId >=", value, "orderconsigneeid");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneeidLessThan(String value) {
            addCriterion("OrderConsigneeId <", value, "orderconsigneeid");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneeidLessThanOrEqualTo(String value) {
            addCriterion("OrderConsigneeId <=", value, "orderconsigneeid");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneeidLike(String value) {
            addCriterion("OrderConsigneeId like", value, "orderconsigneeid");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneeidNotLike(String value) {
            addCriterion("OrderConsigneeId not like", value, "orderconsigneeid");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneeidIn(List<String> values) {
            addCriterion("OrderConsigneeId in", values, "orderconsigneeid");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneeidNotIn(List<String> values) {
            addCriterion("OrderConsigneeId not in", values, "orderconsigneeid");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneeidBetween(String value1, String value2) {
            addCriterion("OrderConsigneeId between", value1, value2, "orderconsigneeid");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneeidNotBetween(String value1, String value2) {
            addCriterion("OrderConsigneeId not between", value1, value2, "orderconsigneeid");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneenameIsNull() {
            addCriterion("OrderConsigneeName is null");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneenameIsNotNull() {
            addCriterion("OrderConsigneeName is not null");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneenameEqualTo(String value) {
            addCriterion("OrderConsigneeName =", value, "orderconsigneename");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneenameNotEqualTo(String value) {
            addCriterion("OrderConsigneeName <>", value, "orderconsigneename");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneenameGreaterThan(String value) {
            addCriterion("OrderConsigneeName >", value, "orderconsigneename");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneenameGreaterThanOrEqualTo(String value) {
            addCriterion("OrderConsigneeName >=", value, "orderconsigneename");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneenameLessThan(String value) {
            addCriterion("OrderConsigneeName <", value, "orderconsigneename");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneenameLessThanOrEqualTo(String value) {
            addCriterion("OrderConsigneeName <=", value, "orderconsigneename");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneenameLike(String value) {
            addCriterion("OrderConsigneeName like", value, "orderconsigneename");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneenameNotLike(String value) {
            addCriterion("OrderConsigneeName not like", value, "orderconsigneename");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneenameIn(List<String> values) {
            addCriterion("OrderConsigneeName in", values, "orderconsigneename");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneenameNotIn(List<String> values) {
            addCriterion("OrderConsigneeName not in", values, "orderconsigneename");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneenameBetween(String value1, String value2) {
            addCriterion("OrderConsigneeName between", value1, value2, "orderconsigneename");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneenameNotBetween(String value1, String value2) {
            addCriterion("OrderConsigneeName not between", value1, value2, "orderconsigneename");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneeaddressIsNull() {
            addCriterion("OrderConsigneeAddress is null");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneeaddressIsNotNull() {
            addCriterion("OrderConsigneeAddress is not null");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneeaddressEqualTo(String value) {
            addCriterion("OrderConsigneeAddress =", value, "orderconsigneeaddress");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneeaddressNotEqualTo(String value) {
            addCriterion("OrderConsigneeAddress <>", value, "orderconsigneeaddress");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneeaddressGreaterThan(String value) {
            addCriterion("OrderConsigneeAddress >", value, "orderconsigneeaddress");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneeaddressGreaterThanOrEqualTo(String value) {
            addCriterion("OrderConsigneeAddress >=", value, "orderconsigneeaddress");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneeaddressLessThan(String value) {
            addCriterion("OrderConsigneeAddress <", value, "orderconsigneeaddress");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneeaddressLessThanOrEqualTo(String value) {
            addCriterion("OrderConsigneeAddress <=", value, "orderconsigneeaddress");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneeaddressLike(String value) {
            addCriterion("OrderConsigneeAddress like", value, "orderconsigneeaddress");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneeaddressNotLike(String value) {
            addCriterion("OrderConsigneeAddress not like", value, "orderconsigneeaddress");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneeaddressIn(List<String> values) {
            addCriterion("OrderConsigneeAddress in", values, "orderconsigneeaddress");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneeaddressNotIn(List<String> values) {
            addCriterion("OrderConsigneeAddress not in", values, "orderconsigneeaddress");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneeaddressBetween(String value1, String value2) {
            addCriterion("OrderConsigneeAddress between", value1, value2, "orderconsigneeaddress");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneeaddressNotBetween(String value1, String value2) {
            addCriterion("OrderConsigneeAddress not between", value1, value2, "orderconsigneeaddress");
            return (Criteria) this;
        }

        public Criteria andOrderevaluationIsNull() {
            addCriterion("OrderEvaluation is null");
            return (Criteria) this;
        }

        public Criteria andOrderevaluationIsNotNull() {
            addCriterion("OrderEvaluation is not null");
            return (Criteria) this;
        }

        public Criteria andOrderevaluationEqualTo(String value) {
            addCriterion("OrderEvaluation =", value, "orderevaluation");
            return (Criteria) this;
        }

        public Criteria andOrderevaluationNotEqualTo(String value) {
            addCriterion("OrderEvaluation <>", value, "orderevaluation");
            return (Criteria) this;
        }

        public Criteria andOrderevaluationGreaterThan(String value) {
            addCriterion("OrderEvaluation >", value, "orderevaluation");
            return (Criteria) this;
        }

        public Criteria andOrderevaluationGreaterThanOrEqualTo(String value) {
            addCriterion("OrderEvaluation >=", value, "orderevaluation");
            return (Criteria) this;
        }

        public Criteria andOrderevaluationLessThan(String value) {
            addCriterion("OrderEvaluation <", value, "orderevaluation");
            return (Criteria) this;
        }

        public Criteria andOrderevaluationLessThanOrEqualTo(String value) {
            addCriterion("OrderEvaluation <=", value, "orderevaluation");
            return (Criteria) this;
        }

        public Criteria andOrderevaluationLike(String value) {
            addCriterion("OrderEvaluation like", value, "orderevaluation");
            return (Criteria) this;
        }

        public Criteria andOrderevaluationNotLike(String value) {
            addCriterion("OrderEvaluation not like", value, "orderevaluation");
            return (Criteria) this;
        }

        public Criteria andOrderevaluationIn(List<String> values) {
            addCriterion("OrderEvaluation in", values, "orderevaluation");
            return (Criteria) this;
        }

        public Criteria andOrderevaluationNotIn(List<String> values) {
            addCriterion("OrderEvaluation not in", values, "orderevaluation");
            return (Criteria) this;
        }

        public Criteria andOrderevaluationBetween(String value1, String value2) {
            addCriterion("OrderEvaluation between", value1, value2, "orderevaluation");
            return (Criteria) this;
        }

        public Criteria andOrderevaluationNotBetween(String value1, String value2) {
            addCriterion("OrderEvaluation not between", value1, value2, "orderevaluation");
            return (Criteria) this;
        }

        public Criteria andValidstatusIsNull() {
            addCriterion("ValidStatus is null");
            return (Criteria) this;
        }

        public Criteria andValidstatusIsNotNull() {
            addCriterion("ValidStatus is not null");
            return (Criteria) this;
        }

        public Criteria andValidstatusEqualTo(String value) {
            addCriterion("ValidStatus =", value, "validstatus");
            return (Criteria) this;
        }

        public Criteria andValidstatusNotEqualTo(String value) {
            addCriterion("ValidStatus <>", value, "validstatus");
            return (Criteria) this;
        }

        public Criteria andValidstatusGreaterThan(String value) {
            addCriterion("ValidStatus >", value, "validstatus");
            return (Criteria) this;
        }

        public Criteria andValidstatusGreaterThanOrEqualTo(String value) {
            addCriterion("ValidStatus >=", value, "validstatus");
            return (Criteria) this;
        }

        public Criteria andValidstatusLessThan(String value) {
            addCriterion("ValidStatus <", value, "validstatus");
            return (Criteria) this;
        }

        public Criteria andValidstatusLessThanOrEqualTo(String value) {
            addCriterion("ValidStatus <=", value, "validstatus");
            return (Criteria) this;
        }

        public Criteria andValidstatusLike(String value) {
            addCriterion("ValidStatus like", value, "validstatus");
            return (Criteria) this;
        }

        public Criteria andValidstatusNotLike(String value) {
            addCriterion("ValidStatus not like", value, "validstatus");
            return (Criteria) this;
        }

        public Criteria andValidstatusIn(List<String> values) {
            addCriterion("ValidStatus in", values, "validstatus");
            return (Criteria) this;
        }

        public Criteria andValidstatusNotIn(List<String> values) {
            addCriterion("ValidStatus not in", values, "validstatus");
            return (Criteria) this;
        }

        public Criteria andValidstatusBetween(String value1, String value2) {
            addCriterion("ValidStatus between", value1, value2, "validstatus");
            return (Criteria) this;
        }

        public Criteria andValidstatusNotBetween(String value1, String value2) {
            addCriterion("ValidStatus not between", value1, value2, "validstatus");
            return (Criteria) this;
        }

        public Criteria andCreattimeIsNull() {
            addCriterion("CreatTime is null");
            return (Criteria) this;
        }

        public Criteria andCreattimeIsNotNull() {
            addCriterion("CreatTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreattimeEqualTo(Date value) {
            addCriterion("CreatTime =", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotEqualTo(Date value) {
            addCriterion("CreatTime <>", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeGreaterThan(Date value) {
            addCriterion("CreatTime >", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreatTime >=", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeLessThan(Date value) {
            addCriterion("CreatTime <", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeLessThanOrEqualTo(Date value) {
            addCriterion("CreatTime <=", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeIn(List<Date> values) {
            addCriterion("CreatTime in", values, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotIn(List<Date> values) {
            addCriterion("CreatTime not in", values, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeBetween(Date value1, Date value2) {
            addCriterion("CreatTime between", value1, value2, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotBetween(Date value1, Date value2) {
            addCriterion("CreatTime not between", value1, value2, "creattime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("UpdateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("UpdateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("UpdateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UpdateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("UpdateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("UpdateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("UpdateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("UpdateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("UpdateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("UpdateTime not between", value1, value2, "updatetime");
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