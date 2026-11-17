package com.facebook.aura.network.traffic.nts;

import X.AbstractC5321DgF;
import X.AnonymousClass003;
import X.BzK;
import X.C4oT;
import X.C7384Etj;
import X.F0C;
import com.facebook.traffic.nts.providers.devicestore.DeviceStoreV2ProviderAppLayerUpcalls;

/* loaded from: classes3.dex */
public final class HatchDeviceStoreProviderAppLayerUpcallsImpl implements DeviceStoreV2ProviderAppLayerUpcalls {
    public final F0C prefs$delegate = AbstractC5321DgF.A03(HatchDeviceStoreProviderAppLayerUpcallsImpl$prefs$2.INSTANCE);

    @Override // com.facebook.traffic.nts.providers.devicestore.DeviceStoreV2ProviderAppLayerUpcalls
    public String getValueForKey(String str) {
        C7384Etj.A0Y(str, 0);
        return C4oT.A00(getPrefs(), str);
    }

    private final C4oT getPrefs() {
        return (C4oT) this.prefs$delegate.getValue();
    }

    @Override // com.facebook.traffic.nts.providers.devicestore.DeviceStoreV2ProviderAppLayerUpcalls
    public void setValueForKey(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        BzK bzKA9q = getPrefs().A9q();
        bzKA9q.AYr(str, str2);
        bzKA9q.apply();
    }
}
