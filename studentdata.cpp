#include <iostream>

struct Student{
const std::string rollPrefix = "MRIIRS-";
int roll;
int age;
float marks;
char name[];
};

int main() {
    struct Student s1;
    
    std::cout << "Enter the name: ";
    std::cin >> s1.name;
    
    std::cout << "Enter your roll number: ";
    std::cin >> s1.roll;

    std::cout << "Enter your age: ";
    std::cin >> s1.age;

    std::cout << "Enter your marks: ";
    std::cin >> s1.marks;

    std::cout << "-----------------------" << std::endl;
    std::cout << "Your details:" << std::endl;
    std::cout << "Name: " << s1.name << std::endl;
    std::cout << "Roll number: " << s1.rollPrefix << s1.roll << std::endl;
    std::cout << "Age: " << s1.age << std::endl;
    std::cout << "Marks: " << s1.marks << std::endl;
    
    return 0;
}
