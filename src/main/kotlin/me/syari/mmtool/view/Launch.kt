package me.syari.mmtool.view

import javafx.stage.Stage
import tornadofx.App

class Launch:App(MainView::class){
    override fun start(stage: Stage) {
        stage.isResizable = false
        super.start(stage)
    }
}