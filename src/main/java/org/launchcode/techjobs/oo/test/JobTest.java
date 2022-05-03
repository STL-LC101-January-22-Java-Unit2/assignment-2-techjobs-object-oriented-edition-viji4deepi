package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import java.lang.String.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
//empty constructor
public class JobTest {
    @Test
    public void testSettingJobId(){
        Job job = new Job();
        Job job1 = new Job();
       assertNotEquals(job.getId(),job1.getId());
    }
    Job job;

    @Before
    public void testobjects(){
        new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
       // make values to toString

    }
    // test testJobConstructorSetsAllFields
    @Test
    public void testJobConstructorSetsAllFields(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
      //  assertEquals(1,job.getId());
        assertEquals("Product tester",job.getName());
        assertEquals("ACME",job.getEmployer().getValue());
        assertEquals("Desert",job.getLocation().getValue());
        assertEquals("Quality control",job.getPositionType().getValue());
        assertEquals("Persistence",job.getCoreCompetency().getValue());
       // assertTrue(job != null);
        assertTrue("Product tester".equals(job.getName()));
        assertTrue("ACME".equals(job.getEmployer().getValue()));
        assertTrue("Desert".equals(job.getLocation().getValue()));
        assertTrue("Quality control".equals(job.getPositionType().getValue()));
        assertTrue("Persistence".equals(job.getCoreCompetency().getValue()));
       // assertFalse(job != job);
       // assertFalse();
    }


    @Test
    public void testToStringHandlesEmptyField(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String  jobToString = "\nID: " + job.getId() + '\n' +
                "Name: " + job.getName() + '\n' +
                "Employer: " + job.getEmployer() + '\n' +
                "Location: " + job.getLocation() + '\n' +
                "Position Type: " + job.getPositionType() + '\n' +
                "Core Competency: " + job.getCoreCompetency() + '\n';
        assertEquals(job.toString(),jobToString);

    }
    @Test
    public void testJobsForEquality(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job.equals(job1));

    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        char firstChar = job.toString().charAt(0);
        char lastChar = job.toString().charAt(job.toString().length()-1);
        assertEquals(firstChar, '\n');
        assertEquals(lastChar, '\n');
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String  jobToString = "\nID: " + job.getId() + '\n' +
                "Name: " + job.getName() + '\n' +
                "Employer: " + job.getEmployer() + '\n' +
                "Location: " + job.getLocation() + '\n' +
                "Position Type: " + job.getPositionType() + '\n' +
                "Core Competency: " + job.getCoreCompetency() + '\n';
    assertEquals(job.toString(),jobToString);
    }


}



/*
"Persistence"
 */
