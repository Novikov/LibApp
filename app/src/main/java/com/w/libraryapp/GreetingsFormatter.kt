package com.w.libraryapp

import com.w.libraryapp.DataConsumer.greetings

class GreetingsFormatter(greetings: Greetings) {

    fun sayHiWithName() = "Hi, ${greetings.name}"
}
