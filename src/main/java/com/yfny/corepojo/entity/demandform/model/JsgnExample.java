package com.yfny.corepojo.entity.demandform.model;

import java.util.ArrayList;
import java.util.List;

public class JsgnExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table NWIDP.IMP_XQD_JSGN
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table NWIDP.IMP_XQD_JSGN
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table NWIDP.IMP_XQD_JSGN
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NWIDP.IMP_XQD_JSGN
     *
     * @mbggenerated
     */
    public JsgnExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NWIDP.IMP_XQD_JSGN
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NWIDP.IMP_XQD_JSGN
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NWIDP.IMP_XQD_JSGN
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NWIDP.IMP_XQD_JSGN
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NWIDP.IMP_XQD_JSGN
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NWIDP.IMP_XQD_JSGN
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NWIDP.IMP_XQD_JSGN
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NWIDP.IMP_XQD_JSGN
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NWIDP.IMP_XQD_JSGN
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NWIDP.IMP_XQD_JSGN
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table NWIDP.IMP_XQD_JSGN
     *
     * @mbggenerated
     */
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

        public Criteria andInfoidIsNull() {
            addCriterion("INFOID is null");
            return (Criteria) this;
        }

        public Criteria andInfoidIsNotNull() {
            addCriterion("INFOID is not null");
            return (Criteria) this;
        }

        public Criteria andInfoidEqualTo(String value) {
            addCriterion("INFOID =", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidNotEqualTo(String value) {
            addCriterion("INFOID <>", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidGreaterThan(String value) {
            addCriterion("INFOID >", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidGreaterThanOrEqualTo(String value) {
            addCriterion("INFOID >=", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidLessThan(String value) {
            addCriterion("INFOID <", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidLessThanOrEqualTo(String value) {
            addCriterion("INFOID <=", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidLike(String value) {
            addCriterion("INFOID like", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidNotLike(String value) {
            addCriterion("INFOID not like", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidIn(List<String> values) {
            addCriterion("INFOID in", values, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidNotIn(List<String> values) {
            addCriterion("INFOID not in", values, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidBetween(String value1, String value2) {
            addCriterion("INFOID between", value1, value2, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidNotBetween(String value1, String value2) {
            addCriterion("INFOID not between", value1, value2, "infoid");
            return (Criteria) this;
        }

        public Criteria andJsbsIsNull() {
            addCriterion("JSBS is null");
            return (Criteria) this;
        }

        public Criteria andJsbsIsNotNull() {
            addCriterion("JSBS is not null");
            return (Criteria) this;
        }

        public Criteria andJsbsEqualTo(String value) {
            addCriterion("JSBS =", value, "jsbs");
            return (Criteria) this;
        }

        public Criteria andJsbsNotEqualTo(String value) {
            addCriterion("JSBS <>", value, "jsbs");
            return (Criteria) this;
        }

        public Criteria andJsbsGreaterThan(String value) {
            addCriterion("JSBS >", value, "jsbs");
            return (Criteria) this;
        }

        public Criteria andJsbsGreaterThanOrEqualTo(String value) {
            addCriterion("JSBS >=", value, "jsbs");
            return (Criteria) this;
        }

        public Criteria andJsbsLessThan(String value) {
            addCriterion("JSBS <", value, "jsbs");
            return (Criteria) this;
        }

        public Criteria andJsbsLessThanOrEqualTo(String value) {
            addCriterion("JSBS <=", value, "jsbs");
            return (Criteria) this;
        }

        public Criteria andJsbsLike(String value) {
            addCriterion("JSBS like", value, "jsbs");
            return (Criteria) this;
        }

        public Criteria andJsbsNotLike(String value) {
            addCriterion("JSBS not like", value, "jsbs");
            return (Criteria) this;
        }

        public Criteria andJsbsIn(List<String> values) {
            addCriterion("JSBS in", values, "jsbs");
            return (Criteria) this;
        }

        public Criteria andJsbsNotIn(List<String> values) {
            addCriterion("JSBS not in", values, "jsbs");
            return (Criteria) this;
        }

        public Criteria andJsbsBetween(String value1, String value2) {
            addCriterion("JSBS between", value1, value2, "jsbs");
            return (Criteria) this;
        }

        public Criteria andJsbsNotBetween(String value1, String value2) {
            addCriterion("JSBS not between", value1, value2, "jsbs");
            return (Criteria) this;
        }

        public Criteria andGnbsIsNull() {
            addCriterion("GNBS is null");
            return (Criteria) this;
        }

        public Criteria andGnbsIsNotNull() {
            addCriterion("GNBS is not null");
            return (Criteria) this;
        }

        public Criteria andGnbsEqualTo(String value) {
            addCriterion("GNBS =", value, "gnbs");
            return (Criteria) this;
        }

        public Criteria andGnbsNotEqualTo(String value) {
            addCriterion("GNBS <>", value, "gnbs");
            return (Criteria) this;
        }

        public Criteria andGnbsGreaterThan(String value) {
            addCriterion("GNBS >", value, "gnbs");
            return (Criteria) this;
        }

        public Criteria andGnbsGreaterThanOrEqualTo(String value) {
            addCriterion("GNBS >=", value, "gnbs");
            return (Criteria) this;
        }

        public Criteria andGnbsLessThan(String value) {
            addCriterion("GNBS <", value, "gnbs");
            return (Criteria) this;
        }

        public Criteria andGnbsLessThanOrEqualTo(String value) {
            addCriterion("GNBS <=", value, "gnbs");
            return (Criteria) this;
        }

        public Criteria andGnbsLike(String value) {
            addCriterion("GNBS like", value, "gnbs");
            return (Criteria) this;
        }

        public Criteria andGnbsNotLike(String value) {
            addCriterion("GNBS not like", value, "gnbs");
            return (Criteria) this;
        }

        public Criteria andGnbsIn(List<String> values) {
            addCriterion("GNBS in", values, "gnbs");
            return (Criteria) this;
        }

        public Criteria andGnbsNotIn(List<String> values) {
            addCriterion("GNBS not in", values, "gnbs");
            return (Criteria) this;
        }

        public Criteria andGnbsBetween(String value1, String value2) {
            addCriterion("GNBS between", value1, value2, "gnbs");
            return (Criteria) this;
        }

        public Criteria andGnbsNotBetween(String value1, String value2) {
            addCriterion("GNBS not between", value1, value2, "gnbs");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table NWIDP.IMP_XQD_JSGN
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table NWIDP.IMP_XQD_JSGN
     *
     * @mbggenerated
     */
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