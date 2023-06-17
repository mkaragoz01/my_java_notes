package jdbcINTRO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws SQLException {
		//selectDemo();
	}
	
	public static void selectDemo() throws SQLException {
		Connection con = null;
		dbHelper helper = new dbHelper();
		Statement statement = null;
		ResultSet resultset = null;
		try {
			con = helper.getConnection();
			statement = con.createStatement();
			resultset = statement.executeQuery("SELECT * from ogrenci_bilgileri");
			ArrayList<Country> countries = new ArrayList<Country>();
			while (resultset.next()) {
				countries.add(new Country(resultset.getString("id"),
						      resultset.getString("ad"),
							  resultset.getString("soyad"),
							  resultset.getString("derse_girme"),
							  resultset.getString("durum")));
			}
			System.out.println(countries.size());
		}catch (SQLException exception){
			helper.showErrorMessage(exception);
		}
		finally {
			con.close();
		}
	}
	
	public static void insertData() throws SQLException {
		Connection con = null;
		dbHelper helper = new dbHelper();
		PreparedStatement statement = null;
		ResultSet resultset = null;
		try {
			con = helper.getConnection();
			String sql = "INSERT INTO ogrenci_bilgileri(id,ad,soyad,derse_girme,durum) values (?,?,?,?,?)";
			statement = con.prepareStatement(sql);
			statement.setInt(1, 2021469025);
			statement.setString(2, "Ömer");
			statement.setString(3, "Akcan");
			statement.setInt(4, 15);
			statement.setInt(5, 0);
			statement.executeUpdate();
			System.out.println("Kayıt Eklendi");
		}catch (SQLException exception){
			helper.showErrorMessage(exception);
		}
		finally {
			statement.close();
			con.close();}
	}
	public static void updateData() throws SQLException{
		Connection con = null;
		dbHelper helper = new dbHelper();
		PreparedStatement statement = null;
		ResultSet resultset = null;
		try {
			con = helper.getConnection();
			String sql = "UPDATE ogrenci_bilgileri SET ad='Ömer Faruk',derse_girme=13 WHERE id=?";
			statement = con.prepareStatement(sql);
			statement.setInt(1, 2021469025);
			statement.executeUpdate();
			System.out.println("Kayıt Güncellendi");
		}catch (SQLException exception){
			helper.showErrorMessage(exception);
		}
		finally {
			statement.close();
			con.close();}
	}
	public static void deleteData() throws SQLException{
		Connection con = null;
		dbHelper helper = new dbHelper();
		PreparedStatement statement = null;
		ResultSet resultset = null;
		try {
			con = helper.getConnection();
			String sql = "DELETE FROM ogrenci_bilgileri WHERE id=?";
			statement = con.prepareStatement(sql);
			statement.setInt(1, 2021469025);
			statement.executeUpdate();
			System.out.println("Kayıt Silindi");
		}catch (SQLException exception){
			helper.showErrorMessage(exception);
		}
		finally {
			statement.close();
			con.close();}
	}
}