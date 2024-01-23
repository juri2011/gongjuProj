package ProjectManagement;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ProjectDAO {
  
  //<String, ProjectVO>형 Map 객체 변수를 선언합니다.
  //personal, business 두 가지를 생성합니다.
  
  //데이터 저장소 역할 대행 Map 객체 
  private static Map<String, ProjectVO> personal = new HashMap<String, ProjectVO>();
  private static Map<String, ProjectVO> business = new HashMap<String, ProjectVO>();
  
  // ProjectVO 타입의 데이터를 받아 DB에 저장하는 함수
  public void insert(ProjectVO vo) {
    personal.put(vo.getTitle(), vo);
    business.put(vo.getTitle(), vo);
  }
  //제목으로 등록된 목록확인 하기
  public ProjectVO pSelectOne(String title) {
    return personal.get(title);
  }
  public ProjectVO bSelectOne(String title) {
    return business.get(title);
  }
  
  //개인 프로젝트 목록 확인
  public Collection<ProjectVO> pSelectList(){
    return personal.values();
  }
      
  //비지니스 프로젝트 목록 확인
  public Collection<ProjectVO> bSelectList(){
    return business.values();
  }
  
  //title 정보 수정
  public void update(ProjectVO vo) {
    personal.put(vo.getTitle(), vo);
    business.put(vo.getTitle(), vo);
  }
}




