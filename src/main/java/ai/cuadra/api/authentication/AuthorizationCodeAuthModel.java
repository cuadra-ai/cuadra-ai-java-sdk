/*
 * CuadraAiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package ai.cuadra.api.authentication;

import ai.cuadra.api.models.OauthToken;

/**
 * A data class for OAuth 2 Authorization Code Grant credentials.
 */
public class AuthorizationCodeAuthModel {
    private String oauthClientId;
    private String oauthClientSecret;
    private String oauthRedirectUri;
    private OauthToken oauthToken;

    /**
     * A Constructor for AuthorizationCodeAuthModel.
     */
    private AuthorizationCodeAuthModel(String oauthClientId, String oauthClientSecret,
            String oauthRedirectUri, OauthToken oauthToken) {
        this.oauthClientId = oauthClientId;
        this.oauthClientSecret = oauthClientSecret;
        this.oauthRedirectUri = oauthRedirectUri;
        this.oauthToken = oauthToken;
    }

    /**
     * Getter for oauthClientId.
     * @return oauthClientId The value of OAuthClientId.
     */
    public String getOauthClientId() {
        return this.oauthClientId;
    }

    /**
     * Getter for oauthClientSecret.
     * @return oauthClientSecret The value of OAuthClientSecret.
     */
    public String getOauthClientSecret() {
        return this.oauthClientSecret;
    }

    /**
     * Getter for oauthRedirectUri.
     * @return oauthRedirectUri The value of OAuthRedirectUri.
     */
    public String getOauthRedirectUri() {
        return this.oauthRedirectUri;
    }

    /**
     * Getter for oauthToken.
     * @return oauthToken The value of OAuthToken.
     */
    public OauthToken getOauthToken() {
        return this.oauthToken;
    }

    /**
     * Builds a new {@link AuthorizationCodeAuthModel.Builder} object.
     * Creates the instance with the state of the current auth model.
     * @return a new {@link AuthorizationCodeAuthModel.Builder} object.
     */
    public Builder toBuilder() {
        return new Builder(getOauthClientId(), getOauthClientSecret(), getOauthRedirectUri())
            .oauthToken(getOauthToken());
    }

    /**
     * A Builder class for OAuth 2 Authorization Code Grant credentials.
     */
    public static class Builder {
        private String oauthClientId;
        private String oauthClientSecret;
        private String oauthRedirectUri;
        private OauthToken oauthToken;

        /**
         * The constructor with required auth credentials.
         * @param oauthClientId The value of OauthClientId.
         * @param oauthClientSecret The value of OauthClientSecret.
         * @param oauthRedirectUri The value of OauthRedirectUri.
         */
        public Builder(String oauthClientId, String oauthClientSecret, String oauthRedirectUri) {
            if (oauthClientId == null) {
                throw new NullPointerException("OauthClientId cannot be null.");
            }

            if (oauthClientSecret == null) {
                throw new NullPointerException("OauthClientSecret cannot be null.");
            }

            if (oauthRedirectUri == null) {
                throw new NullPointerException("OauthRedirectUri cannot be null.");
            }

            this.oauthClientId = oauthClientId;
            this.oauthClientSecret = oauthClientSecret;
            this.oauthRedirectUri = oauthRedirectUri;
        }

        /**
         * Setter for oauthClientId.
         * @param oauthClientId The value of OAuthClientId.
         * @return Builder The current instance of Builder.
         */
        public Builder oauthClientId(String oauthClientId) {
            if (oauthClientId == null) {
                throw new NullPointerException("OauthClientId cannot be null.");
            }

            this.oauthClientId = oauthClientId;
            return this;
        }

        /**
         * Setter for oauthClientSecret.
         * @param oauthClientSecret The value of OAuthClientSecret.
         * @return Builder The current instance of Builder.
         */
        public Builder oauthClientSecret(String oauthClientSecret) {
            if (oauthClientSecret == null) {
                throw new NullPointerException("OauthClientSecret cannot be null.");
            }

            this.oauthClientSecret = oauthClientSecret;
            return this;
        }

        /**
         * Setter for oauthRedirectUri.
         * @param oauthRedirectUri The value of OAuthRedirectUri.
         * @return Builder The current instance of Builder.
         */
        public Builder oauthRedirectUri(String oauthRedirectUri) {
            if (oauthRedirectUri == null) {
                throw new NullPointerException("OauthRedirectUri cannot be null.");
            }

            this.oauthRedirectUri = oauthRedirectUri;
            return this;
        }

        /**
         * Setter for oauthToken.
         * @param oauthToken The value of OAuthToken.
         * @return Builder The current instance of Builder.
         */
        public Builder oauthToken(OauthToken oauthToken) {
            this.oauthToken = oauthToken;
            return this;
        }

        /**
         * Builds the instance of AuthorizationCodeAuthModel using the provided credentials.
         * @return The instance of AuthorizationCodeAuthModel.
         */
        public AuthorizationCodeAuthModel build() {
            return new AuthorizationCodeAuthModel(oauthClientId, oauthClientSecret,
                    oauthRedirectUri, oauthToken);
        }
    }
}