package ru.skillbranch.devintensive.utils

import android.provider.ContactsContract

object Utils {
    fun parseFullName(fullName:String?):Pair<String?, String?>{
        val parts : List<String>? = fullName?.split(" ")

        val firstName = parts?.getOrNull(0)
        val lastName = parts?.getOrNull(1)
        return Pair(firstName, lastName)
    }

    fun transliterations(payload: String, divider:String = " "): String {

    }

    fun toInitials(firstName: String?, lastName: String?): String? {

    }
}