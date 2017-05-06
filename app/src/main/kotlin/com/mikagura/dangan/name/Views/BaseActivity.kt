package com.mikagura.dangan.name.Views

import android.app.ProgressDialog
import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.mikagura.dangan.name.R
import com.mikagura.dangan.name.Utils.Utils

/**
 * Created by klsayhtg on 2017. 5. 1..
 */

open class BaseActivity : AppCompatActivity() {
    lateinit var mActivityContext: BaseActivity
    var mContext: Context = this
    var progressDialog: ProgressDialog? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mContext = this
        mActivityContext = this
    }

    override fun onResume() {
        super.onResume()
        mContext = this
        mActivityContext = this
        Utils.activityContext = this
    }

    fun toFade() {
        overridePendingTransition(R.anim.abc_fade_in, R.anim.abc_fade_out)
    }
}