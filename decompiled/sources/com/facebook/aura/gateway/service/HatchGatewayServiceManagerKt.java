package com.facebook.aura.gateway.service;

import X.AnonymousClass002;
import X.C6686ERv;
import X.C7384Etj;
import X.C7438Evz;
import X.G0U;
import com.crossapp.tigonhttp.noise.NoiseChannelManagerHolder;
import com.facebook.aura.gateway.HatchGatewayConnectionState;
import com.facebook.aura.network.noise.AuraNoiseVmTransport;

/* loaded from: classes5.dex */
public abstract class HatchGatewayServiceManagerKt {
    public static final long LEASE_ESCALATION_GRACE_MS = 3000;
    public static final String TAG = "HatchGatewayServiceManager";

    /* renamed from: com.facebook.aura.gateway.service.HatchGatewayServiceManagerKt$noiseConnectionKeyMatchesGateway$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends C7438Evz implements G0U<String, String> {
        @Override // X.G0U
        public final String invoke(String str) {
            C7384Etj.A0Y(str, 0);
            C6686ERv.A00(NoiseChannelManagerHolder.Companion);
            return NoiseChannelManagerHolder.connectionKeyFromUrlNative(str);
        }

        public AnonymousClass1(Object obj) {
            super(1, obj, AuraNoiseVmTransport.class, "connectionKeyFromUrl", "connectionKeyFromUrl(Ljava/lang/String;)Ljava/lang/String;", 0);
        }
    }

    public static final boolean hasActiveGatewayChannel(HatchGatewayConnectionState hatchGatewayConnectionState) {
        C7384Etj.A0Y(hatchGatewayConnectionState, 0);
        return hatchGatewayConnectionState instanceof HatchGatewayConnectionState.Connected;
    }

    public static final String noiseConnectionKeyForGateway(String str, String str2, boolean z, G0U<? super String, String> g0u) {
        String strInvoke;
        String strInvoke2;
        C7384Etj.A0Y(g0u, 3);
        String str3 = null;
        if (str == null || (strInvoke = g0u.invoke(str)) == null || strInvoke.length() <= 0) {
            strInvoke = null;
        }
        if (str2 != null && (strInvoke2 = g0u.invoke(str2)) != null && strInvoke2.length() > 0) {
            str3 = strInvoke2;
        }
        return (!z ? str3 == null : strInvoke != null) ? str3 : strInvoke;
    }

    public static final boolean noiseConnectionKeyMatchesGateway(String str, String str2, String str3, boolean z, G0U<? super String, String> g0u) {
        AnonymousClass002.A1C(str, 0, g0u);
        return str.length() == 0 || str.equals(noiseConnectionKeyForGateway(str2, str3, z, g0u));
    }

    public static /* synthetic */ boolean noiseConnectionKeyMatchesGateway$default(String str, String str2, String str3, boolean z, G0U g0u, int i, Object obj) {
        if ((i & 16) != 0) {
            g0u = new AnonymousClass1(AuraNoiseVmTransport.INSTANCE);
        }
        return noiseConnectionKeyMatchesGateway(str, str2, str3, z, g0u);
    }
}
