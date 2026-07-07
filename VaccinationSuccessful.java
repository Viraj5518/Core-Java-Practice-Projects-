package Abstraction;

class VaccinationSuccessful extends Vaccine
{
    VaccinationSuccessful(int age, String nationality)
    {
        super(age, nationality);
    }

    @Override
    void boosterDose()
    {
        if(firstDoseTaken)
        {
            System.out.println("Booster Dose Taken Successfully.");
        }
        else
        {
            System.out.println("Not Eligible for Booster Dose.");
        }
    }
}
