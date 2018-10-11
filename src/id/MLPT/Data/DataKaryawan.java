package id.MLPT.Data;

public class DataKaryawan {
	private int idKaryawan; //data karyawan
	private String idKaryawan1;
	private String nama;
	private String tanggal;
	private int idGolongan;
							
							//data golongan
	private String golongan;
	private String namaGolongan;
	private int gajiGolongan;
	public DataKaryawan(){
		
	}
	/*
	public DataKaryawan(int idKaryawan, String nama, String tanggal, int idGolongan) {
		
		this.idKaryawan=idKaryawan;
		this.nama=nama;
		this.tanggal=tanggal;
		this.idGolongan=idGolongan;
	}*/
	
	
	public int getIdKaryawan(){
		return idKaryawan;
	}
	
	public void setIdKaryawan(int idKaryawan){
		this.idKaryawan=idKaryawan;
	}
	public void setIdKaryawan1(String idKaryawan1){
		this.idKaryawan1=idKaryawan1;
	}
	
	public String getNama(){
		return nama;
	}
	
	public void setNama(String nama){
		this.nama=nama;
	}
	
	public String getTanggal(){
		return tanggal;
	}
	
	public void setTanggal(String tanggal){
		this.tanggal=tanggal;
	}
	
	
	/*
	public void DataGolongan(int idGolongan, String golongan, String namaGolongan, int gajiGolongan) {

		this.idGolongan=idGolongan;
		this.golongan=golongan;
		this.namaGolongan=namaGolongan;
		this.gajiGolongan=gajiGolongan;
	}*/
	
	//------------------------------------------------------------------------
	public int getIdGolongan(){
		return idGolongan;
	}
	
	public void setIdGolongan(int idGolongan){
		this.idGolongan=idGolongan;
	}
	
	public String getGolongan(){
		return golongan;
	}
	
	public void setGolongan(String golongan) {
		this.golongan = golongan;
	}
	
	public String getNamaGolongan(){
		return namaGolongan;
	}
	
	public void setNamaGolongan(String namaGolongan) {
		this.namaGolongan = namaGolongan;
	}
	
	public int getGajiGolongan(){
		return gajiGolongan;
	}
	
	public void setGajiGolongan(int gajiGolongan) {
		this.gajiGolongan = gajiGolongan;
	}
	
	
	
	

}
