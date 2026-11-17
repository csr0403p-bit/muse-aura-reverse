package com.facebook.aura.network.sandbox;

import X.AbstractC7559F3s;
import X.C10571Hud;
import X.C3cG;
import X.C4oT;
import com.facebook.aura.common.prefs.AuraDevicePermanentPrefStore;
import com.facebook.aura.common.prefs.AuraDevicePermanentPrefs;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchDeveloperOverrides$prefs$2 extends AbstractC7559F3s implements Function0<C4oT> {
    public static final HatchDeveloperOverrides$prefs$2 INSTANCE = new HatchDeveloperOverrides$prefs$2();

    public HatchDeveloperOverrides$prefs$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C4oT invoke() {
        Object objA0s;
        String str = HatchDeveloperOverrides.ATOD_TOKEN_KEY;
        try {
            objA0s = AuraDevicePermanentPrefs.INSTANCE.get(AuraDevicePermanentPrefStore.DEVELOPER_OVERRIDES);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        return (C4oT) objA0s;
    }
}
