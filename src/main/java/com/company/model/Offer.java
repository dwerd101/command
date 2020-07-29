package com.company.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Offer  {
    private long id;
    private String bs;
    private String lm;
    private long volume;
    private long price;
}
