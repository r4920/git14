package com.rahulsapplication.app.modules.iphone11prox8.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rahulsapplication.app.modules.iphone11prox8.`data`.model.Iphone11ProX8Model

public class Iphone11ProX8VM : ViewModel() {
  public val iphone11ProX8Model: MutableLiveData<Iphone11ProX8Model> =
      MutableLiveData(Iphone11ProX8Model())

  public var navArguments: Bundle? = null
}
