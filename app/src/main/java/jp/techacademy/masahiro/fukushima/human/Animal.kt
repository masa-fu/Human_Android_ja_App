package jp.techacademy.masahiro.fukushima.human

// 抽象クラス[Animal]を定義
abstract class Animal {
    var name: String
    var age: Int

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    // 抽象メソッド[say]を定義
    abstract fun say()
}