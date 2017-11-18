package cn.cttic.model.transport;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransVehicleInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TransVehicleInfoExample() {
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

        public Criteria andProvinceCodeIsNull() {
            addCriterion("PROVINCE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIsNotNull() {
            addCriterion("PROVINCE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeEqualTo(Integer value) {
            addCriterion("PROVINCE_CODE =", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotEqualTo(Integer value) {
            addCriterion("PROVINCE_CODE <>", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThan(Integer value) {
            addCriterion("PROVINCE_CODE >", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("PROVINCE_CODE >=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThan(Integer value) {
            addCriterion("PROVINCE_CODE <", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThanOrEqualTo(Integer value) {
            addCriterion("PROVINCE_CODE <=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIn(List<Integer> values) {
            addCriterion("PROVINCE_CODE in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotIn(List<Integer> values) {
            addCriterion("PROVINCE_CODE not in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeBetween(Integer value1, Integer value2) {
            addCriterion("PROVINCE_CODE between", value1, value2, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("PROVINCE_CODE not between", value1, value2, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andMcuIdIsNull() {
            addCriterion("MCU_ID is null");
            return (Criteria) this;
        }

        public Criteria andMcuIdIsNotNull() {
            addCriterion("MCU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMcuIdEqualTo(String value) {
            addCriterion("MCU_ID =", value, "mcuId");
            return (Criteria) this;
        }

        public Criteria andMcuIdNotEqualTo(String value) {
            addCriterion("MCU_ID <>", value, "mcuId");
            return (Criteria) this;
        }

        public Criteria andMcuIdGreaterThan(String value) {
            addCriterion("MCU_ID >", value, "mcuId");
            return (Criteria) this;
        }

        public Criteria andMcuIdGreaterThanOrEqualTo(String value) {
            addCriterion("MCU_ID >=", value, "mcuId");
            return (Criteria) this;
        }

        public Criteria andMcuIdLessThan(String value) {
            addCriterion("MCU_ID <", value, "mcuId");
            return (Criteria) this;
        }

        public Criteria andMcuIdLessThanOrEqualTo(String value) {
            addCriterion("MCU_ID <=", value, "mcuId");
            return (Criteria) this;
        }

        public Criteria andMcuIdLike(String value) {
            addCriterion("MCU_ID like", value, "mcuId");
            return (Criteria) this;
        }

        public Criteria andMcuIdNotLike(String value) {
            addCriterion("MCU_ID not like", value, "mcuId");
            return (Criteria) this;
        }

        public Criteria andMcuIdIn(List<String> values) {
            addCriterion("MCU_ID in", values, "mcuId");
            return (Criteria) this;
        }

        public Criteria andMcuIdNotIn(List<String> values) {
            addCriterion("MCU_ID not in", values, "mcuId");
            return (Criteria) this;
        }

        public Criteria andMcuIdBetween(String value1, String value2) {
            addCriterion("MCU_ID between", value1, value2, "mcuId");
            return (Criteria) this;
        }

        public Criteria andMcuIdNotBetween(String value1, String value2) {
            addCriterion("MCU_ID not between", value1, value2, "mcuId");
            return (Criteria) this;
        }

        public Criteria andVehicleNoIsNull() {
            addCriterion("VEHICLE_NO is null");
            return (Criteria) this;
        }

        public Criteria andVehicleNoIsNotNull() {
            addCriterion("VEHICLE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleNoEqualTo(String value) {
            addCriterion("VEHICLE_NO =", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoNotEqualTo(String value) {
            addCriterion("VEHICLE_NO <>", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoGreaterThan(String value) {
            addCriterion("VEHICLE_NO >", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoGreaterThanOrEqualTo(String value) {
            addCriterion("VEHICLE_NO >=", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoLessThan(String value) {
            addCriterion("VEHICLE_NO <", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoLessThanOrEqualTo(String value) {
            addCriterion("VEHICLE_NO <=", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoLike(String value) {
            addCriterion("VEHICLE_NO like", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoNotLike(String value) {
            addCriterion("VEHICLE_NO not like", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoIn(List<String> values) {
            addCriterion("VEHICLE_NO in", values, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoNotIn(List<String> values) {
            addCriterion("VEHICLE_NO not in", values, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoBetween(String value1, String value2) {
            addCriterion("VEHICLE_NO between", value1, value2, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoNotBetween(String value1, String value2) {
            addCriterion("VEHICLE_NO not between", value1, value2, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andPlateColorIsNull() {
            addCriterion("PLATE_COLOR is null");
            return (Criteria) this;
        }

        public Criteria andPlateColorIsNotNull() {
            addCriterion("PLATE_COLOR is not null");
            return (Criteria) this;
        }

        public Criteria andPlateColorEqualTo(String value) {
            addCriterion("PLATE_COLOR =", value, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorNotEqualTo(String value) {
            addCriterion("PLATE_COLOR <>", value, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorGreaterThan(String value) {
            addCriterion("PLATE_COLOR >", value, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorGreaterThanOrEqualTo(String value) {
            addCriterion("PLATE_COLOR >=", value, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorLessThan(String value) {
            addCriterion("PLATE_COLOR <", value, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorLessThanOrEqualTo(String value) {
            addCriterion("PLATE_COLOR <=", value, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorLike(String value) {
            addCriterion("PLATE_COLOR like", value, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorNotLike(String value) {
            addCriterion("PLATE_COLOR not like", value, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorIn(List<String> values) {
            addCriterion("PLATE_COLOR in", values, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorNotIn(List<String> values) {
            addCriterion("PLATE_COLOR not in", values, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorBetween(String value1, String value2) {
            addCriterion("PLATE_COLOR between", value1, value2, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorNotBetween(String value1, String value2) {
            addCriterion("PLATE_COLOR not between", value1, value2, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorCodeIsNull() {
            addCriterion("PLATE_COLOR_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPlateColorCodeIsNotNull() {
            addCriterion("PLATE_COLOR_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPlateColorCodeEqualTo(String value) {
            addCriterion("PLATE_COLOR_CODE =", value, "plateColorCode");
            return (Criteria) this;
        }

        public Criteria andPlateColorCodeNotEqualTo(String value) {
            addCriterion("PLATE_COLOR_CODE <>", value, "plateColorCode");
            return (Criteria) this;
        }

        public Criteria andPlateColorCodeGreaterThan(String value) {
            addCriterion("PLATE_COLOR_CODE >", value, "plateColorCode");
            return (Criteria) this;
        }

        public Criteria andPlateColorCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PLATE_COLOR_CODE >=", value, "plateColorCode");
            return (Criteria) this;
        }

        public Criteria andPlateColorCodeLessThan(String value) {
            addCriterion("PLATE_COLOR_CODE <", value, "plateColorCode");
            return (Criteria) this;
        }

        public Criteria andPlateColorCodeLessThanOrEqualTo(String value) {
            addCriterion("PLATE_COLOR_CODE <=", value, "plateColorCode");
            return (Criteria) this;
        }

        public Criteria andPlateColorCodeLike(String value) {
            addCriterion("PLATE_COLOR_CODE like", value, "plateColorCode");
            return (Criteria) this;
        }

        public Criteria andPlateColorCodeNotLike(String value) {
            addCriterion("PLATE_COLOR_CODE not like", value, "plateColorCode");
            return (Criteria) this;
        }

        public Criteria andPlateColorCodeIn(List<String> values) {
            addCriterion("PLATE_COLOR_CODE in", values, "plateColorCode");
            return (Criteria) this;
        }

        public Criteria andPlateColorCodeNotIn(List<String> values) {
            addCriterion("PLATE_COLOR_CODE not in", values, "plateColorCode");
            return (Criteria) this;
        }

        public Criteria andPlateColorCodeBetween(String value1, String value2) {
            addCriterion("PLATE_COLOR_CODE between", value1, value2, "plateColorCode");
            return (Criteria) this;
        }

        public Criteria andPlateColorCodeNotBetween(String value1, String value2) {
            addCriterion("PLATE_COLOR_CODE not between", value1, value2, "plateColorCode");
            return (Criteria) this;
        }

        public Criteria andTransCertificateWordIsNull() {
            addCriterion("TRANS_CERTIFICATE_WORD is null");
            return (Criteria) this;
        }

        public Criteria andTransCertificateWordIsNotNull() {
            addCriterion("TRANS_CERTIFICATE_WORD is not null");
            return (Criteria) this;
        }

        public Criteria andTransCertificateWordEqualTo(String value) {
            addCriterion("TRANS_CERTIFICATE_WORD =", value, "transCertificateWord");
            return (Criteria) this;
        }

        public Criteria andTransCertificateWordNotEqualTo(String value) {
            addCriterion("TRANS_CERTIFICATE_WORD <>", value, "transCertificateWord");
            return (Criteria) this;
        }

        public Criteria andTransCertificateWordGreaterThan(String value) {
            addCriterion("TRANS_CERTIFICATE_WORD >", value, "transCertificateWord");
            return (Criteria) this;
        }

        public Criteria andTransCertificateWordGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_CERTIFICATE_WORD >=", value, "transCertificateWord");
            return (Criteria) this;
        }

        public Criteria andTransCertificateWordLessThan(String value) {
            addCriterion("TRANS_CERTIFICATE_WORD <", value, "transCertificateWord");
            return (Criteria) this;
        }

        public Criteria andTransCertificateWordLessThanOrEqualTo(String value) {
            addCriterion("TRANS_CERTIFICATE_WORD <=", value, "transCertificateWord");
            return (Criteria) this;
        }

        public Criteria andTransCertificateWordLike(String value) {
            addCriterion("TRANS_CERTIFICATE_WORD like", value, "transCertificateWord");
            return (Criteria) this;
        }

        public Criteria andTransCertificateWordNotLike(String value) {
            addCriterion("TRANS_CERTIFICATE_WORD not like", value, "transCertificateWord");
            return (Criteria) this;
        }

        public Criteria andTransCertificateWordIn(List<String> values) {
            addCriterion("TRANS_CERTIFICATE_WORD in", values, "transCertificateWord");
            return (Criteria) this;
        }

        public Criteria andTransCertificateWordNotIn(List<String> values) {
            addCriterion("TRANS_CERTIFICATE_WORD not in", values, "transCertificateWord");
            return (Criteria) this;
        }

        public Criteria andTransCertificateWordBetween(String value1, String value2) {
            addCriterion("TRANS_CERTIFICATE_WORD between", value1, value2, "transCertificateWord");
            return (Criteria) this;
        }

        public Criteria andTransCertificateWordNotBetween(String value1, String value2) {
            addCriterion("TRANS_CERTIFICATE_WORD not between", value1, value2, "transCertificateWord");
            return (Criteria) this;
        }

        public Criteria andTransCertificateCodeIsNull() {
            addCriterion("TRANS_CERTIFICATE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTransCertificateCodeIsNotNull() {
            addCriterion("TRANS_CERTIFICATE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTransCertificateCodeEqualTo(String value) {
            addCriterion("TRANS_CERTIFICATE_CODE =", value, "transCertificateCode");
            return (Criteria) this;
        }

        public Criteria andTransCertificateCodeNotEqualTo(String value) {
            addCriterion("TRANS_CERTIFICATE_CODE <>", value, "transCertificateCode");
            return (Criteria) this;
        }

        public Criteria andTransCertificateCodeGreaterThan(String value) {
            addCriterion("TRANS_CERTIFICATE_CODE >", value, "transCertificateCode");
            return (Criteria) this;
        }

        public Criteria andTransCertificateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_CERTIFICATE_CODE >=", value, "transCertificateCode");
            return (Criteria) this;
        }

        public Criteria andTransCertificateCodeLessThan(String value) {
            addCriterion("TRANS_CERTIFICATE_CODE <", value, "transCertificateCode");
            return (Criteria) this;
        }

        public Criteria andTransCertificateCodeLessThanOrEqualTo(String value) {
            addCriterion("TRANS_CERTIFICATE_CODE <=", value, "transCertificateCode");
            return (Criteria) this;
        }

        public Criteria andTransCertificateCodeLike(String value) {
            addCriterion("TRANS_CERTIFICATE_CODE like", value, "transCertificateCode");
            return (Criteria) this;
        }

        public Criteria andTransCertificateCodeNotLike(String value) {
            addCriterion("TRANS_CERTIFICATE_CODE not like", value, "transCertificateCode");
            return (Criteria) this;
        }

        public Criteria andTransCertificateCodeIn(List<String> values) {
            addCriterion("TRANS_CERTIFICATE_CODE in", values, "transCertificateCode");
            return (Criteria) this;
        }

        public Criteria andTransCertificateCodeNotIn(List<String> values) {
            addCriterion("TRANS_CERTIFICATE_CODE not in", values, "transCertificateCode");
            return (Criteria) this;
        }

        public Criteria andTransCertificateCodeBetween(String value1, String value2) {
            addCriterion("TRANS_CERTIFICATE_CODE between", value1, value2, "transCertificateCode");
            return (Criteria) this;
        }

        public Criteria andTransCertificateCodeNotBetween(String value1, String value2) {
            addCriterion("TRANS_CERTIFICATE_CODE not between", value1, value2, "transCertificateCode");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeCodeIsNull() {
            addCriterion("BUSINESS_SCOPE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeCodeIsNotNull() {
            addCriterion("BUSINESS_SCOPE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeCodeEqualTo(String value) {
            addCriterion("BUSINESS_SCOPE_CODE =", value, "businessScopeCode");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeCodeNotEqualTo(String value) {
            addCriterion("BUSINESS_SCOPE_CODE <>", value, "businessScopeCode");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeCodeGreaterThan(String value) {
            addCriterion("BUSINESS_SCOPE_CODE >", value, "businessScopeCode");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_SCOPE_CODE >=", value, "businessScopeCode");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeCodeLessThan(String value) {
            addCriterion("BUSINESS_SCOPE_CODE <", value, "businessScopeCode");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeCodeLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_SCOPE_CODE <=", value, "businessScopeCode");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeCodeLike(String value) {
            addCriterion("BUSINESS_SCOPE_CODE like", value, "businessScopeCode");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeCodeNotLike(String value) {
            addCriterion("BUSINESS_SCOPE_CODE not like", value, "businessScopeCode");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeCodeIn(List<String> values) {
            addCriterion("BUSINESS_SCOPE_CODE in", values, "businessScopeCode");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeCodeNotIn(List<String> values) {
            addCriterion("BUSINESS_SCOPE_CODE not in", values, "businessScopeCode");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeCodeBetween(String value1, String value2) {
            addCriterion("BUSINESS_SCOPE_CODE between", value1, value2, "businessScopeCode");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeCodeNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_SCOPE_CODE not between", value1, value2, "businessScopeCode");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeDescIsNull() {
            addCriterion("BUSINESS_SCOPE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeDescIsNotNull() {
            addCriterion("BUSINESS_SCOPE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeDescEqualTo(String value) {
            addCriterion("BUSINESS_SCOPE_DESC =", value, "businessScopeDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeDescNotEqualTo(String value) {
            addCriterion("BUSINESS_SCOPE_DESC <>", value, "businessScopeDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeDescGreaterThan(String value) {
            addCriterion("BUSINESS_SCOPE_DESC >", value, "businessScopeDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeDescGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_SCOPE_DESC >=", value, "businessScopeDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeDescLessThan(String value) {
            addCriterion("BUSINESS_SCOPE_DESC <", value, "businessScopeDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeDescLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_SCOPE_DESC <=", value, "businessScopeDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeDescLike(String value) {
            addCriterion("BUSINESS_SCOPE_DESC like", value, "businessScopeDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeDescNotLike(String value) {
            addCriterion("BUSINESS_SCOPE_DESC not like", value, "businessScopeDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeDescIn(List<String> values) {
            addCriterion("BUSINESS_SCOPE_DESC in", values, "businessScopeDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeDescNotIn(List<String> values) {
            addCriterion("BUSINESS_SCOPE_DESC not in", values, "businessScopeDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeDescBetween(String value1, String value2) {
            addCriterion("BUSINESS_SCOPE_DESC between", value1, value2, "businessScopeDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeDescNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_SCOPE_DESC not between", value1, value2, "businessScopeDesc");
            return (Criteria) this;
        }

        public Criteria andTransCertificateGrantOrganIsNull() {
            addCriterion("TRANS_CERTIFICATE_GRANT_ORGAN is null");
            return (Criteria) this;
        }

        public Criteria andTransCertificateGrantOrganIsNotNull() {
            addCriterion("TRANS_CERTIFICATE_GRANT_ORGAN is not null");
            return (Criteria) this;
        }

        public Criteria andTransCertificateGrantOrganEqualTo(String value) {
            addCriterion("TRANS_CERTIFICATE_GRANT_ORGAN =", value, "transCertificateGrantOrgan");
            return (Criteria) this;
        }

        public Criteria andTransCertificateGrantOrganNotEqualTo(String value) {
            addCriterion("TRANS_CERTIFICATE_GRANT_ORGAN <>", value, "transCertificateGrantOrgan");
            return (Criteria) this;
        }

        public Criteria andTransCertificateGrantOrganGreaterThan(String value) {
            addCriterion("TRANS_CERTIFICATE_GRANT_ORGAN >", value, "transCertificateGrantOrgan");
            return (Criteria) this;
        }

        public Criteria andTransCertificateGrantOrganGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_CERTIFICATE_GRANT_ORGAN >=", value, "transCertificateGrantOrgan");
            return (Criteria) this;
        }

        public Criteria andTransCertificateGrantOrganLessThan(String value) {
            addCriterion("TRANS_CERTIFICATE_GRANT_ORGAN <", value, "transCertificateGrantOrgan");
            return (Criteria) this;
        }

        public Criteria andTransCertificateGrantOrganLessThanOrEqualTo(String value) {
            addCriterion("TRANS_CERTIFICATE_GRANT_ORGAN <=", value, "transCertificateGrantOrgan");
            return (Criteria) this;
        }

        public Criteria andTransCertificateGrantOrganLike(String value) {
            addCriterion("TRANS_CERTIFICATE_GRANT_ORGAN like", value, "transCertificateGrantOrgan");
            return (Criteria) this;
        }

        public Criteria andTransCertificateGrantOrganNotLike(String value) {
            addCriterion("TRANS_CERTIFICATE_GRANT_ORGAN not like", value, "transCertificateGrantOrgan");
            return (Criteria) this;
        }

        public Criteria andTransCertificateGrantOrganIn(List<String> values) {
            addCriterion("TRANS_CERTIFICATE_GRANT_ORGAN in", values, "transCertificateGrantOrgan");
            return (Criteria) this;
        }

        public Criteria andTransCertificateGrantOrganNotIn(List<String> values) {
            addCriterion("TRANS_CERTIFICATE_GRANT_ORGAN not in", values, "transCertificateGrantOrgan");
            return (Criteria) this;
        }

        public Criteria andTransCertificateGrantOrganBetween(String value1, String value2) {
            addCriterion("TRANS_CERTIFICATE_GRANT_ORGAN between", value1, value2, "transCertificateGrantOrgan");
            return (Criteria) this;
        }

        public Criteria andTransCertificateGrantOrganNotBetween(String value1, String value2) {
            addCriterion("TRANS_CERTIFICATE_GRANT_ORGAN not between", value1, value2, "transCertificateGrantOrgan");
            return (Criteria) this;
        }

        public Criteria andCertificateBeginDateIsNull() {
            addCriterion("CERTIFICATE_BEGIN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCertificateBeginDateIsNotNull() {
            addCriterion("CERTIFICATE_BEGIN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateBeginDateEqualTo(Date value) {
            addCriterion("CERTIFICATE_BEGIN_DATE =", value, "certificateBeginDate");
            return (Criteria) this;
        }

        public Criteria andCertificateBeginDateNotEqualTo(Date value) {
            addCriterion("CERTIFICATE_BEGIN_DATE <>", value, "certificateBeginDate");
            return (Criteria) this;
        }

        public Criteria andCertificateBeginDateGreaterThan(Date value) {
            addCriterion("CERTIFICATE_BEGIN_DATE >", value, "certificateBeginDate");
            return (Criteria) this;
        }

        public Criteria andCertificateBeginDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CERTIFICATE_BEGIN_DATE >=", value, "certificateBeginDate");
            return (Criteria) this;
        }

        public Criteria andCertificateBeginDateLessThan(Date value) {
            addCriterion("CERTIFICATE_BEGIN_DATE <", value, "certificateBeginDate");
            return (Criteria) this;
        }

        public Criteria andCertificateBeginDateLessThanOrEqualTo(Date value) {
            addCriterion("CERTIFICATE_BEGIN_DATE <=", value, "certificateBeginDate");
            return (Criteria) this;
        }

        public Criteria andCertificateBeginDateIn(List<Date> values) {
            addCriterion("CERTIFICATE_BEGIN_DATE in", values, "certificateBeginDate");
            return (Criteria) this;
        }

        public Criteria andCertificateBeginDateNotIn(List<Date> values) {
            addCriterion("CERTIFICATE_BEGIN_DATE not in", values, "certificateBeginDate");
            return (Criteria) this;
        }

        public Criteria andCertificateBeginDateBetween(Date value1, Date value2) {
            addCriterion("CERTIFICATE_BEGIN_DATE between", value1, value2, "certificateBeginDate");
            return (Criteria) this;
        }

        public Criteria andCertificateBeginDateNotBetween(Date value1, Date value2) {
            addCriterion("CERTIFICATE_BEGIN_DATE not between", value1, value2, "certificateBeginDate");
            return (Criteria) this;
        }

        public Criteria andCertificateExpireDateIsNull() {
            addCriterion("CERTIFICATE_EXPIRE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCertificateExpireDateIsNotNull() {
            addCriterion("CERTIFICATE_EXPIRE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateExpireDateEqualTo(Date value) {
            addCriterion("CERTIFICATE_EXPIRE_DATE =", value, "certificateExpireDate");
            return (Criteria) this;
        }

        public Criteria andCertificateExpireDateNotEqualTo(Date value) {
            addCriterion("CERTIFICATE_EXPIRE_DATE <>", value, "certificateExpireDate");
            return (Criteria) this;
        }

        public Criteria andCertificateExpireDateGreaterThan(Date value) {
            addCriterion("CERTIFICATE_EXPIRE_DATE >", value, "certificateExpireDate");
            return (Criteria) this;
        }

        public Criteria andCertificateExpireDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CERTIFICATE_EXPIRE_DATE >=", value, "certificateExpireDate");
            return (Criteria) this;
        }

        public Criteria andCertificateExpireDateLessThan(Date value) {
            addCriterion("CERTIFICATE_EXPIRE_DATE <", value, "certificateExpireDate");
            return (Criteria) this;
        }

        public Criteria andCertificateExpireDateLessThanOrEqualTo(Date value) {
            addCriterion("CERTIFICATE_EXPIRE_DATE <=", value, "certificateExpireDate");
            return (Criteria) this;
        }

        public Criteria andCertificateExpireDateIn(List<Date> values) {
            addCriterion("CERTIFICATE_EXPIRE_DATE in", values, "certificateExpireDate");
            return (Criteria) this;
        }

        public Criteria andCertificateExpireDateNotIn(List<Date> values) {
            addCriterion("CERTIFICATE_EXPIRE_DATE not in", values, "certificateExpireDate");
            return (Criteria) this;
        }

        public Criteria andCertificateExpireDateBetween(Date value1, Date value2) {
            addCriterion("CERTIFICATE_EXPIRE_DATE between", value1, value2, "certificateExpireDate");
            return (Criteria) this;
        }

        public Criteria andCertificateExpireDateNotBetween(Date value1, Date value2) {
            addCriterion("CERTIFICATE_EXPIRE_DATE not between", value1, value2, "certificateExpireDate");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIsNull() {
            addCriterion("CERTIFICATE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIsNotNull() {
            addCriterion("CERTIFICATE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeEqualTo(String value) {
            addCriterion("CERTIFICATE_TYPE =", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotEqualTo(String value) {
            addCriterion("CERTIFICATE_TYPE <>", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeGreaterThan(String value) {
            addCriterion("CERTIFICATE_TYPE >", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CERTIFICATE_TYPE >=", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLessThan(String value) {
            addCriterion("CERTIFICATE_TYPE <", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLessThanOrEqualTo(String value) {
            addCriterion("CERTIFICATE_TYPE <=", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLike(String value) {
            addCriterion("CERTIFICATE_TYPE like", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotLike(String value) {
            addCriterion("CERTIFICATE_TYPE not like", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIn(List<String> values) {
            addCriterion("CERTIFICATE_TYPE in", values, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotIn(List<String> values) {
            addCriterion("CERTIFICATE_TYPE not in", values, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeBetween(String value1, String value2) {
            addCriterion("CERTIFICATE_TYPE between", value1, value2, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotBetween(String value1, String value2) {
            addCriterion("CERTIFICATE_TYPE not between", value1, value2, "certificateType");
            return (Criteria) this;
        }

        public Criteria andOwnerIdIsNull() {
            addCriterion("OWNER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIdIsNotNull() {
            addCriterion("OWNER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerIdEqualTo(String value) {
            addCriterion("OWNER_ID =", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotEqualTo(String value) {
            addCriterion("OWNER_ID <>", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdGreaterThan(String value) {
            addCriterion("OWNER_ID >", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdGreaterThanOrEqualTo(String value) {
            addCriterion("OWNER_ID >=", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdLessThan(String value) {
            addCriterion("OWNER_ID <", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdLessThanOrEqualTo(String value) {
            addCriterion("OWNER_ID <=", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdLike(String value) {
            addCriterion("OWNER_ID like", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotLike(String value) {
            addCriterion("OWNER_ID not like", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdIn(List<String> values) {
            addCriterion("OWNER_ID in", values, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotIn(List<String> values) {
            addCriterion("OWNER_ID not in", values, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdBetween(String value1, String value2) {
            addCriterion("OWNER_ID between", value1, value2, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotBetween(String value1, String value2) {
            addCriterion("OWNER_ID not between", value1, value2, "ownerId");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("BRAND is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("BRAND is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("BRAND =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("BRAND <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("BRAND >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("BRAND >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("BRAND <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("BRAND <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("BRAND like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("BRAND not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("BRAND in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("BRAND not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("BRAND between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("BRAND not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("MODEL is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("MODEL is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("MODEL =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("MODEL <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("MODEL >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("MODEL >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("MODEL <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("MODEL <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("MODEL like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("MODEL not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("MODEL in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("MODEL not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("MODEL between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("MODEL not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andEngineNoIsNull() {
            addCriterion("ENGINE_NO is null");
            return (Criteria) this;
        }

        public Criteria andEngineNoIsNotNull() {
            addCriterion("ENGINE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andEngineNoEqualTo(String value) {
            addCriterion("ENGINE_NO =", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoNotEqualTo(String value) {
            addCriterion("ENGINE_NO <>", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoGreaterThan(String value) {
            addCriterion("ENGINE_NO >", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoGreaterThanOrEqualTo(String value) {
            addCriterion("ENGINE_NO >=", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoLessThan(String value) {
            addCriterion("ENGINE_NO <", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoLessThanOrEqualTo(String value) {
            addCriterion("ENGINE_NO <=", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoLike(String value) {
            addCriterion("ENGINE_NO like", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoNotLike(String value) {
            addCriterion("ENGINE_NO not like", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoIn(List<String> values) {
            addCriterion("ENGINE_NO in", values, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoNotIn(List<String> values) {
            addCriterion("ENGINE_NO not in", values, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoBetween(String value1, String value2) {
            addCriterion("ENGINE_NO between", value1, value2, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoNotBetween(String value1, String value2) {
            addCriterion("ENGINE_NO not between", value1, value2, "engineNo");
            return (Criteria) this;
        }

        public Criteria andVinIsNull() {
            addCriterion("VIN is null");
            return (Criteria) this;
        }

        public Criteria andVinIsNotNull() {
            addCriterion("VIN is not null");
            return (Criteria) this;
        }

        public Criteria andVinEqualTo(String value) {
            addCriterion("VIN =", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotEqualTo(String value) {
            addCriterion("VIN <>", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinGreaterThan(String value) {
            addCriterion("VIN >", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinGreaterThanOrEqualTo(String value) {
            addCriterion("VIN >=", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLessThan(String value) {
            addCriterion("VIN <", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLessThanOrEqualTo(String value) {
            addCriterion("VIN <=", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLike(String value) {
            addCriterion("VIN like", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotLike(String value) {
            addCriterion("VIN not like", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinIn(List<String> values) {
            addCriterion("VIN in", values, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotIn(List<String> values) {
            addCriterion("VIN not in", values, "vin");
            return (Criteria) this;
        }

        public Criteria andVinBetween(String value1, String value2) {
            addCriterion("VIN between", value1, value2, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotBetween(String value1, String value2) {
            addCriterion("VIN not between", value1, value2, "vin");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeIsNull() {
            addCriterion("VEHICLE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeIsNotNull() {
            addCriterion("VEHICLE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeEqualTo(String value) {
            addCriterion("VEHICLE_TYPE =", value, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeNotEqualTo(String value) {
            addCriterion("VEHICLE_TYPE <>", value, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeGreaterThan(String value) {
            addCriterion("VEHICLE_TYPE >", value, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("VEHICLE_TYPE >=", value, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeLessThan(String value) {
            addCriterion("VEHICLE_TYPE <", value, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeLessThanOrEqualTo(String value) {
            addCriterion("VEHICLE_TYPE <=", value, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeLike(String value) {
            addCriterion("VEHICLE_TYPE like", value, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeNotLike(String value) {
            addCriterion("VEHICLE_TYPE not like", value, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeIn(List<String> values) {
            addCriterion("VEHICLE_TYPE in", values, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeNotIn(List<String> values) {
            addCriterion("VEHICLE_TYPE not in", values, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeBetween(String value1, String value2) {
            addCriterion("VEHICLE_TYPE between", value1, value2, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeNotBetween(String value1, String value2) {
            addCriterion("VEHICLE_TYPE not between", value1, value2, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeCodeIsNull() {
            addCriterion("VEHICLE_TYPE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeCodeIsNotNull() {
            addCriterion("VEHICLE_TYPE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeCodeEqualTo(String value) {
            addCriterion("VEHICLE_TYPE_CODE =", value, "vehicleTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeCodeNotEqualTo(String value) {
            addCriterion("VEHICLE_TYPE_CODE <>", value, "vehicleTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeCodeGreaterThan(String value) {
            addCriterion("VEHICLE_TYPE_CODE >", value, "vehicleTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("VEHICLE_TYPE_CODE >=", value, "vehicleTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeCodeLessThan(String value) {
            addCriterion("VEHICLE_TYPE_CODE <", value, "vehicleTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("VEHICLE_TYPE_CODE <=", value, "vehicleTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeCodeLike(String value) {
            addCriterion("VEHICLE_TYPE_CODE like", value, "vehicleTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeCodeNotLike(String value) {
            addCriterion("VEHICLE_TYPE_CODE not like", value, "vehicleTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeCodeIn(List<String> values) {
            addCriterion("VEHICLE_TYPE_CODE in", values, "vehicleTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeCodeNotIn(List<String> values) {
            addCriterion("VEHICLE_TYPE_CODE not in", values, "vehicleTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeCodeBetween(String value1, String value2) {
            addCriterion("VEHICLE_TYPE_CODE between", value1, value2, "vehicleTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeCodeNotBetween(String value1, String value2) {
            addCriterion("VEHICLE_TYPE_CODE not between", value1, value2, "vehicleTypeCode");
            return (Criteria) this;
        }

        public Criteria andBusTypeIsNull() {
            addCriterion("BUS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBusTypeIsNotNull() {
            addCriterion("BUS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBusTypeEqualTo(String value) {
            addCriterion("BUS_TYPE =", value, "busType");
            return (Criteria) this;
        }

        public Criteria andBusTypeNotEqualTo(String value) {
            addCriterion("BUS_TYPE <>", value, "busType");
            return (Criteria) this;
        }

        public Criteria andBusTypeGreaterThan(String value) {
            addCriterion("BUS_TYPE >", value, "busType");
            return (Criteria) this;
        }

        public Criteria andBusTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BUS_TYPE >=", value, "busType");
            return (Criteria) this;
        }

        public Criteria andBusTypeLessThan(String value) {
            addCriterion("BUS_TYPE <", value, "busType");
            return (Criteria) this;
        }

        public Criteria andBusTypeLessThanOrEqualTo(String value) {
            addCriterion("BUS_TYPE <=", value, "busType");
            return (Criteria) this;
        }

        public Criteria andBusTypeLike(String value) {
            addCriterion("BUS_TYPE like", value, "busType");
            return (Criteria) this;
        }

        public Criteria andBusTypeNotLike(String value) {
            addCriterion("BUS_TYPE not like", value, "busType");
            return (Criteria) this;
        }

        public Criteria andBusTypeIn(List<String> values) {
            addCriterion("BUS_TYPE in", values, "busType");
            return (Criteria) this;
        }

        public Criteria andBusTypeNotIn(List<String> values) {
            addCriterion("BUS_TYPE not in", values, "busType");
            return (Criteria) this;
        }

        public Criteria andBusTypeBetween(String value1, String value2) {
            addCriterion("BUS_TYPE between", value1, value2, "busType");
            return (Criteria) this;
        }

        public Criteria andBusTypeNotBetween(String value1, String value2) {
            addCriterion("BUS_TYPE not between", value1, value2, "busType");
            return (Criteria) this;
        }

        public Criteria andOutFactoryDateIsNull() {
            addCriterion("OUT_FACTORY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andOutFactoryDateIsNotNull() {
            addCriterion("OUT_FACTORY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andOutFactoryDateEqualTo(Date value) {
            addCriterion("OUT_FACTORY_DATE =", value, "outFactoryDate");
            return (Criteria) this;
        }

        public Criteria andOutFactoryDateNotEqualTo(Date value) {
            addCriterion("OUT_FACTORY_DATE <>", value, "outFactoryDate");
            return (Criteria) this;
        }

        public Criteria andOutFactoryDateGreaterThan(Date value) {
            addCriterion("OUT_FACTORY_DATE >", value, "outFactoryDate");
            return (Criteria) this;
        }

        public Criteria andOutFactoryDateGreaterThanOrEqualTo(Date value) {
            addCriterion("OUT_FACTORY_DATE >=", value, "outFactoryDate");
            return (Criteria) this;
        }

        public Criteria andOutFactoryDateLessThan(Date value) {
            addCriterion("OUT_FACTORY_DATE <", value, "outFactoryDate");
            return (Criteria) this;
        }

        public Criteria andOutFactoryDateLessThanOrEqualTo(Date value) {
            addCriterion("OUT_FACTORY_DATE <=", value, "outFactoryDate");
            return (Criteria) this;
        }

        public Criteria andOutFactoryDateIn(List<Date> values) {
            addCriterion("OUT_FACTORY_DATE in", values, "outFactoryDate");
            return (Criteria) this;
        }

        public Criteria andOutFactoryDateNotIn(List<Date> values) {
            addCriterion("OUT_FACTORY_DATE not in", values, "outFactoryDate");
            return (Criteria) this;
        }

        public Criteria andOutFactoryDateBetween(Date value1, Date value2) {
            addCriterion("OUT_FACTORY_DATE between", value1, value2, "outFactoryDate");
            return (Criteria) this;
        }

        public Criteria andOutFactoryDateNotBetween(Date value1, Date value2) {
            addCriterion("OUT_FACTORY_DATE not between", value1, value2, "outFactoryDate");
            return (Criteria) this;
        }

        public Criteria andFuelTypeIsNull() {
            addCriterion("FUEL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFuelTypeIsNotNull() {
            addCriterion("FUEL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFuelTypeEqualTo(String value) {
            addCriterion("FUEL_TYPE =", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeNotEqualTo(String value) {
            addCriterion("FUEL_TYPE <>", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeGreaterThan(String value) {
            addCriterion("FUEL_TYPE >", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FUEL_TYPE >=", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeLessThan(String value) {
            addCriterion("FUEL_TYPE <", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeLessThanOrEqualTo(String value) {
            addCriterion("FUEL_TYPE <=", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeLike(String value) {
            addCriterion("FUEL_TYPE like", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeNotLike(String value) {
            addCriterion("FUEL_TYPE not like", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeIn(List<String> values) {
            addCriterion("FUEL_TYPE in", values, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeNotIn(List<String> values) {
            addCriterion("FUEL_TYPE not in", values, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeBetween(String value1, String value2) {
            addCriterion("FUEL_TYPE between", value1, value2, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeNotBetween(String value1, String value2) {
            addCriterion("FUEL_TYPE not between", value1, value2, "fuelType");
            return (Criteria) this;
        }

        public Criteria andWheelBaseIsNull() {
            addCriterion("WHEEL_BASE is null");
            return (Criteria) this;
        }

        public Criteria andWheelBaseIsNotNull() {
            addCriterion("WHEEL_BASE is not null");
            return (Criteria) this;
        }

        public Criteria andWheelBaseEqualTo(Long value) {
            addCriterion("WHEEL_BASE =", value, "wheelBase");
            return (Criteria) this;
        }

        public Criteria andWheelBaseNotEqualTo(Long value) {
            addCriterion("WHEEL_BASE <>", value, "wheelBase");
            return (Criteria) this;
        }

        public Criteria andWheelBaseGreaterThan(Long value) {
            addCriterion("WHEEL_BASE >", value, "wheelBase");
            return (Criteria) this;
        }

        public Criteria andWheelBaseGreaterThanOrEqualTo(Long value) {
            addCriterion("WHEEL_BASE >=", value, "wheelBase");
            return (Criteria) this;
        }

        public Criteria andWheelBaseLessThan(Long value) {
            addCriterion("WHEEL_BASE <", value, "wheelBase");
            return (Criteria) this;
        }

        public Criteria andWheelBaseLessThanOrEqualTo(Long value) {
            addCriterion("WHEEL_BASE <=", value, "wheelBase");
            return (Criteria) this;
        }

        public Criteria andWheelBaseIn(List<Long> values) {
            addCriterion("WHEEL_BASE in", values, "wheelBase");
            return (Criteria) this;
        }

        public Criteria andWheelBaseNotIn(List<Long> values) {
            addCriterion("WHEEL_BASE not in", values, "wheelBase");
            return (Criteria) this;
        }

        public Criteria andWheelBaseBetween(Long value1, Long value2) {
            addCriterion("WHEEL_BASE between", value1, value2, "wheelBase");
            return (Criteria) this;
        }

        public Criteria andWheelBaseNotBetween(Long value1, Long value2) {
            addCriterion("WHEEL_BASE not between", value1, value2, "wheelBase");
            return (Criteria) this;
        }

        public Criteria andVehicleLengthIsNull() {
            addCriterion("VEHICLE_LENGTH is null");
            return (Criteria) this;
        }

        public Criteria andVehicleLengthIsNotNull() {
            addCriterion("VEHICLE_LENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleLengthEqualTo(Long value) {
            addCriterion("VEHICLE_LENGTH =", value, "vehicleLength");
            return (Criteria) this;
        }

        public Criteria andVehicleLengthNotEqualTo(Long value) {
            addCriterion("VEHICLE_LENGTH <>", value, "vehicleLength");
            return (Criteria) this;
        }

        public Criteria andVehicleLengthGreaterThan(Long value) {
            addCriterion("VEHICLE_LENGTH >", value, "vehicleLength");
            return (Criteria) this;
        }

        public Criteria andVehicleLengthGreaterThanOrEqualTo(Long value) {
            addCriterion("VEHICLE_LENGTH >=", value, "vehicleLength");
            return (Criteria) this;
        }

        public Criteria andVehicleLengthLessThan(Long value) {
            addCriterion("VEHICLE_LENGTH <", value, "vehicleLength");
            return (Criteria) this;
        }

        public Criteria andVehicleLengthLessThanOrEqualTo(Long value) {
            addCriterion("VEHICLE_LENGTH <=", value, "vehicleLength");
            return (Criteria) this;
        }

        public Criteria andVehicleLengthIn(List<Long> values) {
            addCriterion("VEHICLE_LENGTH in", values, "vehicleLength");
            return (Criteria) this;
        }

        public Criteria andVehicleLengthNotIn(List<Long> values) {
            addCriterion("VEHICLE_LENGTH not in", values, "vehicleLength");
            return (Criteria) this;
        }

        public Criteria andVehicleLengthBetween(Long value1, Long value2) {
            addCriterion("VEHICLE_LENGTH between", value1, value2, "vehicleLength");
            return (Criteria) this;
        }

        public Criteria andVehicleLengthNotBetween(Long value1, Long value2) {
            addCriterion("VEHICLE_LENGTH not between", value1, value2, "vehicleLength");
            return (Criteria) this;
        }

        public Criteria andVehicleWidthIsNull() {
            addCriterion("VEHICLE_WIDTH is null");
            return (Criteria) this;
        }

        public Criteria andVehicleWidthIsNotNull() {
            addCriterion("VEHICLE_WIDTH is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleWidthEqualTo(Long value) {
            addCriterion("VEHICLE_WIDTH =", value, "vehicleWidth");
            return (Criteria) this;
        }

        public Criteria andVehicleWidthNotEqualTo(Long value) {
            addCriterion("VEHICLE_WIDTH <>", value, "vehicleWidth");
            return (Criteria) this;
        }

        public Criteria andVehicleWidthGreaterThan(Long value) {
            addCriterion("VEHICLE_WIDTH >", value, "vehicleWidth");
            return (Criteria) this;
        }

        public Criteria andVehicleWidthGreaterThanOrEqualTo(Long value) {
            addCriterion("VEHICLE_WIDTH >=", value, "vehicleWidth");
            return (Criteria) this;
        }

        public Criteria andVehicleWidthLessThan(Long value) {
            addCriterion("VEHICLE_WIDTH <", value, "vehicleWidth");
            return (Criteria) this;
        }

        public Criteria andVehicleWidthLessThanOrEqualTo(Long value) {
            addCriterion("VEHICLE_WIDTH <=", value, "vehicleWidth");
            return (Criteria) this;
        }

        public Criteria andVehicleWidthIn(List<Long> values) {
            addCriterion("VEHICLE_WIDTH in", values, "vehicleWidth");
            return (Criteria) this;
        }

        public Criteria andVehicleWidthNotIn(List<Long> values) {
            addCriterion("VEHICLE_WIDTH not in", values, "vehicleWidth");
            return (Criteria) this;
        }

        public Criteria andVehicleWidthBetween(Long value1, Long value2) {
            addCriterion("VEHICLE_WIDTH between", value1, value2, "vehicleWidth");
            return (Criteria) this;
        }

        public Criteria andVehicleWidthNotBetween(Long value1, Long value2) {
            addCriterion("VEHICLE_WIDTH not between", value1, value2, "vehicleWidth");
            return (Criteria) this;
        }

        public Criteria andVehicleHighIsNull() {
            addCriterion("VEHICLE_HIGH is null");
            return (Criteria) this;
        }

        public Criteria andVehicleHighIsNotNull() {
            addCriterion("VEHICLE_HIGH is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleHighEqualTo(Long value) {
            addCriterion("VEHICLE_HIGH =", value, "vehicleHigh");
            return (Criteria) this;
        }

        public Criteria andVehicleHighNotEqualTo(Long value) {
            addCriterion("VEHICLE_HIGH <>", value, "vehicleHigh");
            return (Criteria) this;
        }

        public Criteria andVehicleHighGreaterThan(Long value) {
            addCriterion("VEHICLE_HIGH >", value, "vehicleHigh");
            return (Criteria) this;
        }

        public Criteria andVehicleHighGreaterThanOrEqualTo(Long value) {
            addCriterion("VEHICLE_HIGH >=", value, "vehicleHigh");
            return (Criteria) this;
        }

        public Criteria andVehicleHighLessThan(Long value) {
            addCriterion("VEHICLE_HIGH <", value, "vehicleHigh");
            return (Criteria) this;
        }

        public Criteria andVehicleHighLessThanOrEqualTo(Long value) {
            addCriterion("VEHICLE_HIGH <=", value, "vehicleHigh");
            return (Criteria) this;
        }

        public Criteria andVehicleHighIn(List<Long> values) {
            addCriterion("VEHICLE_HIGH in", values, "vehicleHigh");
            return (Criteria) this;
        }

        public Criteria andVehicleHighNotIn(List<Long> values) {
            addCriterion("VEHICLE_HIGH not in", values, "vehicleHigh");
            return (Criteria) this;
        }

        public Criteria andVehicleHighBetween(Long value1, Long value2) {
            addCriterion("VEHICLE_HIGH between", value1, value2, "vehicleHigh");
            return (Criteria) this;
        }

        public Criteria andVehicleHighNotBetween(Long value1, Long value2) {
            addCriterion("VEHICLE_HIGH not between", value1, value2, "vehicleHigh");
            return (Criteria) this;
        }

        public Criteria andAxlesAmountIsNull() {
            addCriterion("AXLES_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAxlesAmountIsNotNull() {
            addCriterion("AXLES_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAxlesAmountEqualTo(Long value) {
            addCriterion("AXLES_AMOUNT =", value, "axlesAmount");
            return (Criteria) this;
        }

        public Criteria andAxlesAmountNotEqualTo(Long value) {
            addCriterion("AXLES_AMOUNT <>", value, "axlesAmount");
            return (Criteria) this;
        }

        public Criteria andAxlesAmountGreaterThan(Long value) {
            addCriterion("AXLES_AMOUNT >", value, "axlesAmount");
            return (Criteria) this;
        }

        public Criteria andAxlesAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("AXLES_AMOUNT >=", value, "axlesAmount");
            return (Criteria) this;
        }

        public Criteria andAxlesAmountLessThan(Long value) {
            addCriterion("AXLES_AMOUNT <", value, "axlesAmount");
            return (Criteria) this;
        }

        public Criteria andAxlesAmountLessThanOrEqualTo(Long value) {
            addCriterion("AXLES_AMOUNT <=", value, "axlesAmount");
            return (Criteria) this;
        }

        public Criteria andAxlesAmountIn(List<Long> values) {
            addCriterion("AXLES_AMOUNT in", values, "axlesAmount");
            return (Criteria) this;
        }

        public Criteria andAxlesAmountNotIn(List<Long> values) {
            addCriterion("AXLES_AMOUNT not in", values, "axlesAmount");
            return (Criteria) this;
        }

        public Criteria andAxlesAmountBetween(Long value1, Long value2) {
            addCriterion("AXLES_AMOUNT between", value1, value2, "axlesAmount");
            return (Criteria) this;
        }

        public Criteria andAxlesAmountNotBetween(Long value1, Long value2) {
            addCriterion("AXLES_AMOUNT not between", value1, value2, "axlesAmount");
            return (Criteria) this;
        }

        public Criteria andTractionTonnageIsNull() {
            addCriterion("TRACTION_TONNAGE is null");
            return (Criteria) this;
        }

        public Criteria andTractionTonnageIsNotNull() {
            addCriterion("TRACTION_TONNAGE is not null");
            return (Criteria) this;
        }

        public Criteria andTractionTonnageEqualTo(Long value) {
            addCriterion("TRACTION_TONNAGE =", value, "tractionTonnage");
            return (Criteria) this;
        }

        public Criteria andTractionTonnageNotEqualTo(Long value) {
            addCriterion("TRACTION_TONNAGE <>", value, "tractionTonnage");
            return (Criteria) this;
        }

        public Criteria andTractionTonnageGreaterThan(Long value) {
            addCriterion("TRACTION_TONNAGE >", value, "tractionTonnage");
            return (Criteria) this;
        }

        public Criteria andTractionTonnageGreaterThanOrEqualTo(Long value) {
            addCriterion("TRACTION_TONNAGE >=", value, "tractionTonnage");
            return (Criteria) this;
        }

        public Criteria andTractionTonnageLessThan(Long value) {
            addCriterion("TRACTION_TONNAGE <", value, "tractionTonnage");
            return (Criteria) this;
        }

        public Criteria andTractionTonnageLessThanOrEqualTo(Long value) {
            addCriterion("TRACTION_TONNAGE <=", value, "tractionTonnage");
            return (Criteria) this;
        }

        public Criteria andTractionTonnageIn(List<Long> values) {
            addCriterion("TRACTION_TONNAGE in", values, "tractionTonnage");
            return (Criteria) this;
        }

        public Criteria andTractionTonnageNotIn(List<Long> values) {
            addCriterion("TRACTION_TONNAGE not in", values, "tractionTonnage");
            return (Criteria) this;
        }

        public Criteria andTractionTonnageBetween(Long value1, Long value2) {
            addCriterion("TRACTION_TONNAGE between", value1, value2, "tractionTonnage");
            return (Criteria) this;
        }

        public Criteria andTractionTonnageNotBetween(Long value1, Long value2) {
            addCriterion("TRACTION_TONNAGE not between", value1, value2, "tractionTonnage");
            return (Criteria) this;
        }

        public Criteria andEnginePowerIsNull() {
            addCriterion("ENGINE_POWER is null");
            return (Criteria) this;
        }

        public Criteria andEnginePowerIsNotNull() {
            addCriterion("ENGINE_POWER is not null");
            return (Criteria) this;
        }

        public Criteria andEnginePowerEqualTo(String value) {
            addCriterion("ENGINE_POWER =", value, "enginePower");
            return (Criteria) this;
        }

        public Criteria andEnginePowerNotEqualTo(String value) {
            addCriterion("ENGINE_POWER <>", value, "enginePower");
            return (Criteria) this;
        }

        public Criteria andEnginePowerGreaterThan(String value) {
            addCriterion("ENGINE_POWER >", value, "enginePower");
            return (Criteria) this;
        }

        public Criteria andEnginePowerGreaterThanOrEqualTo(String value) {
            addCriterion("ENGINE_POWER >=", value, "enginePower");
            return (Criteria) this;
        }

        public Criteria andEnginePowerLessThan(String value) {
            addCriterion("ENGINE_POWER <", value, "enginePower");
            return (Criteria) this;
        }

        public Criteria andEnginePowerLessThanOrEqualTo(String value) {
            addCriterion("ENGINE_POWER <=", value, "enginePower");
            return (Criteria) this;
        }

        public Criteria andEnginePowerLike(String value) {
            addCriterion("ENGINE_POWER like", value, "enginePower");
            return (Criteria) this;
        }

        public Criteria andEnginePowerNotLike(String value) {
            addCriterion("ENGINE_POWER not like", value, "enginePower");
            return (Criteria) this;
        }

        public Criteria andEnginePowerIn(List<String> values) {
            addCriterion("ENGINE_POWER in", values, "enginePower");
            return (Criteria) this;
        }

        public Criteria andEnginePowerNotIn(List<String> values) {
            addCriterion("ENGINE_POWER not in", values, "enginePower");
            return (Criteria) this;
        }

        public Criteria andEnginePowerBetween(String value1, String value2) {
            addCriterion("ENGINE_POWER between", value1, value2, "enginePower");
            return (Criteria) this;
        }

        public Criteria andEnginePowerNotBetween(String value1, String value2) {
            addCriterion("ENGINE_POWER not between", value1, value2, "enginePower");
            return (Criteria) this;
        }

        public Criteria andApproveSeatIsNull() {
            addCriterion("APPROVE_SEAT is null");
            return (Criteria) this;
        }

        public Criteria andApproveSeatIsNotNull() {
            addCriterion("APPROVE_SEAT is not null");
            return (Criteria) this;
        }

        public Criteria andApproveSeatEqualTo(Long value) {
            addCriterion("APPROVE_SEAT =", value, "approveSeat");
            return (Criteria) this;
        }

        public Criteria andApproveSeatNotEqualTo(Long value) {
            addCriterion("APPROVE_SEAT <>", value, "approveSeat");
            return (Criteria) this;
        }

        public Criteria andApproveSeatGreaterThan(Long value) {
            addCriterion("APPROVE_SEAT >", value, "approveSeat");
            return (Criteria) this;
        }

        public Criteria andApproveSeatGreaterThanOrEqualTo(Long value) {
            addCriterion("APPROVE_SEAT >=", value, "approveSeat");
            return (Criteria) this;
        }

        public Criteria andApproveSeatLessThan(Long value) {
            addCriterion("APPROVE_SEAT <", value, "approveSeat");
            return (Criteria) this;
        }

        public Criteria andApproveSeatLessThanOrEqualTo(Long value) {
            addCriterion("APPROVE_SEAT <=", value, "approveSeat");
            return (Criteria) this;
        }

        public Criteria andApproveSeatIn(List<Long> values) {
            addCriterion("APPROVE_SEAT in", values, "approveSeat");
            return (Criteria) this;
        }

        public Criteria andApproveSeatNotIn(List<Long> values) {
            addCriterion("APPROVE_SEAT not in", values, "approveSeat");
            return (Criteria) this;
        }

        public Criteria andApproveSeatBetween(Long value1, Long value2) {
            addCriterion("APPROVE_SEAT between", value1, value2, "approveSeat");
            return (Criteria) this;
        }

        public Criteria andApproveSeatNotBetween(Long value1, Long value2) {
            addCriterion("APPROVE_SEAT not between", value1, value2, "approveSeat");
            return (Criteria) this;
        }

        public Criteria andApproveTonIsNull() {
            addCriterion("APPROVE_TON is null");
            return (Criteria) this;
        }

        public Criteria andApproveTonIsNotNull() {
            addCriterion("APPROVE_TON is not null");
            return (Criteria) this;
        }

        public Criteria andApproveTonEqualTo(BigDecimal value) {
            addCriterion("APPROVE_TON =", value, "approveTon");
            return (Criteria) this;
        }

        public Criteria andApproveTonNotEqualTo(BigDecimal value) {
            addCriterion("APPROVE_TON <>", value, "approveTon");
            return (Criteria) this;
        }

        public Criteria andApproveTonGreaterThan(BigDecimal value) {
            addCriterion("APPROVE_TON >", value, "approveTon");
            return (Criteria) this;
        }

        public Criteria andApproveTonGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("APPROVE_TON >=", value, "approveTon");
            return (Criteria) this;
        }

        public Criteria andApproveTonLessThan(BigDecimal value) {
            addCriterion("APPROVE_TON <", value, "approveTon");
            return (Criteria) this;
        }

        public Criteria andApproveTonLessThanOrEqualTo(BigDecimal value) {
            addCriterion("APPROVE_TON <=", value, "approveTon");
            return (Criteria) this;
        }

        public Criteria andApproveTonIn(List<BigDecimal> values) {
            addCriterion("APPROVE_TON in", values, "approveTon");
            return (Criteria) this;
        }

        public Criteria andApproveTonNotIn(List<BigDecimal> values) {
            addCriterion("APPROVE_TON not in", values, "approveTon");
            return (Criteria) this;
        }

        public Criteria andApproveTonBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPROVE_TON between", value1, value2, "approveTon");
            return (Criteria) this;
        }

        public Criteria andApproveTonNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPROVE_TON not between", value1, value2, "approveTon");
            return (Criteria) this;
        }

        public Criteria andSatellitePlatformNameIsNull() {
            addCriterion("SATELLITE_PLATFORM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSatellitePlatformNameIsNotNull() {
            addCriterion("SATELLITE_PLATFORM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSatellitePlatformNameEqualTo(String value) {
            addCriterion("SATELLITE_PLATFORM_NAME =", value, "satellitePlatformName");
            return (Criteria) this;
        }

        public Criteria andSatellitePlatformNameNotEqualTo(String value) {
            addCriterion("SATELLITE_PLATFORM_NAME <>", value, "satellitePlatformName");
            return (Criteria) this;
        }

        public Criteria andSatellitePlatformNameGreaterThan(String value) {
            addCriterion("SATELLITE_PLATFORM_NAME >", value, "satellitePlatformName");
            return (Criteria) this;
        }

        public Criteria andSatellitePlatformNameGreaterThanOrEqualTo(String value) {
            addCriterion("SATELLITE_PLATFORM_NAME >=", value, "satellitePlatformName");
            return (Criteria) this;
        }

        public Criteria andSatellitePlatformNameLessThan(String value) {
            addCriterion("SATELLITE_PLATFORM_NAME <", value, "satellitePlatformName");
            return (Criteria) this;
        }

        public Criteria andSatellitePlatformNameLessThanOrEqualTo(String value) {
            addCriterion("SATELLITE_PLATFORM_NAME <=", value, "satellitePlatformName");
            return (Criteria) this;
        }

        public Criteria andSatellitePlatformNameLike(String value) {
            addCriterion("SATELLITE_PLATFORM_NAME like", value, "satellitePlatformName");
            return (Criteria) this;
        }

        public Criteria andSatellitePlatformNameNotLike(String value) {
            addCriterion("SATELLITE_PLATFORM_NAME not like", value, "satellitePlatformName");
            return (Criteria) this;
        }

        public Criteria andSatellitePlatformNameIn(List<String> values) {
            addCriterion("SATELLITE_PLATFORM_NAME in", values, "satellitePlatformName");
            return (Criteria) this;
        }

        public Criteria andSatellitePlatformNameNotIn(List<String> values) {
            addCriterion("SATELLITE_PLATFORM_NAME not in", values, "satellitePlatformName");
            return (Criteria) this;
        }

        public Criteria andSatellitePlatformNameBetween(String value1, String value2) {
            addCriterion("SATELLITE_PLATFORM_NAME between", value1, value2, "satellitePlatformName");
            return (Criteria) this;
        }

        public Criteria andSatellitePlatformNameNotBetween(String value1, String value2) {
            addCriterion("SATELLITE_PLATFORM_NAME not between", value1, value2, "satellitePlatformName");
            return (Criteria) this;
        }

        public Criteria andSatellitePlatformCodeIsNull() {
            addCriterion("SATELLITE_PLATFORM_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSatellitePlatformCodeIsNotNull() {
            addCriterion("SATELLITE_PLATFORM_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSatellitePlatformCodeEqualTo(String value) {
            addCriterion("SATELLITE_PLATFORM_CODE =", value, "satellitePlatformCode");
            return (Criteria) this;
        }

        public Criteria andSatellitePlatformCodeNotEqualTo(String value) {
            addCriterion("SATELLITE_PLATFORM_CODE <>", value, "satellitePlatformCode");
            return (Criteria) this;
        }

        public Criteria andSatellitePlatformCodeGreaterThan(String value) {
            addCriterion("SATELLITE_PLATFORM_CODE >", value, "satellitePlatformCode");
            return (Criteria) this;
        }

        public Criteria andSatellitePlatformCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SATELLITE_PLATFORM_CODE >=", value, "satellitePlatformCode");
            return (Criteria) this;
        }

        public Criteria andSatellitePlatformCodeLessThan(String value) {
            addCriterion("SATELLITE_PLATFORM_CODE <", value, "satellitePlatformCode");
            return (Criteria) this;
        }

        public Criteria andSatellitePlatformCodeLessThanOrEqualTo(String value) {
            addCriterion("SATELLITE_PLATFORM_CODE <=", value, "satellitePlatformCode");
            return (Criteria) this;
        }

        public Criteria andSatellitePlatformCodeLike(String value) {
            addCriterion("SATELLITE_PLATFORM_CODE like", value, "satellitePlatformCode");
            return (Criteria) this;
        }

        public Criteria andSatellitePlatformCodeNotLike(String value) {
            addCriterion("SATELLITE_PLATFORM_CODE not like", value, "satellitePlatformCode");
            return (Criteria) this;
        }

        public Criteria andSatellitePlatformCodeIn(List<String> values) {
            addCriterion("SATELLITE_PLATFORM_CODE in", values, "satellitePlatformCode");
            return (Criteria) this;
        }

        public Criteria andSatellitePlatformCodeNotIn(List<String> values) {
            addCriterion("SATELLITE_PLATFORM_CODE not in", values, "satellitePlatformCode");
            return (Criteria) this;
        }

        public Criteria andSatellitePlatformCodeBetween(String value1, String value2) {
            addCriterion("SATELLITE_PLATFORM_CODE between", value1, value2, "satellitePlatformCode");
            return (Criteria) this;
        }

        public Criteria andSatellitePlatformCodeNotBetween(String value1, String value2) {
            addCriterion("SATELLITE_PLATFORM_CODE not between", value1, value2, "satellitePlatformCode");
            return (Criteria) this;
        }

        public Criteria andGpsTerminalModelIsNull() {
            addCriterion("GPS_TERMINAL_MODEL is null");
            return (Criteria) this;
        }

        public Criteria andGpsTerminalModelIsNotNull() {
            addCriterion("GPS_TERMINAL_MODEL is not null");
            return (Criteria) this;
        }

        public Criteria andGpsTerminalModelEqualTo(String value) {
            addCriterion("GPS_TERMINAL_MODEL =", value, "gpsTerminalModel");
            return (Criteria) this;
        }

        public Criteria andGpsTerminalModelNotEqualTo(String value) {
            addCriterion("GPS_TERMINAL_MODEL <>", value, "gpsTerminalModel");
            return (Criteria) this;
        }

        public Criteria andGpsTerminalModelGreaterThan(String value) {
            addCriterion("GPS_TERMINAL_MODEL >", value, "gpsTerminalModel");
            return (Criteria) this;
        }

        public Criteria andGpsTerminalModelGreaterThanOrEqualTo(String value) {
            addCriterion("GPS_TERMINAL_MODEL >=", value, "gpsTerminalModel");
            return (Criteria) this;
        }

        public Criteria andGpsTerminalModelLessThan(String value) {
            addCriterion("GPS_TERMINAL_MODEL <", value, "gpsTerminalModel");
            return (Criteria) this;
        }

        public Criteria andGpsTerminalModelLessThanOrEqualTo(String value) {
            addCriterion("GPS_TERMINAL_MODEL <=", value, "gpsTerminalModel");
            return (Criteria) this;
        }

        public Criteria andGpsTerminalModelLike(String value) {
            addCriterion("GPS_TERMINAL_MODEL like", value, "gpsTerminalModel");
            return (Criteria) this;
        }

        public Criteria andGpsTerminalModelNotLike(String value) {
            addCriterion("GPS_TERMINAL_MODEL not like", value, "gpsTerminalModel");
            return (Criteria) this;
        }

        public Criteria andGpsTerminalModelIn(List<String> values) {
            addCriterion("GPS_TERMINAL_MODEL in", values, "gpsTerminalModel");
            return (Criteria) this;
        }

        public Criteria andGpsTerminalModelNotIn(List<String> values) {
            addCriterion("GPS_TERMINAL_MODEL not in", values, "gpsTerminalModel");
            return (Criteria) this;
        }

        public Criteria andGpsTerminalModelBetween(String value1, String value2) {
            addCriterion("GPS_TERMINAL_MODEL between", value1, value2, "gpsTerminalModel");
            return (Criteria) this;
        }

        public Criteria andGpsTerminalModelNotBetween(String value1, String value2) {
            addCriterion("GPS_TERMINAL_MODEL not between", value1, value2, "gpsTerminalModel");
            return (Criteria) this;
        }

        public Criteria andBusinessStateIsNull() {
            addCriterion("BUSINESS_STATE is null");
            return (Criteria) this;
        }

        public Criteria andBusinessStateIsNotNull() {
            addCriterion("BUSINESS_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessStateEqualTo(String value) {
            addCriterion("BUSINESS_STATE =", value, "businessState");
            return (Criteria) this;
        }

        public Criteria andBusinessStateNotEqualTo(String value) {
            addCriterion("BUSINESS_STATE <>", value, "businessState");
            return (Criteria) this;
        }

        public Criteria andBusinessStateGreaterThan(String value) {
            addCriterion("BUSINESS_STATE >", value, "businessState");
            return (Criteria) this;
        }

        public Criteria andBusinessStateGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_STATE >=", value, "businessState");
            return (Criteria) this;
        }

        public Criteria andBusinessStateLessThan(String value) {
            addCriterion("BUSINESS_STATE <", value, "businessState");
            return (Criteria) this;
        }

        public Criteria andBusinessStateLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_STATE <=", value, "businessState");
            return (Criteria) this;
        }

        public Criteria andBusinessStateLike(String value) {
            addCriterion("BUSINESS_STATE like", value, "businessState");
            return (Criteria) this;
        }

        public Criteria andBusinessStateNotLike(String value) {
            addCriterion("BUSINESS_STATE not like", value, "businessState");
            return (Criteria) this;
        }

        public Criteria andBusinessStateIn(List<String> values) {
            addCriterion("BUSINESS_STATE in", values, "businessState");
            return (Criteria) this;
        }

        public Criteria andBusinessStateNotIn(List<String> values) {
            addCriterion("BUSINESS_STATE not in", values, "businessState");
            return (Criteria) this;
        }

        public Criteria andBusinessStateBetween(String value1, String value2) {
            addCriterion("BUSINESS_STATE between", value1, value2, "businessState");
            return (Criteria) this;
        }

        public Criteria andBusinessStateNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_STATE not between", value1, value2, "businessState");
            return (Criteria) this;
        }

        public Criteria andBusinessStateCodeIsNull() {
            addCriterion("BUSINESS_STATE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBusinessStateCodeIsNotNull() {
            addCriterion("BUSINESS_STATE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessStateCodeEqualTo(String value) {
            addCriterion("BUSINESS_STATE_CODE =", value, "businessStateCode");
            return (Criteria) this;
        }

        public Criteria andBusinessStateCodeNotEqualTo(String value) {
            addCriterion("BUSINESS_STATE_CODE <>", value, "businessStateCode");
            return (Criteria) this;
        }

        public Criteria andBusinessStateCodeGreaterThan(String value) {
            addCriterion("BUSINESS_STATE_CODE >", value, "businessStateCode");
            return (Criteria) this;
        }

        public Criteria andBusinessStateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_STATE_CODE >=", value, "businessStateCode");
            return (Criteria) this;
        }

        public Criteria andBusinessStateCodeLessThan(String value) {
            addCriterion("BUSINESS_STATE_CODE <", value, "businessStateCode");
            return (Criteria) this;
        }

        public Criteria andBusinessStateCodeLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_STATE_CODE <=", value, "businessStateCode");
            return (Criteria) this;
        }

        public Criteria andBusinessStateCodeLike(String value) {
            addCriterion("BUSINESS_STATE_CODE like", value, "businessStateCode");
            return (Criteria) this;
        }

        public Criteria andBusinessStateCodeNotLike(String value) {
            addCriterion("BUSINESS_STATE_CODE not like", value, "businessStateCode");
            return (Criteria) this;
        }

        public Criteria andBusinessStateCodeIn(List<String> values) {
            addCriterion("BUSINESS_STATE_CODE in", values, "businessStateCode");
            return (Criteria) this;
        }

        public Criteria andBusinessStateCodeNotIn(List<String> values) {
            addCriterion("BUSINESS_STATE_CODE not in", values, "businessStateCode");
            return (Criteria) this;
        }

        public Criteria andBusinessStateCodeBetween(String value1, String value2) {
            addCriterion("BUSINESS_STATE_CODE between", value1, value2, "businessStateCode");
            return (Criteria) this;
        }

        public Criteria andBusinessStateCodeNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_STATE_CODE not between", value1, value2, "businessStateCode");
            return (Criteria) this;
        }

        public Criteria andVehiclePicIsNull() {
            addCriterion("VEHICLE_PIC is null");
            return (Criteria) this;
        }

        public Criteria andVehiclePicIsNotNull() {
            addCriterion("VEHICLE_PIC is not null");
            return (Criteria) this;
        }

        public Criteria andVehiclePicEqualTo(String value) {
            addCriterion("VEHICLE_PIC =", value, "vehiclePic");
            return (Criteria) this;
        }

        public Criteria andVehiclePicNotEqualTo(String value) {
            addCriterion("VEHICLE_PIC <>", value, "vehiclePic");
            return (Criteria) this;
        }

        public Criteria andVehiclePicGreaterThan(String value) {
            addCriterion("VEHICLE_PIC >", value, "vehiclePic");
            return (Criteria) this;
        }

        public Criteria andVehiclePicGreaterThanOrEqualTo(String value) {
            addCriterion("VEHICLE_PIC >=", value, "vehiclePic");
            return (Criteria) this;
        }

        public Criteria andVehiclePicLessThan(String value) {
            addCriterion("VEHICLE_PIC <", value, "vehiclePic");
            return (Criteria) this;
        }

        public Criteria andVehiclePicLessThanOrEqualTo(String value) {
            addCriterion("VEHICLE_PIC <=", value, "vehiclePic");
            return (Criteria) this;
        }

        public Criteria andVehiclePicLike(String value) {
            addCriterion("VEHICLE_PIC like", value, "vehiclePic");
            return (Criteria) this;
        }

        public Criteria andVehiclePicNotLike(String value) {
            addCriterion("VEHICLE_PIC not like", value, "vehiclePic");
            return (Criteria) this;
        }

        public Criteria andVehiclePicIn(List<String> values) {
            addCriterion("VEHICLE_PIC in", values, "vehiclePic");
            return (Criteria) this;
        }

        public Criteria andVehiclePicNotIn(List<String> values) {
            addCriterion("VEHICLE_PIC not in", values, "vehiclePic");
            return (Criteria) this;
        }

        public Criteria andVehiclePicBetween(String value1, String value2) {
            addCriterion("VEHICLE_PIC between", value1, value2, "vehiclePic");
            return (Criteria) this;
        }

        public Criteria andVehiclePicNotBetween(String value1, String value2) {
            addCriterion("VEHICLE_PIC not between", value1, value2, "vehiclePic");
            return (Criteria) this;
        }

        public Criteria andVehicleZoneCodeIsNull() {
            addCriterion("VEHICLE_ZONE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andVehicleZoneCodeIsNotNull() {
            addCriterion("VEHICLE_ZONE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleZoneCodeEqualTo(String value) {
            addCriterion("VEHICLE_ZONE_CODE =", value, "vehicleZoneCode");
            return (Criteria) this;
        }

        public Criteria andVehicleZoneCodeNotEqualTo(String value) {
            addCriterion("VEHICLE_ZONE_CODE <>", value, "vehicleZoneCode");
            return (Criteria) this;
        }

        public Criteria andVehicleZoneCodeGreaterThan(String value) {
            addCriterion("VEHICLE_ZONE_CODE >", value, "vehicleZoneCode");
            return (Criteria) this;
        }

        public Criteria andVehicleZoneCodeGreaterThanOrEqualTo(String value) {
            addCriterion("VEHICLE_ZONE_CODE >=", value, "vehicleZoneCode");
            return (Criteria) this;
        }

        public Criteria andVehicleZoneCodeLessThan(String value) {
            addCriterion("VEHICLE_ZONE_CODE <", value, "vehicleZoneCode");
            return (Criteria) this;
        }

        public Criteria andVehicleZoneCodeLessThanOrEqualTo(String value) {
            addCriterion("VEHICLE_ZONE_CODE <=", value, "vehicleZoneCode");
            return (Criteria) this;
        }

        public Criteria andVehicleZoneCodeLike(String value) {
            addCriterion("VEHICLE_ZONE_CODE like", value, "vehicleZoneCode");
            return (Criteria) this;
        }

        public Criteria andVehicleZoneCodeNotLike(String value) {
            addCriterion("VEHICLE_ZONE_CODE not like", value, "vehicleZoneCode");
            return (Criteria) this;
        }

        public Criteria andVehicleZoneCodeIn(List<String> values) {
            addCriterion("VEHICLE_ZONE_CODE in", values, "vehicleZoneCode");
            return (Criteria) this;
        }

        public Criteria andVehicleZoneCodeNotIn(List<String> values) {
            addCriterion("VEHICLE_ZONE_CODE not in", values, "vehicleZoneCode");
            return (Criteria) this;
        }

        public Criteria andVehicleZoneCodeBetween(String value1, String value2) {
            addCriterion("VEHICLE_ZONE_CODE between", value1, value2, "vehicleZoneCode");
            return (Criteria) this;
        }

        public Criteria andVehicleZoneCodeNotBetween(String value1, String value2) {
            addCriterion("VEHICLE_ZONE_CODE not between", value1, value2, "vehicleZoneCode");
            return (Criteria) this;
        }

        public Criteria andYellowLabelCarIsNull() {
            addCriterion("YELLOW_LABEL_CAR is null");
            return (Criteria) this;
        }

        public Criteria andYellowLabelCarIsNotNull() {
            addCriterion("YELLOW_LABEL_CAR is not null");
            return (Criteria) this;
        }

        public Criteria andYellowLabelCarEqualTo(String value) {
            addCriterion("YELLOW_LABEL_CAR =", value, "yellowLabelCar");
            return (Criteria) this;
        }

        public Criteria andYellowLabelCarNotEqualTo(String value) {
            addCriterion("YELLOW_LABEL_CAR <>", value, "yellowLabelCar");
            return (Criteria) this;
        }

        public Criteria andYellowLabelCarGreaterThan(String value) {
            addCriterion("YELLOW_LABEL_CAR >", value, "yellowLabelCar");
            return (Criteria) this;
        }

        public Criteria andYellowLabelCarGreaterThanOrEqualTo(String value) {
            addCriterion("YELLOW_LABEL_CAR >=", value, "yellowLabelCar");
            return (Criteria) this;
        }

        public Criteria andYellowLabelCarLessThan(String value) {
            addCriterion("YELLOW_LABEL_CAR <", value, "yellowLabelCar");
            return (Criteria) this;
        }

        public Criteria andYellowLabelCarLessThanOrEqualTo(String value) {
            addCriterion("YELLOW_LABEL_CAR <=", value, "yellowLabelCar");
            return (Criteria) this;
        }

        public Criteria andYellowLabelCarLike(String value) {
            addCriterion("YELLOW_LABEL_CAR like", value, "yellowLabelCar");
            return (Criteria) this;
        }

        public Criteria andYellowLabelCarNotLike(String value) {
            addCriterion("YELLOW_LABEL_CAR not like", value, "yellowLabelCar");
            return (Criteria) this;
        }

        public Criteria andYellowLabelCarIn(List<String> values) {
            addCriterion("YELLOW_LABEL_CAR in", values, "yellowLabelCar");
            return (Criteria) this;
        }

        public Criteria andYellowLabelCarNotIn(List<String> values) {
            addCriterion("YELLOW_LABEL_CAR not in", values, "yellowLabelCar");
            return (Criteria) this;
        }

        public Criteria andYellowLabelCarBetween(String value1, String value2) {
            addCriterion("YELLOW_LABEL_CAR between", value1, value2, "yellowLabelCar");
            return (Criteria) this;
        }

        public Criteria andYellowLabelCarNotBetween(String value1, String value2) {
            addCriterion("YELLOW_LABEL_CAR not between", value1, value2, "yellowLabelCar");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("UPDATE_DATE =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("UPDATE_DATE <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("UPDATE_DATE >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("UPDATE_DATE <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("UPDATE_DATE in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("UPDATE_DATE not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE not between", value1, value2, "updateDate");
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