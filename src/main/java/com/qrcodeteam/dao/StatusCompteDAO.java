package com.qrcodeteam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StatusCompteDAO {

	// Init -> status(0)"
	// Activer -> status (1)
	// Desactiver -> status(-2)
	
	
	
	public static void initCompteGerant(Connection con,String idUser) {
		String req="UPDATE GERANT SET STATUSCOMPTEGERANT=? WHERE idGerant=? ";
		PreparedStatement pstmt=null;
		try {
			pstmt=con.prepareStatement(req);
			pstmt.setInt(1, 0);
			pstmt.setString(2,idUser);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (pstmt != null) {
				DBConnexion.closePreparedStatement(pstmt);
			}
			
			if (con != null) {
				DBConnexion.closeConnection(con);
			}
		}
		
	}
	
	public static void initCompteEntreprise(Connection con,String idUser) {
		String req="UPDATE ENTREPRISE SET STATUSCOMPTEENTREPRISE=? WHERE idEntreprise=? ";
		PreparedStatement pstmt=null;
		try {
			pstmt=con.prepareStatement(req);
			pstmt.setInt(1, 0);
			pstmt.setString(2,idUser);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (pstmt != null) {
				DBConnexion.closePreparedStatement(pstmt);
			}
			
			if (con != null) {
				DBConnexion.closeConnection(con);
			}
		}
		
	}
	
	
	public static void activerCompteGerant(Connection con,String idUser) {
		String req="UPDATE GERANT SET STATUSCOMPTEGERANT=? WHERE idGerant=? ";
		PreparedStatement pstmt=null;
		try {
			pstmt=con.prepareStatement(req);
			pstmt.setInt(1, 1);
			pstmt.setString(2,idUser);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (pstmt != null) {
				DBConnexion.closePreparedStatement(pstmt);
			}
			
			if (con != null) {
				DBConnexion.closeConnection(con);
			}
		}
		
	}
	
	
	public static void activerCompteEntreprise(Connection con,String idUser) {
		String req="UPDATE ENTREPRISE SET STATUSCOMPTEENTREPRISE=? WHERE idEntreprise=? ";
		PreparedStatement pstmt=null;
		try {
			pstmt=con.prepareStatement(req);
			pstmt.setInt(1, 1);
			pstmt.setString(2,idUser);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (pstmt != null) {
				DBConnexion.closePreparedStatement(pstmt);
			}
			
			if (con != null) {
				DBConnexion.closeConnection(con);
			}
		}
		
	}
	
	public static void desactiverCompteGerant(Connection con,String idUser) {
		String req="UPDATE GERANT SET STATUSCOMPTEGERANT=? WHERE idGerant=? ";
		PreparedStatement pstmt=null;
		try {
			pstmt=con.prepareStatement(req);
			pstmt.setInt(1, -2);
			pstmt.setString(2,idUser);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (pstmt != null) {
				DBConnexion.closePreparedStatement(pstmt);
			}
			
			if (con != null) {
				DBConnexion.closeConnection(con);
			}
		}
		
	}
	
	
	public static void desactiverCompteEntreprise(Connection con,String idUser) {
		String req="UPDATE ENTREPRISE SET STATUSCOMPTEENTREPRISE=? WHERE idEntreprise=? ";
		PreparedStatement pstmt=null;
		try {
			pstmt=con.prepareStatement(req);
			pstmt.setInt(1, -2);
			pstmt.setString(2,idUser);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (pstmt != null) {
				DBConnexion.closePreparedStatement(pstmt);
			}
			
			if (con != null) {
				DBConnexion.closeConnection(con);
			}
		}
		
	}
	
	public static void initCompteCommerce(Connection con,String idCommerce) {
		String req="UPDATE COMMERCE SET STATUSCOMPTECOMMERCE=? WHERE IDCOMMERCE=? ";
		PreparedStatement pstmt=null;
		try {
			pstmt=con.prepareStatement(req);
			pstmt.setInt(1, 0);
			pstmt.setString(2,idCommerce);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (pstmt != null) {
				DBConnexion.closePreparedStatement(pstmt);
			}
			
			if (con != null) {
				DBConnexion.closeConnection(con);
			}
		}
		
	}
	
	public static void activerCompteEmploye(Connection con,String idUser) {
		String req="UPDATE EMPLOYE SET STATUSCOMPTEEMPLOYE=? WHERE idEmploye=? ";
		PreparedStatement pstmt=null;
		try {
			pstmt=con.prepareStatement(req);
			pstmt.setInt(1, 1);
			pstmt.setString(2,idUser);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	finally {
		if (pstmt != null) {
			DBConnexion.closePreparedStatement(pstmt);
		}
		
		if (con != null) {
			DBConnexion.closeConnection(con);
		}
	}
		
	}
	
}
