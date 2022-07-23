 abstract class GeneralBank{
	abstract void getSavingsInterestRate() ;
	abstract	void getFixedDepositInterestRate() ;
	
}
 class KotMBank extends GeneralBank{
		void getSavingsInterestRate() {
			System.out.println("Savings are 6%");
		}
			void getFixedDepositInterestRate() {
			System.out.println("Fixed Deposit is 9%");
				
			}
}
 class ICICIBank extends GeneralBank{
		void getSavingsInterestRate() {
			System.out.println("Savings are 5%");
		}
			void getFixedDepositInterestRate() {
				System.out.println("Fixed Deposit is 8.5%");
				
			}
 }
public class ques1 {

	public static void main(String[] args) {
		ICICIBank i=new ICICIBank();
           i.getSavingsInterestRate();
           i.getFixedDepositInterestRate();
		 KotMBank k=new KotMBank();
k.getFixedDepositInterestRate();
k.getSavingsInterestRate();
		 GeneralBank g=new KotMBank();
g.getFixedDepositInterestRate();
g.getSavingsInterestRate();
		 GeneralBank f=new ICICIBank();
		 f.getFixedDepositInterestRate();
		 f.getSavingsInterestRate();
	}

}
