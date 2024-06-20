package com.devjethava.realmdemo.models

import io.realm.kotlin.ext.realmListOf
import io.realm.kotlin.types.RealmList
import io.realm.kotlin.types.RealmObject
import io.realm.kotlin.types.annotations.PrimaryKey
import org.mongodb.kbson.BsonObjectId
import org.mongodb.kbson.ObjectId

class Teacher : RealmObject {
    @PrimaryKey
    var _id: ObjectId = BsonObjectId()
    var address: Address? = null
    var courses: RealmList<Course> = realmListOf()
}
