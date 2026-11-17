package com.facebook.aura.qpl;

import X.C7384Etj;
import X.CAH;
import X.COt;
import X.CPZ;
import X.EtT;
import X.InterfaceC3173C1c;
import com.facebook.aura.network.state.AuraNetworkMonitor;
import com.facebook.aura.network.state.AuraNetworkState;
import com.facebook.aura.qpl.module.AuraQplModule$provideQuickPerformanceLoggerGKs$1$getMetadataGKs$1;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes5.dex */
public final class AuraNetworkStatsProvider extends CAH<AuraNetworkState> {
    public final String providerName = "network_stats";

    @Override // X.DHp
    public ListenableFuture<?> decorateEvent(COt cOt, AuraNetworkState auraNetworkState, AuraNetworkState auraNetworkState2) {
        String networkType;
        C7384Etj.A0Y(cOt, 0);
        if ((auraNetworkState != null && (networkType = AuraNetworkDataProvidersKt.getNetworkType(auraNetworkState)) != null) || (auraNetworkState2 != null && (networkType = AuraNetworkDataProvidersKt.getNetworkType(auraNetworkState2)) != null)) {
            EtT.A01(cOt.AHg(), networkType, "network_type");
        }
        return CPZ.A01;
    }

    @Override // X.DHp
    public boolean isEnabled(InterfaceC3173C1c interfaceC3173C1c) {
        C7384Etj.A0Y(interfaceC3173C1c, 0);
        return ((AuraQplModule$provideQuickPerformanceLoggerGKs$1$getMetadataGKs$1) interfaceC3173C1c).isNetworkStatsEnabled;
    }

    @Override // X.DHp
    public String getProviderName() {
        return this.providerName;
    }

    @Override // X.DHp
    public int getProviderTypeId() {
        return 1;
    }

    @Override // X.DHp
    public Class<AuraNetworkState> getSnapshotType() {
        return AuraNetworkState.class;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.CAH
    public AuraNetworkState snapshot() {
        return AuraNetworkMonitor.state.getValue();
    }

    @Override // X.CAH
    public /* bridge */ /* synthetic */ AuraNetworkState snapshot() {
        return AuraNetworkMonitor.state.getValue();
    }
}
