package com.mophuk.simple_controller;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SimpleRequest {

    private String value;
}
