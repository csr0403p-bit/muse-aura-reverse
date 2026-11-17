package com.facebook.aura.login.credentials;

import X.AbstractC7559F3s;
import X.C4oT;
import com.facebook.aura.common.prefs.AuraDevicePermanentPrefStore;
import com.facebook.aura.common.prefs.AuraDevicePermanentPrefs;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class AuraRememberedAccountsStore$Companion$device$2 extends AbstractC7559F3s implements Function0<C4oT> {
    public static final AuraRememberedAccountsStore$Companion$device$2 INSTANCE = new AuraRememberedAccountsStore$Companion$device$2();

    public AuraRememberedAccountsStore$Companion$device$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C4oT invoke() {
        return AuraDevicePermanentPrefs.INSTANCE.get(AuraDevicePermanentPrefStore.REMEMBERED_ACCOUNTS);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C4oT invoke() {
        return AuraDevicePermanentPrefs.INSTANCE.get(AuraDevicePermanentPrefStore.REMEMBERED_ACCOUNTS);
    }
}
