package ru.wearemad.mad_navigation.router

import android.os.Bundle
import com.github.terrakok.cicerone.Router
import ru.wearemad.mad_navigation.commands.AddScreenCommand
import ru.wearemad.mad_navigation.commands.ExitWithFragmentResult
import ru.wearemad.mad_navigation.commands.OpenDialogCommand
import ru.wearemad.mad_navigation.commands.ReplaceTabCommand
import ru.wearemad.mad_navigation.route.FragmentRoute

class AppRouter : Router() {

    fun openDialog(screen: FragmentRoute, replaceCurrent: Boolean = false) {
        executeCommands(OpenDialogCommand(screen, replaceCurrent))
    }

    fun addScreen(screen: FragmentRoute, hideCurrent: Boolean = true) {
        executeCommands(AddScreenCommand(screen, hideCurrent))
    }

    fun exitWithFragmentResult(requestCode: String, data: Bundle = Bundle.EMPTY) {
        executeCommands(ExitWithFragmentResult(requestCode, data))
    }

    fun replaceTab(screen: FragmentRoute) {
        executeCommands(ReplaceTabCommand(screen))
    }
}