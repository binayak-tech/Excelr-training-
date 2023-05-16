/* Abstraction is a way of hiding implemantation details and show only the functionality to the user.
    NOTE - 
        we cannot create instance of Abstract class
        it reduces duplication of code
*/


// creating a constructure function
function Student(){
    this.name = "name";
    throw new Error("You cannot create an instance of Abstract Class");
}
Student.prototype.show = function() {
    return "Student name is "+ this.name;
}

// creating another constructure function
function Teacher(name){
    this.name = name;
}

Teacher.prototype = Object.create(Student.prototype);
var stu = new Teacher("Binayak");
console.log(stu.show());
