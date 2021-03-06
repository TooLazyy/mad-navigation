package ru.wearemad.mad_navigation

import com.github.terrakok.cicerone.Cicerone
import com.github.terrakok.cicerone.NavigatorHolder
import ru.wearemad.mad_navigation.router.AppRouter

class CiceroneHolder {

    private val ciceroneHolder: MutableMap<String, Cicerone<AppRouter>> = mutableMapOf()

    fun getOrCreateRouter(key: String): AppRouter = getOrCreateCicerone(key).router

    fun getOrCreateHolder(key: String): NavigatorHolder =
        getOrCreateCicerone(key).getNavigatorHolder()

    fun remove(key: String) {
        ciceroneHolder.remove(key)
    }

    private fun getOrCreateCicerone(key: String): Cicerone<AppRouter> =
        ciceroneHolder[key] ?: Cicerone.create(AppRouter()).apply {
            ciceroneHolder[key] = this
        }
}