public class WordWrap {public static String wrapText(String words, int length) {

    String[] splitWords = words.split(" ");
    StringBuilder wordStack = new StringBuilder();
    StringBuilder temp = new StringBuilder();
    for (String word:splitWords) {

        if(temp.length()+ word.length() >= length){
            wordStack.append(temp).append("\n");
            temp.delete(0,temp.length());
            temp.append(word).append(" ");
        }else{
            temp.append(word).append(" ");
        }


    }
    if(!(temp.length()==0)){
        wordStack.append(temp);
    }

    return wordStack.toString();
}
}
