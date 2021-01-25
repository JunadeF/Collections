package collections.Junade;

import org.junit.Test;

import org.junit.Assert;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.ApplicationContext;


public class PersonTest
{
    ApplicationContext appContext = new AnnotationConfigApplicationContext(ConfigureClass.class);

    PersonsInterface pInterface = (PersonsInterface) appContext.getBean("PersonCount");

    PersonsInterface p = new PersonsInterfaceImplementation();

    @Test
    public void testAddFirstName()
    {
        String result = p.addFirstName("Tahrik");

        Assert.assertEquals("Tahrik", result);
    }

    @Test
    public void testAddLastName()
    {
        String result = p.addLastName("Jacobs");

        Assert.assertEquals("Jacobs", result);
    }

    @Test
    public void testAddAge()
    {
        int result = p.addAge(31);

        Assert.assertEquals(31, result);
    }
}