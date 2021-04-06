package com.wolken.wolkenapp.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.wolken.wolkenapp.DTO.MobilesDTO;

public class MobilesDAOImpl implements MobilesDAO {
	//Connection con = null;

	@Override
	public void add(MobilesDTO mobilesDTO) throws SQLException {
		// TODO Auto-generated method stub
		// try (Connection con = Connect.getConnect()) {
		try(Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost:3306?user=root&password=Password@1234567890")){
		try (PreparedStatement pre = con.prepareStatement("insert into wolken.mobile_table values(?,?,?,?)");) {
			pre.setInt(1, mobilesDTO.getMobileId());
			pre.setString(2, mobilesDTO.getBrandName());
			pre.setInt(3, mobilesDTO.getPrice());
			pre.setString(4, mobilesDTO.getModelName());
			pre.executeUpdate();
			System.out.println("inmate data is added ");
			pre.close();
		}
		con.close();
	}

}

	@Override
	public void get() throws SQLException {
		try (Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost:3306?user=root&password=Password@1234567890")) {
			try (PreparedStatement pre = con.prepareStatement("select * from wolken.mobile_table")) {
				try (ResultSet rs = pre.executeQuery()) {
					while (rs.next()) {
						int mobileId = rs.getInt("mobile_id");
						String modelName = rs.getString("model_name");
						int price = rs.getInt("mobile_price");
						String brandName = rs.getString("model_brand");
						System.out.println(mobileId + " " + modelName + " " + price + " " + brandName);
					}

					rs.close();
				}
			}
			con.close();
		}

	}

//	@Override
//	public void close() {
//
//		
//		if (con != null) {
//			try {
//				con.close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}

	@Override
	public void update(int id, int price) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("inside update");
		try(Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost:3306?user=root&password=Password@1234567890")){
		try (PreparedStatement pre = con
				.prepareStatement("update wolken.mobile_table set mobile_price=?  where mobile_id= ?")) {
			pre.setInt(1, price);
			pre.setInt(2, id);
			pre.executeUpdate();
			System.out.println("data has been updated ");
			pre.close();
		}
		con.close();
		}
	}

	@Override
	public void delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		try (Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost:3306?user=root&password=Password@1234567890")) {

			try (PreparedStatement pre = con.prepareStatement("delete from wolken.mobile_table where mobile_id=?")) {

				System.out.println("inside delete");
				pre.setInt(1, id);
				pre.executeUpdate();
				pre.close();
			}
			con.close();;
		}
	}

}
