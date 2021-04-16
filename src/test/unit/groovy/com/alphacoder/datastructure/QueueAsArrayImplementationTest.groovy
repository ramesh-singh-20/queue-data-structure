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

    def 'Test QueueAsArrayImplementation | isEmpty() | Queue is not empty'(){
        given:
        def queue= new QueueAsArrayImplementation()
        queue.enQueue(0)

        when:
        def result= queue.isEmpty()

        then:
        !result
    }

    def 'Test QueueAsArrayImplementation | head() | Queue is empty'(){
        given:
        def queue= new QueueAsArrayImplementation()

        when:
        queue.head()

        then:
        thrown(UnsupportedOperationException)
    }

    def 'Test QueueAsArrayImplementation | head() | Queue is not empty'(){
        given:
        def queue= new QueueAsArrayImplementation()
        queue.enQueue(0)

        when:
        def result= queue.head()

        then:
        result== 0
        and:
        !queue.isEmpty()
    }

    def 'Test QueueAsArrayImplementation | deQueue() | Queue is empty'(){
        given:
        def queue= new QueueAsArrayImplementation()

        when:
        queue.deQueue()

        then:
        thrown(UnsupportedOperationException)
    }

    def 'Test QueueAsArrayImplementation | deQueue() | Queue is not empty'(){
        given:
        def queue= new QueueAsArrayImplementation()
        queue.enQueue(0)


        when:
        def result= queue.deQueue()

        then:
        result== 0
        and:
        queue.isEmpty()
    }

    def 'Test QueueAsArrayImplementation | deQueue() | Deleting multiple elements'(){
        given:
        def queue= new QueueAsArrayImplementation()
        queue.enQueue(0)
        queue.enQueue(1)
        queue.enQueue(2)
        queue.deQueue()

        when:
        def result= queue.deQueue()

        then:
        result== 1
        queue.head()==2
        !queue.isEmpty()
    }

    def 'Test QueueAsArrayImplementation | deQueue() | Deleting all elements'(){
        given:
        def queue= new QueueAsArrayImplementation()
        queue.enQueue(0)
        queue.enQueue(1)
        queue.enQueue(2)
        queue.deQueue()
        queue.deQueue()

        when:
        def result= queue.deQueue()

        then:
        result== 2
        queue.isEmpty()
    }

    def 'Test QueueAsArrayImplementation | enQueue() | inserting multiple elements'(){
        given:
        def queue= new QueueAsArrayImplementation()

        when:
        queue.enQueue(0)
        queue.enQueue(1)
        queue.enQueue(2)

        then:
        !queue.isEmpty()

        and:
        queue.head()==0
    }

    def 'Test QueueAsArrayImplementation | enQueue() | inserting elements greater than initial capacity'(){
        given:
        def queue= new QueueAsArrayImplementation()

        when:
        queue.enQueue(0)
        queue.enQueue(1)
        queue.enQueue(2)
        queue.enQueue(3)
        queue.enQueue(4)
        queue.enQueue(5)
        queue.enQueue(6)
        queue.enQueue(7)
        queue.enQueue(8)
        queue.enQueue(9)
        queue.enQueue(10)
        queue.enQueue(11)

        then:
        !queue.isEmpty()

        and:
        queue.head()==0
    }
}
