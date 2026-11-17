package com.facebook.aura.qpl;

import X.C7384Etj;
import X.CAH;
import X.COt;
import X.CPZ;
import X.EtT;
import X.InterfaceC3173C1c;
import android.content.Context;
import com.facebook.aura.qpl.module.AuraQplModule$provideQuickPerformanceLoggerGKs$1$getMetadataGKs$1;
import com.facebook.quicklog.QuickEventImpl;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class AuraNetworkConnectivityProvider extends CAH<Unit> {
    public final Context context;
    public final String providerName;

    public AuraNetworkConnectivityProvider(Context context) {
        C7384Etj.A0Y(context, 0);
        this.context = context;
        this.providerName = "network_connectivity";
    }

    @Override // X.DHp
    public ListenableFuture<?> decorateEvent(COt cOt, Unit unit, Unit unit2) {
        C7384Etj.A0Y(cOt, 0);
        AuraDataSaverMonitor.INSTANCE.ensureStartedAsync(this.context);
        String str = AuraDataSaverMonitor.restrictBackgroundStatus;
        if (str != null) {
            EtT.A01(cOt.AHg(), str, "restrict_background_status");
        }
        if (AuraDataSaverMonitor.startFailed) {
            ((QuickEventImpl) cOt).A0R.A0D("data_saver_monitor_failed", true);
        }
        return CPZ.A01;
    }

    @Override // X.DHp
    public boolean isEnabled(InterfaceC3173C1c interfaceC3173C1c) {
        C7384Etj.A0Y(interfaceC3173C1c, 0);
        return ((AuraQplModule$provideQuickPerformanceLoggerGKs$1$getMetadataGKs$1) interfaceC3173C1c).isNetworkConnectivityEnabled;
    }

    @Override // X.DHp
    public String getProviderName() {
        return this.providerName;
    }

    @Override // X.DHp
    public int getProviderTypeId() {
        return 25;
    }

    @Override // X.DHp
    public Class<Unit> getSnapshotType() {
        return Unit.class;
    }
}
