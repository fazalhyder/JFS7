interface Bank{
	void openAccount();
	void closeAccount();
}
 abstract class SBI implements Bank{
	public void openAccount(){
		System.out.println("Account succesfully opened");
	}
	public  abstract void closeAccount();
 }
 class SBIclose extends SBI{
	 public void closeAccount(){
		 System.out.println("Account succesfully closed");
	 }
 }
 
	 public class SBItest {
		 public static void main(String [] args){
			 SBIclose sbi = new SBIclose();
			 sbi.openAccount();
			 sbi.closeAccount();
		 }
 }
 
 
		 