package com.PolyPro.entity;

import static org.testng.Assert.assertEquals;

import java.util.Date;

import org.testng.annotations.Test;

import com.PolyPro.helper.DateHelper;

public class NguoiHocTest {

	@Test
	public void getDienThoaiTest() {
		System.out.println("getDienThoai");
		NguoiHoc nh = new NguoiHoc();
		String sdt = "0902993991";

		nh.setDienThoai(sdt);

		String result = nh.getDienThoai();
		String expected = sdt;
		assertEquals(result, expected);
	}

	@Test
	public void setDienThoaiTest() {
		System.out.println("setDienThoai");
		NguoiHoc nh = new NguoiHoc();
		String sdt = "0902993992";

		nh.setDienThoai(sdt);

		String result = nh.getDienThoai();
		String expected = sdt;
		assertEquals(result, expected);
	}

	@Test
	public void getEmailTest() {
		System.out.println("getEmail");
		NguoiHoc nh = new NguoiHoc();
		String email = "tester@gmail.com";
		
		nh.setEmail(email);

		String result = nh.getEmail();
		String expected = email;
		assertEquals(result, expected);
	}

	@Test
	public void setEmailTest() {
		System.out.println("setEmail");
		NguoiHoc nh = new NguoiHoc();
		String email = "tester2@gmail.com";
		
		nh.setEmail(email);

		String result = nh.getEmail();
		String expected = email;
		assertEquals(result, expected);
	}

	@Test
	public void getGhiChuTest() {
		System.out.println("getGhiChu");
		NguoiHoc nh = new NguoiHoc();
		String ghichu = "Tester tương lai";
		
		nh.setGhiChu(ghichu);

		String result = nh.getGhiChu();
		String expected = ghichu;
		assertEquals(result, expected);
	}

	@Test
	public void setGhiChuTest() {
		System.out.println("setGhiChu");
		NguoiHoc nh = new NguoiHoc();
		String ghichu = "Tester tương lai nè";
		
		nh.setGhiChu(ghichu);

		String result = nh.getGhiChu();
		String expected = ghichu;
		assertEquals(result, expected);
	}

	@Test
	public void getHoTenTest() {
		System.out.println("getHoTen");
		NguoiHoc nh = new NguoiHoc();
		String hoTen = "Trần Văn Tester";
		
		nh.setHoTen(hoTen);

		String result = nh.getHoTen();
		String expected = hoTen;
		assertEquals(result, expected);
	}

	@Test
	public void setHoTenTest() {
		System.out.println("getHoTen");
		NguoiHoc nh = new NguoiHoc();
		String hoTen = "Trần Thị Tester";
		
		nh.setHoTen(hoTen);

		String result = nh.getHoTen();
		String expected = hoTen;
		assertEquals(result, expected);
	}

	@Test
	public void getMaNHTest() {
		System.out.println("getMaNH");
		NguoiHoc nh = new NguoiHoc();
		String maNH = "PS15069";
		
		nh.setMaNH(maNH);

		String result = nh.getMaNH();
		String expected = maNH;
		assertEquals(result, expected);
	}

	@Test
	public void setMaNHTest() {
		System.out.println("setMaNH");
		NguoiHoc nh = new NguoiHoc();
		String maNH = "PS15068";
		
		nh.setMaNH(maNH);

		String result = nh.getMaNH();
		String expected = maNH;
		assertEquals(result, expected);
	}

	@Test
	public void getMaNVTest() {
		System.out.println("getMaNV");
		NguoiHoc nh = new NguoiHoc();
		String maNV = "taint";
		
		nh.setMaNV(maNV);

		String result = nh.getMaNV();
		String expected = maNV;
		assertEquals(result, expected);
	}

	@Test
	public void setMaNVTest() {
		System.out.println("setMaNV");
		NguoiHoc nh = new NguoiHoc();
		String maNV = "chinh";
		
		nh.setMaNV(maNV);

		String result = nh.getMaNV();
		String expected = maNV;
		assertEquals(result, expected);
	}

	@Test
	public void getNgaySinhTest() {
		System.out.println("getNgaySinh");
		NguoiHoc nh = new NguoiHoc();
		String ngaySinh = "28/07/1999";
		
		nh.setNgaySinh(DateHelper.toDate(ngaySinh));

		Date result = nh.getNgaySinh();
		Date expected = DateHelper.toDate(ngaySinh);
		assertEquals(result, expected);
	}

	@Test
	public void setNgaySinhTest() {
		System.out.println("setNgaySinh");
		NguoiHoc nh = new NguoiHoc();
		String ngaySinh = "23/10/2003";
		
		nh.setNgaySinh(DateHelper.toDate(ngaySinh));

		Date result = nh.getNgaySinh();
		Date expected = DateHelper.toDate(ngaySinh);
		assertEquals(result, expected);
	}

	@Test
	public void isGioiTinhTest() {
		System.out.println("isGioiTinh");
		NguoiHoc nh = new NguoiHoc();
		Boolean gioiTinh = true;
		
		nh.setGioiTinh(gioiTinh);

		Boolean result = nh.isGioiTinh();
		Boolean expected = gioiTinh;
		assertEquals(result, expected);
	}

	@Test
	public void setGioiTinhTest() {
		System.out.println("isGioiTinh");
		NguoiHoc nh = new NguoiHoc();
		Boolean gioiTinh = false;
		
		nh.setGioiTinh(gioiTinh);

		Boolean result = nh.isGioiTinh();
		Boolean expected = gioiTinh;
		assertEquals(result, expected);		
	}

	@Test
	public void toStringTest() {
		System.out.println("toString");
		String hoTen = "Nguyễn Trường Chin";
		NguoiHoc nh = new NguoiHoc();
		nh.setHoTen(hoTen);
		assertEquals(hoTen, nh.toString());
	}

}
