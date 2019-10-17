public class WordWrap {

    public static String wrapText(String words, int width) {
    //Splits string by spaces and puts them into string array
    String[] splitWords = words.split(" ");
    //create a string builder to hold final answer
    StringBuilder wordStack = new StringBuilder();
    //create a string builder to temporary hold current string to see if next string from array
    //will put it over defined width
    StringBuilder temp = new StringBuilder();
    for (String word:splitWords) {

        if(temp.length()+ word.length() >= width){

            wordStack.append(temp.toString().trim()).append("\n");
            temp.delete(0,temp.length());
            temp.append(word).append(" ");
        }else{
            temp.append(word).append(" ");
        }


    }
    //check to see if there is anything is left in temp if there is it adds it to wordstack;
    if(!(temp.length()==0)){
        wordStack.append(temp.toString().trim());
    }

    return wordStack.toString();
}
}
