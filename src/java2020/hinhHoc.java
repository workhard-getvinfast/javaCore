package java2020;

public class hinhHoc {
	
	private String name;
	private double dienTich;
	private int chuVi;
	
	
	hinhHoc(String name, int canh1, int canh2, int canh3){
		this.name = name;		
		this.chuVi = canh1+canh2+canh3;	
		double nuaChuVi = (canh1+canh2+canh3)/2;
		this.dienTich = Math.sqrt(nuaChuVi/2*(nuaChuVi/2-canh1)*(nuaChuVi/2-canh2)*(nuaChuVi/2-canh3));
	}
	hinhHoc(String name, int canhHinhVuong){
		this.name = name;
		this.chuVi = canhHinhVuong*4;
		this.dienTich = canhHinhVuong*canhHinhVuong;
	}
	public int getChuVi(hinhHoc hinhHoc) {
		return this.chuVi;
	}
	public double getDienTich(hinhHoc hinhHoc) {
		return this.dienTich;
	}
	public String getName(hinhHoc hinhHoc) {
		return this.name;
	}
	

}
