package Abstraction;

public class Vaccination
{
    public static void main(String[] args)
    {
        VaccinationSuccessful v =
                new VaccinationSuccessful(18, "Indian");

        v.firstDose();

        v.secondDose();

        v.boosterDose();
    }
}
