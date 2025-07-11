/*
 * CuadraAiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package ai.cuadra.api.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.coreinterfaces.http.Context;
import java.util.Map;

/**
 * This is a model class for ErrorResponseException type.
 */
public class ErrorResponseException extends ApiException {
    private static final long serialVersionUID = -4988693302467745927L;
    private String message;
    private Integer status;
    private Map<String, String> fieldErrors;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public ErrorResponseException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Message.
     * A message describing the error
     * @return Returns the String
     */
    @JsonGetter("message")
    public String getMessageField() {
        return this.message;
    }

    /**
     * Setter for Message.
     * A message describing the error
     * @param messageField Value for String
     */
    @JsonSetter("message")
    private void setMessageField(String messageField) {
        this.message = messageField;
    }

    /**
     * Getter for Status.
     * HTTP status code
     * @return Returns the Integer
     */
    @JsonGetter("status")
    public Integer getStatus() {
        return this.status;
    }

    /**
     * Setter for Status.
     * HTTP status code
     * @param status Value for Integer
     */
    @JsonSetter("status")
    private void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * Getter for FieldErrors.
     * Optional: Field-specific validation errors
     * @return Returns the Map of String, String
     */
    @JsonGetter("field_errors")
    public Map<String, String> getFieldErrors() {
        return this.fieldErrors;
    }

    /**
     * Setter for FieldErrors.
     * Optional: Field-specific validation errors
     * @param fieldErrors Value for Map of String, String
     */
    @JsonSetter("field_errors")
    private void setFieldErrors(Map<String, String> fieldErrors) {
        this.fieldErrors = fieldErrors;
    }

    /**
     * Converts this ErrorResponseException into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ErrorResponseException [" + "statusCode=" + getResponseCode() + ", message="
                + getMessage() + ", message=" + message + ", status=" + status + ", fieldErrors="
                + fieldErrors + "]";
    }
}
