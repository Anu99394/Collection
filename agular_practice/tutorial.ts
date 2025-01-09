// let id:number=5;
// let company:string="acme corp";
// let isPublished:boolean =true;

// let ids:number[]=[1,2,3,4,5];
// let x:any="pedro";
// let xArr: any[] = ["pedro", 0 , true];


// const concatenateValues= (a:string,b:string):string => {
//     return "10";
// };

// console.log(concatenateValues("hello", "world"));
// console.log(concatenateValues("10","5"));

// interface User
// {
//     id:number;
//     name:string;
//     age?:number;
//     greet(message:string):void;
// }

// const user: User =
// {
//     id:2,
//     name:"anurag",
//     greet(message:string):void{
//         console.log(message);
//     }
// };

// console.log(user.id);
// console.log(user.name);
// console.log("hello");

// if(!user.age)
// {
//     console.log("No age is given");
// }
// else{
//     console.log(user.age);
// }

// function printId(id:number | string):void
// {
//     console.log(id);
// }

// const printId=(id:number | string | number[]) =>
//     {
//         console.log(id);
//     }


// printId(234);

// interface A {
//     name:string;
//     village:string;
// }

// interface B {
//     id:number;
// }

// type C= A & B;

// function fun(dummy: C):void 
// {
//     console.log(dummy.id+ " "+dummy.name);
// }

// fun({name:"anurag",village:"abc",id:1});


// class StorageContainer<T>
// {
//     private contents:T[];

//     constructor()
//     {
//         this.contents=[];
//     }

//     addItems(item:T)
//     {
//         this.contents.push(item);
//     }

//     getItems(index:number) : T | undefined
//     {
//         return this.contents[index];
//     }
// }

// const A=new StorageContainer<number>();
// A.addItems(10);
// A.addItems(20);
// console.log(A.getItems(1));

// const B=new StorageContainer<String>();
// B.addItems("10");
// B.addItems("30")
// console.log(B.getItems(1));


// interface Employee
// {
//     readonly id:number;
//     readonly startdate:Date;

//     name:string;
//     department:string;
// }

// const employee:Employee = {
//     id:2,
//     startdate:new Date(),
//     name:"Anurag",
//     department:"ECE"
// }

// employee.name="Anu";
// // employee.id(3);
// console.log(employee);


// class EmployeeClass implements Employee {
//     readonly id: number;
//     readonly startdate: Date;
//     name: string;
//     department: string;

//     // Constructor to initialize the properties
//     constructor(id: number, startdate: Date, name: string, department: string) {
//         this.id = id;
//         this.startdate = startdate;
//         this.name = name;
//         this.department = department;
//     }

//     // Optional: Add methods to the class
//     displayEmployeeDetails(): void {
//         console.log(`ID: ${this.id}, Name: ${this.name}, Department: ${this.department}, Start Date: ${this.startdate}`);
//     }
// }
// const employeee = new EmployeeClass(3, new Date(), "Anurag", "ECE");
// employeee.displayEmployeeDetails();


let num:number[]=[1,2,3,4,5,5,6,6,7,7,7,9];

for(let i=0;i<num.length;i++)
{
    console.log(num[i]);
}
console.log(num.join(" "));