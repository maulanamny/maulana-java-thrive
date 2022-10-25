package com.thrive.model;

import com.thrive.enums.ApiAuthenticationType;
import com.thrive.enums.ApiVersion;
import lombok.Getter;


public class EmailModel {

    @Getter
    private final String resource;

    @Getter
    private final String action;

    @Getter
    private final Boolean withoutNamespace;

    @Getter
    private final ApiVersion apiVersion;

    @Getter
    private final ApiAuthenticationType authenticationType;

    public EmailModel(String resource, String action, ApiVersion apiVersion, ApiAuthenticationType authenticationType, Boolean withoutNamespace) {
        this.resource = resource;
        this.action = action;
        this.withoutNamespace = withoutNamespace;
        this.apiVersion = apiVersion;
        this.authenticationType = authenticationType;
    }

    public EmailModel(String resource, String action, ApiVersion apiVersion, ApiAuthenticationType authenticationType) {

        this(resource, action, apiVersion, authenticationType, false);
    }


}
