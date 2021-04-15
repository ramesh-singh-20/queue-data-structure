package com.alphacoder.datastructure

import spock.lang.Specification

class QueueAsArrayImplementationTest extends Specification{

    def 'Test QueueAsArrayImplementation | isEmpty() | Queue is empty'(){
        given:
        def queue= new QueueAsArrayImplementation()

        when:
        def result= queue.isEmpty()

        then:
        result
    }

    def 'Test QueueAsArrayImplementation | head() | Queue is empty'(){
        given:
        def queue= new QueueAsArrayImplementation();

        when:
        def result= queue.head()

        then:
        thrown(UnsupportedOperationException)
    }
}
