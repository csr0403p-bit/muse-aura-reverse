package com.facebook.aura.devices.pairing;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C4oT;
import X.CH0;
import com.facebook.aura.common.prefs.AuraUserPrefStore;
import com.facebook.aura.common.prefs.AuraUserPrefs;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchSavedWifiNetworkStore$Companion$forUser$1 extends AbstractC7559F3s implements Function0<C4oT> {
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSavedWifiNetworkStore$Companion$forUser$1(AbstractC3358CGz abstractC3358CGz) {
        super(0);
        this.$userSession = abstractC3358CGz;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C4oT invoke() {
        return AuraUserPrefs.INSTANCE.get(((CH0) this.$userSession).A01, AuraUserPrefStore.SAVED_WIFI_NETWORKS);
    }
}
