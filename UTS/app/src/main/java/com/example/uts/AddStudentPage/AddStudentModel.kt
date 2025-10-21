package com.example.uts.AddStudentPage

class AddStudentModel (var myStudents : MutableList<Student> = mutableListOf()){
    fun addStudent(name: String, id: String, phone: String, address: String){
        this.myStudents.add(Student(name, id, phone, address))
    }
}

//MY TO DO LIST :
//Add Student Form Screen consist of
//–
//Student ID Text Field
//–
//Student Name Text Field
//–
//Student Phone Text Field
//–
//Student Address Text Field
//– Register button

class Student(
    val name: String,
    val id: String,
    val phone: String,
    val address: String
){

}