/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PolyPro.entity;

import com.PolyPro.helper.DateHelper;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author NguyenTruongChinh
 */
public class NguoiHoc {

	private String MaNH;
	private String hoTen;
	private Date ngaySinh;
	private boolean gioiTinh;
	private String dienThoai;
	private String email;
	private String ghiChu;
	private String maNV;
	private Date ngayDK = DateHelper.now();

	@Override
	public String toString() {
		return this.hoTen;
	}

	@Override
	public int hashCode() {
		return Objects.hash(MaNH);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NguoiHoc other = (NguoiHoc) obj;
		return Objects.equals(MaNH, other.MaNH);
	}

	public String getMaNH() {
		return MaNH;
	}

	public void setMaNH(String MaNH) {
		this.MaNH = MaNH;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public boolean isGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getDienThoai() {
		return dienThoai;
	}

	public void setDienThoai(String dienThoai) {
		this.dienThoai = dienThoai;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public Date getNgayDK() {
		return ngayDK;
	}

	public void setNgayDK(Date ngayDK) {
		this.ngayDK = ngayDK;
	}

}
