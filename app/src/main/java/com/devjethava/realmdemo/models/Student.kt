package com.devjethava.realmdemo.models

import io.realm.kotlin.ext.backlinks
import io.realm.kotlin.ext.realmListOf
import io.realm.kotlin.query.RealmResults
import io.realm.kotlin.types.RealmList
import io.realm.kotlin.types.RealmObject
import io.realm.kotlin.types.annotations.PrimaryKey
import org.mongodb.kbson.BsonObjectId
import org.mongodb.kbson.ObjectId

class Student : RealmObject {
    @PrimaryKey
    var _id: ObjectId = BsonObjectId()
    var name: String = ""

    // foreign key
    val enrolledCourse: RealmResults<Course> by backlinks(Course::enrolledStudent)
}
