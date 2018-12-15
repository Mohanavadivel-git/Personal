package com.example.Personal.Model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@Getter @Setter @NoArgsConstructor
public class Leprosy {
    @Id
    @GeneratedValue(
            strategy= GenerationType.AUTO,
            generator="native"
    )
    @GenericGenerator(
            name = "native",
            strategy = "native"
    )
    public  int id;
    public String State;
    public String District;
    public String Healthfacility;
    public String Name;
    public String Dob;
    public String Gender;
    public String Phonenumber;
    public String Address;
    public String Leprosytype;
    public String Identifiedtime;
    public String Disabilitystatus;
    public String Reactiontype;
    public String Dose40mg;
    public String Dose30mg;
    public String Dose20mg;
    public String Dose10mg;
    public String Dose5mg;
    public String Otherdrugs;
    public boolean Treatmentcomplete;
    public boolean Personstatus;
    public String Remarks;



    public Leprosy(String State,String District,String Healthfacility,String Name,String Dob,String Gender,String Phonenumber,
                   String Address,String Leprosytype,String Identifiedtime,String Disabilitystatus,String Reactiontype,String Dose40mg,String Dose30mg,String Dose20mg,String Dose10mg,String Dose5mg,
                   String Otherdrugs,boolean Treatmentcomplete,boolean Personstatus,String Remarks) {
        this.State=State;
        this.District=District;
        this.Healthfacility=Healthfacility;
        this.Name=Name;
        this.Dob=Dob;
        this.Gender=Gender;
        this.Phonenumber=Phonenumber;
        this.Address=Address;
        this.Leprosytype=Leprosytype;
        this.Identifiedtime=Identifiedtime;
        this.Disabilitystatus=Disabilitystatus;
        this.Reactiontype=Reactiontype;
        this.Dose40mg=Dose40mg;
        this.Dose30mg=Dose30mg;
        this.Dose20mg=Dose20mg;
        this.Dose10mg=Dose10mg;
        this.Dose5mg=Dose5mg;
        this.Otherdrugs=Otherdrugs;
        this.Treatmentcomplete=Treatmentcomplete;
        this.Personstatus=Personstatus;
        this.Remarks=Remarks;
    }
/*
    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }*/
}
