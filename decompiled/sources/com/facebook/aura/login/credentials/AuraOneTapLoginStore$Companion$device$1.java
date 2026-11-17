package com.facebook.aura.login.credentials;

import X.AbstractC7559F3s;
import X.C4oT;
import com.facebook.aura.common.prefs.AuraDevicePermanentPrefStore;
import com.facebook.aura.common.prefs.AuraDevicePermanentPrefs;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class AuraOneTapLoginStore$Companion$device$1 extends AbstractC7559F3s implements Function0<C4oT> {
    public static final AuraOneTapLoginStore$Companion$device$1 INSTANCE = new AuraOneTapLoginStore$Companion$device$1();

    public AuraOneTapLoginStore$Companion$device$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C4oT invoke() {
        return AuraDevicePermanentPrefs.INSTANCE.get(AuraDevicePermanentPrefStore.ONE_TAP_LOGIN);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C4oT invoke() {
        return AuraDevicePermanentPrefs.INSTANCE.get(AuraDevicePermanentPrefStore.ONE_TAP_LOGIN);
    }
}
