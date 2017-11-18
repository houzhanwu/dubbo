package cn.cttic.model.dynamic;

import java.io.Serializable;

public class Position implements Serializable {
	
	private static final long serialVersionUID = 1L;
	//VehicleNo
	private String vehicleno = "";
	// PlateColor
	private int platecolor = 0;
	// PositionTime
	private long positiontime = 0l;
	// AccessCode
	private int accesscode = 0;
	// City
	private int city = 0;
	// CurAccessCode
	private int curaccesscode = 0;
	// Trans
	private int trans = 0;
	// UpdateTime
	private long updatetime = 0l;
	// Encrypt
	private int encrypt = 0;
	// Lon
	private double lon = 0;
	// Lat
	private double lat = 0;
	// Vec1
	private int vec1 = 0;
	// Vec2
	private int vec2 = 0;
	// Vec3
	private int vec3 = 0;
	// Direction
	private int direction = 0;
	// Altitude
	private int altitude = 0;
	// State
	private int state = 0;
	// Alarm
	private int alarm = 0;
	// Reserved
	private String reserved = "";
	
	public String getVehicleno() {
		return vehicleno;
	}
	public void setVehicleno(String vehicleno) {
		this.vehicleno = vehicleno;
	}
	public int getPlatecolor() {
		return platecolor;
	}
	public void setPlatecolor(int platecolor) {
		this.platecolor = platecolor;
	}
	public long getPositiontime() {
		return positiontime;
	}
	public void setPositiontime(long positiontime) {
		this.positiontime = positiontime;
	}
	public int getAccesscode() {
		return accesscode;
	}
	public void setAccesscode(int accesscode) {
		this.accesscode = accesscode;
	}
	public int getCity() {
		return city;
	}
	public void setCity(int city) {
		this.city = city;
	}
	public int getCuraccesscode() {
		return curaccesscode;
	}
	public void setCuraccesscode(int curaccesscode) {
		this.curaccesscode = curaccesscode;
	}
	public int getTrans() {
		return trans;
	}
	public void setTrans(int trans) {
		this.trans = trans;
	}
	public long getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(long updatetime) {
		this.updatetime = updatetime;
	}
	public int getEncrypt() {
		return encrypt;
	}
	public void setEncrypt(int encrypt) {
		this.encrypt = encrypt;
	}
	
	public double getLon() {
		return lon;
	}
	public void setLon(double lon) {
		this.lon = lon;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public int getVec1() {
		return vec1;
	}
	public void setVec1(int vec1) {
		this.vec1 = vec1;
	}
	public int getVec2() {
		return vec2;
	}
	public void setVec2(int vec2) {
		this.vec2 = vec2;
	}
	public int getVec3() {
		return vec3;
	}
	public void setVec3(int vec3) {
		this.vec3 = vec3;
	}
	public int getDirection() {
		return direction;
	}
	public void setDirection(int direction) {
		this.direction = direction;
	}
	public int getAltitude() {
		return altitude;
	}
	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getAlarm() {
		return alarm;
	}
	public void setAlarm(int alarm) {
		this.alarm = alarm;
	}
	public String getReserved() {
		return reserved;
	}
	public void setReserved(String reserved) {
		this.reserved = reserved;
	}
	public Position() {
		super();
	}
	
}
