package com.hellcorp.chessclocks

import android.graphics.Color
import android.os.Build
import android.view.View
import android.view.WindowInsetsController
import android.view.WindowManager
import androidx.core.content.ContextCompat
import com.hellcorp.chessclocks.databinding.ActivityMainBinding
import com.hellcorp.ui.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {
    override fun initViews() {
        setStatusBar()
    }

    @Suppress("DEPRECATION")
    private fun setStatusBar() {
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.statusBarColor =
            ContextCompat.getColor(this, com.hellcorp.ui.R.color.main_background_color)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (!isColorDark(
                    ContextCompat.getColor(
                        this,
                        com.hellcorp.ui.R.color.main_background_color
                    )
                )
            ) {
                window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
            } else {
                window.decorView.systemUiVisibility = 0
            }
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.setSystemBarsAppearance(
                WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS,
                WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS
            )
        }
    }

    private fun isColorDark(color: Int): Boolean {
        val darkness =
            1 - (0.299 * Color.red(color) + 0.587 * Color.green(color) + 0.114 * Color.blue(color)) / 255
        return darkness >= 0.5
    }

}