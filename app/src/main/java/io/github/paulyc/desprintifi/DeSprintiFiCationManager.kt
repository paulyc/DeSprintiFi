package io.github.paulyc.desprintifi

import android.content.Context
import android.telephony.SubscriptionManager
import android.telephony.TelephonyManager
import java.lang.Runtime.getRuntime

class DeSprintiFiCationManager {

    val TMoPLMNId = "310260"

    init {
        getRuntime().exec("su")
    }

    fun deSprintiFiNow() {
        useTMo()
    }

    fun useTMo() {
        //
        //Context.getSystemService()
        //val subMgr = SubscriptionManager()
        //TelephonyManager
    }

}
