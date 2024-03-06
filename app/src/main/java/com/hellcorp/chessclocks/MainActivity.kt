package com.hellcorp.chessclocks

import android.os.Bundle
import android.util.SparseIntArray
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val arr: SparseIntArray
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun myPow(x: Double, n: Int): Double {
        var result = 1.0
        if(x == 1.0) {
            return result
        } else if (x == -1.0) {
            if (n % 2 == 0) {
                return x
            } else {
                return result
            }
        }
        return if (n == 0) {
            result
        } else if (n > 0) {
            for (i in 1..n) {
                result *= x
            }
            result
        } else {
            for (i in -1 downTo n) {
                result /= x
            }
            result
        }
    }
}