package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    //constructor for id's
    public  Job(){
        id = nextId;
        nextId++;
    }

    //constructor for fields
    public Job(String name,Employer employer,Location location,PositionType positionType,CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Job job = (Job) o;
//        return name.equals(job.name) && employer.equals(job.employer) && location.equals(job.location) && positionType.equals(job.positionType) && coreCompetency.equals(job.coreCompetency);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }



    //toString


    @Override
    public String toString() {
        String data = "Data not available";

        if(name == ""||name == null){
            name = data;
        } if(employer.getValue() == ""){
           employer.setValue(data);
        } if(location.getValue() == ""||location.getValue() == null){
            location.setValue(data);
        } if(positionType.getValue() == ""||positionType.getValue() == null){
            positionType.setValue(data);
        }  if(coreCompetency.getValue() == ""||coreCompetency.getValue() == null) {
            coreCompetency.setValue(data);
        }
        return  "\nID: " + id + '\n' +
                        "Name: " + name + '\n' +
                        "Employer: " + employer + '\n' +
                        "Location: " + location + '\n' +
                        "Position Type: " + positionType + '\n' +
                        "Core Competency: " + coreCompetency + '\n';
    }
}
