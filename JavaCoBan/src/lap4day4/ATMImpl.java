package lap4day4;

public class ATMImpl implements ATm{
	private int idATM;
	private int accountId;
	public ATMImpl(int idATM, int accountId) {
		super();
		this.idATM = idATM;
		this.accountId = accountId;
	}
	@Override
	public boolean withdraw(int x, double y) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean deposit(int x, double y) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public double queryBalance(int x) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean login(String x, String y) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean logout(String x) {
		// TODO Auto-generated method stub
		return false;
	}
}