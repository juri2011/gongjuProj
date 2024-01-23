package ProjectManagement;

public class RequestDTO {

  //개인/비지니스 용도 제목 중요도 시작일 마감일 상태 
  private String purpose;
  private String title;
  private String importancelevel;
  private String startDate;
  private String endDate;
  private String state;
  
  //생성자 함수
  public RequestDTO(String purpose, String title, String importanceleve, String startDate, String endDate, String state) {
    this.purpose = purpose;
    this.title = title;
    this.importancelevel = importanceleve;
    this.startDate = startDate;
    this.endDate = endDate;
    this.state = state;
  }

  //getter 와 setter
  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getImportancelevel() {
    return importancelevel;
  }

  public void setImportancelevel(String importancelevel) {
    this.importancelevel = importancelevel;
  }

  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }
  

}
