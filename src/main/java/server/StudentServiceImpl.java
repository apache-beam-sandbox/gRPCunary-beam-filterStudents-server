package server;

import com.studentReader.generated.stubs.*;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl extends StudentServiceGrpc.StudentServiceImplBase {

    @Override
    public void getStudentList(Empty request,
                               StreamObserver<StudentObjectResponse> responseObserver) {
        System.out.println("Request received");
        List<Student> studentlist = new ArrayList<>();
        Student student1 = Student.newBuilder().setFname("Somanshu0").setLname("Shekhar0").setRoll(01).setBranch("CSE").setAddress(Address.newBuilder().setHouseNumber("House00").setPhone(123455).setStreet(Street.newBuilder().setStreetName("street00").setZipCode(123).build()).build()).build();
        Student student2 = Student.newBuilder().setFname("Somanshu1").setLname("Shekhar1").setRoll(10).setBranch("ETC").setAddress(Address.newBuilder().setHouseNumber("House01").setPhone(112345).setStreet(Street.newBuilder().setStreetName("street01").setZipCode(1123).build()).build()).build();
        Student student3 = Student.newBuilder().setFname("Somanshu2").setLname("Shekhar2").setRoll(20).setBranch("CSE").setAddress(Address.newBuilder().setHouseNumber("House02").setPhone(212345).setStreet(Street.newBuilder().setStreetName("street02").setZipCode(2123).build()).build()).build();
        Student student4 = Student.newBuilder().setFname("Somanshu3").setLname("Shekhar3").setRoll(30).setBranch("MECH").setAddress(Address.newBuilder().setHouseNumber("House03").setPhone(312345).setStreet(Street.newBuilder().setStreetName("street03").setZipCode(1123).build()).build()).build();
        Student student5 = Student.newBuilder().setFname("Somanshu4").setLname("Shekhar4").setRoll(40).setBranch("CSE").setAddress(Address.newBuilder().setHouseNumber("House04").setPhone(412345).setStreet(Street.newBuilder().setStreetName("street04").setZipCode(4123).build()).build()).build();
        Student student6 = Student.newBuilder().setFname("Somanshu5").setLname("Shekhar5").setRoll(50).setBranch("ETC").setAddress(Address.newBuilder().setHouseNumber("House05").setPhone(512345).setStreet(Street.newBuilder().setStreetName("street05").setZipCode(2123).build()).build()).build();
        Student student7 = Student.newBuilder().setFname("Somanshu6").setLname("Shekhar6").setRoll(60).setBranch("CSE").setAddress(Address.newBuilder().setHouseNumber("House06").setPhone(612345).setStreet(Street.newBuilder().setStreetName("street06").setZipCode(123).build()).build()).build();
        studentlist.add(student1);
        studentlist.add(student2);
        studentlist.add(student3);
        studentlist.add(student4);
        studentlist.add(student5);
        studentlist.add(student6);
        studentlist.add(student7);
        try {
            StudentObjectResponse students = StudentObjectResponse.newBuilder().addAllStudents(studentlist).build();
            // students.forEach(student -> {System.out.println(student);} );
            responseObserver.onNext(students);
            responseObserver.onCompleted();
            System.out.println("Response sent successfully");
        }catch (Exception exception){
            System.out.println("Exception Occurred:" +exception.getMessage());
        }
    }

}
