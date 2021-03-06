package ru.wearemad.mad_navigation.commands

import com.github.terrakok.cicerone.Command
import ru.wearemad.mad_navigation.route.FragmentRoute

class OpenDialogCommand(
    val screen: FragmentRoute,
    val replaceCurrent: Boolean = false
) : Command