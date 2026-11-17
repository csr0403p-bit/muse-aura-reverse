package com.facebook.aura.commands.network;

import X.AbstractC7559F3s;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class NetworkStateHandlerKt$readWifi$info$1 extends AbstractC7559F3s implements Function0<WifiInfo> {
    public final /* synthetic */ WifiManager $wm;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkStateHandlerKt$readWifi$info$1(WifiManager wifiManager) {
        super(0);
        this.$wm = wifiManager;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final WifiInfo invoke() {
        return this.$wm.getConnectionInfo();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ WifiInfo invoke() {
        return this.$wm.getConnectionInfo();
    }
}
