package com.facebook.aura.network.traffic.nts;

import X.AbstractC7559F3s;
import X.C4oT;
import com.facebook.aura.common.prefs.AuraDevicePermanentPrefStore;
import com.facebook.aura.common.prefs.AuraDevicePermanentPrefs;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchDeviceStoreProviderAppLayerUpcallsImpl$prefs$2 extends AbstractC7559F3s implements Function0<C4oT> {
    public static final HatchDeviceStoreProviderAppLayerUpcallsImpl$prefs$2 INSTANCE = new HatchDeviceStoreProviderAppLayerUpcallsImpl$prefs$2();

    public HatchDeviceStoreProviderAppLayerUpcallsImpl$prefs$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C4oT invoke() {
        return AuraDevicePermanentPrefs.INSTANCE.get(AuraDevicePermanentPrefStore.TRAFFIC_NTS_DEVICE_STORE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C4oT invoke() {
        return AuraDevicePermanentPrefs.INSTANCE.get(AuraDevicePermanentPrefStore.TRAFFIC_NTS_DEVICE_STORE);
    }
}
