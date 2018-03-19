package daos;

import java.util.ArrayList;

import Entities.ReimbursementRequest;

public interface ReimbursementRequestDao {
	public void createReimbursementRequest(ReimbursementRequest req);
	public ReimbursementRequest retrieveReimbRequestById(int id);
	public ArrayList<ReimbursementRequest> retrieveReimbRequestsByEmpId(int id);
	public ArrayList<ReimbursementRequest> retrieveReimbRequestByIssuer(String issuer);
	public void updateReimbursementRequest(ReimbursementRequest req);
	public void deleteReimbursementRequest(int id);
}
