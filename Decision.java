class Decision {

  public static void main(String[] args) {
    Decision d = new Decision();
    d.checkGrade('A');
    d.checkGrade('B');
    d.checkGrade('C');
    d.checkGrade('D');
    d.checkGrade('E');
    d.checkGrade('F');
    d.checkGrade('Z');
    
  }

  public void checkGrade(char grade) {
    if (grade == 'A') {
      System.out.println("Excellent");
    } else if (grade == 'B') {
      System.out.println("Very good");
    } else if (grade == 'C') {
      System.out.println("Well done");
    } else if (grade == 'D') {
      System.out.println("Pass");
    } else if (grade == 'E') {
      System.out.println("Almost failed");
    } else if (grade == 'F') {
      System.out.println("Failed");
    } else {
      System.out.println("Invalid grade");
    }

    System.out.println("Your grade is: " + grade);
  }

  public void printGrade(int score) {
    if (score >= 70) {
      System.out.println("Your grade is A");
    } else if (score >= 60 && score < 70) {
      System.out.println("Your grade is B");
    } else if (score >= 50 && score < 60) {
      System.out.println("Your grade is C");
    } else if (score >= 40 && score < 50) {
      System.out.println("Your grade is D");
    } else if (score >= 30 && score < 40) {
      System.out.println("Your garde is E");
    } else if (score >= 20 && score < 30) {
       System.out.println("Your grade is F");
    } else {
      System.out.println("Invalid grade");
    }

  System.out.println("Your grade is" + score);
  }

  public void determineGrade(int score) {
    score > 70 ? System.out.println("Grade is A") : System.out.println("Grade is not A");

    if (score > 70) {
      System.out.println("Grade is A");
    } else {
      System.out.println("Grade is not A");
    }
  }

  public void calculatePropertyType(int x, int y, String propertyType) {
    if (propertyType == "area") {
      System.out.println("Area = " + (x * y));
    } else if (propertyType == "perimeter") {
      System.out.println("Area = " + (2 * (x + y)));
    }

  }


  public void doNestedIf() {
   
  }
}