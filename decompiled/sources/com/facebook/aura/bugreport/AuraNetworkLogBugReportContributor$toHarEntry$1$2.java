package com.facebook.aura.bugreport;

import X.AbstractC7559F3s;
import X.C2nw;
import X.C7384Etj;
import X.C7qW;
import X.G0U;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.network.transport.AuraNetworkLogEntry;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class AuraNetworkLogBugReportContributor$toHarEntry$1$2 extends AbstractC7559F3s implements G0U<C2nw, Unit> {
    public final /* synthetic */ AuraNetworkLogEntry $this_toHarEntry;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2nw c2nw) {
        C7384Etj.A0Y(c2nw, 0);
        C7qW.A06(AuraDeeplinkRouteMapper.STATUS_ROUTE, String.valueOf(this.$this_toHarEntry.status), c2nw);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraNetworkLogBugReportContributor$toHarEntry$1$2(AuraNetworkLogEntry auraNetworkLogEntry) {
        super(1);
        this.$this_toHarEntry = auraNetworkLogEntry;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2nw c2nw) {
        invoke2(c2nw);
        return Unit.INSTANCE;
    }
}
