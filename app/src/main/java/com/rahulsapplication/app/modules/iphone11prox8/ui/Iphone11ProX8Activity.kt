package com.rahulsapplication.app.modules.iphone11prox8.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.base.BaseActivity
import com.rahulsapplication.app.databinding.ActivityIphone11ProX8Binding
import com.rahulsapplication.app.modules.iphone11prox8.`data`.viewmodel.Iphone11ProX8VM
import com.rahulsapplication.app.modules.iphone13mini1.ui.Iphone13Mini1Activity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class Iphone11ProX8Activity :
    BaseActivity<ActivityIphone11ProX8Binding>(R.layout.activity_iphone_11_pro_x_8) {
  private val viewModel: Iphone11ProX8VM by viewModels<Iphone11ProX8VM>()

  private val REQUEST_CODE_IPHONE13MINI1ACTIVITY: Int = 410

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.iphone11ProX8VM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.txtE.setOnClickListener {
      val destIntent = Iphone13Mini1Activity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_IPHONE13MINI1ACTIVITY)
    }
  }

  public companion object {
    public const val TAG: String = "IPHONE11PRO_X8ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone11ProX8Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
