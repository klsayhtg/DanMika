package com.mikagura.dangan.name.Views

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import com.mikagura.dangan.name.R

/**
 * Created by klsayhtg on 2017. 5. 1..
 */

class SplashActivity: BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            val intent = Intent(mContext, HomeActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NO_HISTORY
            startActivity(intent)
            finish()
            toFade()
        }, 2000)
    }
}