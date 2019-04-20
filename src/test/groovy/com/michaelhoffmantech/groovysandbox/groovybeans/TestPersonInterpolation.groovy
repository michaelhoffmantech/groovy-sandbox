package com.michaelhoffmantech.groovysandbox.groovybeans

import org.junit.Assert
import org.junit.Before
import org.junit.Test

import java.time.LocalDate

class TestPersonInterpolation {

    @Before
    void setUp() {

    }

    @Test
    void test_interpolation() {
        Person person = new Person()
        person.setName "Bob"
        person.setAge 10
        person.setBirthDate LocalDate.now()

        Assert.assertEquals(0, "Bob is 10".compareTo("$person.name is $person.age"))
    }

    @Test
    void test_interpolationWithClosure() {
        def number = 1
        def istring = "Number is ${number}"
        def istringclosure = "Number is ${-> number}"
        Assert.assertTrue("Number is 1" == istring)
        Assert.assertTrue("Number is 1" == istringclosure)
        number = 2
        Assert.assertTrue("Number is 1" == istring)
        Assert.assertTrue("Number is 2" == istringclosure)
    }


}
