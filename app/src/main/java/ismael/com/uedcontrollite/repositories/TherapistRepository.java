package ismael.com.uedcontrollite.repositories;

import ismael.com.uedcontrollite.R;
import ismael.com.uedcontrollite.model.Activitys;
import ismael.com.uedcontrollite.model.Therapist;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;


public class TherapistRepository extends ArrayList<Therapist> {

    public static TherapistRepository therapistRep;

    public static TherapistRepository getInstance(){

        if(therapistRep == null)
            therapistRep = new TherapistRepository();

        return therapistRep;
    }


    private TherapistRepository(){

        add(new Therapist("Elisa", "Ramos", "86957412F",  "eliloga@gmail.com", "752148569", R.drawable.ter, "0000"));
        add(new Therapist("Ana", "Zamora", "45926845M",  "anazamo@gmail.com", "678594815", R.drawable.ter, "0000"));
        add(new Therapist("Andrea", "Perez", "67846845Z",  "andreaperz@gmail.com", "659231452", R.drawable.ter, "0000"));
        add(new Therapist("Elisa", "Lopez", "86957412F",  "eliloga@gmail.com", "752148569", R.drawable.ter, "0000"));


    }



}
