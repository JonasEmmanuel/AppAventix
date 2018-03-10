package com.qrcodeteam.dao;


import java.sql.Connection;
import java.util.Map;

import com.qrcodeteam.beans.CommerceGerant;
import com.qrcodeteam.beans.EmployeQrCodeRest;

public interface InterfaceServiceDAO {
	public EmployeQrCodeRest authentificationEmploye(Connection con, String mailEmploye, String mdpEmploye);
	public CommerceGerant authentificationGerant(Connection con, String mailGerant, String mdpGerant);
	public Map<String, String> getQrCode(Connection con, String idEmploye);
	public String changeMdpEmploye(String idEmploye, String newMdp);
	public int checkStatutEmploye(String idEmploye);
	public boolean validerPaiement(String numeroCode, float montant, String idCommercant);
	public Map<String, Float> getSoldeTotalEtJournalier(String idEmploye);
	public Map<String, Float> getLastMonthTransactions(String idCommerce);
}