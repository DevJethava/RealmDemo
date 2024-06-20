package com.devjethava.realmdemo

import android.app.Application
import com.devjethava.realmdemo.models.Address
import com.devjethava.realmdemo.models.Course
import com.devjethava.realmdemo.models.Student
import com.devjethava.realmdemo.models.Teacher
import io.realm.kotlin.Realm
import io.realm.kotlin.RealmConfiguration

class MyApp : Application() {

    companion object {
        lateinit var realm: Realm
    }

    override fun onCreate() {
        super.onCreate()
        realm = Realm.open(
            configuration = RealmConfiguration.create(
                schema = setOf(
                    Address::class,
                    Teacher::class,
                    Course::class,
                    Student::class
                )
            )
        )
    }
}