/*
 * CuadraAiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package ai.cuadra.api.models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.AdditionalProperties;
import io.apimatic.core.utilities.ConversionHelper;
import java.util.List;
import java.util.Map;

/**
 * This is a model class for PaginatedResponseExListModelEx type.
 */
public class PaginatedResponseExListModelEx {
    private Integer page;
    private Integer size;
    private List<ModelEx> data;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public PaginatedResponseExListModelEx() {
    }

    /**
     * Initialization constructor.
     * @param  page  Integer value for page.
     * @param  size  Integer value for size.
     * @param  data  List of ModelEx value for data.
     */
    public PaginatedResponseExListModelEx(
            Integer page,
            Integer size,
            List<ModelEx> data) {
        this.page = page;
        this.size = size;
        this.data = data;
    }

    /**
     * Getter for Page.
     * @return Returns the Integer
     */
    @JsonGetter("page")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPage() {
        return page;
    }

    /**
     * Setter for Page.
     * @param page Value for Integer
     */
    @JsonSetter("page")
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * Getter for Size.
     * @return Returns the Integer
     */
    @JsonGetter("size")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSize() {
        return size;
    }

    /**
     * Setter for Size.
     * @param size Value for Integer
     */
    @JsonSetter("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * Getter for Data.
     * @return Returns the List of ModelEx
     */
    @JsonGetter("data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ModelEx> getData() {
        return data;
    }

    /**
     * Setter for Data.
     * @param data Value for List of ModelEx
     */
    @JsonSetter("data")
    public void setData(List<ModelEx> data) {
        this.data = data;
    }

    /**
     * Hidden method for the serialization of additional properties.
     * @return The map of additionally set properties.
     */
    @JsonAnyGetter
    private Map<String, Object> getAdditionalProperties() {
        return additionalProperties.getAdditionalProperties();
    }

    /**
     * Hidden method for the de-serialization of additional properties.
     * @param name The name of the additional property.
     * @param value The Object value of the additional property.
     */
    @JsonAnySetter
    private void setAdditionalProperties(String name, Object value) {
        additionalProperties.setAdditionalProperty(name,
                ConversionHelper.convertToSimpleType(value,
                        x -> x),
                true);
    }

    /**
     * Getter for the value of additional properties based on provided property name.
     * @param name The name of the additional property.
     * @return Either the Object property value or null if not exist.
     */
    
    public Object getAdditionalProperty(String name) {
        return additionalProperties.getAdditionalProperty(name);
    }

    /**
     * Converts this PaginatedResponseExListModelEx into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaginatedResponseExListModelEx [" + "page=" + page + ", size=" + size + ", data="
                + data + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link PaginatedResponseExListModelEx.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PaginatedResponseExListModelEx.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .page(getPage())
                .size(getSize())
                .data(getData());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link PaginatedResponseExListModelEx}.
     */
    public static class Builder {
        private Integer page;
        private Integer size;
        private List<ModelEx> data;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for page.
         * @param  page  Integer value for page.
         * @return Builder
         */
        public Builder page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Setter for size.
         * @param  size  Integer value for size.
         * @return Builder
         */
        public Builder size(Integer size) {
            this.size = size;
            return this;
        }

        /**
         * Setter for data.
         * @param  data  List of ModelEx value for data.
         * @return Builder
         */
        public Builder data(List<ModelEx> data) {
            this.data = data;
            return this;
        }

        /**
         * Setter for additional property that are not in model fields.
         * @param name The name of the additional property.
         * @param value The Object value of the additional property.
         * @return Builder.
         */
        public Builder additionalProperty(String name, Object value) {
            this.additionalProperties.setAdditionalProperty(name, value);
            return this;
        }

        /**
         * Builds a new {@link PaginatedResponseExListModelEx} object using the set fields.
         * @return {@link PaginatedResponseExListModelEx}
         */
        public PaginatedResponseExListModelEx build() {
            PaginatedResponseExListModelEx model =
                    new PaginatedResponseExListModelEx(page, size, data);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
