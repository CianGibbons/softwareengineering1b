/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package softwareengineering1b;

import org.joda.time.DateTime;
import sofwareengineering1a.CourseProgramme;
import sofwareengineering1a.Module;
import sofwareengineering1a.Student;
import java.util.ArrayList;

/**
 *
 * @author ciangibbons
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create Courses
        // public CourseProgramme(String name, DateTime academicStartDate, DateTime academicEndDate)
        ArrayList<CourseProgramme> listOfAllCourses = new ArrayList<>();
        CourseProgramme BCT = new CourseProgramme("BCT", new DateTime(2021, 9, 6, 9, 0, 0), new DateTime(2022, 5, 31, 6, 0, 0));
        CourseProgramme BACT = new CourseProgramme("BACT", new DateTime(2021, 9, 6, 9, 0, 0), new DateTime(2022, 5, 31, 6, 0, 0));
        CourseProgramme BAIT = new CourseProgramme("BAIT", new DateTime(2021, 9, 6, 9, 0, 0), new DateTime(2022, 5, 31, 6, 0, 0));
        
        listOfAllCourses.add(BCT);
        listOfAllCourses.add(BACT);
        listOfAllCourses.add(BAIT);

        //SubLists of Courses used to Associate Modules with Courses
        //BCT BAIT
        ArrayList<CourseProgramme> bctAndBaitCourses = new ArrayList<>();
        bctAndBaitCourses.add(BCT);
        bctAndBaitCourses.add(BAIT);
        //BCT BACT
        ArrayList<CourseProgramme> bctAndBactCourses = new ArrayList<>();
        bctAndBactCourses.add(BCT);
        bctAndBactCourses.add(BACT);
        //BACT, BAIT
        ArrayList<CourseProgramme> bactAndBaitCourses = new ArrayList<>();
        bactAndBaitCourses.add(BACT);
        bactAndBaitCourses.add(BAIT);
        //BACT
        ArrayList<CourseProgramme> bactCourseAsList = new ArrayList<>();
        bactCourseAsList.add(BACT);
        
        // Create Modules
        // public Module(String name, String id)
        ArrayList<Module> listOfAllModules = new ArrayList<>();
        Module professionalSkills = new Module("Advanced Professional Skills","CT436", listOfAllCourses);
        Module machineLearning = new Module("Machine Learning","CT4101", bctAndBaitCourses);
        Module softwareEngineering = new Module("Software Engineering","CT417", listOfAllCourses);
        Module graphicsAndImageProcessing = new Module("Graphics and Image Processing","CT404", bctAndBactCourses);
        Module humanComputerInteraction = new Module("Human Computer Interaction","CT318", bactAndBaitCourses);
        Module gamesProgramming = new Module("Games Programming","CT3536", bctAndBactCourses);
        Module networksAndDataCommunications = new Module("Networks and Data Communications 2","CT3531", listOfAllCourses);
        Module programmingParadigms = new Module("Programming Paradigms","CT331", bactCourseAsList);
        
        listOfAllModules.add(professionalSkills);//BCT, BACT, BAIT (All Courses Currently Available)
        listOfAllModules.add(machineLearning);//BCT, BAIT
        listOfAllModules.add(softwareEngineering);//BCT, BACT, BAIT (All Courses Currently Available)
        listOfAllModules.add(graphicsAndImageProcessing);//BCT, BACT
        listOfAllModules.add(humanComputerInteraction);//BACT, BAIT
        listOfAllModules.add(gamesProgramming);//BCT, BACT
        listOfAllModules.add(networksAndDataCommunications);//BCT, BACT, BAIT (All Courses Currently Available)
        listOfAllModules.add(programmingParadigms);//BACT
        
        // Create Students
        // public Student(String name, DateTime dob)
        ArrayList<Student> listOfAllStudents = new ArrayList<>();
        Student cianGibbons = new Student("Cian Gibbons", new DateTime(2000, 1, 21, 11, 15, 0));
        Student jamieLarkin = new Student("Jamie Larkin", new DateTime(2001, 1, 21, 14, 35, 0));
        Student joeRibbon = new Student("Joe Ribbon", new DateTime(2000, 12, 12, 13, 43, 0));
        Student jeremyHiggins = new Student("Jeremy Higgins", new DateTime(1999, 1, 21, 11, 21, 0));
        
        Student jackCollins = new Student("Jack Collins", new DateTime(2000, 3, 20, 15, 57, 0));
        Student kevinDuffy = new Student("Kevin Duffy", new DateTime(1999, 6, 15, 9, 16, 0));
        Student samuelTogher = new Student("Samuel Togher", new DateTime(1999, 11, 28, 18, 20, 0));
        Student laoiseTighe = new Student("Laoise Tighe", new DateTime(2001, 5, 18, 17, 0, 0));
        
        Student sarahMulroe = new Student("Sarah Mulroe", new DateTime(2000, 2, 2, 2, 25, 0));
        Student adamMurphy = new Student("Adam Murphy", new DateTime(1999, 12, 6, 6, 30, 0));
        Student alannaDaly = new Student("Alanna Daly", new DateTime(2000, 1, 5, 6, 15, 0));
        
        listOfAllStudents.add(cianGibbons);
        listOfAllStudents.add(jamieLarkin);
        listOfAllStudents.add(joeRibbon);
        listOfAllStudents.add(jeremyHiggins);
        listOfAllStudents.add(jackCollins);
        listOfAllStudents.add(kevinDuffy);
        listOfAllStudents.add(samuelTogher);
        listOfAllStudents.add(laoiseTighe);
        listOfAllStudents.add(sarahMulroe);
        listOfAllStudents.add(adamMurphy);
        listOfAllStudents.add(alannaDaly);
        
        
        //Register Students for their Course
        BCT.addStudent(cianGibbons);
        BCT.addStudent(jamieLarkin);
        BCT.addStudent(joeRibbon);
        BCT.addStudent(jeremyHiggins);
        
        BACT.addStudent(jackCollins);
        BACT.addStudent(kevinDuffy);
        BACT.addStudent(samuelTogher);
        BACT.addStudent(laoiseTighe);
        
        BAIT.addStudent(sarahMulroe);
        BAIT.addStudent(adamMurphy);
        BAIT.addStudent(alannaDaly);
        
        //Register Students for their Modules -> In turn adding those modules on the students list
        
        professionalSkills.addStudent(cianGibbons);
        machineLearning.addStudent(cianGibbons);
        softwareEngineering.addStudent(cianGibbons);
        
        machineLearning.addStudent(jamieLarkin);
        softwareEngineering.addStudent(jamieLarkin);
        graphicsAndImageProcessing.addStudent(jamieLarkin);
        
        softwareEngineering.addStudent(joeRibbon);
        networksAndDataCommunications.addStudent(joeRibbon);
        gamesProgramming.addStudent(joeRibbon);
        
        graphicsAndImageProcessing.addStudent(jeremyHiggins);
        professionalSkills.addStudent(jeremyHiggins);
        machineLearning.addStudent(jeremyHiggins);
        
        humanComputerInteraction.addStudent(jackCollins);
        softwareEngineering.addStudent(jackCollins);
        graphicsAndImageProcessing.addStudent(jackCollins);
        
        gamesProgramming.addStudent(kevinDuffy);
        networksAndDataCommunications.addStudent(kevinDuffy);
        humanComputerInteraction.addStudent(kevinDuffy);
        
        networksAndDataCommunications.addStudent(samuelTogher);
        softwareEngineering.addStudent(samuelTogher);
        professionalSkills.addStudent(samuelTogher);
        
        programmingParadigms.addStudent(laoiseTighe);
        gamesProgramming.addStudent(laoiseTighe);
        humanComputerInteraction.addStudent(laoiseTighe);
        
        professionalSkills.addStudent(sarahMulroe);
        machineLearning.addStudent(sarahMulroe);
        softwareEngineering.addStudent(sarahMulroe);
        
        networksAndDataCommunications.addStudent(adamMurphy);
        softwareEngineering.addStudent(adamMurphy);
        professionalSkills.addStudent(adamMurphy);
        
        humanComputerInteraction.addStudent(alannaDaly);
        softwareEngineering.addStudent(alannaDaly);
        professionalSkills.addStudent(alannaDaly);
            
        // Print out the Results
        System.out.println("\nList Of Courses: ");
        for(int i = 0; i < listOfAllCourses.size(); i++){
            System.out.println(listOfAllCourses.get(i));
        }
        
        System.out.println("\nList Of Modules: ");
        for(int i = 0; i < listOfAllModules.size(); i++){
            System.out.println(listOfAllModules.get(i));
        }
        
        System.out.println("\nList Of Students: ");
        for(int i = 0; i < listOfAllStudents.size(); i++){
            System.out.println(listOfAllStudents.get(i));
        }
    }
    
}
