package com.facebook.aura.commands.network;

import X.AbstractC7559F3s;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class NetworkStateHandlerKt$readCurrentNetworkState$caps$1 extends AbstractC7559F3s implements Function0<NetworkCapabilities> {
    public final /* synthetic */ ConnectivityManager $cm;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkStateHandlerKt$readCurrentNetworkState$caps$1(ConnectivityManager connectivityManager) {
        super(0);
        this.$cm = connectivityManager;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final NetworkCapabilities invoke() {
        Network activeNetwork;
        ConnectivityManager connectivityManager = this.$cm;
        if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null) {
            return null;
        }
        return this.$cm.getNetworkCapabilities(activeNetwork);
    }
}
