package com.ssm.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItemexchangeinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemexchangeinfoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDonorIdIsNull() {
            addCriterion("donor_id is null");
            return (Criteria) this;
        }

        public Criteria andDonorIdIsNotNull() {
            addCriterion("donor_id is not null");
            return (Criteria) this;
        }

        public Criteria andDonorIdEqualTo(Integer value) {
            addCriterion("donor_id =", value, "donorId");
            return (Criteria) this;
        }

        public Criteria andDonorIdNotEqualTo(Integer value) {
            addCriterion("donor_id <>", value, "donorId");
            return (Criteria) this;
        }

        public Criteria andDonorIdGreaterThan(Integer value) {
            addCriterion("donor_id >", value, "donorId");
            return (Criteria) this;
        }

        public Criteria andDonorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("donor_id >=", value, "donorId");
            return (Criteria) this;
        }

        public Criteria andDonorIdLessThan(Integer value) {
            addCriterion("donor_id <", value, "donorId");
            return (Criteria) this;
        }

        public Criteria andDonorIdLessThanOrEqualTo(Integer value) {
            addCriterion("donor_id <=", value, "donorId");
            return (Criteria) this;
        }

        public Criteria andDonorIdIn(List<Integer> values) {
            addCriterion("donor_id in", values, "donorId");
            return (Criteria) this;
        }

        public Criteria andDonorIdNotIn(List<Integer> values) {
            addCriterion("donor_id not in", values, "donorId");
            return (Criteria) this;
        }

        public Criteria andDonorIdBetween(Integer value1, Integer value2) {
            addCriterion("donor_id between", value1, value2, "donorId");
            return (Criteria) this;
        }

        public Criteria andDonorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("donor_id not between", value1, value2, "donorId");
            return (Criteria) this;
        }

        public Criteria andDonorNameIsNull() {
            addCriterion("donor_name is null");
            return (Criteria) this;
        }

        public Criteria andDonorNameIsNotNull() {
            addCriterion("donor_name is not null");
            return (Criteria) this;
        }

        public Criteria andDonorNameEqualTo(String value) {
            addCriterion("donor_name =", value, "donorName");
            return (Criteria) this;
        }

        public Criteria andDonorNameNotEqualTo(String value) {
            addCriterion("donor_name <>", value, "donorName");
            return (Criteria) this;
        }

        public Criteria andDonorNameGreaterThan(String value) {
            addCriterion("donor_name >", value, "donorName");
            return (Criteria) this;
        }

        public Criteria andDonorNameGreaterThanOrEqualTo(String value) {
            addCriterion("donor_name >=", value, "donorName");
            return (Criteria) this;
        }

        public Criteria andDonorNameLessThan(String value) {
            addCriterion("donor_name <", value, "donorName");
            return (Criteria) this;
        }

        public Criteria andDonorNameLessThanOrEqualTo(String value) {
            addCriterion("donor_name <=", value, "donorName");
            return (Criteria) this;
        }

        public Criteria andDonorNameLike(String value) {
            addCriterion("donor_name like", value, "donorName");
            return (Criteria) this;
        }

        public Criteria andDonorNameNotLike(String value) {
            addCriterion("donor_name not like", value, "donorName");
            return (Criteria) this;
        }

        public Criteria andDonorNameIn(List<String> values) {
            addCriterion("donor_name in", values, "donorName");
            return (Criteria) this;
        }

        public Criteria andDonorNameNotIn(List<String> values) {
            addCriterion("donor_name not in", values, "donorName");
            return (Criteria) this;
        }

        public Criteria andDonorNameBetween(String value1, String value2) {
            addCriterion("donor_name between", value1, value2, "donorName");
            return (Criteria) this;
        }

        public Criteria andDonorNameNotBetween(String value1, String value2) {
            addCriterion("donor_name not between", value1, value2, "donorName");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andStreetIsNull() {
            addCriterion("street is null");
            return (Criteria) this;
        }

        public Criteria andStreetIsNotNull() {
            addCriterion("street is not null");
            return (Criteria) this;
        }

        public Criteria andStreetEqualTo(String value) {
            addCriterion("street =", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotEqualTo(String value) {
            addCriterion("street <>", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThan(String value) {
            addCriterion("street >", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThanOrEqualTo(String value) {
            addCriterion("street >=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThan(String value) {
            addCriterion("street <", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThanOrEqualTo(String value) {
            addCriterion("street <=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLike(String value) {
            addCriterion("street like", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotLike(String value) {
            addCriterion("street not like", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetIn(List<String> values) {
            addCriterion("street in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotIn(List<String> values) {
            addCriterion("street not in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetBetween(String value1, String value2) {
            addCriterion("street between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotBetween(String value1, String value2) {
            addCriterion("street not between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andCellNumberIsNull() {
            addCriterion("cell_number is null");
            return (Criteria) this;
        }

        public Criteria andCellNumberIsNotNull() {
            addCriterion("cell_number is not null");
            return (Criteria) this;
        }

        public Criteria andCellNumberEqualTo(String value) {
            addCriterion("cell_number =", value, "cellNumber");
            return (Criteria) this;
        }

        public Criteria andCellNumberNotEqualTo(String value) {
            addCriterion("cell_number <>", value, "cellNumber");
            return (Criteria) this;
        }

        public Criteria andCellNumberGreaterThan(String value) {
            addCriterion("cell_number >", value, "cellNumber");
            return (Criteria) this;
        }

        public Criteria andCellNumberGreaterThanOrEqualTo(String value) {
            addCriterion("cell_number >=", value, "cellNumber");
            return (Criteria) this;
        }

        public Criteria andCellNumberLessThan(String value) {
            addCriterion("cell_number <", value, "cellNumber");
            return (Criteria) this;
        }

        public Criteria andCellNumberLessThanOrEqualTo(String value) {
            addCriterion("cell_number <=", value, "cellNumber");
            return (Criteria) this;
        }

        public Criteria andCellNumberLike(String value) {
            addCriterion("cell_number like", value, "cellNumber");
            return (Criteria) this;
        }

        public Criteria andCellNumberNotLike(String value) {
            addCriterion("cell_number not like", value, "cellNumber");
            return (Criteria) this;
        }

        public Criteria andCellNumberIn(List<String> values) {
            addCriterion("cell_number in", values, "cellNumber");
            return (Criteria) this;
        }

        public Criteria andCellNumberNotIn(List<String> values) {
            addCriterion("cell_number not in", values, "cellNumber");
            return (Criteria) this;
        }

        public Criteria andCellNumberBetween(String value1, String value2) {
            addCriterion("cell_number between", value1, value2, "cellNumber");
            return (Criteria) this;
        }

        public Criteria andCellNumberNotBetween(String value1, String value2) {
            addCriterion("cell_number not between", value1, value2, "cellNumber");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andDonateItemIsNull() {
            addCriterion("donate_item is null");
            return (Criteria) this;
        }

        public Criteria andDonateItemIsNotNull() {
            addCriterion("donate_item is not null");
            return (Criteria) this;
        }

        public Criteria andDonateItemEqualTo(String value) {
            addCriterion("donate_item =", value, "donateItem");
            return (Criteria) this;
        }

        public Criteria andDonateItemNotEqualTo(String value) {
            addCriterion("donate_item <>", value, "donateItem");
            return (Criteria) this;
        }

        public Criteria andDonateItemGreaterThan(String value) {
            addCriterion("donate_item >", value, "donateItem");
            return (Criteria) this;
        }

        public Criteria andDonateItemGreaterThanOrEqualTo(String value) {
            addCriterion("donate_item >=", value, "donateItem");
            return (Criteria) this;
        }

        public Criteria andDonateItemLessThan(String value) {
            addCriterion("donate_item <", value, "donateItem");
            return (Criteria) this;
        }

        public Criteria andDonateItemLessThanOrEqualTo(String value) {
            addCriterion("donate_item <=", value, "donateItem");
            return (Criteria) this;
        }

        public Criteria andDonateItemLike(String value) {
            addCriterion("donate_item like", value, "donateItem");
            return (Criteria) this;
        }

        public Criteria andDonateItemNotLike(String value) {
            addCriterion("donate_item not like", value, "donateItem");
            return (Criteria) this;
        }

        public Criteria andDonateItemIn(List<String> values) {
            addCriterion("donate_item in", values, "donateItem");
            return (Criteria) this;
        }

        public Criteria andDonateItemNotIn(List<String> values) {
            addCriterion("donate_item not in", values, "donateItem");
            return (Criteria) this;
        }

        public Criteria andDonateItemBetween(String value1, String value2) {
            addCriterion("donate_item between", value1, value2, "donateItem");
            return (Criteria) this;
        }

        public Criteria andDonateItemNotBetween(String value1, String value2) {
            addCriterion("donate_item not between", value1, value2, "donateItem");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andAddressPathIsNull() {
            addCriterion("address_path is null");
            return (Criteria) this;
        }

        public Criteria andAddressPathIsNotNull() {
            addCriterion("address_path is not null");
            return (Criteria) this;
        }

        public Criteria andAddressPathEqualTo(String value) {
            addCriterion("address_path =", value, "addressPath");
            return (Criteria) this;
        }

        public Criteria andAddressPathNotEqualTo(String value) {
            addCriterion("address_path <>", value, "addressPath");
            return (Criteria) this;
        }

        public Criteria andAddressPathGreaterThan(String value) {
            addCriterion("address_path >", value, "addressPath");
            return (Criteria) this;
        }

        public Criteria andAddressPathGreaterThanOrEqualTo(String value) {
            addCriterion("address_path >=", value, "addressPath");
            return (Criteria) this;
        }

        public Criteria andAddressPathLessThan(String value) {
            addCriterion("address_path <", value, "addressPath");
            return (Criteria) this;
        }

        public Criteria andAddressPathLessThanOrEqualTo(String value) {
            addCriterion("address_path <=", value, "addressPath");
            return (Criteria) this;
        }

        public Criteria andAddressPathLike(String value) {
            addCriterion("address_path like", value, "addressPath");
            return (Criteria) this;
        }

        public Criteria andAddressPathNotLike(String value) {
            addCriterion("address_path not like", value, "addressPath");
            return (Criteria) this;
        }

        public Criteria andAddressPathIn(List<String> values) {
            addCriterion("address_path in", values, "addressPath");
            return (Criteria) this;
        }

        public Criteria andAddressPathNotIn(List<String> values) {
            addCriterion("address_path not in", values, "addressPath");
            return (Criteria) this;
        }

        public Criteria andAddressPathBetween(String value1, String value2) {
            addCriterion("address_path between", value1, value2, "addressPath");
            return (Criteria) this;
        }

        public Criteria andAddressPathNotBetween(String value1, String value2) {
            addCriterion("address_path not between", value1, value2, "addressPath");
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