package com.rahulsapplication.app.modules.iphone13mini1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rahulsapplication.app.modules.iphone13mini1.`data`.model.Iphone13Mini1Model

public class Iphone13Mini1VM : ViewModel() {
  public val iphone13Mini1Model: MutableLiveData<Iphone13Mini1Model> =
      MutableLiveData(Iphone13Mini1Model())

  public var navArguments: Bundle? = null
}
