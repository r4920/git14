package com.rahulsapplication.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.base.BaseActivity
import com.rahulsapplication.app.databinding.ActivityAppNavigationBinding
import com.rahulsapplication.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.rahulsapplication.app.modules.iphone11prox8.ui.Iphone11ProX8Activity
import com.rahulsapplication.app.modules.iphone13mini1.ui.Iphone13Mini1Activity
import kotlin.String
import kotlin.Unit

public class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.appNavigationVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.linearIPhone13Mini1.setOnClickListener {
      val destIntent = Iphone13Mini1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone11ProX8.setOnClickListener {
      val destIntent = Iphone11ProX8Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "APP_NAVIGATION_ACTIVITY"
  }
}
