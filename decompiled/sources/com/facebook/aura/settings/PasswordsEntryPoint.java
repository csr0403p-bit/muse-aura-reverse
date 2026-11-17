package com.facebook.aura.settings;

import X.Ey9;
import X.F3w;
import com.facebook.aura.R;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.SecureStoragePasswordsScreenKey;
import com.facebook.aura.navigation.key.SecureStorageScreenKey;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class PasswordsEntryPoint {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ PasswordsEntryPoint[] $VALUES;
    public static final PasswordsEntryPoint PASSWORDS;
    public static final PasswordsEntryPoint SECURE_STORE;
    public final AuraNavKey destination;
    public final int titleRes;

    public static Ey9<PasswordsEntryPoint> getEntries() {
        return $ENTRIES;
    }

    public static PasswordsEntryPoint valueOf(String str) {
        return (PasswordsEntryPoint) Enum.valueOf(PasswordsEntryPoint.class, str);
    }

    public static PasswordsEntryPoint[] values() {
        return (PasswordsEntryPoint[]) $VALUES.clone();
    }

    public final AuraNavKey getDestination() {
        return this.destination;
    }

    public final int getTitleRes() {
        return this.titleRes;
    }

    static {
        PasswordsEntryPoint passwordsEntryPoint = new PasswordsEntryPoint("SECURE_STORE", 0, R.string._name_removed__res_0x7f120eb3, SecureStorageScreenKey.INSTANCE);
        SECURE_STORE = passwordsEntryPoint;
        PasswordsEntryPoint passwordsEntryPoint2 = new PasswordsEntryPoint("PASSWORDS", 1, R.string._name_removed__res_0x7f120eae, SecureStoragePasswordsScreenKey.INSTANCE);
        PASSWORDS = passwordsEntryPoint2;
        PasswordsEntryPoint[] passwordsEntryPointArr = {passwordsEntryPoint, passwordsEntryPoint2};
        $VALUES = passwordsEntryPointArr;
        $ENTRIES = new F3w(passwordsEntryPointArr);
    }

    public PasswordsEntryPoint(String str, int i, int i2, AuraNavKey auraNavKey) {
        this.titleRes = i2;
        this.destination = auraNavKey;
    }
}
