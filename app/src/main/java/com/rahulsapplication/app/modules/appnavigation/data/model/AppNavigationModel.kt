package com.rahulsapplication.app.modules.appnavigation.`data`.model

import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class AppNavigationModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtAppNavigation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_app_navigation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCheckYourAppsUIFromTheBelowDemoScreensOfYourApp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_your_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtIPhone11ProX8: String? =
      MyApp.getInstance().resources.getString(R.string.msg_iphone_11_pro)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtIPhone13Mini1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_iphone_13_mini)

)
