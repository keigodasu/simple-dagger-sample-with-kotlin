package com.example.simplekoinsample

class MySimplePresenter(val repo: HelloRepository) {
    fun sayHello() = "${repo.giveHello()} from $this"
}