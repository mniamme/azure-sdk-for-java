// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The configuration settings of the Azure Active Directory login flow.
 */
@Fluent
public final class AzureActiveDirectoryLogin implements JsonSerializable<AzureActiveDirectoryLogin> {
    /*
     * Login parameters to send to the OpenID Connect authorization endpoint when
     * a user logs in. Each parameter must be in the form "key=value".
     */
    private List<String> loginParameters;

    /*
     * <code>true</code> if the www-authenticate provider should be omitted from the request; otherwise,
     * <code>false</code>.
     */
    private Boolean disableWwwAuthenticate;

    /**
     * Creates an instance of AzureActiveDirectoryLogin class.
     */
    public AzureActiveDirectoryLogin() {
    }

    /**
     * Get the loginParameters property: Login parameters to send to the OpenID Connect authorization endpoint when
     * a user logs in. Each parameter must be in the form "key=value".
     * 
     * @return the loginParameters value.
     */
    public List<String> loginParameters() {
        return this.loginParameters;
    }

    /**
     * Set the loginParameters property: Login parameters to send to the OpenID Connect authorization endpoint when
     * a user logs in. Each parameter must be in the form "key=value".
     * 
     * @param loginParameters the loginParameters value to set.
     * @return the AzureActiveDirectoryLogin object itself.
     */
    public AzureActiveDirectoryLogin withLoginParameters(List<String> loginParameters) {
        this.loginParameters = loginParameters;
        return this;
    }

    /**
     * Get the disableWwwAuthenticate property: &lt;code&gt;true&lt;/code&gt; if the www-authenticate provider should be
     * omitted from the request; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the disableWwwAuthenticate value.
     */
    public Boolean disableWwwAuthenticate() {
        return this.disableWwwAuthenticate;
    }

    /**
     * Set the disableWwwAuthenticate property: &lt;code&gt;true&lt;/code&gt; if the www-authenticate provider should be
     * omitted from the request; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @param disableWwwAuthenticate the disableWwwAuthenticate value to set.
     * @return the AzureActiveDirectoryLogin object itself.
     */
    public AzureActiveDirectoryLogin withDisableWwwAuthenticate(Boolean disableWwwAuthenticate) {
        this.disableWwwAuthenticate = disableWwwAuthenticate;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("loginParameters", this.loginParameters,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeBooleanField("disableWWWAuthenticate", this.disableWwwAuthenticate);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureActiveDirectoryLogin from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureActiveDirectoryLogin if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AzureActiveDirectoryLogin.
     */
    public static AzureActiveDirectoryLogin fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureActiveDirectoryLogin deserializedAzureActiveDirectoryLogin = new AzureActiveDirectoryLogin();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("loginParameters".equals(fieldName)) {
                    List<String> loginParameters = reader.readArray(reader1 -> reader1.getString());
                    deserializedAzureActiveDirectoryLogin.loginParameters = loginParameters;
                } else if ("disableWWWAuthenticate".equals(fieldName)) {
                    deserializedAzureActiveDirectoryLogin.disableWwwAuthenticate
                        = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureActiveDirectoryLogin;
        });
    }
}
