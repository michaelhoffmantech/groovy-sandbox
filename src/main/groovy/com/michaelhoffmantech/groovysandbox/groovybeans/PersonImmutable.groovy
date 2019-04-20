package com.michaelhoffmantech.groovysandbox.groovybeans

import groovy.transform.Immutable

import java.time.LocalDate

@groovy.transform.Immutable
class PersonImmutable {
    String name
    Integer age
    LocalDate birthDate
}
