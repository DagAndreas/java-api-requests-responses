package com.booleanuk.api.requests;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Language {
    private String name;

    @JsonCreator
    public Language(@JsonProperty("name") String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
