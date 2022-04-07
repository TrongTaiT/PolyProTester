package com.PolyPro.entity;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NhanVienTest {

	NhanVien nv;

	@BeforeClass
	public void beforeClass() {
	}

	@AfterClass
	public void afterClass() {
	}

	@Test
	public void getMaNVTest() {
		System.out.println("getMaNV");
		nv = new NhanVien();
		String expected = "NV01";
		nv.setMaNV("NV01");
		String result = nv.getMaNV();
		assertEquals(result, expected);
	}

	@Test
	public void setMaNVTest() {
		System.out.println("setMaNV");
		String maNV = "NV01";
		nv = new NhanVien();
		nv.setMaNV(maNV);
		assertEquals(nv.getMaNV(), maNV);
	}

	@Test
	public void getHoTenTest() {
		System.out.println("setHoTen");
		nv = new NhanVien();
		String expected = "Họ và tên";
		nv.setHoTen("Họ và tên");
		String result = nv.getHoTen();
		assertEquals(result, expected);
	}

	@Test
	public void setHoTenTest() {
		System.out.println("setHoTen");
		String hoTen = "Họ và tên";
		nv = new NhanVien();
		nv.setHoTen(hoTen);
		assertEquals(nv.getHoTen(), hoTen);
	}

	@Test
	public void getMatKhauTest() {
		System.out.println("getMatKhau");
		nv = new NhanVien();
		String expected = "abc123";
		nv.setMatKhau("abc123");
		String result = nv.getMatKhau();
		assertEquals(result, expected);
	}

	@Test
	public void setMatKhauTest() {
		System.out.println("setMatKhau");
		String matKhau = "abc123";
		nv = new NhanVien();
		nv.setMatKhau(matKhau);
		assertEquals(nv.getMatKhau(), matKhau);
	}

	@Test
	public void isVaiTroTest() {
		System.out.println("isVaiTro");
		nv = new NhanVien();
		boolean expected = true;
		nv.setVaiTro(true);
		boolean result = nv.isVaiTro();
		assertEquals(result, expected);
	}

	@Test
	public void setVaiTroTest() {
		System.out.println("setVaiTro");
		boolean vaiTro = true;
		nv = new NhanVien();
		nv.setVaiTro(vaiTro);
		assertEquals(nv.isVaiTro(), vaiTro);
	}

	@Test
	public void toStringTest() {
		System.out.println("toString");
		String hoTen = "Nguyễn Trường Chinh";
		nv = new NhanVien();
		nv.setHoTen(hoTen);
		assertEquals(hoTen, nv.toString());
	}
}
