package com.bixbox.wall.utils.rxAndroid

import androidx.annotation.NonNull
import io.reactivex.Scheduler
import io.reactivex.schedulers.Schedulers

open class ImmediateSchedulerProvider : BaseSchedulerProvider {

    @NonNull
    override fun io(): Scheduler {
        return Schedulers.trampoline()
    }

    @NonNull
    override fun ui(): Scheduler {
        return Schedulers.trampoline()
    }
}
