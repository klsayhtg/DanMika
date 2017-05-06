package com.mikagura.dangan.name.Views

import android.os.Bundle
import com.bumptech.glide.Glide
import com.mikagura.dangan.name.R
import com.mikagura.dangan.name.Utils.CircleTransform
import kotlinx.android.synthetic.main.activity_home.*


/**
 * Created by klsayhtg on 2017. 5. 1..
 */

class HomeActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setViews()
    }

    private fun setViews() {
        Glide.with(mContext).load("").placeholder(R.drawable.loading_image).centerCrop().crossFade().transform(CircleTransform(mContext)).into(myProfileIV)
    }
}