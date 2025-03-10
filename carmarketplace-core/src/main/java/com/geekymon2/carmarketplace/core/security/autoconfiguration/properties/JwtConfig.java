package com.homeaidepi.carmarketplace.core.security.autoconfiguration.properties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JwtConfig {
    private Boolean jwtDisabled;
    private String jwtSecret;
    private long jwtValidity;
}
