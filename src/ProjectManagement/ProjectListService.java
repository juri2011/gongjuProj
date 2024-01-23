package ProjectManagement;

import java.util.Collection;

public class ProjectListService {

  private ProjectDAO dao = new ProjectDAO();
 
  public void listPrint() {

  }
  
  //개인 프로젝트 목록 출력 함수
  public void printPProjectList() {
    Collection<ProjectVO> pList = dao.pSelectList();
    int i = 1;
    for (ProjectVO vo : pList) {
      System.out.println(i + ". 제목:" + vo.getTitle() + ", 중요도:" + vo.getImportancelevel() + ", 시작일:" + vo.getStartDate() + ", 종료일" + vo.getEndDate() + ", 상태" + vo.getImportancelevel());
    }
    
  }
  
  //비지니스 프로젝트 목록 출력 함수
  public void printBProjectList() {
    Collection<ProjectVO>  bList = dao.bSelectList();
    int i = 1;
    for (ProjectVO vo : bList) {
      System.out.println(i + ". 제목:" + vo.getTitle() + ", 중요도:" + vo.getImportancelevel() + ", 시작일:" + vo.getStartDate() + ", 종료일" + vo.getEndDate() + ", 상태" + vo.getImportancelevel());
    }    
  }
  
}
