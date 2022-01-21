package com.github.muran2.yii1framework.services

import com.intellij.openapi.project.Project
import com.github.muran2.yii1framework.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
