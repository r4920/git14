package com.rahulsapplication.app.modules.iphone13mini1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.base.BaseActivity
import com.rahulsapplication.app.databinding.ActivityIphone13Mini1Binding
import com.rahulsapplication.app.modules.iphone13mini1.`data`.viewmodel.Iphone13Mini1VM
import kotlin.String
import kotlin.Unit

public class Iphone13Mini1Activity :
    BaseActivity<ActivityIphone13Mini1Binding>(R.layout.activity_iphone_13_mini_1) {
  private val viewModel: Iphone13Mini1VM by viewModels<Iphone13Mini1VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.iphone13Mini1VM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "IPHONE13MINI1ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone13Mini1Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
