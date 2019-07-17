/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvx;

/**
 *
 * @author hp
 */
public class Mvx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        student model  = retriveStudentFromDatabase();

      //Create a view : to write student details on console
      student_view view = new student_view();

      student_controller controller = new student_controller(model, view);

      controller.updateView();

      //update model data
      controller.setStudentName("Sir Riaz Bhatti");

      controller.updateView();
   }

   private static student retriveStudentFromDatabase(){
      student student = new student();
      student.setName("Umair");
      student.setRollNo("069");
      return student;
    }
    
}
