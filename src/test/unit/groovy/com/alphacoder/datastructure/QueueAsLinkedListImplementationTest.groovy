package com.alphacoder.datastructure

import spock.lang.Specification

class QueueAsLinkedListImplementationTest extends Specification{

    def 'Test QueueAsLinkedListImplementation | isEmpty() | queue is empty'(){
        given:
        def queue= new QueueAsLinkedListImplementation()

        when:
        def result= queue.isEmpty()

        then:
        result
    }

    def 'Test QueueAsLinkedListImplementation | isEmpty() | queue is not empty'(){
        given:
        def queue= new QueueAsLinkedListImplementation()
        queue.enQueue(0)

        when:
        def result= queue.isEmpty()

        then:
        !result
    }

    def 'Test QueueAsLinkedListImplementation | front() | queue is empty'(){
        given:
        def queue= new QueueAsLinkedListImplementation()

        when:
        queue.front()

        then:
        thrown(UnsupportedOperationException)
    }

    def 'Test QueueAsLinkedListImplementation | front() | queue is not empty'(){
        given:
        def queue= new QueueAsLinkedListImplementation()
        queue.enQueue(0)

        when:
        def result= queue.front()

        then:
        result==0

        and:
        !queue.isEmpty()
    }

    def 'Test QueueAsLinkedListImplementation | front() | more than one elements'(){
        given:
        def queue= new QueueAsLinkedListImplementation()
        queue.enQueue(0)
        queue.enQueue(1)

        when:
        def result= queue.front()

        then:
        result==0

        and:
        !queue.isEmpty()
    }

    def 'Test QueueAsLinkedListImplementation | enQueue() | insert one element'(){
        given:
        def queue= new QueueAsLinkedListImplementation()

        when:
        queue.enQueue(0)

        then:
        !queue.isEmpty()

        and:
        queue.front()== 0
    }

    def 'Test QueueAsLinkedListImplementation | enQueue() | insert more than one element'(){
        given:
        def queue= new QueueAsLinkedListImplementation()

        when:
        queue.enQueue(0)
        queue.enQueue(1)
        queue.enQueue(2)

        then:
        !queue.isEmpty()

        and:
        queue.front()== 0
    }

    def 'Test QueueAsLinkedListImplementation | deQueue() | queue is empty'(){
        given:
        def queue= new QueueAsLinkedListImplementation()

        when:
        queue.deQueue()

        then:
        thrown(UnsupportedOperationException)

    }

    def 'Test QueueAsLinkedListImplementation | deQueue() | queue has one element'(){
        given:
        def queue= new QueueAsLinkedListImplementation()
        queue.enQueue(0)

        when:
        queue.deQueue()

        then:
        queue.isEmpty()

    }

    def 'Test QueueAsLinkedListImplementation | deQueue() | queue has multiple element'(){
        given:
        def queue= new QueueAsLinkedListImplementation()
        queue.enQueue(0)
        queue.enQueue(1)

        when:
        queue.deQueue()

        then:
        !queue.isEmpty()

        and:
        queue.front()== 1

    }

    def 'Test QueueAsLinkedListImplementation | deQueue() | queue has multiple element and deleting multiple elements'(){
        given:
        def queue= new QueueAsLinkedListImplementation()
        queue.enQueue(0)
        queue.enQueue(1)
        queue.enQueue(2)
        queue.enQueue(3)
        queue.enQueue(4)

        when:
        queue.deQueue()
        queue.deQueue()
        queue.deQueue()

        then:
        !queue.isEmpty()

        and:
        queue.front()== 3

    }
}
