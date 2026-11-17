package com.facebook.aura.network.noise;

import X.AnonymousClass001;
import X.C3cI;
import X.C7384Etj;
import X.G0V;
import X.Ht9;
import X.InterfaceC2349BUy;
import com.crossapp.tigonhttp.noise.NoiseConnectionDemandListener;

/* loaded from: classes5.dex */
public final /* synthetic */ class AuraNoiseVmTransportKt$sam$com_crossapp_tigonhttp_noise_NoiseConnectionDemandListener$0 implements InterfaceC2349BUy, NoiseConnectionDemandListener {
    public final /* synthetic */ G0V function;

    public AuraNoiseVmTransportKt$sam$com_crossapp_tigonhttp_noise_NoiseConnectionDemandListener$0(G0V g0v) {
        C7384Etj.A0Y(g0v, 0);
        this.function = g0v;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof NoiseConnectionDemandListener) && (obj instanceof InterfaceC2349BUy)) {
            return C3cI.A1V(obj, this.function);
        }
        return false;
    }

    @Override // X.InterfaceC2349BUy
    public final Ht9<?> getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return this.function.hashCode();
    }

    @Override // com.crossapp.tigonhttp.noise.NoiseConnectionDemandListener
    public final /* synthetic */ boolean onConnectionDemand(long j, String str) {
        return AnonymousClass001.A1X(this.function.invoke(Long.valueOf(j), str));
    }
}
