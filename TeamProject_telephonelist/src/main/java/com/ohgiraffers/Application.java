package main.java.com.ohgiraffers;

import main.java.com.ohgiraffers.phone.controller.PhoneController;
import main.java.com.ohgiraffers.phone.dto.PhoneDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner([System.in](http://system.in/));
        PhoneController phoneController = new PhoneController();
        boolean phone = true;
        String result = "";

        while (phone) {
            System.out.println("1. 전화번호 등록");
            System.out.println("2. 전화번호 수정");
            System.out.println("3. 전화번호 상세조회");
            System.out.println("4. 전화번호 전체조회");
            System.out.println("5. 전화번호 삭제");
            System.out.println("6. 전화번호 등록");
            System.out.println("어떤 메뉴를 동작하시겠나요?");
            int input = sc.nextInt();
            sc.nextLine();

            switch (input) {
                case 1: // 전화번호 등록
                    System.out.println("등록할 이름을 입력하세요.");
                    String name = sc.nextLine();
                    sc.nextLine();
                    PhoneDTO[] phones = new PhoneDTO[10];
                    for (int i = 0; i < 10; i++) {
                        System.out.println("등록할 전화번호를 입력하세요.");
                        int number = sc.nextInt();
                        sc.nextLine();

                        System.out.println("등록할 주소를 입력해주세요 (ex 서초동)");
                        String adress = sc.nextLine();
                        sc.nextLine();

                        phones[i] = new PhoneDTO(name,number,adress);
                        System.out.println("등록이 완료되었습니다.");  //5.메뉴로 돌아감 <-이거만들기
                    }
                    result = PhoneController.phone(phones);
                    break;


                case 2: // 전화번호 수정
                    PhoneController.phoneModify();
                    break;


                case 3: //전화번호 상세조회
                    System.out.println(phoneController.phoneRead());
                    System.out.println("상세 조회할 전화번호의 이름을 입력해주세요");
                    String name = sc.nextLine();
                    sc.nextLine();
                    result =phoneController.phoneDetail("");
                    break;

                case 4: //전화번호 전체조회
                    for(String phoneResult : result.split("")){
                        System.out.println(phoneResult);
                    }
                    result = phoneController.phoneRead();
                    break;

                case 5: //전화번호 삭제
                    System.out.println("삭제할 번호의 이름을 입력해주세요");
                    name = sc.nextLine();

                    System.out.println(name + "님의 정보를 삭제하시겠습니까?");
                    result += phoneController.phonedelete(phones);
                    // if (??) <-네 아니오 코드짜고 싶어요...]

                    break;

                default:
                    System.out.println("입력이 잘못되었습니다.");
                    break;


            }

            System.out.println(result);


            System.out.println("조회를 종료하시겠습니까?");
            phone = sc.nextBoolean();



        }

    }
}