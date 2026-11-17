package com.facebook.aura.auth.store;

import X.AbstractC7559F3s;
import X.CGw;
import com.facebook.aura.common.prefs.AuraDevicePrefStore;
import com.facebook.aura.common.prefs.AuraDevicePrefs;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraUserSessionStore$instance$2 extends AbstractC7559F3s implements Function0<CGw> {
    public static final AuraUserSessionStore$instance$2 INSTANCE = new AuraUserSessionStore$instance$2();

    public AuraUserSessionStore$instance$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final CGw invoke() {
        return new CGw(AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.USER_SESSION));
    }
}
