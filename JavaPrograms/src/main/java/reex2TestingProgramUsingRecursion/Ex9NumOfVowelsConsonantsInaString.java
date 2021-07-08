package reex2TestingProgramUsingRecursion;

public class Ex9NumOfVowelsConsonantsInaString {
	
	
	
	// %%%%%%%%%%%%%%%%this program is not correct because we couldn't return vowels and consonants%%%%%%%%%%%%%%%%%%%%%

	public static void main(String[] args) {
		
		String s="Jesus is blessing my family";
		findVowelsAndConsonants(s);
		
	}
	static int findVowelsAndConsonants(String s) {
		
		int vowels_count=0;
		int conson_count=0;
		
		
		for(int i=0;i<s.length(); i++) {
			
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				
				vowels_count++;
			}else {
				
				conson_count++;
			}
		
	}return vowels_count;
		}
	}

