package com.example.dagger2example

import dagger.Component

@Component
interface MagicBox {
    fun inject(app: MainActivity)
    fun inject(app: Main2Activity)
}