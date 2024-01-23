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
      String purpose = "";
      //명령어: 1. 추가
      if(userInput.equals("1")) {
        
        //사용자로부터 관리할 프로젝트의 용도 입력
        System.out.println("새로 추가할 프로젝트의 용도를 입력하세요. (개인/비지니스)");
        userInput = sc.nextLine().trim();
        if(userInput.equals("개인")) purpose = "personal";
        else if(userInput.equals("비지니스")) purpose = "business";
        else {
          System.out.println("잘 못 입력하셨습니다. \'개인\'과 \'비지니스\' 중 하나를 입력하세요.");
        }
        
        //사용자로부터 프로젝트의 내용 입력
        System.out.println("추가할 프로젝트를 입력하세요.");
        System.out.println("(형식)제목 중요도 시작일(yyMMdd) 종료일(yyMMdd) 상태(진행/보류/완료)");
        //사용자에게 입력형식에 대한 설명 출력
        System.out.println("-------설명------");
        System.out.println("제목 : 프로젝트의 제목입니다. 중복될 수 없습니다.");
        System.out.println("중요도 : 미정 / 하 / 중 / 상");
        System.out.println("시작일 : 프로젝트가 시작되는 날짜입니다.");
        System.out.println("종료일 : 프로젝트가 끝나는 날짜입니다.");
        System.out.println("상태 : 프로젝트의 제목입니다.");
        System.out.println("---------------");
        
        userInput = sc.nextLine();
        String[] userInputs = userInput.split(" ");
        
        //데이터 유효성 검사
        if(userInputs.length != 5) {
          System.out.println("입력 형식이 올바르지 않습니다.");
          continue;
        }
        
        //RequestDTO에서 올바른 데이터 형식으로 작성했는지 검사 필요
        //RequestDTO dto = new RequestDTO(purpose, userInputs[0], userInputs[1], userInputs[2], userInputs[3], userInputs[4]);
        
        //ProjectAddServices addSrv = new ProjectAddServices();
        
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
