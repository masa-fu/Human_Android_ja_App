package jp.techacademy.masahiro.fukushima.human

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 名前 taro, 年齢 23, 趣味 設計で、Humanのインスタンスを作る
        val taro = Human("taro", 23, "設計")
        taro.say()
        taro.think()

        // 名前 takeshi, 年齢 20, 趣味 実装で、Humanのインスタンスを作る
        val takeshi = Human("takeshi", 20, "実装")
        takeshi.say()
        takeshi.think()
    }
}
