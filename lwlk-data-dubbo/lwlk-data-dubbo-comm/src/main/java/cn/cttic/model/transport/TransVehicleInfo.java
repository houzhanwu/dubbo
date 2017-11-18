package cn.cttic.model.transport;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
/**
 * 运政车辆信息表
 * @author wy
 *
 */
public class TransVehicleInfo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	//省份行政区划代码
    private Integer provinceCode;
    //省级系统营运车辆ID
    private String mcuId;
    //车辆（挂车）号牌
    private String vehicleNo;
    //车牌颜色
    private String plateColor;
    //车牌颜色代码
    private String plateColorCode;
    //道路运输证字
    private String transCertificateWord;
    //道路运输证号
    private String transCertificateCode;
    //经营范围
    private String businessScopeCode;
    //经营范围文字
    private String businessScopeDesc;
    //发证机构
    private String transCertificateGrantOrgan;
    //有效期起
    private Date certificateBeginDate;
    //有效期止
    private Date certificateExpireDate;
    //证照介质类型
    private String certificateType;
    //省级系统经营业户ID
    private String ownerId;
    //车辆厂牌
    private String brand;
    //车辆厂牌型号
    private String model;
    //发动机号
    private String engineNo;
    //车辆识别VIN码
    private String vin;
    //车辆类型
    private String vehicleType;
    //车辆类型代码
    private String vehicleTypeCode;
    //客车类型与等级
    private String busType;
    //出厂日期
    private Date outFactoryDate;
    //车辆燃料类型代码
    private String fuelType;
    //车辆轴距
    private Long wheelBase;
    //车辆车长
    private Long vehicleLength;
    //车辆车宽
    private Long vehicleWidth;
    //车辆车高
    private Long vehicleHigh;
    //车辆车轴数
    private Long axlesAmount;
    //车辆准牵引总质量
    private Long tractionTonnage;
    //车辆发动机功率
    private String enginePower;
    //---车辆核定载客位
    private Long approveSeat;
    //---车辆（挂车）吨位
    private BigDecimal approveTon;
    //车辆接入卫星定位平台名称
    private String satellitePlatformName;
    //车辆接入卫星定位平台代码
    private String satellitePlatformCode;
    //车辆卫星定位终端型号
    private String gpsTerminalModel;
    //车辆状况
    private String businessState;
    //车辆状况代码
    private String businessStateCode;
    //车辆照片名称
    private String vehiclePic;
    //车籍地行政区域代码
    private String vehicleZoneCode;
    //是否黄标车
    private String yellowLabelCar;
    //创建时间
    private Date createDate;
    //更新时间
    private Date updateDate;

    public Integer getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(Integer provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getMcuId() {
        return mcuId;
    }

    public void setMcuId(String mcuId) {
        this.mcuId = mcuId;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getPlateColor() {
        return plateColor;
    }

    public void setPlateColor(String plateColor) {
        this.plateColor = plateColor;
    }

    public String getPlateColorCode() {
        return plateColorCode;
    }

    public void setPlateColorCode(String plateColorCode) {
        this.plateColorCode = plateColorCode;
    }

    public String getTransCertificateWord() {
        return transCertificateWord;
    }

    public void setTransCertificateWord(String transCertificateWord) {
        this.transCertificateWord = transCertificateWord;
    }

    public String getTransCertificateCode() {
        return transCertificateCode;
    }

    public void setTransCertificateCode(String transCertificateCode) {
        this.transCertificateCode = transCertificateCode;
    }

    public String getBusinessScopeCode() {
        return businessScopeCode;
    }

    public void setBusinessScopeCode(String businessScopeCode) {
        this.businessScopeCode = businessScopeCode;
    }

    public String getBusinessScopeDesc() {
        return businessScopeDesc;
    }

    public void setBusinessScopeDesc(String businessScopeDesc) {
        this.businessScopeDesc = businessScopeDesc;
    }

    public String getTransCertificateGrantOrgan() {
        return transCertificateGrantOrgan;
    }

    public void setTransCertificateGrantOrgan(String transCertificateGrantOrgan) {
        this.transCertificateGrantOrgan = transCertificateGrantOrgan;
    }

    public Date getCertificateBeginDate() {
        return certificateBeginDate;
    }

    public void setCertificateBeginDate(Date certificateBeginDate) {
        this.certificateBeginDate = certificateBeginDate;
    }

    public Date getCertificateExpireDate() {
        return certificateExpireDate;
    }

    public void setCertificateExpireDate(Date certificateExpireDate) {
        this.certificateExpireDate = certificateExpireDate;
    }

    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleTypeCode() {
        return vehicleTypeCode;
    }

    public void setVehicleTypeCode(String vehicleTypeCode) {
        this.vehicleTypeCode = vehicleTypeCode;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public Date getOutFactoryDate() {
        return outFactoryDate;
    }

    public void setOutFactoryDate(Date outFactoryDate) {
        this.outFactoryDate = outFactoryDate;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public Long getWheelBase() {
        return wheelBase;
    }

    public void setWheelBase(Long wheelBase) {
        this.wheelBase = wheelBase;
    }

    public Long getVehicleLength() {
        return vehicleLength;
    }

    public void setVehicleLength(Long vehicleLength) {
        this.vehicleLength = vehicleLength;
    }

    public Long getVehicleWidth() {
        return vehicleWidth;
    }

    public void setVehicleWidth(Long vehicleWidth) {
        this.vehicleWidth = vehicleWidth;
    }

    public Long getVehicleHigh() {
        return vehicleHigh;
    }

    public void setVehicleHigh(Long vehicleHigh) {
        this.vehicleHigh = vehicleHigh;
    }

    public Long getAxlesAmount() {
        return axlesAmount;
    }

    public void setAxlesAmount(Long axlesAmount) {
        this.axlesAmount = axlesAmount;
    }

    public Long getTractionTonnage() {
        return tractionTonnage;
    }

    public void setTractionTonnage(Long tractionTonnage) {
        this.tractionTonnage = tractionTonnage;
    }

    public String getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(String enginePower) {
        this.enginePower = enginePower;
    }

    public Long getApproveSeat() {
        return approveSeat;
    }

    public void setApproveSeat(Long approveSeat) {
        this.approveSeat = approveSeat;
    }

    public BigDecimal getApproveTon() {
        return approveTon;
    }

    public void setApproveTon(BigDecimal approveTon) {
        this.approveTon = approveTon;
    }

    public String getSatellitePlatformName() {
        return satellitePlatformName;
    }

    public void setSatellitePlatformName(String satellitePlatformName) {
        this.satellitePlatformName = satellitePlatformName;
    }

    public String getSatellitePlatformCode() {
        return satellitePlatformCode;
    }

    public void setSatellitePlatformCode(String satellitePlatformCode) {
        this.satellitePlatformCode = satellitePlatformCode;
    }

    public String getGpsTerminalModel() {
        return gpsTerminalModel;
    }

    public void setGpsTerminalModel(String gpsTerminalModel) {
        this.gpsTerminalModel = gpsTerminalModel;
    }

    public String getBusinessState() {
        return businessState;
    }

    public void setBusinessState(String businessState) {
        this.businessState = businessState;
    }

    public String getBusinessStateCode() {
        return businessStateCode;
    }

    public void setBusinessStateCode(String businessStateCode) {
        this.businessStateCode = businessStateCode;
    }

    public String getVehiclePic() {
        return vehiclePic;
    }

    public void setVehiclePic(String vehiclePic) {
        this.vehiclePic = vehiclePic;
    }

    public String getVehicleZoneCode() {
        return vehicleZoneCode;
    }

    public void setVehicleZoneCode(String vehicleZoneCode) {
        this.vehicleZoneCode = vehicleZoneCode;
    }

    public String getYellowLabelCar() {
        return yellowLabelCar;
    }

    public void setYellowLabelCar(String yellowLabelCar) {
        this.yellowLabelCar = yellowLabelCar;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}