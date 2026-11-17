package com.facebook.aura.login.credentials;

import X.AbstractC7559F3s;
import com.facebook.aura.common.prefs.AuraDevicePermanentPrefs;
import java.io.File;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class AuraRememberedAccountsStore$Companion$device$1 extends AbstractC7559F3s implements Function0<File> {
    public static final AuraRememberedAccountsStore$Companion$device$1 INSTANCE = new AuraRememberedAccountsStore$Companion$device$1();

    public AuraRememberedAccountsStore$Companion$device$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final File invoke() {
        return AuraDevicePermanentPrefs.INSTANCE.retiredStoreFile(AuraRememberedAccountsStoreKt.UNCONSENTED_STORE_KEY);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ File invoke() {
        return AuraDevicePermanentPrefs.INSTANCE.retiredStoreFile(AuraRememberedAccountsStoreKt.UNCONSENTED_STORE_KEY);
    }
}
