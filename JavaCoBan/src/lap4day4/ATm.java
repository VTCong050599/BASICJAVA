package lap4day4;

public interface ATm{
	boolean withdraw(int sotk,double sotienrut);
	boolean deposit(int sotk,double sotiengui);
	double queryBalance(int sotk);
	boolean login(String sotaikhoan,String matkhau);
	boolean logout(String x);
}
