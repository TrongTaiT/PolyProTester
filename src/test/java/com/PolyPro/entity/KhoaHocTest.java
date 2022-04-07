package com.PolyPro.entity;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class KhoaHocTest {

	KhoaHoc kh;

	@BeforeClass
	public void beforeClass() {
	}

	@AfterClass
	public void afterClass() {
	}

	@Test
	public void getMaKHTest() {
		System.out.println("getMaKH");
		kh = new KhoaHoc();
		int expected = 1;
		kh.setMaKH(1);
		int result = kh.getMaKH();
		assertEquals(expected, result);
	}

	@Test
	public void setMaKHTest() {
		System.out.println("setMaKH");
		int maKH = 1;
		kh = new KhoaHoc();
		kh.setMaKH(maKH);
		assertTrue(kh.getMaKH() == maKH);
	}

	@Test
	public void getMaCDTest() {
		System.out.println("getMaCD");
		kh = new KhoaHoc();
		String expected = "JAV01";
		kh.setMaCD("JAV01");
		String result = kh.getMaCD();
		assertEquals(expected, result);
	}

	@Test
	public void setMaCDTest() {
		System.out.println("setMaCD");
		String maCD = "JAV01";
		kh = new KhoaHoc();
		kh.setMaCD(maCD);
		assertEquals(kh.getMaCD(), maCD);
	}

	@Test
	public void getHocPhiTest() {
		System.out.println("getHocPhi");
		kh = new KhoaHoc();
		double expected = 5555.2222;
		kh.setHocPhi(5555.2222);
		double result = kh.getHocPhi();
		assertTrue(expected == result);
	}

	@Test
	public void setHocPhiTest() {
		System.out.println("setHocPhi");
		double hocPhi = 5555.2222;
		kh = new KhoaHoc();
		kh.setHocPhi(hocPhi);
		assertTrue(kh.getHocPhi() == hocPhi);
	}
	
	@Test
	public void getThoiLuongTest() {
		System.out.println("getThoiLuong");
		kh = new KhoaHoc();
		int expected = 5;
		kh.setThoiLuong(5);
		int result = kh.getThoiLuong();
		assertTrue(expected == result);
	}

	@Test
	public void setThoiLuongTest() {
		System.out.println("setThoiLuong");
		int thoiLuong = 5;
		kh = new KhoaHoc();
		kh.setThoiLuong(thoiLuong);
		assertTrue(kh.getThoiLuong() == thoiLuong);
	}
	
	@Test
	public void getNgayKGTest() {
		System.out.println("getNgayKG");
		kh = new KhoaHoc();
		Date expected = new Date();
		kh.setNgayKG(new Date());
		Date result = kh.getNgayKG();
		assertEquals(expected, result);
	}

	@Test
	public void setNgayKGTest() {
		System.out.println("setNgayKG");
		Date ngayKG = new Date();
		kh = new KhoaHoc();
		kh.setNgayKG(ngayKG);
		assertEquals(kh.getNgayKG(), ngayKG);
	}
	
	@Test
	public void getGhiChuTest() {
		System.out.println("getGhiChu");
		kh = new KhoaHoc();
		String expected = "Test ghi chú";
		kh.setGhiChu("Test ghi chú");
		String result = kh.getGhiChu();
		assertEquals(expected, result);
	}

	@Test
	public void setGhiChuTest() {
		System.out.println("setGhiChu");
		String ghiChu = "Ghi chú test";
		kh = new KhoaHoc();
		kh.setGhiChu(ghiChu);
		assertEquals(kh.getGhiChu(), ghiChu);
	}

	@Test
	public void getMaNVTest() {
		System.out.println("getMaNV");
		kh = new KhoaHoc();
		String expected = "NV01";
		kh.setMaNV("NV01");
		String result = kh.getMaNV();
		assertEquals(expected, result);
	}

	@Test
	public void setMaNVTest() {
		System.out.println("setMaNV");
		String maNV = "NV01";
		kh = new KhoaHoc();
		kh.setMaNV(maNV);
		assertEquals(kh.getMaNV(), maNV);
	}

	@Test
	public void getNgayTaoTest() {
		System.out.println("getNgayTao");
		kh = new KhoaHoc();
		Date expected = new Date();
		kh.setNgayTao(new Date());
		Date result = kh.getNgayTao();
		assertEquals(expected, result);
	}

	@Test
	public void setNgayTaoTest() {
		System.out.println("setNgayTao");
		Date ngayTao = new Date();
		kh = new KhoaHoc();
		kh.setNgayTao(ngayTao);
		assertEquals(kh.getNgayTao(), ngayTao);
	}

	@Test
	public void toStringTest() {
		System.out.println("toString");
		String maCD = "JAV01";
		Date ngayKG = new Date();
		kh = new KhoaHoc();
		kh.setMaCD(maCD);
		kh.setNgayKG(ngayKG);
		assertEquals(maCD + "(" + ngayKG + ")", kh.toString());
		System.out.println(kh.toString());
	}
}
