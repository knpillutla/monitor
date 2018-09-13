package com.example.monitor.dto.requests;

import lombok.Data;

@Data
public class OrderShipRequestDTO {
	private Integer locnNbr;
	private String locnBrcd;
	private String itemBrcd;
	private String ilpn;
	private Integer qty;
	private String batchNbr;
	private String orderNbr;
	private String packageNbr;
	private String busUnit;
	private String userId;
}
