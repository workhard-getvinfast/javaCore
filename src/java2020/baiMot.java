package java2020;

import java.util.Scanner;

public class baiMot {

	public static void main(String[] args) {
		hinhHoc hinhVuong = new hinhHoc("Hình vuông", 30);
		hinhHoc hinhTamGiac = new hinhHoc("Hình tam giác",10,15,30);
		System.out.println("Chu vi của " + hinhVuong.getName(hinhVuong) + " là: " + hinhVuong.getChuVi(hinhVuong));
		System.out.println("Chu vi của " + hinhTamGiac.getName( hinhTamGiac) + " là: " +  hinhTamGiac.getChuVi( hinhTamGiac));
		System.out.println("Diện tích của " + hinhVuong.getName(hinhVuong) + " là: " + hinhVuong.getDienTich(hinhVuong));
		System.out.println("Diện tích của " +  hinhTamGiac.getName( hinhTamGiac) + " là: " + hinhTamGiac.getDienTich(hinhTamGiac));
		
		Scanner scan = new Scanner(System.in);
		oTo myOto = new oTo();
		System.out.print("Nhập số bánh: ");
		myOto.setSoBanh(scan.nextByte());		
		System.out.print("Nhập thương hiệu: ");
		myOto.setThuongHieu(scan.next());		
		myOto.print();
	}
}


