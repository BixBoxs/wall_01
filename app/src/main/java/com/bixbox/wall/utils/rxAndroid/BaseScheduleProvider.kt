package com.bixbox.wall.utils.rxAndroid

import androidx.annotation.NonNull
import io.reactivex.Scheduler

interface BaseSchedulerProvider {

    @NonNull
    fun io(): Scheduler

    @NonNull
    fun ui(): Scheduler
}
