package ru.wearemad.mad_navigation.route

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.github.terrakok.cicerone.androidx.FragmentScreen
import ru.wearemad.mad_navigation.data.SharedTransitionInfo

private const val ARG_SHARED_ELEMENTS_NAMES = "ru.wearemad.mad_navigation.route.arg_shared_elements_names"

open class FragmentRoute(
    private val creator: () -> Fragment
) : FragmentScreen(fragmentCreator = { creator() }) {

    companion object {

        fun fetchArgSharedElementsNames(args: Bundle?): List<String> =
            (args?.getStringArray(ARG_SHARED_ELEMENTS_NAMES) ?: emptyArray<String>()).toList()
    }

    val sharedTransitionInfo = SharedTransitionInfo()

    var animation: TransitionAnimation? = null

    fun withDefaultAnim(): FragmentRoute = this.apply {
        animation = TransitionAnimation()
    }

    fun withCustomAnim(transition: TransitionAnimation): FragmentRoute = this.apply {
        animation = transition
    }

    open fun applySharedTransitionInfo(fragment: Fragment?) {
        fragment ?: return
        if (sharedTransitionInfo.hasSharedElements.not()) {
            return
        }
        var args = fragment.arguments
        if (args == null) {
            args = Bundle()
            fragment.arguments = args
        }
        args.putSharedElementsNamesIfExist()
    }

    private fun Bundle.putSharedElementsNamesIfExist() {
        putStringArray(ARG_SHARED_ELEMENTS_NAMES, sharedTransitionInfo.names.toTypedArray())
    }
}