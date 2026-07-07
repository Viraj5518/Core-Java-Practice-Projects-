package Abstraction;

abstract class Vaccine
{
    int age;
    String nationality;
    boolean firstDoseTaken = false;

    Vaccine(int age, String nationality)
    {
        this.age = age;
        this.nationality = nationality;
    }

    void firstDose()
    {
        if(age >= 18 && nationality.equalsIgnoreCase("Indian"))
        {
            System.out.println("First Dose Taken Successfully.");
            System.out.println("Pay Rs.250");
            firstDoseTaken = true;
        }
        else
        {
            System.out.println("Not Eligible for First Dose.");
        }
    }

    void secondDose()
    {
        if(firstDoseTaken)
        {
            System.out.println("Second Dose Taken Successfully.");
        }
        else
        {
            System.out.println("Take First Dose First.");
        }
    }

    abstract void boosterDose();
}

