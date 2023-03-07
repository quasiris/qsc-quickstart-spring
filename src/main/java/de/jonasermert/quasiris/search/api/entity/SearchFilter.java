package de.jonasermert.quasiris.search.api.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SearchFilter {
    private String filterType;
    private String id;
    private String name;
    private boolean filterBorder;
    private String sortby;

    // private boolean sortOrder;
    private String sortOrder = "asc";
    private List <String> tags;
    private List<String> values;

    private Object minValue;
    private Object maxValue;
    public void addValue(String value) {
        if(getValues() == null) {
            this.values = new ArrayList<>();
        }
        getValues().add(value);
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFilterBorder() {
        return filterBorder;
    }

    public void setFilterBorder(boolean filterBorder) {
        this.filterBorder = filterBorder;
    }

    public String getSortby() {
        return sortby;
    }

    public void setSortby(String sortby) {
        this.sortby = sortby;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    public Object getMinValue() {
        return minValue;
    }

    public void setMinValue(Object minValue) {
        this.minValue = minValue;
    }

    public Object getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Object maxValue) {
        this.maxValue = maxValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchFilter that = (SearchFilter) o;
        return filterBorder == that.filterBorder && Objects.equals(filterType, that.filterType) && Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(sortby, that.sortby) && Objects.equals(sortOrder, that.sortOrder) && Objects.equals(tags, that.tags) && Objects.equals(values, that.values) && Objects.equals(minValue, that.minValue) && Objects.equals(maxValue, that.maxValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filterType, id, name, filterBorder, sortby, sortOrder, tags, values, minValue, maxValue);
    }

    @Override
    public String toString() {
        return "SearchFilter{" +
                "filterType='" + filterType + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", filterBorder=" + filterBorder +
                ", sortby='" + sortby + '\'' +
                ", sortOrder='" + sortOrder + '\'' +
                ", tags=" + tags +
                ", values=" + values +
                ", minValue=" + minValue +
                ", maxValue=" + maxValue +
                '}';
    }


}
