package com.PolyPro.entity;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class HocVienTest {

	@Test
	public void setMaHVTest() {
		System.out.println("setMaHV");
		HocVien hv = new HocVien();

		System.out.println("setMaKH");
		hv.setMaHV(1);
		
		int expected = 1;
		assertTrue(hv.getMaHV() == expected);
	}

	@Test
	public void getMaHVTest() {
		System.out.println("getMaHV");
		HocVien hv = new HocVien();
		
		hv.setMaHV(1);
		
		int result = hv.getMaHV();
		int expected = 1;
		assertEquals(expected, result);
	}
	
	@Test
	public void getDiemTest() {
		System.out.println("getDiem");
		HocVien hv = new HocVien();
		
		hv.setDiem(10);
		
		double result = hv.getDiem();
		double expected = 10;
		assertEquals(expected, result);
	}

	@Test
	public void setDiemTest() {
		System.out.println("setDiem");
		HocVien hv = new HocVien();
		
		hv.setDiem(10);
		
		double result = hv.getDiem();
		double expected = 10;
		assertEquals(expected, result);
	}

	@Test
	public void getMaKHTest() {
		System.out.println("getMaKH");
		HocVien hv = new HocVien();
		int maKH = 3;
		
		hv.setMaKH(maKH);
		
		int result = hv.getMaKH();
		int expected = maKH;
		assertEquals(expected, result);
	}

	@Test
	public void setMaKHTest() {
		System.out.println("setMaKH");
		HocVien hv = new HocVien();
		int maKH = 4;
		
		hv.setMaKH(maKH);
		
		int result = hv.getMaKH();
		int expected = maKH;
		assertEquals(expected, result);
	}

	@Test
	public void getMaNHTest() {
		System.out.println("getMaNH");
		HocVien hv = new HocVien();
		String maNH = "PS12862";
		
		hv.setMaNH(maNH);
		
		String result = hv.getMaNH();
		String expected = maNH;
		assertEquals(expected, result);
	}

	@Test
	public void setMaNHTest() {
		System.out.println("setMaNH");
		HocVien hv = new HocVien();
		String maNH = "PS32862";
		
		hv.setMaNH(maNH);
		
		String result = hv.getMaNH();
		String expected = maNH;
		assertEquals(expected, result);
	}
}
