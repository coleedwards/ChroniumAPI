package com.mizuledevelopment.chronium.api;

import lombok.Getter;

import java.util.UUID;

public class ChroniumAPI {

    @Getter public static ChroniumAPI apiInstance;

    public String getRankName(UUID uuid) {
        throw new UnsupportedOperationException("Invalid API version");
    }

    public String getRankColor(UUID uuid) {
        throw new UnsupportedOperationException("Invalid API version");
    }

    public String getPrefix(UUID uuid) {
        throw new UnsupportedOperationException("Invalid API version");
    }

    public String getSuffix(UUID uuid) {
        throw new UnsupportedOperationException("Invalid API version");
    }

    public int getWeight(UUID uuid) {
        throw new UnsupportedOperationException("Invalid API version");
    }
}
