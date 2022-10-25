package com.thrive.enums;

import lombok.Getter;


public enum ApiVersion {

    V3_1("v3.1"),
    V3("v3"),
    V4("v4");

    @Getter
    private final String urlSegment;

    ApiVersion(String urlSegment){
        this.urlSegment = urlSegment;
    }
}
