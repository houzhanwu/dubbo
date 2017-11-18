package cn.cttic.model.transport;

import java.io.Serializable;
import java.math.BigDecimal;

public class TransVehicleResult implements Serializable{
	
	private static final long serialVersionUID = 1L;
	//省份行政区划代码
    private Integer provinceCode;
    //车籍地行政区域代码
    private String vehicleZoneCode;
    //客车求其座位数（按照地区到地市（钻取到地市））
    private Long sumApproveSeat;
    //货车求其吨位数（按照地区到地市（钻取到地市））
    private BigDecimal sumApproveTon;
	public Integer getProvinceCode() {
		return provinceCode;
	}
	public void setProvinceCode(Integer provinceCode) {
		this.provinceCode = provinceCode;
	}
	public String getVehicleZoneCode() {
		return vehicleZoneCode;
	}
	public void setVehicleZoneCode(String vehicleZoneCode) {
		this.vehicleZoneCode = vehicleZoneCode;
	}
	public Long getSumApproveSeat() {
		return sumApproveSeat;
	}
	public void setSumApproveSeat(Long sumApproveSeat) {
		this.sumApproveSeat = sumApproveSeat;
	}
	public BigDecimal getSumApproveTon() {
		return sumApproveTon;
	}
	public void setSumApproveTon(BigDecimal sumApproveTon) {
		this.sumApproveTon = sumApproveTon;
	}
    
    
}
