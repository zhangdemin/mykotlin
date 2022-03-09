package com.github.zhangdemin.mykotlin.services

import com.intellij.openapi.project.Project
import com.github.zhangdemin.mykotlin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
