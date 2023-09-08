package com.shaan.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CryptoResponse {
	public Time time;
	public BPI bpi;
	public String chartName;
	public String disclaimer;
}
