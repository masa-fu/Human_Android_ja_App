package jp.techacademy.masahiro.fukushima.human

import android.util.Log

class Human: Animal, Thinkable {

    // プロパティ[hobby]を定義
    private var hobby: String

    // 引数付きコンストラクタを定義
    constructor(name: String, age: Int, hobby: String): super(name, age) {
        // 引数で受け取ったhobbyをメンバ変数hobbyに格納
        this.hobby = hobby
    }

    // Animalクラスのメソッド[say]をオーバーライド
    override fun say() {
        Log.d("kotlintest", "私の名前は" + name + "です。年は" + age + "歳です。")
    }

    // Thinkableインターフェースのメソッド[think]をオーバーライド
    override fun think() {
        Log.d("kotlintest", "私は" + hobby + "について考える。")
    }
}