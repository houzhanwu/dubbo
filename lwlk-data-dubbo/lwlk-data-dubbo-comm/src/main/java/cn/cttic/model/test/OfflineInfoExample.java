package cn.cttic.model.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OfflineInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OfflineInfoExample() {
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

        public Criteria andSchcodeIsNull() {
            addCriterion("SCHCODE is null");
            return (Criteria) this;
        }

        public Criteria andSchcodeIsNotNull() {
            addCriterion("SCHCODE is not null");
            return (Criteria) this;
        }

        public Criteria andSchcodeEqualTo(String value) {
            addCriterion("SCHCODE =", value, "schcode");
            return (Criteria) this;
        }

        public Criteria andSchcodeNotEqualTo(String value) {
            addCriterion("SCHCODE <>", value, "schcode");
            return (Criteria) this;
        }

        public Criteria andSchcodeGreaterThan(String value) {
            addCriterion("SCHCODE >", value, "schcode");
            return (Criteria) this;
        }

        public Criteria andSchcodeGreaterThanOrEqualTo(String value) {
            addCriterion("SCHCODE >=", value, "schcode");
            return (Criteria) this;
        }

        public Criteria andSchcodeLessThan(String value) {
            addCriterion("SCHCODE <", value, "schcode");
            return (Criteria) this;
        }

        public Criteria andSchcodeLessThanOrEqualTo(String value) {
            addCriterion("SCHCODE <=", value, "schcode");
            return (Criteria) this;
        }

        public Criteria andSchcodeLike(String value) {
            addCriterion("SCHCODE like", value, "schcode");
            return (Criteria) this;
        }

        public Criteria andSchcodeNotLike(String value) {
            addCriterion("SCHCODE not like", value, "schcode");
            return (Criteria) this;
        }

        public Criteria andSchcodeIn(List<String> values) {
            addCriterion("SCHCODE in", values, "schcode");
            return (Criteria) this;
        }

        public Criteria andSchcodeNotIn(List<String> values) {
            addCriterion("SCHCODE not in", values, "schcode");
            return (Criteria) this;
        }

        public Criteria andSchcodeBetween(String value1, String value2) {
            addCriterion("SCHCODE between", value1, value2, "schcode");
            return (Criteria) this;
        }

        public Criteria andSchcodeNotBetween(String value1, String value2) {
            addCriterion("SCHCODE not between", value1, value2, "schcode");
            return (Criteria) this;
        }

        public Criteria andLinecodeIsNull() {
            addCriterion("LINECODE is null");
            return (Criteria) this;
        }

        public Criteria andLinecodeIsNotNull() {
            addCriterion("LINECODE is not null");
            return (Criteria) this;
        }

        public Criteria andLinecodeEqualTo(String value) {
            addCriterion("LINECODE =", value, "linecode");
            return (Criteria) this;
        }

        public Criteria andLinecodeNotEqualTo(String value) {
            addCriterion("LINECODE <>", value, "linecode");
            return (Criteria) this;
        }

        public Criteria andLinecodeGreaterThan(String value) {
            addCriterion("LINECODE >", value, "linecode");
            return (Criteria) this;
        }

        public Criteria andLinecodeGreaterThanOrEqualTo(String value) {
            addCriterion("LINECODE >=", value, "linecode");
            return (Criteria) this;
        }

        public Criteria andLinecodeLessThan(String value) {
            addCriterion("LINECODE <", value, "linecode");
            return (Criteria) this;
        }

        public Criteria andLinecodeLessThanOrEqualTo(String value) {
            addCriterion("LINECODE <=", value, "linecode");
            return (Criteria) this;
        }

        public Criteria andLinecodeLike(String value) {
            addCriterion("LINECODE like", value, "linecode");
            return (Criteria) this;
        }

        public Criteria andLinecodeNotLike(String value) {
            addCriterion("LINECODE not like", value, "linecode");
            return (Criteria) this;
        }

        public Criteria andLinecodeIn(List<String> values) {
            addCriterion("LINECODE in", values, "linecode");
            return (Criteria) this;
        }

        public Criteria andLinecodeNotIn(List<String> values) {
            addCriterion("LINECODE not in", values, "linecode");
            return (Criteria) this;
        }

        public Criteria andLinecodeBetween(String value1, String value2) {
            addCriterion("LINECODE between", value1, value2, "linecode");
            return (Criteria) this;
        }

        public Criteria andLinecodeNotBetween(String value1, String value2) {
            addCriterion("LINECODE not between", value1, value2, "linecode");
            return (Criteria) this;
        }

        public Criteria andDepdateIsNull() {
            addCriterion("DEPDATE is null");
            return (Criteria) this;
        }

        public Criteria andDepdateIsNotNull() {
            addCriterion("DEPDATE is not null");
            return (Criteria) this;
        }

        public Criteria andDepdateEqualTo(Date value) {
            addCriterion("DEPDATE =", value, "depdate");
            return (Criteria) this;
        }

        public Criteria andDepdateNotEqualTo(Date value) {
            addCriterion("DEPDATE <>", value, "depdate");
            return (Criteria) this;
        }

        public Criteria andDepdateGreaterThan(Date value) {
            addCriterion("DEPDATE >", value, "depdate");
            return (Criteria) this;
        }

        public Criteria andDepdateGreaterThanOrEqualTo(Date value) {
            addCriterion("DEPDATE >=", value, "depdate");
            return (Criteria) this;
        }

        public Criteria andDepdateLessThan(Date value) {
            addCriterion("DEPDATE <", value, "depdate");
            return (Criteria) this;
        }

        public Criteria andDepdateLessThanOrEqualTo(Date value) {
            addCriterion("DEPDATE <=", value, "depdate");
            return (Criteria) this;
        }

        public Criteria andDepdateIn(List<Date> values) {
            addCriterion("DEPDATE in", values, "depdate");
            return (Criteria) this;
        }

        public Criteria andDepdateNotIn(List<Date> values) {
            addCriterion("DEPDATE not in", values, "depdate");
            return (Criteria) this;
        }

        public Criteria andDepdateBetween(Date value1, Date value2) {
            addCriterion("DEPDATE between", value1, value2, "depdate");
            return (Criteria) this;
        }

        public Criteria andDepdateNotBetween(Date value1, Date value2) {
            addCriterion("DEPDATE not between", value1, value2, "depdate");
            return (Criteria) this;
        }

        public Criteria andBkgtypeIsNull() {
            addCriterion("BKGTYPE is null");
            return (Criteria) this;
        }

        public Criteria andBkgtypeIsNotNull() {
            addCriterion("BKGTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBkgtypeEqualTo(String value) {
            addCriterion("BKGTYPE =", value, "bkgtype");
            return (Criteria) this;
        }

        public Criteria andBkgtypeNotEqualTo(String value) {
            addCriterion("BKGTYPE <>", value, "bkgtype");
            return (Criteria) this;
        }

        public Criteria andBkgtypeGreaterThan(String value) {
            addCriterion("BKGTYPE >", value, "bkgtype");
            return (Criteria) this;
        }

        public Criteria andBkgtypeGreaterThanOrEqualTo(String value) {
            addCriterion("BKGTYPE >=", value, "bkgtype");
            return (Criteria) this;
        }

        public Criteria andBkgtypeLessThan(String value) {
            addCriterion("BKGTYPE <", value, "bkgtype");
            return (Criteria) this;
        }

        public Criteria andBkgtypeLessThanOrEqualTo(String value) {
            addCriterion("BKGTYPE <=", value, "bkgtype");
            return (Criteria) this;
        }

        public Criteria andBkgtypeLike(String value) {
            addCriterion("BKGTYPE like", value, "bkgtype");
            return (Criteria) this;
        }

        public Criteria andBkgtypeNotLike(String value) {
            addCriterion("BKGTYPE not like", value, "bkgtype");
            return (Criteria) this;
        }

        public Criteria andBkgtypeIn(List<String> values) {
            addCriterion("BKGTYPE in", values, "bkgtype");
            return (Criteria) this;
        }

        public Criteria andBkgtypeNotIn(List<String> values) {
            addCriterion("BKGTYPE not in", values, "bkgtype");
            return (Criteria) this;
        }

        public Criteria andBkgtypeBetween(String value1, String value2) {
            addCriterion("BKGTYPE between", value1, value2, "bkgtype");
            return (Criteria) this;
        }

        public Criteria andBkgtypeNotBetween(String value1, String value2) {
            addCriterion("BKGTYPE not between", value1, value2, "bkgtype");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIdtypeIsNull() {
            addCriterion("IDTYPE is null");
            return (Criteria) this;
        }

        public Criteria andIdtypeIsNotNull() {
            addCriterion("IDTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIdtypeEqualTo(String value) {
            addCriterion("IDTYPE =", value, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeNotEqualTo(String value) {
            addCriterion("IDTYPE <>", value, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeGreaterThan(String value) {
            addCriterion("IDTYPE >", value, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeGreaterThanOrEqualTo(String value) {
            addCriterion("IDTYPE >=", value, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeLessThan(String value) {
            addCriterion("IDTYPE <", value, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeLessThanOrEqualTo(String value) {
            addCriterion("IDTYPE <=", value, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeLike(String value) {
            addCriterion("IDTYPE like", value, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeNotLike(String value) {
            addCriterion("IDTYPE not like", value, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeIn(List<String> values) {
            addCriterion("IDTYPE in", values, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeNotIn(List<String> values) {
            addCriterion("IDTYPE not in", values, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeBetween(String value1, String value2) {
            addCriterion("IDTYPE between", value1, value2, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeNotBetween(String value1, String value2) {
            addCriterion("IDTYPE not between", value1, value2, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdcodeIsNull() {
            addCriterion("IDCODE is null");
            return (Criteria) this;
        }

        public Criteria andIdcodeIsNotNull() {
            addCriterion("IDCODE is not null");
            return (Criteria) this;
        }

        public Criteria andIdcodeEqualTo(String value) {
            addCriterion("IDCODE =", value, "idcode");
            return (Criteria) this;
        }

        public Criteria andIdcodeNotEqualTo(String value) {
            addCriterion("IDCODE <>", value, "idcode");
            return (Criteria) this;
        }

        public Criteria andIdcodeGreaterThan(String value) {
            addCriterion("IDCODE >", value, "idcode");
            return (Criteria) this;
        }

        public Criteria andIdcodeGreaterThanOrEqualTo(String value) {
            addCriterion("IDCODE >=", value, "idcode");
            return (Criteria) this;
        }

        public Criteria andIdcodeLessThan(String value) {
            addCriterion("IDCODE <", value, "idcode");
            return (Criteria) this;
        }

        public Criteria andIdcodeLessThanOrEqualTo(String value) {
            addCriterion("IDCODE <=", value, "idcode");
            return (Criteria) this;
        }

        public Criteria andIdcodeLike(String value) {
            addCriterion("IDCODE like", value, "idcode");
            return (Criteria) this;
        }

        public Criteria andIdcodeNotLike(String value) {
            addCriterion("IDCODE not like", value, "idcode");
            return (Criteria) this;
        }

        public Criteria andIdcodeIn(List<String> values) {
            addCriterion("IDCODE in", values, "idcode");
            return (Criteria) this;
        }

        public Criteria andIdcodeNotIn(List<String> values) {
            addCriterion("IDCODE not in", values, "idcode");
            return (Criteria) this;
        }

        public Criteria andIdcodeBetween(String value1, String value2) {
            addCriterion("IDCODE between", value1, value2, "idcode");
            return (Criteria) this;
        }

        public Criteria andIdcodeNotBetween(String value1, String value2) {
            addCriterion("IDCODE not between", value1, value2, "idcode");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andDepcodeIsNull() {
            addCriterion("DEPCODE is null");
            return (Criteria) this;
        }

        public Criteria andDepcodeIsNotNull() {
            addCriterion("DEPCODE is not null");
            return (Criteria) this;
        }

        public Criteria andDepcodeEqualTo(String value) {
            addCriterion("DEPCODE =", value, "depcode");
            return (Criteria) this;
        }

        public Criteria andDepcodeNotEqualTo(String value) {
            addCriterion("DEPCODE <>", value, "depcode");
            return (Criteria) this;
        }

        public Criteria andDepcodeGreaterThan(String value) {
            addCriterion("DEPCODE >", value, "depcode");
            return (Criteria) this;
        }

        public Criteria andDepcodeGreaterThanOrEqualTo(String value) {
            addCriterion("DEPCODE >=", value, "depcode");
            return (Criteria) this;
        }

        public Criteria andDepcodeLessThan(String value) {
            addCriterion("DEPCODE <", value, "depcode");
            return (Criteria) this;
        }

        public Criteria andDepcodeLessThanOrEqualTo(String value) {
            addCriterion("DEPCODE <=", value, "depcode");
            return (Criteria) this;
        }

        public Criteria andDepcodeLike(String value) {
            addCriterion("DEPCODE like", value, "depcode");
            return (Criteria) this;
        }

        public Criteria andDepcodeNotLike(String value) {
            addCriterion("DEPCODE not like", value, "depcode");
            return (Criteria) this;
        }

        public Criteria andDepcodeIn(List<String> values) {
            addCriterion("DEPCODE in", values, "depcode");
            return (Criteria) this;
        }

        public Criteria andDepcodeNotIn(List<String> values) {
            addCriterion("DEPCODE not in", values, "depcode");
            return (Criteria) this;
        }

        public Criteria andDepcodeBetween(String value1, String value2) {
            addCriterion("DEPCODE between", value1, value2, "depcode");
            return (Criteria) this;
        }

        public Criteria andDepcodeNotBetween(String value1, String value2) {
            addCriterion("DEPCODE not between", value1, value2, "depcode");
            return (Criteria) this;
        }

        public Criteria andArrcodeIsNull() {
            addCriterion("ARRCODE is null");
            return (Criteria) this;
        }

        public Criteria andArrcodeIsNotNull() {
            addCriterion("ARRCODE is not null");
            return (Criteria) this;
        }

        public Criteria andArrcodeEqualTo(String value) {
            addCriterion("ARRCODE =", value, "arrcode");
            return (Criteria) this;
        }

        public Criteria andArrcodeNotEqualTo(String value) {
            addCriterion("ARRCODE <>", value, "arrcode");
            return (Criteria) this;
        }

        public Criteria andArrcodeGreaterThan(String value) {
            addCriterion("ARRCODE >", value, "arrcode");
            return (Criteria) this;
        }

        public Criteria andArrcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ARRCODE >=", value, "arrcode");
            return (Criteria) this;
        }

        public Criteria andArrcodeLessThan(String value) {
            addCriterion("ARRCODE <", value, "arrcode");
            return (Criteria) this;
        }

        public Criteria andArrcodeLessThanOrEqualTo(String value) {
            addCriterion("ARRCODE <=", value, "arrcode");
            return (Criteria) this;
        }

        public Criteria andArrcodeLike(String value) {
            addCriterion("ARRCODE like", value, "arrcode");
            return (Criteria) this;
        }

        public Criteria andArrcodeNotLike(String value) {
            addCriterion("ARRCODE not like", value, "arrcode");
            return (Criteria) this;
        }

        public Criteria andArrcodeIn(List<String> values) {
            addCriterion("ARRCODE in", values, "arrcode");
            return (Criteria) this;
        }

        public Criteria andArrcodeNotIn(List<String> values) {
            addCriterion("ARRCODE not in", values, "arrcode");
            return (Criteria) this;
        }

        public Criteria andArrcodeBetween(String value1, String value2) {
            addCriterion("ARRCODE between", value1, value2, "arrcode");
            return (Criteria) this;
        }

        public Criteria andArrcodeNotBetween(String value1, String value2) {
            addCriterion("ARRCODE not between", value1, value2, "arrcode");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("PRICE is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("PRICE =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("PRICE <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("PRICE >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("PRICE <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("PRICE in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("PRICE not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andTktstatusIsNull() {
            addCriterion("TKTSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andTktstatusIsNotNull() {
            addCriterion("TKTSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andTktstatusEqualTo(String value) {
            addCriterion("TKTSTATUS =", value, "tktstatus");
            return (Criteria) this;
        }

        public Criteria andTktstatusNotEqualTo(String value) {
            addCriterion("TKTSTATUS <>", value, "tktstatus");
            return (Criteria) this;
        }

        public Criteria andTktstatusGreaterThan(String value) {
            addCriterion("TKTSTATUS >", value, "tktstatus");
            return (Criteria) this;
        }

        public Criteria andTktstatusGreaterThanOrEqualTo(String value) {
            addCriterion("TKTSTATUS >=", value, "tktstatus");
            return (Criteria) this;
        }

        public Criteria andTktstatusLessThan(String value) {
            addCriterion("TKTSTATUS <", value, "tktstatus");
            return (Criteria) this;
        }

        public Criteria andTktstatusLessThanOrEqualTo(String value) {
            addCriterion("TKTSTATUS <=", value, "tktstatus");
            return (Criteria) this;
        }

        public Criteria andTktstatusLike(String value) {
            addCriterion("TKTSTATUS like", value, "tktstatus");
            return (Criteria) this;
        }

        public Criteria andTktstatusNotLike(String value) {
            addCriterion("TKTSTATUS not like", value, "tktstatus");
            return (Criteria) this;
        }

        public Criteria andTktstatusIn(List<String> values) {
            addCriterion("TKTSTATUS in", values, "tktstatus");
            return (Criteria) this;
        }

        public Criteria andTktstatusNotIn(List<String> values) {
            addCriterion("TKTSTATUS not in", values, "tktstatus");
            return (Criteria) this;
        }

        public Criteria andTktstatusBetween(String value1, String value2) {
            addCriterion("TKTSTATUS between", value1, value2, "tktstatus");
            return (Criteria) this;
        }

        public Criteria andTktstatusNotBetween(String value1, String value2) {
            addCriterion("TKTSTATUS not between", value1, value2, "tktstatus");
            return (Criteria) this;
        }

        public Criteria andSeatnoIsNull() {
            addCriterion("SEATNO is null");
            return (Criteria) this;
        }

        public Criteria andSeatnoIsNotNull() {
            addCriterion("SEATNO is not null");
            return (Criteria) this;
        }

        public Criteria andSeatnoEqualTo(String value) {
            addCriterion("SEATNO =", value, "seatno");
            return (Criteria) this;
        }

        public Criteria andSeatnoNotEqualTo(String value) {
            addCriterion("SEATNO <>", value, "seatno");
            return (Criteria) this;
        }

        public Criteria andSeatnoGreaterThan(String value) {
            addCriterion("SEATNO >", value, "seatno");
            return (Criteria) this;
        }

        public Criteria andSeatnoGreaterThanOrEqualTo(String value) {
            addCriterion("SEATNO >=", value, "seatno");
            return (Criteria) this;
        }

        public Criteria andSeatnoLessThan(String value) {
            addCriterion("SEATNO <", value, "seatno");
            return (Criteria) this;
        }

        public Criteria andSeatnoLessThanOrEqualTo(String value) {
            addCriterion("SEATNO <=", value, "seatno");
            return (Criteria) this;
        }

        public Criteria andSeatnoLike(String value) {
            addCriterion("SEATNO like", value, "seatno");
            return (Criteria) this;
        }

        public Criteria andSeatnoNotLike(String value) {
            addCriterion("SEATNO not like", value, "seatno");
            return (Criteria) this;
        }

        public Criteria andSeatnoIn(List<String> values) {
            addCriterion("SEATNO in", values, "seatno");
            return (Criteria) this;
        }

        public Criteria andSeatnoNotIn(List<String> values) {
            addCriterion("SEATNO not in", values, "seatno");
            return (Criteria) this;
        }

        public Criteria andSeatnoBetween(String value1, String value2) {
            addCriterion("SEATNO between", value1, value2, "seatno");
            return (Criteria) this;
        }

        public Criteria andSeatnoNotBetween(String value1, String value2) {
            addCriterion("SEATNO not between", value1, value2, "seatno");
            return (Criteria) this;
        }

        public Criteria andSeattypeIsNull() {
            addCriterion("SEATTYPE is null");
            return (Criteria) this;
        }

        public Criteria andSeattypeIsNotNull() {
            addCriterion("SEATTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSeattypeEqualTo(String value) {
            addCriterion("SEATTYPE =", value, "seattype");
            return (Criteria) this;
        }

        public Criteria andSeattypeNotEqualTo(String value) {
            addCriterion("SEATTYPE <>", value, "seattype");
            return (Criteria) this;
        }

        public Criteria andSeattypeGreaterThan(String value) {
            addCriterion("SEATTYPE >", value, "seattype");
            return (Criteria) this;
        }

        public Criteria andSeattypeGreaterThanOrEqualTo(String value) {
            addCriterion("SEATTYPE >=", value, "seattype");
            return (Criteria) this;
        }

        public Criteria andSeattypeLessThan(String value) {
            addCriterion("SEATTYPE <", value, "seattype");
            return (Criteria) this;
        }

        public Criteria andSeattypeLessThanOrEqualTo(String value) {
            addCriterion("SEATTYPE <=", value, "seattype");
            return (Criteria) this;
        }

        public Criteria andSeattypeLike(String value) {
            addCriterion("SEATTYPE like", value, "seattype");
            return (Criteria) this;
        }

        public Criteria andSeattypeNotLike(String value) {
            addCriterion("SEATTYPE not like", value, "seattype");
            return (Criteria) this;
        }

        public Criteria andSeattypeIn(List<String> values) {
            addCriterion("SEATTYPE in", values, "seattype");
            return (Criteria) this;
        }

        public Criteria andSeattypeNotIn(List<String> values) {
            addCriterion("SEATTYPE not in", values, "seattype");
            return (Criteria) this;
        }

        public Criteria andSeattypeBetween(String value1, String value2) {
            addCriterion("SEATTYPE between", value1, value2, "seattype");
            return (Criteria) this;
        }

        public Criteria andSeattypeNotBetween(String value1, String value2) {
            addCriterion("SEATTYPE not between", value1, value2, "seattype");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNull() {
            addCriterion("FILENAME is null");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNotNull() {
            addCriterion("FILENAME is not null");
            return (Criteria) this;
        }

        public Criteria andFilenameEqualTo(String value) {
            addCriterion("FILENAME =", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotEqualTo(String value) {
            addCriterion("FILENAME <>", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThan(String value) {
            addCriterion("FILENAME >", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("FILENAME >=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThan(String value) {
            addCriterion("FILENAME <", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThanOrEqualTo(String value) {
            addCriterion("FILENAME <=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLike(String value) {
            addCriterion("FILENAME like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotLike(String value) {
            addCriterion("FILENAME not like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameIn(List<String> values) {
            addCriterion("FILENAME in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotIn(List<String> values) {
            addCriterion("FILENAME not in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameBetween(String value1, String value2) {
            addCriterion("FILENAME between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotBetween(String value1, String value2) {
            addCriterion("FILENAME not between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("CTIME is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("CTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Date value) {
            addCriterion("CTIME =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Date value) {
            addCriterion("CTIME <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Date value) {
            addCriterion("CTIME >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CTIME >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Date value) {
            addCriterion("CTIME <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Date value) {
            addCriterion("CTIME <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Date> values) {
            addCriterion("CTIME in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Date> values) {
            addCriterion("CTIME not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Date value1, Date value2) {
            addCriterion("CTIME between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Date value1, Date value2) {
            addCriterion("CTIME not between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andProvcodeIsNull() {
            addCriterion("PROVCODE is null");
            return (Criteria) this;
        }

        public Criteria andProvcodeIsNotNull() {
            addCriterion("PROVCODE is not null");
            return (Criteria) this;
        }

        public Criteria andProvcodeEqualTo(String value) {
            addCriterion("PROVCODE =", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeNotEqualTo(String value) {
            addCriterion("PROVCODE <>", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeGreaterThan(String value) {
            addCriterion("PROVCODE >", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeGreaterThanOrEqualTo(String value) {
            addCriterion("PROVCODE >=", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeLessThan(String value) {
            addCriterion("PROVCODE <", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeLessThanOrEqualTo(String value) {
            addCriterion("PROVCODE <=", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeLike(String value) {
            addCriterion("PROVCODE like", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeNotLike(String value) {
            addCriterion("PROVCODE not like", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeIn(List<String> values) {
            addCriterion("PROVCODE in", values, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeNotIn(List<String> values) {
            addCriterion("PROVCODE not in", values, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeBetween(String value1, String value2) {
            addCriterion("PROVCODE between", value1, value2, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeNotBetween(String value1, String value2) {
            addCriterion("PROVCODE not between", value1, value2, "provcode");
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