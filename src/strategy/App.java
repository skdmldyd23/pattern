package strategy;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        Solider solider = new Solider();
	        int weaponType;
	        
	        while (true){
				System.out.println("무기 골라요.");
				System.out.println("1활 2총 3칼 0끝");
	            weaponType = scanner.nextInt();

	            if(weaponType == 0){
	                break;
	            }

	            if(weaponType < 0 || weaponType > 3){
	                System.out.println("잘못입력했어요.");
	                continue;
	            }
	            
	            solider.setWeapon(weaponType);
	            solider.use();
	        }

	        System.out.println("ㅇㅇ");
	        scanner.close();
			}
	}