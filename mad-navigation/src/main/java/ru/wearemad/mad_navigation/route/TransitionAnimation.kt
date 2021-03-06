package ru.wearemad.mad_navigation.route

import androidx.annotation.AnimRes
import androidx.annotation.AnimatorRes
import ru.wearemad.mad_navigation.R

data class TransitionAnimation(
    @AnimatorRes @AnimRes val enter: Int = R.anim.scale_fade_in,
    @AnimatorRes @AnimRes val exit: Int = R.anim.scale_fade_out,
    @AnimatorRes @AnimRes val popEnter: Int = R.anim.scale_fade_in,
    @AnimatorRes @AnimRes val popExit: Int = R.anim.scale_fade_out
)