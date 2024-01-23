package ProjectManagement;

import java.text.SimpleDateFormat;

public class ProjectVO {

  private String title;
  private String importancelevel;
  private String startDate;
  private String endDate;
  private String state;
  
  //startDate를 문자열로 변환하는 메소드
  public String getStartDateAsString() {
    SimpleDateFormat startDateFormat = new SimpleDateFormat("yyyy-mm-dd");
    return startDate;
  }
  //endDate를 문자열로 변환하는 메소드
  public String getEndDateAsString() {
    SimpleDateFormat endDateFormat = new SimpleDateFormat("yyyy-mm-dd");
    return startDate;
  }
  
  public ProjectVO(String title, String importancelevel, String startDate, String  endDate, String state) {
    this.title = title;
    this.importancelevel = importancelevel;
    this.startDate = startDate;
    this.endDate = endDate;
    this.state = state;
  }
  @Override
  public String toString() {
    return "ProjectVO [제목 = " + title + ", 용도 = " + importancelevel + ", 시작날짜 = " + startDate + ", 마감날짜"+ endDate +", 상태" + state +"]";
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
