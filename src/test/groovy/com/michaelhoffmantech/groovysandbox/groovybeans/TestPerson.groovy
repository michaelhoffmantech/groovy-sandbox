package com.michaelhoffmantech.groovysandbox.groovybeans

import org.junit.Assert
import org.junit.Before
import org.junit.Test

import java.time.LocalDate

class TestPerson {

    @Before
    void setUp() {

    }

    @Test
    void test_PersonAsserts() {
        Person person = new Person()
        person.setName "Bob"
        person.setAge 10
        person.setBirthDate LocalDate.now()
        Assert.assertEquals("Bob", person.name)
        Assert.assertEquals(10, person.age)
        Assert.assertNotNull(person.birthDate)
    }
}
