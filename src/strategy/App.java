package strategy;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        Solider solider = new Solider();
	        int weaponType;
	        
	        while (true){
				System.out.println("���� ����.");
				System.out.println("1Ȱ 2�� 3Į 0��");
	            weaponType = scanner.nextInt();

	            if(weaponType == 0){
	                break;
	            }

	            if(weaponType < 0 || weaponType > 3){
	                System.out.println("�߸��Է��߾��.");
	                continue;
	            }
	            
	            solider.setWeapon(weaponType);
	            solider.use();
	        }

	        System.out.println("����");
	        scanner.close();
			}
	}