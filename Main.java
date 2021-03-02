

class Main {
  public static void main(String[] args) {
    Student student1 = new Student();
    Student student2 = new Student();

  double sum = 0;

    student1.setName("Arnold Spielberg");
    student1.setGPA(4.0);
    student1.setMajor("Electrical Engineering");
        student1.print();


    student2.setName("Jason Morgner");
    student2.setGPA(4.3);
    student2.setMajor("IS");
        student2.print();

    double gpas[] = new double [2]; 
      gpas[0] = student1.getGPA();
      gpas[1] = student2.getGPA();

    for (double i : gpas){
      sum += i;

      
     
     

    }
    System.out.println(sum/gpas.length);
  }
}
