import java.util.ArrayList;
import java.util.List;

class Resume {
    private String name;
    private String email;
    private String phoneNumber;
    private List<String> education;
    private List<String> experience;
    private List<String> skills;

    public Resume(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.education = new ArrayList<>();
        this.experience = new ArrayList<>();
        this.skills = new ArrayList<>();
    }

    public void addEducation(String education) {
        this.education.add(education);
    }

    public void addExperience(String experience) {
        this.experience.add(experience);
    }

    public void addSkill(String skill) {
        this.skills.add(skill);
    }

    public void generateResume() {
        System.out.println("----------- Resume -----------");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("\nEducation:");
        for (String edu : education) {
            System.out.println("- " + edu);
        }
        System.out.println("\nExperience:");
        for (String exp : experience) {
            System.out.println("- " + exp);
        }
        System.out.println("\nSkills:");
        for (String skill : skills) {
            System.out.println("- " + skill);
        }
        System.out.println("-------------------------------");
    }
}

public class ResumeBuilder {
    public static void main(String[] args) {
        // Create a new resume instance
        Resume resume = new Resume("John Doe", "johndoe@example.com", "123-456-7890");

        // Add education
        resume.addEducation("Bachelor of Science in Computer Science, XYZ University, 2015-2019");
        resume.addEducation("High School Diploma, ABC High School, 2011-2015");

        // Add experience
        resume.addExperience("Software Engineer, XYZ Company, 2019-Present");
        resume.addExperience("Intern, ABC Company, Summer 2018");

        // Add skills
        resume.addSkill("Java");
        resume.addSkill("Python");
        resume.addSkill("Web Development");

        // Generate and display the resume
        resume.generateResume();
    }
}
