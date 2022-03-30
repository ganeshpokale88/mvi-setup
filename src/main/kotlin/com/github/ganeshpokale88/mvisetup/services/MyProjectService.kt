package com.github.ganeshpokale88.mvisetup.services

import com.intellij.openapi.project.Project
import com.github.ganeshpokale88.mvisetup.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
