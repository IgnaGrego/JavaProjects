import java.util.Scanner;

public class bankingApplication {
	
	public static void main(String[] args) {
		
		BankAccount obj1 = new BankAccount ("XYZ","BA0001");
		obj1.showMenu();
		
		
	}
	

}


class BankAccount {
	
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	
	BankAccount(String cname, String cid)
	{
		customerName = cname;
		customerId = cid;
	}

	void deposit(int amount)
	{
		if(amount != 0)
		{
		balance = balance + amount;
		previousTransaction = amount;
		}
	}
	
	void withdraw(int amount)
	{
	   if(amount != 0)
	   {
	   balance = balance - amount;
	   previousTransaction = -amount;	
	   }						
	}
	
	void getPreviousTransaction()
	{
		if (previousTransaction > 0)
		{
			System.out.println("Depositado: "+previousTransaction);
		} 
		else if (previousTransaction < 0)
		{
			System.out.println("Monto prestado: " +Math.abs(previousTransaction));
		}
		else
		{
		    System.out.println("No existen operaciones de transacciónes");
		}
		
	}
	
	void showMenu()
	{
		char option ='\0';
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bienvenido "+customerName);
		System.out.println("Tu ID es "+customerName);
		System.out.println("\n");
		System.out.println("A. Chequear Balance");
		System.out.println("B. Depositar");
		System.out.println("C. Préstamos");
		System.out.println("D. Transacciones Previas");
		System.out.println("E. Salir");
		
		do
		{  
			System.out.println("=======================================================");
			System.out.println("Ingresá una opción");
			System.out.println("=======================================================");
			option = scanner.next().charAt(0);
			System.out.println("\n");
			
			switch(option)
			{
			
			
			
			case 'A':
				System.out.println("--------------------------------");
				System.out.println("Balance = "+balance);
				System.out.println("--------------------------------");
				System.out.println("\n");	
				break;
				
			case 'B':
				System.out.println("--------------------------------");
				System.out.println("Ingresá un monto a depositar = ");
				System.out.println("--------------------------------");
				int amount = scanner.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
				
			case 'C':
				System.out.println("--------------------------------");
				System.out.println("Ingrese préstamo a recibir = ");
				System.out.println("--------------------------------");
				int amount2 = scanner.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break;
				
			case 'D':
				System.out.println("--------------------------------");
				getPreviousTransaction();
				System.out.println("--------------------------------");
				System.out.println("\n");
				break;
				
			case 'E':
				System.out.println("================================================");
				break;
				
				
			default:
				System.out.println("Opcion inválida. Por favor intentar nuevamente.");
				break;
				
			}
			
		}while(option != 'E');
		
		System.out.println("Muchas gracias por usar nuestros servicios.");
			
		}
			
}
	
	
	
	



