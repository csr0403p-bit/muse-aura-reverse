package com.facebook.aura.gateway;

import X.C10543Hqv;
import X.C7384Etj;
import X.F1F;
import X.F60;
import X.G0U;
import com.facebook.aura.network.transport.HatchHttpResponse;
import com.facebook.aura.network.transport.HatchVmProbeResponseObserver;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchVmStatusProbe$fetchStatusFromVm$failure$1 implements HatchVmProbeResponseObserver {
    public final /* synthetic */ C10543Hqv<Health> $health;
    public final /* synthetic */ C10543Hqv<Identity> $identity;
    public final /* synthetic */ G0U<Identity, Unit> $onIdentity;
    public final /* synthetic */ F1F $receivedIdentityResponse;

    @Override // com.facebook.aura.network.transport.HatchVmProbeResponseObserver
    public final void onResponse(int i, HatchHttpResponse hatchHttpResponse) {
        if (i == 0 || i == 1) {
            C7384Etj.A0P();
            throw F60.createAndThrow();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HatchVmStatusProbe$fetchStatusFromVm$failure$1(C10543Hqv<Identity> c10543Hqv, F1F f1f, G0U<? super Identity, Unit> g0u, C10543Hqv<Health> c10543Hqv2) {
        this.$identity = c10543Hqv;
        this.$receivedIdentityResponse = f1f;
        this.$onIdentity = g0u;
        this.$health = c10543Hqv2;
    }
}
