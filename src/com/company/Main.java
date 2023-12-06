package com.company;

import classes.*;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        // Create university
        University vsu = new University();
        vsu.setName("ВГУ");

        // Create faculties
        Faculty rgp = new Faculty();
        rgp.setName("РГФ");

        Faculty csf = new Faculty();
        csf.setName("ФКН");

        List<Faculty> faculties = new ArrayList<>();
        faculties.add(rgp);
        faculties.add(csf);

        vsu.setFaculties(faculties);

        // Create institutes
        Institute prAndIT = new Institute();
        prAndIT.setName("ПиИТ");

        Institute iTInManagement = new Institute();
        iTInManagement.setName("ИТУ");

        Institute iS = new Institute();
        iS.setName("Информационных систем");

        List<Institute> institutes = new ArrayList<>();
        institutes.add(prAndIT);
        institutes.add(iTInManagement);
        institutes.add(iS);

        csf.setInstitutes(institutes);

        // Create researches
        Research research = new Research();
        research.setName("Научный сотрудник");

        List<Research> researches = new ArrayList<>();
        researches.add(research);
        iS.setResearches(researches);

        // Create lecturers
        Lecturer lecturer = new Lecturer();
        lecturer.setName("Лектор");

        Lecturer practitioner = new Lecturer();
        practitioner.setName("Практик");

        List<Lecturer> lecturers = new ArrayList<>();
        lecturers.add(lecturer);
        lecturers.add(practitioner);

        // Create courses
        Course course1 = new Course();
        course1.setName("Физика");

        Course course2 = new Course();
        course2.setName("Программная инженерия");

        List<Course> coursesForAll = new ArrayList<>();
        coursesForAll.add(course1);
        lecturer.setCourses(coursesForAll);
        practitioner.setCourses(coursesForAll);

        List<Course> coursesForFirst = new ArrayList<>();
        coursesForFirst.add(course1);
        coursesForFirst.add(course2);
        lecturer.setCourses(coursesForFirst);

        // Create projects
        Project project1 = new Project();
        project1.setName("ИТ сегодня");
        project1.setStartingDate("2023.03.05");
        project1.setEndDate("2024.05.05");

        List<Project> projects = new ArrayList<>();
        projects.add(project1);
        research.setProjects(projects);

        Participation empForResearch1 = new Participation();
        empForResearch1.setHours(12);

        research.setProjects(projects);

        // Create administrative personal
        AdministrativePersonal personal1 = new AdministrativePersonal();
        personal1.setName("Гардеробщица");

        AdministrativePersonal personal2 = new AdministrativePersonal();
        personal2.setName("Диспетчер");

        List<AdministrativePersonal> administrativePersonals = new ArrayList<>();
        administrativePersonals.add(personal1);
        administrativePersonals.add(personal2);

        vsu.setPersonals(administrativePersonals);

        Employee dean = new Employee();
        dean.setName("Декан");
        csf.setDean(dean);

        for (Faculty faculty : vsu.getFaculties()) {
            System.out.println("Faculty name: " + faculty.getName());

            for (Institute institute : faculty.getInstitutes()) {
                System.out.println("---- Institute name: " + institute.getName());

                for (Research res : institute.getResearches()) {
                    System.out.println("-------- Research name: " + res.getName());

                    for (Project project : res.getProjects()) {
                        System.out.println("------------ Project name: " + project.getName());
                    }

                }
            }
        }

        for (AdministrativePersonal adP : vsu.getPersonals()) {
            System.out.println("Personal name: " + adP.getName());
        }

        for (Lecturer lec : lecturers) {
            System.out.println("Lecturer name: " + lec.getName());

            for (Course course : lec.getCourses()) {
                System.out.println("---- Course name: " + course.getName());
            }
        }
        
        System.out.println("Dean of csf: " + csf.getDean().getName());

    }
}
