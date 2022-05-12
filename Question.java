public class Question {
    String Question,answer1,answer2,answer3,answer4,correctAnswer;

    public Question(String question, String answer1, String answer2, String answer3, String answer4,
            String correctAnswer) {
        Question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.correctAnswer = correctAnswer;
    }
    
    /** 
     * @return Question - returning the question
     */
    public String getQuestion() {
        return Question;
    }

    
    /** 
     * @param question  
     */
    public void setQuestion(String question) {
        Question = question;
    }

    
    /** 
     * @return answer1 - 1st answer(option)
     */
    public String getAnswer1() {
        return answer1;
    }

    
    /** 
     * @param answer1
     */
    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    
    /** 
     * @return answer2- 2nd answer(option)
     */
    public String getAnswer2() {
        return answer2;
    }

    
    /** 
     * @param answer2
     */
    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    
    /** 
     * @return answer3 - 3rd answer(option)
     */
    public String getAnswer3() {
        return answer3;
    }

    
    /** 
     * @param answer3
     */
    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    
    /** 
     * @return answer4 - 4th answer(option)
     */
    public String getAnswer4() {
        return answer4;
    }

    
    /** 
     * @param answer4
     */
    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }

    
    /** 
     * @return correctAnswer - returns the correct answer
     */
    public String getCorrectAnswer() {
        return correctAnswer;
    }

    
    /** 
     * @param correctAnswer
     */
    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    
    /** 
     * @return Question - returning the question
     * @return answer1 - 1st answer(option)
     * @return answer2 - 2nd answer(option)
     * @return answer3 - 3rd answer(option)
     * @return answer4 - 4th answer(option)
     */
    @Override
    public String toString() {
        return Question + "\n" + answer1 + "\n" + answer2 + "\n" + answer3 + "\n" + answer4;
    }

    
}
