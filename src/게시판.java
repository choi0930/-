import java.util.Scanner;

public class 게시판 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	 Scanner sc = new Scanner(System.in);//스캐너
	 String[] titles = new String[10];//제목
	 String[] bodies = new String[10];//내용
	 int[] ids =new int[10];
	 
	 int index=0;
	 int id = 1;
	 
	 //무한반복
	 while(true) {
		 
		 System.out.print("명령을 입력해주세요 :");		
		 String cmd = sc.nextLine();
		
		 //프로그램 종료
		 if(cmd.equals("exit")) {
			 System.out.println("프로그램을 종료합니다.");
			 break;
		 }
	
    //게시물 제목 및 내용 등록 
    if(cmd.equals("add")) {
    
    	
		 System.out.print("게시물 제목을 입력해주세요:");
		 titles[index]= sc.nextLine();
		 
		 System.out.print("게시물 내용을 입력해주세요:");
		 bodies[index] = sc.nextLine();
		 
		 System.out.println("게시물이 등록되었습니다.");
		 ids[index]=id;
		 
		 index++; 
	     id++;
    }
    
	 //add로 저장한거 출력
    if(cmd.equals("list")) {
    
    	for(int i =0; i < index ; i++) {
    	System.out.println("번호 : "+ ids[i]);
    	System.out.println("제목 :" + titles[i]);
    	System.out.println("====================");
    	
    	}
    }
    
	 
	 }
	 
	 
	}

}


