package com.example.android.navigation.base

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.huawei.hms.analytics.HiAnalytics
import com.huawei.hms.analytics.HiAnalyticsInstance


abstract class BaseFragment: Fragment(){

    //TODO (4): Agregar instancia de huawei para todos los fragmentos
    lateinit var huaweiAnalyticsInstance: HiAnalyticsInstance

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        huaweiAnalyticsInstance = HiAnalytics.getInstance(context)

    }
}