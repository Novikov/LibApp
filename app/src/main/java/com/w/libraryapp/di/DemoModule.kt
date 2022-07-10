package com.w.libraryapp.di

import com.w.libraryapp.Greetings
import com.w.libraryapp.GreetingsFormatter
import org.koin.dsl.module

private var demoAppModule = module {
    single { Greetings() }
    single { GreetingsFormatter(greetings = get()) }
}

val demoModules = listOf(demoAppModule)
