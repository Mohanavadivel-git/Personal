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
    public String state;
    public String district;
    public String healthfacility;
    public String name;
    public String dob;
    public String Gender;
    public String phonenumber;
    public String address;
    public String leprosytype;
    public String identifiedtime;
    public String disabilitystatus;
    public String reactiontype;
    public String dose40mg;
    public String dose30mg;
    public String dose20mg;
    public String dose15mg;
    public String dose10mg;
    public String dose5mg;
    public String otherdrugs;
    public boolean treatmentcomplete;
    public boolean personstatus;
    public String remarks;


/*
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
    }*/
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
