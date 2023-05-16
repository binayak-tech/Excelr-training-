/* The JavaScript Encapsulation is a process of binding the data (i.e. variables) 
with the functions acting on that data.
It allows us to control the data and validate it

use var keyword for class attributes to make them private;
use setter methods to set the data and getter methods to get the data
*/
class Student {
    constructor(){
        var name;
        var marks;
    }

    getName(){
        return this.name;
    }

    getMarks(){
        return this.marks;
    }

    setName(name){
        this.name = name;
    }
    setMarks(marks){
        this.marks = (marks < 100 && marks > 0) ? marks : alert("Invalid marks");
    }
}

const encapsulate = new Student();
encapsulate.setName("Binayak");
encapsulate.setMarks(94);
document.write("Name: " + encapsulate.getName()+ " Marks: " + encapsulate.getMarks());



// Prototype based encapsulation

function Employee(name, salary) {
    var eName = name;
    var eSalary = salary;

    Object.defineProperty(this,"name", {
       
        get:() => {
            return eName;
        },

        set:(eName) => {
            this.eName = eName;
        }

    });

    Object.defineProperty(this,"salary", {

        get:() => {
            return eSalary;
        },
        set:(eSalary) => {
            this.eSalary = eSalary;
        }
        
    });
  }


const obj = new Employee("Binayak", 50000);
console.log("Name = "+ obj.name + "  Salary = "+obj.salary);

