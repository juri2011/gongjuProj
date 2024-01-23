package ProjectManagement;

public class ProjectAddService {
  private ProjectDAO dao;
  
  public ProjectAddService() {
    dao = new ProjectDAO();
  }
  
  public boolean isTitleExists(String purpose, String title) {
    ProjectVO vo;
    //제목이 DAO에 있는지 검사
    if(purpose.equals("개인")) {
      vo = dao.pSelectOne(title);
      if(vo != null) {
        System.out.println("같은 제목을 가진 프로젝트가 존재합니다.");
        return false;
      }
    }
    else {
      vo = dao.bSelectOne(title);
      if(vo != null) {
        System.out.println("같은 제목을 가진 프로젝트가 존재합니다.");
        return false;
      }
    }
    
    return true;
  }
  
  public void projectAdd(RequestDTO dto) {
    ProjectVO vo;
    String purpose = dto.getPurpose();
    //중요도를 바르게 입력했는지 검사
    if((!dto.getImportancelevel().equals("미정"))&&(!dto.getImportancelevel().equals("상"))&&(!dto.getImportancelevel().equals("중"))&&(!dto.getImportancelevel().equals("하"))) {
      System.out.println("중요도는, 미정, 상, 중, 하, 네 가지만 입력할 수 있습니다.");
      return;
    }
    //시작일을 바르게 입력했는지 검사
    if(dto.getStartDate().length()!=6) {
      System.out.println("시작일을 올바른 날짜 형식으로 입력해주세요.");
      return;
    }
    //MM에 들어가는 값이 1~12사이를 벗어나는지 확인
    if(Integer.parseInt(dto.getStartDate().substring(2,4))<1||
        Integer.parseInt(dto.getStartDate().substring(2,4))>12) {
      System.out.println("시작일을 1~12월 사이로 입력해주세요.");
      return;
    }
    //dd에 들어가는 값이 1~31사이를 벗어나는지 확인
    //달에 따라서 입력할 수 있는 날짜수를 정하는 것도 필요(아직은 구현하지 않음)
    if(Integer.parseInt(dto.getStartDate().substring(4))<1||
        Integer.parseInt(dto.getStartDate().substring(4))>31) {
      System.out.println("시작일 날짜를 1~31일 사이로 입력해주세요.");
      return;
    }
    //종료일을 바르게 입력했는지 검사
    if(dto.getEndDate().length()!=6) {
      System.out.println("종료일을 올바른 날짜 형식으로 입력해주세요.");
      return;
    }
  //MM에 들어가는 값이 1~12사이를 벗어나는지 확인
    if(Integer.parseInt(dto.getEndDate().substring(2,4))<1||
        Integer.parseInt(dto.getEndDate().substring(2,4))>12) {
      
      System.out.println("종료일을 1~12월 사이로 입력해주세요.");
      return;
    }
    //dd에 들어가는 값이 1~31사이를 벗어나는지 확인
    //달에 따라서 입력할 수 있는 날짜수를 정하는 것도 필요(아직은 구현하지 않음)
    if(Integer.parseInt(dto.getEndDate().substring(4))<1||
        Integer.parseInt(dto.getEndDate().substring(4))>31) {
      System.out.println("종료일 날짜를 1~31일 사이로 입력해주세요.");
      return;
    }
    //종료일이 시작일보다 빠르지 않은지 확인
    if(Integer.parseInt(dto.getEndDate())<Integer.parseInt(dto.getStartDate())) {
      System.out.println("종료일은 시작일보다 빠를 수 없습니다.");
      return;
    }
    //상태를 바르게 입력했는지 검사
    if((!dto.getState().equals("진행"))&&(!dto.getState().equals("보류"))&&(!dto.getState().equals("완료"))) {
      System.out.println("상태는, 진행, 보류, 완료 세 가지만 입력할 수 있습니다.");
      return;
    }
    
    vo = new ProjectVO(dto.getTitle(), dto.getImportancelevel(), dto.getStartDate(), dto.getEndDate(), dto.getState());
    
    if(purpose.equals("개인")) {
      dao.pInsert(vo);
    }
    else {
      dao.bInsert(vo);
    }
    System.out.println("프로젝트가 성공적으로 입력되었습니다.");
  }
}
