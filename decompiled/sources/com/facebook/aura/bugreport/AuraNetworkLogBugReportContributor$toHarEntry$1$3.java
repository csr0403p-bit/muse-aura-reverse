package com.facebook.aura.bugreport;

import X.AbstractC7559F3s;
import X.C2nw;
import X.C7384Etj;
import X.C7qW;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class AuraNetworkLogBugReportContributor$toHarEntry$1$3 extends AbstractC7559F3s implements G0U<C2nw, Unit> {
    public static final AuraNetworkLogBugReportContributor$toHarEntry$1$3 INSTANCE = new AuraNetworkLogBugReportContributor$toHarEntry$1$3();

    public AuraNetworkLogBugReportContributor$toHarEntry$1$3() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2nw c2nw) {
        C7384Etj.A0Y(c2nw, 0);
        C7qW.A05(-1, "blocked", c2nw);
        C7qW.A05(-1, "dns", c2nw);
        C7qW.A05(-1, "connect", c2nw);
        C7qW.A05(-1, "ssl", c2nw);
        C7qW.A05(-1, "send", c2nw);
        C7qW.A05(-1, "wait", c2nw);
        C7qW.A05(-1, "receive", c2nw);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2nw c2nw) {
        invoke2(c2nw);
        return Unit.INSTANCE;
    }
}
