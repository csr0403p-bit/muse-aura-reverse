package com.facebook.aura.commands.network;

import X.AbstractC7559F3s;
import android.telephony.TelephonyManager;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class NetworkStateHandlerKt$readCellular$roaming$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ TelephonyManager $tm;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkStateHandlerKt$readCellular$roaming$1(TelephonyManager telephonyManager) {
        super(0);
        this.$tm = telephonyManager;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(this.$tm.isNetworkRoaming());
    }
}
