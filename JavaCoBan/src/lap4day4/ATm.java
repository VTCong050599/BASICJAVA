package lap4day4;

public interface ATm{
	boolean withdraw(int x,double y);
	boolean deposit(int x,double y);
	double queryBalance(int x);
	boolean login(String x,String y);
	boolean logout(String x);
}
