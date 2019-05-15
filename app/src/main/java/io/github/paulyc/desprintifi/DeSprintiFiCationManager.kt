package io.github.paulyc.desprintifi

import android.content.Context
import android.telephony.SubscriptionManager
import android.telephony.TelephonyManager
import java.lang.Runtime.getRuntime

class DeSprintiFiCationManager {

    val TMoPLMNId = "310260"
    var permanent  = false

    init {
        getRuntime().exec("su")
    }

    fun deSprintiFiNow(ctx: Context) {
        useTMo(ctx, permanent)
    }

    fun togglePermanent(ctx: Context) {
        permanent = !permanent
        if (permanent) {
            useTMo(ctx, true)
        }
    }

    fun useTMo(ctx: Context, persist: Boolean) {
        val tm = ctx.getSystemService(TelephonyManager::class.java)
        //val currentNetOp = tm.networkOperator
        // allows this when called from system but i think it needs to
        // switch subscriptions or reset the connection as well
        tm.setNetworkSelectionModeManual(TMoPLMNId, persist)
    }

}
