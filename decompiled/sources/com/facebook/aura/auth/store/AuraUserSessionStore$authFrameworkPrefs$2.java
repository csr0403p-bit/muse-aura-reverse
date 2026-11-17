package com.facebook.aura.auth.store;

import X.AbstractC7559F3s;
import X.C4oT;
import com.facebook.aura.common.prefs.AuraDevicePrefStore;
import com.facebook.aura.common.prefs.AuraDevicePrefs;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraUserSessionStore$authFrameworkPrefs$2 extends AbstractC7559F3s implements Function0<C4oT> {
    public static final AuraUserSessionStore$authFrameworkPrefs$2 INSTANCE = new AuraUserSessionStore$authFrameworkPrefs$2();

    public AuraUserSessionStore$authFrameworkPrefs$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C4oT invoke() {
        return AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.AUTH_FRAMEWORK);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C4oT invoke() {
        return AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.AUTH_FRAMEWORK);
    }
}
