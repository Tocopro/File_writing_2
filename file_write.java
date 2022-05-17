package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void Patient() {
        Patient file_p = new Patient();
        file_p.getName();
        file_p.getAge();
        file_p.getGender();


            try {
                File patient = new File("C:\\Users\\NEAK\\Downloads\\java folder.txt");
                if (!patient.exists()) {
                    patient.createNewFile();
                }
                PrintWriter P_file = new PrintWriter(patient);
                P_file.println("0" );
                P_file.close();


            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

package com.company;
import java.util.Scanner;

public class Patient {


    public String getName()
    {
        Scanner name = new Scanner(System.in);
        System.out.println("Enter Patients Name: ");
        return name.nextLine();
    }
    public String getAge()
    {
        Scanner age = new Scanner(System.in);
        System.out.println("Enter Patients Age: ");
        return age.nextLine();
    }
    public String getGender()
    {
        Scanner gender = new Scanner(System.in);
        System.out.println("Enter Patients Gender: ");
        return gender.nextLine();
    }
    public void setName(String name) {
    }
    public void setAge(String age) {
    }
    public void setGender(String gender) {
    }


}



