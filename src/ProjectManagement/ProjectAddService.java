package ProjectManagement;

public class ProjectAddService {
  private ProjectDAO dao;
  
  public ProjectAddService() {
    dao = new ProjectDAO();
  }
  
  public void projectAdd(RequestDTO dto) {
    
    String purpose = dto.getPurpose();
    //제목이 dao에 있는지 검사
    
    //중요도를 바르게 입력했는지 검사
    //시작일을 바르게 입력했는지 검사
    if(dto.getStartDate().length()!=6) {
      System.out.println("시작일을 올바른 날짜 형식으로 입력해주세요.");
      return;
    }
    //MM에 들어가는 값이 1~12사이를 벗어나는지 확인
    if(Integer.parseInt(dto.getStartDate().substring(2,3))<0||
        Integer.parseInt(dto.getStartDate().substring(2,3))>12) {
      System.out.println("1~12월 사이로 입력해주세요.");
      return;
    }
    //dd에 들어가는 값이 1~31사이를 벗어나는지 확인
    //달에 따라서 입력할 수 있는 날짜수를 정하는 것도 필요(아직은 구현하지 않음)
    if(Integer.parseInt(dto.getStartDate().substring(4,5))<0||
        Integer.parseInt(dto.getStartDate().substring(4,5))>31) {
      System.out.println("1~31일 사이로 입력해주세요.");
      return;
    }
    //종료일을 바르게 입력했는지 검사
    if(dto.getEndDate().length()!=6) {
      System.out.println("시작일을 올바른 날짜 형식으로 입력해주세요.");
      return;
    }
  //MM에 들어가는 값이 1~12사이를 벗어나는지 확인
    if(Integer.parseInt(dto.getEndDate().substring(2,3))<0||
        Integer.parseInt(dto.getEndDate().substring(2,3))>12) {
      System.out.println("1~12월 사이로 입력해주세요.");
      return;
    }
    //dd에 들어가는 값이 1~31사이를 벗어나는지 확인
    //달에 따라서 입력할 수 있는 날짜수를 정하는 것도 필요(아직은 구현하지 않음)
    if(Integer.parseInt(dto.getEndDate().substring(4,5))<0||
        Integer.parseInt(dto.getEndDate().substring(4,5))>31) {
      System.out.println("1~31일 사이로 입력해주세요.");
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
    
    ProjectVO vo = new ProjectVO(dto.getTitle(), dto.getImportancelevel(), dto.getStartDate(), dto.getEndDate(), dto.getState());
    
    if(purpose.equals("개인")) {
      dao.pInsert(vo);
    }
    else {
      dao.bInsert(vo);
    }
    System.out.println("프로젝트가 성공적으로 입력되었습니다.");
  }
}
