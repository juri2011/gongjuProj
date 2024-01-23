package ProjectManagement;

import java.util.Scanner;

public class MainController {
  public static void help() {
    //도움말 명령어를 출력하는 메소드입니다.
    System.out.println("명령어를 숫자로 입력해 주세요");
    System.out.println("1. 추가 : 개인/비지니스 제목 중요도 시작일 마감일");
    System.out.println("2. 삭제 ");
    System.out.println("3. 변경");
    System.out.println("4. 리스트");
    System.out.println("5. 찾기");
    System.out.println("6. 도움말");
    System.out.println("7. 종료");
    System.out.println();
  }
  
  public static void main(String[] args) {
    //메인 메소드입니다.
    System.out.println("안녕하세요! 프로젝트 관리 매니저입니다.");
    Scanner sc = new Scanner(System.in);
    while(true) {
      help();
      String userInput = sc.nextLine().trim();
      //명령어: 1. 추가
      if(userInput.equals("1")) {
        
      }
      //명령어: 2. 삭제
      else if(userInput.equals("2")){
        
      }
      //명령어: 3. 변경
      else if(userInput.equals("3")){
        
      }
      //명령어: 4. 리스트
      else if(userInput.equals("4")){
        
      }
      //명령어: 5. 찾기
      else if(userInput.equals("5")){
        
      }
      //명령어: 6. 도움말
      else if(userInput.equals("6")){
        
      }
      //명령어: 7. 종료
      else if(userInput.equals("7")){
        System.out.println("프로그램을 종료합니다.");
        break;
      }
      //명령어 잘 못 입력함
      else {
        System.out.println("명령어를 잘 못 입력하셨습니다.");
        continue;
      }
      
    }//end of while
    sc.close();
  }//end of main
}
