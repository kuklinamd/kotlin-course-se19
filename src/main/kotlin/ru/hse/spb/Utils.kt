package ru.hse.spb

fun Boolean.toInt() = if (this) 1 else 0

fun Int.toBoolean() = this != 0
