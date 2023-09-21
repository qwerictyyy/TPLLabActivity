package theoryOfProgrammingLanguage;

public class labActivity3 {

	public static void main(String[] args) {
		String state = "q0";
		String state1 = "q0";
		String input[] = {"1", "0", "1"};
		
		for(int x = 0; x < input.length; x++){
            if(state.equals("q0") && state1.equals("q0") && input[x] == "1"  ){
            	
                state = "q0";
                state1 = "q0";
            }else if(state.equals("q0") && state1.equals("q0") && input[x] == "0" ){
            	
                state = "q1";
                state1 = "q1";
            }else if(state.equals("q1") && state1.equals("q1") && input[x] == "0"  ){
            	
                state = "q1";
                state1 = "q1";
            }else if(state.equals("q1") && state1.equals("q1") && input[x] == "1"  ){

                state = "q2";
                state1 = "q1";
                
            }else if(state.equals("q2") && state.equals("q2") && input[x] == "0"  ){

                state = "q1";
                state1 = "q1";
                
            }else if(state.equals("q2") && state.equals("q2") && input[x] == "1"  ){

                state = "q0";
                state1 = "q1";
                
            }else{
                System.out.println("Invalid input.. Exiting automaton");
            }

        }
		
		if(state.equals("q2") && state1.equals("q1")){
            System.out.println("String accepted");
        }else{
            System.out.println("String not accepted");
        }
	}

}
