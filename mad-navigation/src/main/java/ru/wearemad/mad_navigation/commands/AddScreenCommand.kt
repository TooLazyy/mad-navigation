package ru.wearemad.mad_navigation.commands

import com.github.terrakok.cicerone.Command
import ru.wearemad.mad_navigation.route.FragmentRoute

class AddScreenCommand(
    val screen: FragmentRoute,
    val hideCurrent: Boolean
) : Command