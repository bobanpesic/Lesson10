package exercises;

import java.util.List;


import examples.FileHelper;

public class Palindrome {

	public List<String> loadWords() {
		return FileHelper.loadFileContentsIntoArrayList("resource/words.txt");
	}

	public boolean isPalindrome(String string) {

        for (int i=0 , j=string.length()-1 ; i<j ; i++ , j-- ) {

            if ( string.charAt(i) != string.charAt(j) ) {
                return false;
            }
        }

        return true;
    }


	}

	
	



