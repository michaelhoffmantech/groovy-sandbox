package com.michaelhoffmantech.groovysandbox.groovybeans

import org.junit.Assert
import org.junit.Before
import org.junit.Test

import java.time.LocalDate

class TestPersonImmutable {

    @Before
    void setUp() {

    }

    @Test(expected = ReadOnlyPropertyException.class)
    void test_PersonImmutableAsserts() {
        PersonImmutable person = new PersonImmutable("Bob", 10, LocalDate.now())
        person.name = "fail"
    }
}
